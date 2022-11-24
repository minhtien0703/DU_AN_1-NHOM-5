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
import java.util.logging.Level;
import java.util.logging.Logger;
import utilconnext.DBConnection;
import viewmodels.ChucVuView;
import viewmodels.NhanVienview;

/**
 *
 * @author hungh
 */
public class NhanvienReposytory implements INhanvienReposytory {

     @Override
    public List<NhanVienview> getAllNhanVien() {
        List<NhanVienview> nvv = new ArrayList<>();
        String sql = "SELECT  Users.Id,Users.Ten,TenDem,Ho,NgaySinh,Gioitinh,Sdt,IdCV,TaiKhoan,MatKhau,Email,ChucVu.Ten,TrangThai FROM Users join ChucVu \n"
                + "on ChucVu.Id = Users.IdCV";

        ResultSet rs = null;
        try {
            rs = DBConnection.getDataFromQuery(sql);
            while (rs.next()) {
                ChucVuView cvv = new ChucVuView(rs.getString(8), rs.getString(12));
                Integer Id = rs.getInt(1);
                String ten = rs.getString(2);
                String tendem = rs.getString(3);
                String ho = rs.getString(4);
                String ngaysinh = rs.getString(5);
                Integer gioitinh = rs.getInt(6);
                String sdt = rs.getString(7);
                String tk = rs.getString(9);
                String mk = rs.getString(10);
                String email = rs.getString(11);
                Integer tt = rs.getInt(13);

                nvv.add(new NhanVienview(Id, ten, tendem, ho, ngaysinh, gioitinh, sdt, tk, mk, email, cvv, tt));
//              nvv.add(new NhanVienview(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(9), rs.getString(10), rs.getString(11), cvv, rs.getInt(12)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanvienReposytory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nvv;
    }

    @Override
    public Integer add(Nhanvien nv) {
        String sql = "INSERT INTO dbo.Users(Ten,TenDem,Ho,NgaySinh,Gioitinh,Sdt,IdCV,TaiKhoan,MatKhau,Email,TrangThai)VALUES(?,?,?,?,?,?,?,?,?,?,? )";

        Integer row = DBConnection.ExcuteQuery(sql,
                nv.getTen(),
                nv.getTendem(),
                nv.getHo(),
                nv.getNgaysinh(),
                nv.getGioitinh(),
                nv.getSdt(),
                nv.getChucVu(),
                nv.getTk(),
                nv.getMk(),
                nv.getEmail(),
                nv.getTT()
        );
        return row;
    }

    @Override
    public Integer update(Nhanvien id) {
        String sql = "UPDATE Users\n"
                + "set Ten = ? ,\n"
                + "TenDem = ?,\n"
                + "Ho = ?,\n"
                + "NgaySinh = ?,\n"
                + "Gioitinh = ?,\n"
                + "Sdt = ?,\n"
                + "IdCV = ?,\n"
                + "TaiKhoan = ?,\n"
                + "MatKhau = ?,\n"
                + "Email = ?,\n"
                + "TrangThai = ?\n"
                + "where Id = ?";

        Integer row = DBConnection.ExcuteQuery(sql,
                id.getTen(),
                id.getTendem(),
                id.getHo(),
                id.getNgaysinh(),
                id.getGioitinh(),
                id.getSdt(),
                id.getChucVu(),
                id.getTk(),
                id.getMk(),
                id.getEmail(),
                id.getTT(),
                id.getId()
        );
        return row;
    }

    @Override
    public List<NhanVienview> SearchNVV(String Ten) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Nhanvien getbyid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer delete(Integer id) {
        String sql = "delete from Users where Id = ?";
        Integer row = DBConnection.ExcuteQuery(sql, id);
        return row;
    }

}

