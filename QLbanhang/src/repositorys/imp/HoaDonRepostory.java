/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.imp;

import java.sql.*;
import java.sql.PreparedStatement;
import models.HoaDon;
import models.HoaDonChiTiet;
import repositorys.IHoaDonRepostory;
import utilconnext.DBConnection;

/**
 *
 * @author Admin
 */
public class HoaDonRepostory implements IHoaDonRepostory{

    @Override
    public Integer insertHoaDon(HoaDon hd) {
        int result = 0;
        try {
            String sql = "insert into HoaDon (Ma ,IdNV, NgayTao , NgayThanhToan , TinhTrang) values(? , ? ,? ,? ,?)";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, hd.getMa());
            pr.setInt(2, 1);
            pr.setDate(3, hd.getNgayTao());
            pr.setDate(4, hd.getNgayThanhToan());
            pr.setInt(5, hd.getTinhTrang());
             result =  pr.executeUpdate();
        
          
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }
        return result;
    }

    @Override
    public Integer insertHoaDonChiTiet(HoaDonChiTiet hdct , Integer idSP , Integer idHD) {
       
          int result = 0;
        try {
            String sql = "insert into HoaDonChiTiet (IdHD ,ICTSP, Soluong , Dongia ) values(? , ? ,? ,?)";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, idSP);
            pr.setInt(2, idHD);
            pr.setInt(3, hdct.getSoluong());
            pr.setDouble(4, hdct.getDonGia());
           
           result =  pr.executeUpdate();
        
          
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }
        return result;
    }
    
}
