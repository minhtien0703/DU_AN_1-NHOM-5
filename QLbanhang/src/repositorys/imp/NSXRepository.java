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
import models.NSX;
import repositorys.INSXRepository;
import utilconnext.DBConnection;

/**
 *
 * @author vieta
 */
public class NSXRepository implements INSXRepository{
     List<NSX> listnsx;
    
    public NSXRepository(){
        listnsx = new ArrayList<>();
    }
    
    @Override
    public List<NSX> getAll(){
        try {
            listnsx.removeAll(listnsx);
            String sql = "select * from NSX";
            Connection cn = DBConnection.openDbConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                listnsx.add(new NSX(rs.getString(1),rs.getString(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChatLieuRepositoryimpl.class.getName()).log(Level.ALL.SEVERE, null, ex);
        }
        return listnsx;
    }
    
    @Override
    public boolean Add(NSX nsx){
        String sql = "insert into NSX(Id,Ten) values (newID(),?)";
        try {
            Connection cn = DBConnection.openDbConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
         
            pstm.setString(1, nsx.getTen());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }        
    }
    
    @Override
    public boolean Update(NSX nsx,String id){
        String sql = "update NSX set Ten = ? where id = ?";
        try {
            Connection cn = DBConnection.openDbConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
    
            pstm.setString(1, nsx.getTen());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    @Override
    public boolean Delete(String id){
        String sql = "delete from NSX where id = ?";
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
