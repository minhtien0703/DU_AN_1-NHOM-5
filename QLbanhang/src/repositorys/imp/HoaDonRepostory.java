package repositorys.imp;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.HoaDon;
import models.HoaDonChiTiet;
import models.KhuyenMai;
import models.SanPham;
import repositorys.IHoaDonRepostory;
import utilconnext.DBConnection;

/**
 *
 * @author Admin
 */
public class HoaDonRepostory implements IHoaDonRepostory {


    @Override
    public List<HoaDon> GetAllHD() {
        String query = "SELECT [id]\n"
                + "      ,[IDKH]\n"
                + "      ,[IDNV]\n"
                + "      ,[Ma]\n"
                + "      ,[NgayTao]\n"
                + "      ,[NgayThanhToan]\n"
                + "      ,[TinhTrang]\n"
                + "  FROM [dbo].[HoaDon]";
        try (Connection con = DBConnection.openDbConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<HoaDon> listSP = new ArrayList<>();
            while (rs.next()) {
                HoaDon hoadon = new HoaDon();
                hoadon.setId(rs.getInt(1));
                hoadon.setIDKH(rs.getInt(2));
                hoadon.setIDNV(rs.getInt(3));
                hoadon.setMa(rs.getString(4));
                hoadon.setNgayTao(rs.getDate(5));
                hoadon.setNgayThanhToan(rs.getDate(6));
                hoadon.setTinhTrang(rs.getInt(7));

                listSP.add(hoadon);
            }
            return listSP;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public List<HoaDonChiTiet> GetAllHDCT() {
        String query = "SELECT * from HoaDonChiTiet ";
        try (Connection con = DBConnection.openDbConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<HoaDonChiTiet> listhdct = new ArrayList<>();
            while (rs.next()) {
                HoaDonChiTiet hoadonCT = new HoaDonChiTiet();
                hoadonCT.setIdHoaDon(rs.getInt(1));
                hoadonCT.setIdCTSP(rs.getInt(2));
                hoadonCT.setSoluong(rs.getInt(3));
                hoadonCT.setDonGia(rs.getDouble(4));
                hoadonCT.setDonKhiGiam(rs.getDouble(5));

                listhdct.add(hoadonCT);
            }
            return listhdct;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

 @Override

    public List<HoaDon> TimID(String ID) {
        List<HoaDon> hd = new ArrayList<>();
        String sql = "SELECT [Id]\n"
                + "      ,[IdKH]\n"
                + "      ,[IdNV]\n"
                + "      ,[Ma]\n"
                + "      ,[NgayTao]\n"
                + "      ,[NgayThanhToan]\n"
                + "      ,[TinhTrang]\n"
                + "      ,[Ghichu]\n"
                + "  FROM [dbo].[HoaDon]\n"
                + "\n"
                + "  where id = ?";
//                + "on ChucVu.Id = Users.IdCV Where CAST(Ho+TenDem+Users.Ten as nvarchar) like ?";
        try {
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, ID);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                hd.add(new HoaDon(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getInt(7)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonRepostory.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hd;
    }
   

    
   
/////////////////////////////////////////////////
    @Override
    public Integer insertHoaDon(HoaDon hd, Integer idNV) {
        int result = 0;
        try {
            String sql = "insert into HoaDon (Ma ,IdNV, NgayTao , NgayThanhToan , TinhTrang) values(? , ? ,? ,? ,?)";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, hd.getMa());
            pr.setInt(2, hd.getIDNV());
            pr.setDate(3, hd.getNgayTao());
            pr.setDate(4, hd.getNgayThanhToan());
            pr.setDouble(5,hd.getTinhTrang());

           
            result = pr.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return result;
    }
    
    @Override
    public Integer insertHoaDonChiTiet(HoaDonChiTiet hdct) {
        int result = 0;
        try {
            String sql = "insert into HoaDonChiTiet (IdHD ,idCTSP, Soluong , Dongia ) values(? , ? ,? ,?)";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(2, hdct.getSanPham().getId());
            pr.setInt(1, hdct.getHaoDon().getId());
            pr.setInt(3, hdct.getSoluong());
            pr.setDouble(4, hdct.getDonGia());

            result = pr.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return result;
    }
      @Override
    public List<HoaDon> getListHD(double TinhTrang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getIdHD(String MaHD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<HoaDonChiTiet> getListHoaDonChiTiet(String MaHD) {
        List<HoaDonChiTiet> getList = new ArrayList<>();
        try {
            String sql = "SELECT SP.Ma , SP.Ten , HDCT.Dongia , HDCT.Soluong , KM.Giatrigiam , KM.HinhthucKM ,HDCT.IdCTSP FROM HoaDon HD JOIN HoaDonChiTiet HDCT ON HD.Id = HDCT.IdHD\n"
                    + "                    JOIN ChitietSP SP ON SP.Id = HDCT.IdCTSP join KhuyenMai km ON SP.IdKM = KM.Id WHERE HD.Ma =?";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, MaHD);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                HoaDonChiTiet hdct = new HoaDonChiTiet();
                KhuyenMai km = new KhuyenMai();
                km.setGiaTriGiam(rs.getDouble(5));
                km.setHinhThucKM(rs.getString(6));

                SanPham sp = new SanPham();
                sp.setTen(rs.getString(2));
                sp.setMa(rs.getString(1));
                sp.setId(rs.getInt(7));
                sp.setKhuenMai(km);
                hdct.setSanPham(sp);
                hdct.setSoluong(rs.getInt(4));
                hdct.setDonGia(rs.getDouble(3));
                getList.add(hdct);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getList;
    }

    
    public Integer deleteSanPham(int idHD, int idSP) {
        int rs = 0;
        try {
            String sql = "DELETE FROM HoaDonChiTiet WHERE IdHD = ? AND IdCTSP = ?";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, idHD);
            pr.setInt(2, idSP);
            rs = pr.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return rs;
    }

    
    public Integer updateSanPhamTrenGioHang(int idHD, int idSP, int SoLuong) {
        int rs = 0;
        try {
            String sql = "UPDATE HoaDonChiTiet SET Soluong = ? WHERE IdHD = ? AND IdCTSP = ?";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(2, idHD);
            pr.setInt(3, idSP);
            pr.setInt(1, SoLuong);
            rs = pr.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return rs;
    }

    @Override
    public Integer clearSanPhamTrenGioHang(int idHD) {
        int rs = 0;
        try {
            String sql = "DELETE FROM HoaDonChiTiet WHERE IdHD = ?";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, idHD);

            rs = pr.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return rs;
    }

    @Override
    public Integer getIDCTSP(int MaHD) {
        int idCTSP = 0;
        try {
            String sql = "select idCTSP from HoaDonChiTiet where idHD = ?";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, MaHD);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                idCTSP = rs.getInt(1);
                System.out.println(idCTSP);
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return idCTSP;
    }

    @Override
    public Integer updateSoLuongGioHang(int SoLuong,String MaSP , String MaHD) {
        int rs = 0;
        try {
            String sql = "UPDATE HoaDonChiTiet SET Soluong = ? WHERE IdHD IN (SELECT ID FROM HoaDon WHERE MA = ?) AND IdCTSP IN (SELECT ID FROM ChitietSP WHERE MA = ?)";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, SoLuong);
            pr.setString(2, MaHD);
            pr.setString(3, MaSP);
            rs = pr.executeUpdate();
            if (rs > 0 ) {
                System.out.println("thành công");
            }else{
                System.out.println("thất bại");
            }
           
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }
         return rs;
    }

    

    

  

    

}