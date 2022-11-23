/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.imp;

import java.util.ArrayList;
import java.util.List;
import models.Nhanvien;
import repositorys.INhanvienReposytory;
import java.sql.*;
import utilconnext.DBConnection;
import viewmodels.NhanVienview;

/**
 *
 * @author hungh
 */
public class NhanvienReposytory implements INhanvienReposytory {

    final String INSERT_SQL = "INSERT INTO dbo.Users(Ten,TenDem,Ho,NgaySinh,Gioitinh,Sdt,IdCV,TaiKhoan,MatKhau,Email,TrangThai)VALUES(?,?,?,?,?,?,?,?,?,?,? )";
    final String UPDATE_SQL = "";
    final String SELECT_ALL_SQL = "SELECT Id,Ten,TenDem,Ho,NgaySinh,Gioitinh,Sdt,IdCV,TaiKhoan,MatKhau,Email,TrangThai FROM dbo.Users";
    final String SELECT_BY_SQL = "";
    final String DELETE_BY_SQL = "";

    @Override
    public List<Nhanvien> getAll() {
        return getselectSQL(SELECT_ALL_SQL);
    }

    @Override
    public int add(Nhanvien x) {

        return DBConnection.ExcuteQuery(INSERT_SQL, x.getTen(), x.getTendem(), x.getHo(), x.getNgaysinh(), x.getGioitinh(), x.getSdt(), x.getChucvu(), x.getTaikhoan(), x.getMatkhau(), x.getEmail(), x.getTrangthai());

    }

    @Override
    public int update(Nhanvien x, String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Nhanvien getbyid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private List<Nhanvien> getselectSQL(String SQL, Object... arvg) {
        List<Nhanvien> lstNhanVien = new ArrayList<>();
        try {
            ResultSet rl = DBConnection.getDataFromQuery(SQL, arvg);
            while (rl.next()) {
                Nhanvien x = new Nhanvien(rl.getString(1),
                        rl.getString(2),
                        rl.getString(3),
                        rl.getString(4),
                        rl.getDate(5),
                        rl.getInt(6),
                        rl.getString(7),
                        rl.getString(8),
                        rl.getString(9),
                        rl.getString(10),
                        rl.getString(11),
                        rl.getInt(12));
                lstNhanVien.add(x);
               // System.out.println(x.toString());
            }
        } catch (Exception e) {
        }
        
        return lstNhanVien;

    }
}
