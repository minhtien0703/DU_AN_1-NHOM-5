/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.imp;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Chucvu;
import models.Chucvu;
import models.User;
import repositorys.IUserRepostory;
import utilconnext.DBConnection;

/**
 *
 * @author Admin
 */
public class UserRepostory implements IUserRepostory {

    @Override
    public List<User> getUser(String TaiKhoan , String MatKhau) {
        List<User> list = new ArrayList<>();
        try {
            String sql = "select nv.Ten , cv.Ten , nv.id from Users nv join ChucVu  cv on nv.idCV = cv.id where nv.TaiKhoan =? and nv.matKhau =?";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, TaiKhoan);
            pr.setString(2, MatKhau);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {                
                User user = new User();
                user.setTen(rs.getString(1));
                Chucvu cv = new Chucvu();
                cv.setTen(rs.getString(2));
                user.setChucVu(cv);
                user.setId(rs.getInt(3));
                list.add(user);
            }
             
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
