package repositorys.imp;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.HoaDon;
import models.HoaDonChiTiet;
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

    public Integer insertHoaDonChiTiet(HoaDonChiTiet hdct, Integer idSP, Integer idHD) {


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

    @Override
    public Integer insertHoaDon(HoaDon hd) {
        
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
    }

   