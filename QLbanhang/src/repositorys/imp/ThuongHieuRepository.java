/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.ThuongHieu;
import repositorys.IThuongHieuRepository;
import utilconnext.DBConnection;

/**
 *
 * @author vieta
 */
public class ThuongHieuRepository implements IThuongHieuRepository{
     List<ThuongHieu> listth;
    
    public ThuongHieuRepository(){
        listth = new ArrayList<>();
    }
    
    @Override
    public List<ThuongHieu> getAll(){
        try {
            listth.removeAll(listth);
            String sql = "select * from ThuongHieu";
            Connection cn = DBConnection.openDbConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                listth.add(new ThuongHieu(rs.getString(1)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChatLieuRepositoryimpl.class.getName()).log(Level.ALL.SEVERE, null, ex);
        }
        return listth;
    }
    
    @Override
    public boolean Add(ThuongHieu th){
        String sql = "insert into ThuongHieu(Id,Ten) values (?)";
        try {
            Connection cn = DBConnection.openDbConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
         
            pstm.setString(1, th.getTen());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }        
    }
    
    @Override
    public boolean Update(ThuongHieu th,String id){
        String sql = "update ThuongHieu set Ten = ? where id = ?";
        try {
            Connection cn = DBConnection.openDbConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
         
            pstm.setString(1, th.getTen());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    @Override
    public boolean Delete(String id){
        String sql = "delete from ThuongHieu where id = ?";
        int check = 0;
        try {
            Connection cn = DBConnection.openDbConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setObject(1, id);
            check = pstm.executeUpdate();
        } catch (Exception e) {
        }
        return check > 0;
    }
}
