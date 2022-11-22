/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.imp;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;
import models.ChatLieu;
import models.KhuyenMai;
import models.KichCo;
import models.MauSac;
import models.SanPham;
import repositorys.ISanPhamReposory;
import utilconnext.DBConnection;

/**
 *
 * @author hungh
 */
public class SanPhamRepostory implements ISanPhamReposory {

    @Override
    public List<SanPham> getListSanPham() throws SQLException {
        List<SanPham> getListSP = new ArrayList<>();

        String sql = "SELECT SP.MA , SP.TEN , MS.Ten AS N'Màu Sắc' ,KM.Giatrigiam  , KM.HinhthucKM , KC.Ten AS N'Kích Cỡ' , CL.Ten AS N'CHẤT LIỆU', SP.SoLuongTon ,SP.GiaBan FROM ChitietSP SP \n"
                + "JOIN MauSac MS ON SP.IdMauSac = MS.Id\n"
                + "JOIN KichCo KC ON SP.IdKC = KC.Id JOIN ChatLieu CL ON SP.IdCL = CL.Id JOIN KhuyenMai KM ON SP.IdKM = KM.Id";
        Connection conn = DBConnection.openDbConnection();
        Statement stt = conn.createStatement();
    
        ResultSet rs = stt.executeQuery(sql);
        while (rs.next()) {
            SanPham sp = new SanPham();
            sp.setMa(rs.getString(1));
            sp.setTen(rs.getString(2));
            MauSac ms = new MauSac();
            ms.setTen(rs.getString(3));
            sp.setMauSac(ms);
            KhuyenMai km = new KhuyenMai();
            km.setGiaTriGiam(rs.getDouble(4));
            km.setHinhThucKM(rs.getString(5));
            sp.setKhuenMai(km);
            KichCo ks = new KichCo();
            ks.setTen(rs.getString(6));
            sp.setKichCo(ks);
            ChatLieu cl = new ChatLieu();
            cl.setTen(rs.getString(7));
            sp.setChatLieu(cl);
            sp.setSoLuongTon(rs.getInt(8));
            sp.setGiaBan(rs.getDouble(9));
            getListSP.add(sp);
        }
        rs.close();
        stt.close();
        conn.close();
        return getListSP;
    }

    @Override
    public boolean updateSoLuongSP(String Masp, int SoLuong) {
        try {
            String sql = "UPDATE ChitietSP SET SoLuongTon = ? WHERE MA = ?";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, SoLuong);
            pr.setString(2, Masp);
            pr.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public Integer getIdSanPham(String MaSP) {
        Integer idSP = 0;
         try {
            String sql = "select id from SanPham where Ma = ?";
            Connection conn = DBConnection.openDbConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, MaSP);
            ResultSet rs = pr.executeQuery();
           idSP =  rs.getInt(1);
        } catch (Exception ex) {
            ex.printStackTrace();
        
        }
         return idSP;
    }

}
