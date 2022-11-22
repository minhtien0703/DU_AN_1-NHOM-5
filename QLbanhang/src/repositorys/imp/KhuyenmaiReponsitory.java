/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorys.imp;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.KhuyenMai;
import repositorys.IKhuyenmaiRepository;
import utilconnext.DBConnection;


/**
 *
 * @author ADMIN
 */
public class KhuyenmaiReponsitory implements IKhuyenmaiRepository{
    List<KhuyenMai> lstKm;
    public KhuyenmaiReponsitory() {
        lstKm = new ArrayList<>();
    }

    @Override
    public List<KhuyenMai> GetAll() {
        try {
            String sql = "Select * from khuyenmai";
            Connection conn = DBConnection.openDbConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lstKm.add(new KhuyenMai(rs.getString(1), rs.getString(2), rs.getString(5), rs.getString(3), rs.getString(4), rs.getBigDecimal(6)));
                        }
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenmaiReponsitory.class.getName()).log(Level.SEVERE, null, ex);
        }
                    return lstKm;
    }

    @Override
    public boolean Add(KhuyenMai km) {
        String sql = "INSERT INTO KHUYENMAI(TEN,HINHTHUCKM,NGAYBATDAU,NGAYKETHUC,GIATRIGIAM) VALUES(?,?,?,?,?)";
        try {
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, km.getTenKM());
            pstm.setString(2, km.getHinhThucKM());
            pstm.setString(3, km.getNgayBatDau());
            pstm.setString(4, km.getNgayKetThuc());
            pstm.setBigDecimal(5, km.getGiaTriGiam());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean Update(KhuyenMai km, String id) {
String sql = "UPDATE KHUYENMAI SET TEN=?,NGAYBATDAU=?,NGAYKETTHUC = ?,HINHTHUCKM=?,GIATRIGIAM =? WHERE ID = ?";
        try {
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, km.getTenKM());
            pstm.setString(2, km.getNgayBatDau());
            pstm.setString(3, km.getNgayKetThuc());
            pstm.setString(4, km.getHinhThucKM());
            pstm.setBigDecimal(5, km.getGiaTriGiam());
            pstm.setString(6, id);
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }    }

    @Override
    public boolean Delete(String id) {
        String sql = "DELETE FROM KHUYENMAI WHERE ID = ?";
        try {
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, id);
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String checktrung(String ten) {
        String sql = " SELECT TEN FROM KHUYENMAI WHERE TEN = ?";
        String box = null;
        try {
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, ten);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {                
                box = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return box;
    }

    
}
