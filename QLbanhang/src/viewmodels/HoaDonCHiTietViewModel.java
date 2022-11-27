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
    private HoaDon haDon;
    private SanPham sanPham;
    private int Soluong;
    private Double DonGia;
    private Double DonGiaKhiGiam;

    public HoaDonCHiTietViewModel() {
    }

    public HoaDonCHiTietViewModel(HoaDon haDon, SanPham sanPham, int Soluong, Double DonGia, Double DonGiaKhiGiam) {
        this.haDon = haDon;
        this.sanPham = sanPham;
        this.Soluong = Soluong;
        this.DonGia = DonGia;
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
   public Double getThanhTien(){
   return DonGia * Soluong;
   }
 
    
    
}
