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
import models.SanPham;
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
            String sql = "Select * from khuyenmai a join Sanpham b on a.id = b.idkm";
            Connection conn = DBConnection.openDbConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lstKm.add(new KhuyenMai(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBigDecimal(6), (SanPham) rs.getObject(7)));
                        }
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenmaiReponsitory.class.getName()).log(Level.SEVERE, null, ex);
        }
                    return lstKm;
    }

    @Override
    public boolean Add(KhuyenMai km) {
        String sql = "INSERT INTO KHUYENMAI VALUES(?,?,?,?,?)";
        try {
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, km.getTenKm());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean Update(KhuyenMai km, String id) {
String sql = "UPDATE KHUYENMAI SET TEN=? WHERE ID = ?";
        try {
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, km.getTenKm());
            pstm.setString(2, id);
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

    
}
