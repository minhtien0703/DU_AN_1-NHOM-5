/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class HoaDonChiTiet {
    private Integer idHoaDon;
    private Integer idCTSP;
    private int Soluong;
    private Double DonGia;
    private Double DonKhiGiam;
    private HoaDon haoDon;
    private SanPham sanPham;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(Integer idHoaDon, Integer idCTSP, int Soluong, Double DonGia, Double DonKhiGiam, HoaDon haoDon, SanPham sanPham) {
        this.idHoaDon = idHoaDon;
        this.idCTSP = idCTSP;
        this.Soluong = Soluong;
        this.DonGia = DonGia;
        this.DonKhiGiam = DonKhiGiam;
        this.haoDon = haoDon;
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

    public Double getDonKhiGiam() {
        return DonKhiGiam;
    }

    public void setDonKhiGiam(Double DonKhiGiam) {
        this.DonKhiGiam = DonKhiGiam;
    }

    public HoaDon getHaoDon() {
        return haoDon;
    }

    public void setHaoDon(HoaDon haoDon) {
        this.haoDon = haoDon;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "idHoaDon=" + idHoaDon + ", idCTSP=" + idCTSP + ", Soluong=" + Soluong + ", DonGia=" + DonGia + ", DonKhiGiam=" + DonKhiGiam + ", haoDon=" + haoDon + ", sanPham=" + sanPham + '}';
    }

}