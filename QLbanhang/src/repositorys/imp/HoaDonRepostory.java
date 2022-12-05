package repositorys.imp;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.HoaDon;
import models.HoaDonChiTiet;
import models.KhachHang;
import models.KhuyenMai;
import models.SanPham;
import models.User;
import repositorys.IHoaDonRepostory;
import utilconnext.DBConnection;

/**
 *
 * @author Admin
 */
public class HoaDonRepostory implements IHoaDonRepostory {


    @Override
    public List<HoaDon> GetAllHD() {
        String query = "SELECT a.MA,b.TEN,c.TEN,NGAYTAO,NGAYTHANHTOAN,TRANGTHAI,GHICHU FROM HOADON a JOIN USERS b ON a.IDNV = b.ID "
                + "JOIN KHACHHANG c ON a.IDKH = c.ID";
        try (Connection con = DBConnection.openDbConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<HoaDon> listSP = new ArrayList<>();
            while (rs.next()) {
                HoaDon hoadon = new HoaDon();
                hoadon.setMa(rs.getString(1));
                User u = new User();
                u.setTen(rs.getString(2));
                KhachHang khachHang = new KhachHang();
                khachHang.setTen(rs.getString(3));
                hoadon.setKhachHang(khachHang);
                hoadon.setGhichu(rs.getString(7));
                hoadon.setNgayTao(rs.getDate(4));
                hoadon.setNgayThanhToan(rs.getDate(5));
                hoadon.setTinhTrang(rs.getInt(6));

                listSP.add(hoadon);
            }
            return listSP;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
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
            pr.setInt(2, idNV);
            pr.setDate(3, hd.getNgayTao());
            pr.setDate(4, hd.getNgayThanhToan());
            pr.setInt(5, hd.getTinhTrang());
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
    public List<HoaDon> getListHD(int TrangThai) {
        List<HoaDon> getListGD = new ArrayList<>();
        try {
            String sql = "SELECT HD.Ma , HD.NgayTao , NV.Ten , HD.TinhTrang , NV.TenDem , NV.Ho FROM HoaDon HD JOIN Users NV ON HD.IdNV = NV.Id WHERE HD.TinhTrang = ?";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, TrangThai);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();

                hd.setMa(rs.getString(1));
                hd.setNgayTao(rs.getDate(2));
                User uesr = new User();
                uesr.setTen(rs.getString(6)+" "+rs.getString(5)+" " + rs.getString(3));
                hd.setUser(uesr);
                hd.setTinhTrang(rs.getInt(4));
                getListGD.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return getListGD;
    }

    @Override
    public Integer getIdHD(String MaHD) {
        Integer idHD = 0;
        try {
            String sql = "select id from HoaDon where Ma = ?";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, MaHD);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                idHD = rs.getInt(1);
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return idHD;
    }

    @Override
    public List<HoaDonChiTiet> getListHoaDonChiTiet(String MaHD) {
        List<HoaDonChiTiet> getList = new ArrayList<>();
        try {
            String sql = "SELECT SP.Ma , SP.Ten , HDCT.Dongia , HDCT.Soluong , KM.Giatrigiam , KM.HinhthucKM ,HDCT.IdCTSP , kh.Ho , kh.TenDem , kh.Ten , kh.Sdt , kh.Diemthuong FROM HoaDon HD JOIN HoaDonChiTiet HDCT ON HD.Id = HDCT.IdHD\n"
                    + "                    JOIN ChitietSP SP ON SP.Id = HDCT.IdCTSP join KhuyenMai km ON SP.IdKM = KM.Id JOIN KhachHang kh on"
                    + " HD.idKH = kh.id  WHERE HD.Ma =?";
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
                
                KhachHang kh = new KhachHang();
                kh.setTen(rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10));
                kh.setSdt(rs.getString(11));
                kh.setDiemthuong(rs.getInt(12));
                HoaDon hd= new HoaDon();
                hd.setKhachHang(kh);
                hdct.setHaoDon(hd);
                getList.add(hdct);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getList;
    }

    @Override
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

    @Override
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
    public Integer updateSoLuongGioHang(int SoLuong, String MaSP, String MaHD) {
        int rs = 0;
        try {
            String sql = "UPDATE HoaDonChiTiet SET Soluong = ? WHERE IdHD IN (SELECT ID FROM HoaDon WHERE MA = ?) AND IdCTSP IN (SELECT ID FROM ChitietSP WHERE MA = ?)";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, SoLuong);
            pr.setString(2, MaHD);
            pr.setString(3, MaSP);
            rs = pr.executeUpdate();
            if (rs > 0) {
                System.out.println("thành công");
            } else {
                System.out.println("thất bại");
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return rs;
    }

    @Override
    public Integer updateTrangThaiHoaDon(HoaDon hd) {
        int rs = 0;
        try {
            String sql = "update HoaDon set TinhTrang = ? , Ghichu = ? ,NgayThanhToan = ?   where Ma = ?";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, hd.getTinhTrang());
            pr.setString(2, hd.getGhichu());
            pr.setDate(3, hd.getNgayThanhToan());
            pr.setString(4, hd.getMa());
//            pr.setInt(4, hd.getKhachHang().getId());
            rs = pr.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return rs;
    }

    @Override
    public Integer updateHoaDonKhachHang(int Ma  ,String MaHD) {
          int rs = 0;
        try {
            String sql = "UPDATE HoaDon SET idKH = ? WHERE Ma = ?";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, Ma);
            pr.setString(2, MaHD);
          
            rs = pr.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return rs;
    }

    

    

   
  

    

}