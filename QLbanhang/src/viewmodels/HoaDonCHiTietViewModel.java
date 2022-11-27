/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodels;

import models.HoaDon;
import models.SanPham;

/**
 *
 * @author Admin
 */
public class HoaDonCHiTietViewModel {
    private Integer idHoaDon;
    private Integer idCTSP;
    private int Soluong;
    private Double DonGia;
    private Double DonGiaKhiGiam;
    private HoaDon haDon;
    private SanPham sanPham;
   
    
  
    public HoaDonCHiTietViewModel() {
    }

    public HoaDonCHiTietViewModel(Integer idHoaDon, Integer idCTSP, int Soluong, Double DonGia, Double DonGiaKhiGiam, HoaDon haDon, SanPham sanPham) {
        this.idHoaDon = idHoaDon;
        this.idCTSP = idCTSP;
        this.Soluong = Soluong;
        this.DonGia = DonGia;
        this.DonGiaKhiGiam = DonGiaKhiGiam;
        this.haDon = haDon;
        this.sanPham = sanPham;
    }

    public Integer getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(Integer idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public Integer getIdCTSP() {
        return idCTSP;
    }

    public void setIdCTSP(Integer idCTSP) {
        this.idCTSP = idCTSP;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
    }

    public Double getDonGiaKhiGiam() {
        return DonGiaKhiGiam;
    }

    public void setDonGiaKhiGiam(Double DonGiaKhiGiam) {
        this.DonGiaKhiGiam = DonGiaKhiGiam;
    }

    public HoaDon getHaDon() {
        return haDon;
    }

    public void setHaDon(HoaDon haDon) {
        this.haDon = haDon;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    @Override
    public String toString() {
        return "HoaDonCHiTietViewModel{" + "idHoaDon=" + idHoaDon + ", idCTSP=" + idCTSP + ", Soluong=" + Soluong + ", DonGia=" + DonGia + ", DonGiaKhiGiam=" + DonGiaKhiGiam + ", haDon=" + haDon + ", sanPham=" + sanPham + '}';
    }

    
    
}
