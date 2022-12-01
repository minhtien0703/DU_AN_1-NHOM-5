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
import models.DanhMucSP;
import repositorys.IDanhMucSPRepository;
import utilconnext.DBConnection;

/**
 *
 * @author vieta
 */
public class DanhMucSPRepository implements IDanhMucSPRepository{
     List<DanhMucSP> listdmsp;
    
    public DanhMucSPRepository(){
        listdmsp = new ArrayList<>();
    }
    
    @Override
    public List<DanhMucSP> getAll(){
        try {
            listdmsp.removeAll(listdmsp);
            String sql = "select * from DanhMucSP";
            Connection cn = DBConnection.openDbConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                listdmsp.add(new DanhMucSP(rs.getString(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DanhMucSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listdmsp;
    }
    
    @Override
    public boolean Add(DanhMucSP dmsp){
        String sql = "insert into DanhMucSP(Id,Ten) values (?)";
        try {
            Connection cn = DBConnection.openDbConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
           
            pstm.setString(1, dmsp.getTen());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }        
    }
    
    @Override
    public boolean Update(DanhMucSP dmsp,String id){
        String sql = "update DanhMucSP set Ten = ? where id = ?";
        try {
            Connection cn = DBConnection.openDbConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
         
            pstm.setString(1, dmsp.getTen());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    @Override
    public boolean Delete(String id){
        String sql = "delete from DanhMucSP where id = ?";
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
