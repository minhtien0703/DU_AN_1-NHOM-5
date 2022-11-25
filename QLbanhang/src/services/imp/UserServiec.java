/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp;

import java.util.List;
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
    public String getUser(String TaiKhoan, String MatKhau) {
        List<User> list = userRepostory.getUser(TaiKhoan, MatKhau);
        if (TaiKhoan.isEmpty()) {
        
            return "tên đăng nhập không được để trống";
      
           
        }
        if (MatKhau.isEmpty()) {
             new frm_Login().setVisible(true);
            return "mật khẩu không được để trống";
        }if (TaiKhoan.isEmpty() && MatKhau.isEmpty()) {
             new frm_Login().setVisible(true);
            return "tên đăng nhập và mật khẩu không được để trống";
        }
        if (list != null) {
            for (User user : list) {
                if (user.getChucVu().getTen().equalsIgnoreCase("quản lý")) {
                 new frm_Dashboard(user.getTen() , user.getId()).setVisible(true);  
               
                    return "đăng nhập thành công";
                    
                }else{
                   new frm_Login().setVisible(true);
            return "chưa có form nhân viên";
        }

            }
            

        }
        new frm_Login().setVisible(true);
        return "tên đăng nhập hoặc tài khoản không đúng";
    }

}
