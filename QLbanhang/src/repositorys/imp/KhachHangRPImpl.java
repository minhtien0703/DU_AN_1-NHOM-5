/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.KhachHang;
import models.KhuyenMai;
import utilconnext.DBConnection;
import repositorys.IKhachHangReposytory;
import viewmodels.KhachHangViewMD;

/**
 *
 * @author PC
 */
public class KhachHangRPImpl implements IKhachHangReposytory {

    @Override
    public List<KhachHang> getall() {
        String query = "SELECT [Id]\n"
                + "      ,[Ten]\n"
                + "      ,[TenDem]\n"
                + "      ,[Ho]\n"
                + "      ,[Gioitinh]\n"
                + "      ,[NgaySinh]\n"
                + "      ,[Email]\n"
                + "      ,[Sdt]\n"
                + "      ,[Diemthuong]\n"
                + "  FROM [dbo].[KhachHang]";
        try ( Connection con = DBConnection.openDbConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<KhachHang> listSP = new ArrayList<>();
            while (rs.next()) {
                KhachHang khachhang = new KhachHang();
                khachhang.setId(rs.getInt(1));
                khachhang.setTen(rs.getString(2));
                khachhang.setTendem(rs.getString(3));
                khachhang.setHo(rs.getString(4));
                khachhang.setGioitinh(rs.getInt(5));
                khachhang.setNgaysinh(rs.getString(6));
                khachhang.setEmail(rs.getString(7));
                khachhang.setSdt(rs.getString(8));
                khachhang.setDiemthuong(rs.getInt(9));

                listSP.add(khachhang);
            }
            return listSP;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean add(KhachHang khachhang) {
        int check = 0;
        String sql = "INSERT INTO [dbo].[KhachHang]\n"
                + "           ([Ten]\n"
                + "           ,[TenDem]\n"
                + "           ,[Ho]\n"
                + "           ,[Gioitinh]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[Email]\n"
                + "           ,[Sdt]\n)"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?)";
        try ( Connection con = DBConnection.openDbConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, khachhang.getTen());
            ps.setObject(2, khachhang.getTendem());
            ps.setObject(3, khachhang.getHo());
            ps.setObject(4, khachhang.getGioitinh());
            ps.setObject(5, khachhang.getNgaysinh());
            ps.setObject(6, khachhang.getEmail());
            ps.setObject(7, khachhang.getSdt());

            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean update(int id, KhachHang khachhang) {
        int check = 0;
        String sql = "UPDATE [dbo].[KhachHang]\n"
                + "   SET [Ten] =?\n"
                + "      ,[TenDem] = ?\n"
                + "      ,[Ho] =?\n"
                + "      ,[Gioitinh] = ?\n"
                + "      ,[NgaySinh] = ?\n"
                + "      ,[Email] = ?\n"
                + "      ,[Sdt] = ?\n"
                + "      ,[Diemthuong] = ?\n"
                + " WHERE id = ?";
        try ( Connection con = DBConnection.openDbConnection();  PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setObject(1, khachhang.getTen());
            ps.setObject(2, khachhang.getTendem());
            ps.setObject(3, khachhang.getHo());
            ps.setObject(4, khachhang.getGioitinh());
            ps.setObject(5, khachhang.getNgaysinh());
            ps.setObject(6, khachhang.getEmail());
            ps.setObject(7, khachhang.getSdt());
            ps.setObject(8, khachhang.getDiemthuong());
            ps.setObject(9, id);

            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean delete(int id) {
        int check = 0;
        String sql = "DELETE FROM [dbo].[KhachHang]\n"
                + "      WHERE id = ?";
        try ( Connection con = DBConnection.openDbConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    

}
