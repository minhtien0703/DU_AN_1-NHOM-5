/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodels;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class HoaDonViewModel {
    private String id;
    private String IDKH;
    private String IDNV;
    private String Ma;
    private Date NgayTao;
    private Date NgayThanhToan;
    private int TrangThai;
//    private 

    public HoaDonViewModel() {
    }

    public HoaDonViewModel(String id, String IDKH, String IDNV, String Ma, Date NgayTao, Date NgayThanhToan, int TrangThai) {
        this.id = id;
        this.IDKH = IDKH;
        this.IDNV = IDNV;
        this.Ma = Ma;
        this.NgayTao = NgayTao;
        this.NgayThanhToan = NgayThanhToan;
        this.TrangThai = TrangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIDKH() {
        return IDKH;
    }

    public void setIDKH(String IDKH) {
        this.IDKH = IDKH;
    }

    public String getIDNV() {
        return IDNV;
    }

    public void setIDNV(String IDNV) {
        this.IDNV = IDNV;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(Date NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "HoaDonViewModel{" + "id=" + id + ", IDKH=" + IDKH + ", IDNV=" + IDNV + ", Ma=" + Ma + ", NgayTao=" + NgayTao + ", NgayThanhToan=" + NgayThanhToan + ", TrangThai=" + TrangThai + '}';
    }
    
}
