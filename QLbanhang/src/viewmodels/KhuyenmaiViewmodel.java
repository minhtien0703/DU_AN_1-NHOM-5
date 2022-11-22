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
    private String TenKM,HinhThucKM,NgayBatDau,NgayKetThuc;
    private BigDecimal GiaTriGiam;

    public KhuyenmaiViewmodel() {
    }

    public KhuyenmaiViewmodel(String TenKM, String HinhThucKM, String NgayBatDau, String NgayKetThuc, BigDecimal GiaTriGiam) {
        this.TenKM = TenKM;
        this.HinhThucKM = HinhThucKM;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.GiaTriGiam = GiaTriGiam;
    }
    
    public String getTenKM() {
        return TenKM;
    }

    public void setTenKM(String TenKM) {
        this.TenKM = TenKM;
    }

    public String getHinhThucKM() {
        return HinhThucKM;
    }

    public void setHinhThucKM(String HinhThucKM) {
        this.HinhThucKM = HinhThucKM;
    }

    public String getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(String NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public String getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(String NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public BigDecimal getGiaTriGiam() {
        return GiaTriGiam;
    }

    public void setGiaTriGiam(BigDecimal GiaTriGiam) {
        this.GiaTriGiam = GiaTriGiam;
    }
    
}
