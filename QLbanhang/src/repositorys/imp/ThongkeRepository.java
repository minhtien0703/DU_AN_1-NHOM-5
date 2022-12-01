/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorys.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Thongke;
import repositorys.IThongkeRepository;
import utilconnext.DBConnection;

/**
 *
 * @author ADMIN
 */
public class ThongkeRepository implements IThongkeRepository{
private List<Thongke> lst ;
    public ThongkeRepository() {
        lst = new ArrayList<>();
    }

    @Override
    public List<Thongke> getbyday() {
        String sql = "select Sum(a.Dongia*a.Soluong),Sum(b.GiaNhap*a.Soluong),Sum((a.Dongia*a.Soluong)-(b.GiaNhap*a.Soluong)) from HoaDonChiTiet a join ChitietSP b on a.IdCTSP =b.id\n"
                + "join HoaDon c on a.IdHD = c.Id where TinhTrang = 'true' and Day(c.NgayThanhToan) = DAY(GETDATE())";
        try {
            Connection conn = DBConnection.openDbConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {                
                lst.add(new Thongke(rs.getDouble(1), rs.getDouble(2), rs.getDouble(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    return lst;
    }

    @Override
    public List<Thongke> getbymonth() {
        String sql = "select Sum(a.Dongia*a.Soluong),Sum(b.GiaNhap*a.Soluong),Sum((a.Dongia*a.Soluong)-(b.GiaNhap*a.Soluong)) from HoaDonChiTiet a join ChitietSP b on a.IdCTSP =b.id\n"
                + "join HoaDon c on a.IdHD = c.Id where TinhTrang = 'true' and MONTH(c.NgayThanhToan) = MONTH(GETDATE())";
        try {
            Connection conn = DBConnection.openDbConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lst.add(new Thongke(rs.getDouble(1), rs.getDouble(2), rs.getDouble(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return lst;
    }

    @Override
    public List<Thongke> getbyyear() {
 String sql = "select Sum(a.Dongia*a.Soluong),Sum(b.GiaNhap*a.Soluong),Sum((a.Dongia*a.Soluong)-(b.GiaNhap*a.Soluong)) from HoaDonChiTiet a join ChitietSP b on a.IdCTSP =b.id\n"
                + "join HoaDon c on a.IdHD = c.Id where TinhTrang = 'true' and YEAR(c.NgayThanhToan) = YEAR(GETDATE())";
        try {
            Connection conn = DBConnection.openDbConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lst.add(new Thongke(rs.getDouble(1), rs.getDouble(2), rs.getDouble(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return lst;    }

    @Override
    public List<Thongke> getbyday(String date) {
        String sql = "select Sum(a.Dongia*a.Soluong)as'Tổng tiền',Sum(b.GiaNhap*a.Soluong) as 'vốn',Sum((a.Dongia*a.Soluong)-(b.GiaNhap*a.Soluong)) as 'lợi nhuận'  from HoaDonChiTiet a join ChitietSP b on a.IdCTSP =b.id\n"
                + "join HoaDon c on a.IdHD = c.Id where TinhTrang = 'true' and DAY(c.NgayThanhToan) = ?";
        try {
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, date);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                lst.add(new Thongke(rs.getDouble(1), rs.getDouble(2), rs.getDouble(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return lst;
    }

    @Override
    public List<Thongke> getbymonth(String date) {
        String sql = "select Sum(a.Dongia*a.Soluong)as'Tổng tiền',Sum(b.GiaNhap*a.Soluong) as 'vốn',Sum((a.Dongia*a.Soluong)-(b.GiaNhap*a.Soluong)) as 'lợi nhuận'  from HoaDonChiTiet a join ChitietSP b on a.IdCTSP =b.id\n"
                + "join HoaDon c on a.IdHD = c.Id where TinhTrang = 'true' and MONTH(c.NgayThanhToan) = ?";
        try {
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, date);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                lst.add(new Thongke(rs.getDouble(1), rs.getDouble(2), rs.getDouble(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return lst;
    }

    @Override
    public List<Thongke> getbyyear(String date) {
        String sql = "select Sum(a.Dongia*a.Soluong)as'Tổng tiền',Sum(b.GiaNhap*a.Soluong) as 'vốn',Sum((a.Dongia*a.Soluong)-(b.GiaNhap*a.Soluong)) as 'lợi nhuận'  from HoaDonChiTiet a join ChitietSP b on a.IdCTSP =b.id\n"
                + "join HoaDon c on a.IdHD = c.Id where TinhTrang = 'true' and YEAR(c.NgayThanhToan) = ?";
        try {
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, date);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                lst.add(new Thongke(rs.getDouble(1), rs.getDouble(2), rs.getDouble(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return lst;
    }

    @Override
    public List<Thongke> getbyall(String day, String month, String year) {
String sql = "select Sum(a.Dongia*a.Soluong)as'Tổng tiền',Sum(b.GiaNhap*a.Soluong) as 'vốn',Sum((a.Dongia*a.Soluong)-(b.GiaNhap*a.Soluong)) as 'lợi nhuận'  from HoaDonChiTiet a join ChitietSP b on a.IdCTSP =b.id\n"
                + "join HoaDon c on a.IdHD = c.Id where TinhTrang = 'true' and DAY(c.NgayThanhToan) = ? and MONTH(c.NgayThanhToan) = ?and YEAR(c.NgayThanhToan) = ?";
        try {
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, day);
            pstm.setString(2, month);
            pstm.setString(3, year);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                lst.add(new Thongke(rs.getDouble(1), rs.getDouble(2), rs.getDouble(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return lst;
    }
    
}
