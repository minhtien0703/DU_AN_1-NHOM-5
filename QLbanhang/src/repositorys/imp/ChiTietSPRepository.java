/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.ChiTietSP;
import repositorys.IChiTietSPRepository;
import utilconnext.DBConnection;

/**
 *
 * @author vieta
 */
public class ChiTietSPRepository implements IChiTietSPRepository {

    List<ChiTietSP> listctsp;

    public ChiTietSPRepository() {
        listctsp = new ArrayList<>();
    }

    @Override
    public List<ChiTietSP> getAll() {
        try {
            listctsp.removeAll(listctsp);
            String sql = "select * from ChiTietSP";
            Connection cn = DBConnection.openDbConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                listctsp.add(new ChiTietSP(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10), rs.getDouble(11), rs.getDouble(12), rs.getString(13), rs.getString(14)));

            }
        } catch (Exception e) {
        }
        return listctsp;
    }

    @Override
    public boolean Add(ChiTietSP ctsp) {
        String sql = "insert into ChitietSP (Ma, Ten, MoTa, SoLuongTon, GiaNhap, GiaBan)\n"
                + "values(?,?,?,?,?,?)";
        try {
            Connection cn = DBConnection.openDbConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, ctsp.getMa());
            pstm.setString(2, ctsp.getTen());
            pstm.setString(3, ctsp.getMota());
            pstm.setInt(4, ctsp.getSoluongton());
            pstm.setDouble(5, ctsp.getGianhap());
            pstm.setDouble(6, ctsp.getGiaban());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean Update(ChiTietSP ctsp,int id) {
        String sql = "update ChitietSP set Ma = ? ,Ten = ?, IdNsx = ?, IdMauSac = ?, IdDMuc = ?, IdKC = ?,IdCL = ?, IdTH = ?, IdKM = ?, SoLuongTon = ?, GiaNhap = ?, GiaBan= ?, MoTa = ?\n"
                + "where id = ?";
        try {
            Connection cn = DBConnection.openDbConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, ctsp.getMa());
            pstm.setString(2, ctsp.getTen());
            pstm.setString(3, ctsp.getIdnsx());
            pstm.setString(4, ctsp.getIdmausac());
            pstm.setString(5, ctsp.getIddanhmuc());
            pstm.setString(6, ctsp.getIdkc());
            pstm.setString(7, ctsp.getIdcl());
            pstm.setString(8, ctsp.getIdth());
            pstm.setString(9, ctsp.getIdkm());
            
            pstm.setInt(10, ctsp.getSoluongton());
            pstm.setDouble(11, ctsp.getGianhap());
            pstm.setDouble(12, ctsp.getGiaban());
            pstm.setString(13, ctsp.getMota());
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    @Override
    public boolean Delete(int id){
        String sql = "delete from ChiTietSP where id = ?";
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
