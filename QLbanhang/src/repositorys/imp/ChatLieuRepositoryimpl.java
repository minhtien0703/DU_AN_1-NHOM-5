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
import models.ChatLieu;
import repositorys.IChatLieuRepository;
import utilconnext.DBConnection;

/**
 *
 * @author vieta
 */
public class ChatLieuRepositoryimpl implements IChatLieuRepository{
     List<ChatLieu> listcl;
    
    public ChatLieuRepositoryimpl(){
        listcl = new ArrayList<>();
    }
    
    @Override
    public List<ChatLieu> getAll(){
        try {
            listcl.removeAll(listcl);
            String sql = "select * from ChatLieu";
            Connection cn = DBConnection.openDbConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                listcl.add(new ChatLieu(rs.getString(1)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChatLieuRepositoryimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listcl;
    }
    
    @Override
    public boolean Add(ChatLieu cl){
        String sql = "insert into ChatLieu(Id,Ten) values (?)";
        try {
            Connection cn = DBConnection.openDbConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
           
            pstm.setString(1, cl.getTen());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }        
    }
    
    @Override
    public boolean Update(ChatLieu cl,String id){
        String sql = "update ChatLieu set Ten = ? where id = ?";
        try {
            Connection cn = DBConnection.openDbConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
            
            pstm.setString(1, cl.getTen());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    @Override
    public boolean Delete(String id){
        String sql = "delete from ChatLieu where id = ?";
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
