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
import models.MauSac;
import repositorys.IMauSacRepository;
import utilconnext.DBConnection;

/**
 *
 * @author vieta
 */
public class MauSacRepositoryimpl implements IMauSacRepository{
    List<MauSac> listms;
    
    public MauSacRepositoryimpl(){
        listms = new ArrayList<>();
    }
    
    @Override
    public List<MauSac> getAll(){
        try {
            listms.removeAll(listms);
            String sql = "select * from MauSac";
            Connection cn = DBConnection.openDbConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                listms.add(new MauSac(rs.getString(1)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MauSacRepositoryimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listms;
    }
    
    @Override
    public boolean Add(MauSac ms){
        String sql = "insert into MauSac(Id,Ten) values (?)";
        try {
            Connection cn = DBConnection.openDbConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
          
            pstm.setString(1, ms.getTen());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }        
    }
    
    @Override
    public boolean Update(MauSac ms,String id){
        String sql = "update MauSac set Ten = ? where id = ?";
        try {
            Connection cn = DBConnection.openDbConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
           
            pstm.setString(1, ms.getTen());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    @Override
    public boolean Delete(String id){
        String sql = "delete from MauSac where id = ?";
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
