/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewmodels;

import java.math.BigDecimal;

/**
 *
 * @author ADMIN
 */
public class KhuyenmaiViewmodel {
    private String TenKm,HinhthucKM;
    private String Ngaybatdau,Ngayketthuc;
    private BigDecimal Giatrigiam;

    public KhuyenmaiViewmodel() {
    }

    public KhuyenmaiViewmodel(String TenKm, String HinhthucKM, String Ngaybatdau, String Ngayketthuc, BigDecimal Giatrigiam) {
        this.TenKm = TenKm;
        this.HinhthucKM = HinhthucKM;
        this.Ngaybatdau = Ngaybatdau;
        this.Ngayketthuc = Ngayketthuc;
        this.Giatrigiam = Giatrigiam;
    }

    public String getTenKm() {
        return TenKm;
    }

    public void setTenKm(String TenKm) {
        this.TenKm = TenKm;
    }

    public String getHinhthucKM() {
        return HinhthucKM;
    }

    public void setHinhthucKM(String HinhthucKM) {
        this.HinhthucKM = HinhthucKM;
    }

    public String getNgaybatdau() {
        return Ngaybatdau;
    }

    public void setNgaybatdau(String Ngaybatdau) {
        this.Ngaybatdau = Ngaybatdau;
    }

    public String getNgayketthuc() {
        return Ngayketthuc;
    }

    public void setNgayketthuc(String Ngayketthuc) {
        this.Ngayketthuc = Ngayketthuc;
    }

    public BigDecimal getGiatrigiam() {
        return Giatrigiam;
    }

    public void setGiatrigiam(BigDecimal Giatrigiam) {
        this.Giatrigiam = Giatrigiam;
    }

    
}
