/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.imp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.ChiTietSP;
import repositorys.IChiTietSPRepository;
import utilconnext.DBConnection;

/**
 *
 * @author vieta
 */
public class ChiTietSPRepository implements IChiTietSPRepository {

    final String SQL_SELECT_ALL = "SELECT Ma,Ten,IdNsx,IdMauSac,IdDMuc,IdKC,IdCL,IdTH,IdKM,SoLuongTon,GiaNhap,GiaBan,MoTa,QrCode FROM dbo.ChitietSP WHERE SoLuongTon > 0";
    final String SQL_SELECT_BY_SL = "SELECT Ma,Ten,IdNsx,IdMauSac,IdDMuc,IdKC,IdCL,IdTH,IdKM,SoLuongTon,GiaNhap,GiaBan,MoTa,QrCode FROM dbo.ChitietSP WHERE SoLuongTon = 0";
    final String SQL_SELECT_BY_TEN = "SELECT Ma,Ten,IdNsx,IdMauSac,IdDMuc,IdKC,IdCL,IdTH,IdKM,SoLuongTon,GiaNhap,GiaBan,MoTa,QrCode FROM dbo.ChitietSP WHERE SoLuongTon > 0 AND ten LIKE ?";
    final String SQL_INSERT = "INSERT INTO dbo.ChitietSP\n"
            + "( Ma, Ten, IdNsx, IdMauSac, IdDMuc, IdKC, IdCL, IdTH, IdKM, MoTa, SoLuongTon, GiaNhap, GiaBan, QrCode)\n"
            + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    final String SQL_UPDATE = "UPDATE dbo.ChitietSP SET Ma = ?, Ten = ?, IdNsx = ?, IdMauSac = ?, IdDMuc = ?, IdKC = ?, IdCL = ?, IdTH = ?, IdKM = ?, MoTa = ?, SoLuongTon = ?, GiaNhap = ?, GiaBan = ? WHERE Ma = ?";
    final String SQL_DELETE = "DELETE dbo.ChitietSP WHERE Ma = ?";

    @Override
    public List<ChiTietSP> getAll() {
        return getdataquery(SQL_SELECT_ALL);
    }

    @Override
    public List<ChiTietSP> getlistbyTen(String ten) {
        return getdataquery(SQL_SELECT_BY_TEN, ten);
    }

    private List<ChiTietSP> getdataquery(String SQL, Object... arvg) {
        List<ChiTietSP> lst = new ArrayList<>();
        try {
            ResultSet rl = DBConnection.getDataFromQuery(SQL, arvg);
            while (rl.next()) {
                lst.add(new ChiTietSP(
                        rl.getNString(1),
                        rl.getNString(2),
                        rl.getInt(3),
                        rl.getInt(4),
                        rl.getInt(5),
                        rl.getInt(6),
                        rl.getInt(7),
                        rl.getInt(8),
                        rl.getInt(9),
                        rl.getInt(10),
                        rl.getDouble(11),
                        rl.getDouble(12),
                        rl.getString(13),
                        rl.getString(14)
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;

    }

    @Override
    public int insert(ChiTietSP x) {
        return DBConnection.ExcuteQuery(SQL_INSERT, x.getMa(), x.getTen(), x.getIdnsx(), x.getIdmausac(), x.getIddanhmuc(), x.getIdkc(), x.getIdcl(), x.getIdth(), x.getIdkm(), x.getMota(), x.getSoluongton(), x.getGianhap(), x.getGiaban(), x.getQrcode());
    }

    @Override
    public int update(ChiTietSP x, String Ma) {
        return DBConnection.ExcuteQuery(SQL_UPDATE, x.getMa(), x.getTen(), x.getIdnsx(), x.getIdmausac(), x.getIddanhmuc(), x.getIdkc(), x.getIdcl(), x.getIdth(), x.getIdkm(), x.getMota(), x.getSoluongton(), x.getGianhap(), x.getGiaban(), Ma);
    }

    @Override
    public int delete(String ma) {
        return DBConnection.ExcuteQuery(SQL_DELETE, ma);
    }

    @Override
    public List<ChiTietSP> getSPhet() {
        return getdataquery(SQL_SELECT_BY_SL);
    }

}
