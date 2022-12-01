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
import models.KichCo;
import repositorys.IKichCoRepository;

import utilconnext.DBConnection;

/**
 *
 * @author vieta
 */

 
public class KichCoRepositoryimpl implements IKichCoRepository{
    List<KichCo> listkc;
    
    public KichCoRepositoryimpl(){
        listkc = new ArrayList<>();
    }
    
    @Override
    public List<KichCo> getAll(){
        try {
            listkc.removeAll(listkc);
            String sql = "select * from KichCo";
            Connection cn = DBConnection.openDbConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                listkc.add(new KichCo(rs.getString(1)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KichCoRepositoryimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listkc;
    }
    
    @Override
    public boolean Add(KichCo kc){
        String sql = "insert into KichCo(Id,Ten) values (?)";
        try {
            Connection cn = DBConnection.openDbConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
           
            pstm.setString(1, kc.getTen());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }        
    }
    
    @Override
    public boolean Update(KichCo kc,String id){
        String sql = "update KichCo set Ten = ? where id = ?";
        try {
            Connection cn = DBConnection.openDbConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
            
            pstm.setString(1, kc.getTen());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    @Override
    public boolean Delete(String id){
        String sql = "delete from KichCo where id = ?";
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


