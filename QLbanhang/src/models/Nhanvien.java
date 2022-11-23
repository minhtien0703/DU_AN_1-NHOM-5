/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author hungh
 */
public class Nhanvien {
    String id,ten,tendem,ho;
    Date ngaysinh;
    int gioitinh;
    String sdt;
    String chucvu;
    String taikhoan,matkhau,email;
    int trangthai;

    public Nhanvien() {
    }

    public Nhanvien(String id, String ten, String tendem, String ho, Date ngaysinh, int gioitinh, String sdt, String chucvu, String taikhoan, String matkhau, String email, int trangthai) {
        this.id = id;
        this.ten = ten;
        this.tendem = tendem;
        this.ho = ho;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.chucvu = chucvu;
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.email = email;
        this.trangthai = trangthai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTendem() {
        return tendem;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "Nhanvien{" + "id=" + id + ", ten=" + ten + ", tendem=" + tendem + ", ho=" + ho + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + ", sdt=" + sdt + ", chucvu=" + chucvu + ", taikhoan=" + taikhoan + ", matkhau=" + matkhau + ", email=" + email + ", trangthai=" + trangthai + '}';
    }
    
}
