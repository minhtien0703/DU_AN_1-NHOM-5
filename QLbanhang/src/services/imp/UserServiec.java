/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp;

import java.util.List;
import javax.swing.JOptionPane;
import models.User;
import repositorys.IUserRepostory;
import repositorys.imp.UserRepostory;
import services.IUserServiec;
import views.frm_Banhang;
import views.frm_Dangnhap;
import views.frm_Dashboard;
import views.frm_Login;

/**
 *
 * @author Admin
 */
public class UserServiec implements IUserServiec {

    private IUserRepostory userRepostory;

    public UserServiec() {
        userRepostory = new UserRepostory();
    }

    @Override
    public boolean getUser(String TaiKhoan, String MatKhau) {
        List<User> list = userRepostory.getUser(TaiKhoan, MatKhau);
        if (TaiKhoan.isEmpty()) {
            JOptionPane.showMessageDialog(new frm_Login(), "Nhập tài khoản");
            return false;

        }
        if (MatKhau.isEmpty()) {
            JOptionPane.showMessageDialog(new frm_Login(), "Nhập mật khẩu");

        }
                           
        if (list != null) {
            for (User user : list) {
                if (user.getChucVu().getTen().equalsIgnoreCase("quản lý")) {
                    JOptionPane.showMessageDialog(new frm_Login(), "Đăng nhập thành công !");
                    new frm_Dashboard(user.getTen(), user.getId()).setVisible(true);
                    return true;

                } else {
                    JOptionPane.showMessageDialog(new frm_Login(), "chờ update");
                    return false;
                }

            }

        }
        JOptionPane.showMessageDialog(new frm_Login(), "Sai tài khoản và mật khẩu"); 
        return false;
    }

}
