/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.imp;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.ChatLieu;
import models.HoaDon;
import models.HoaDonChiTiet;
import models.KhuyenMai;
import models.KichCo;
import models.MauSac;
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
            String sql = "SELECT HD.Ma , HD.NgayTao , NV.Ten , HD.TinhTrang FROM HoaDon HD JOIN Users NV ON HD.IdNV = NV.Id WHERE HD.TinhTrang = ?";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, TrangThai);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMa(rs.getString(1));
                hd.setNgayTao(rs.getDate(2));
                User uesr = new User();
                uesr.setTen(rs.getString(3));
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
            String sql = "SELECT SP.Ma , SP.Ten , HDCT.Dongia , HDCT.Soluong , KM.Giatrigiam , KM.HinhthucKM FROM HoaDon HD JOIN HoaDonChiTiet HDCT ON HD.Id = HDCT.IdHD\n"
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

    @Override
    public Integer deleteSanPham(int idHD, int idSP) {
      int rs =0;
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
             int rs =0;
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
                    int rs =0;
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

}
