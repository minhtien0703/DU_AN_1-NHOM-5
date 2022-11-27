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
    private Integer id;
    private Integer IDKH;
    private Integer IDNV;
    private String Ma;
    private Date NgayTao;
    private Date NgayThanhToan;
    private double TinhTrang;


    public HoaDonViewModel() {
    }

    public HoaDonViewModel(Integer id, Integer IDKH, Integer IDNV, String Ma, Date NgayTao, Date NgayThanhToan, double TinhTrang) {
        this.id = id;
        this.IDKH = IDKH;
        this.IDNV = IDNV;
        this.Ma = Ma;
        this.NgayTao = NgayTao;
        this.NgayThanhToan = NgayThanhToan;
        this.TinhTrang = TinhTrang;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIDKH() {
        return IDKH;
    }

    public void setIDKH(Integer IDKH) {
        this.IDKH = IDKH;
    }

    public Integer getIDNV() {
        return IDNV;
    }

    public void setIDNV(Integer IDNV) {
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

    public double getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(double TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    @Override
    public String toString() {
        return "HoaDonViewModel{" + "id=" + id + ", IDKH=" + IDKH + ", IDNV=" + IDNV + ", Ma=" + Ma + ", NgayTao=" + NgayTao + ", NgayThanhToan=" + NgayThanhToan + ", TinhTrang=" + TinhTrang + '}';
    }

    
     
}
