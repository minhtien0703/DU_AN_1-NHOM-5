/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Date;

/**
 *
 * @author PC
 */
public class HoaDon {
    private int id;
    private String Ma;
    private Date NgayTao;
    private Date NgayThanhToan;
    private int TinhTrang;
    private String GhiChu;
    private User user;
    public HoaDon() {
    }

    public HoaDon(String Ma, Date NgayTao, Date NgayThanhToan, int TinhTrang, String GhiChu, User user) {
        this.Ma = Ma;
        this.NgayTao = NgayTao;
        this.NgayThanhToan = NgayThanhToan;
        this.TinhTrang = TinhTrang;
        this.GhiChu = GhiChu;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
}
