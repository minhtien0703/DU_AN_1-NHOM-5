
package models;

import java.sql.Date;

/**
 *
 * @author PC
 */
public class HoaDon {

     private Integer id;
    private Integer IDKH;
    private Integer IDNV;
    private String Ma;
    private Date NgayTao;
    private Date NgayThanhToan;
    private double TinhTrang;

    public HoaDon() {
    }

    public HoaDon(Integer id, Integer IDKH, Integer IDNV, String Ma, Date NgayTao, Date NgayThanhToan, int TinhTrang) {
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
        return "HoaDon{" + "id=" + id + ", IDKH=" + IDKH + ", IDNV=" + IDNV + ", Ma=" + Ma + ", NgayTao=" + NgayTao + ", NgayThanhToan=" + NgayThanhToan + ", TinhTrang=" + TinhTrang + '}';
    }

   

    
     

}
 