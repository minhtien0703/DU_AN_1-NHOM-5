/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodels;

import java.sql.Date;
import models.User;

/**
 *
 * @author Admin
 */
public class HoaDonViewModel {
    private String Ma;
    private Date NgayTao;
    private Date NgayThanhToan;
    private int TrangThai;
    private User user;

    public HoaDonViewModel() {
    }

    public HoaDonViewModel(String Ma, Date NgayTao, Date NgayThanhToan, int TrangThai) {
        this.Ma = Ma;
        this.NgayTao = NgayTao;
        this.NgayThanhToan = NgayThanhToan;
        this.TrangThai = TrangThai;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    
    
}
