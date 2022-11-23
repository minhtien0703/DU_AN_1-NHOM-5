/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodels;

import java.util.Date;

/**
 *
 * @author hungh
 */
public class NhanVienview {

    String id, ho, tendem, ten;
    Date ngaysinh;
    int gioitinh, trangthai;
    String chucvu;
    String user, pass, sdt, gmail;

    public NhanVienview() {
    }

    public NhanVienview(String id, String ho, String tendem, String ten, Date ngaysinh, int gioitinh, int trangthai, String chucvu, String user, String pass, String sdt, String gmail) {
        this.id = id;
        this.ho = ho;
        this.tendem = tendem;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.trangthai = trangthai;
        this.chucvu = chucvu;
        this.user = user;
        this.pass = pass;
        this.sdt = sdt;
        this.gmail = gmail;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTendem() {
        return tendem;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getgt(int gt) {
        return gt == 1 ? "Nam" : "Nữ";
    }

    public String gettt(int tt) {
        return tt == 1 ? "Làm việc" : "Nghỉ làm";
    }

    @Override
    public String toString() {
        return "NhanVienview{" + "id=" + id + ", ho=" + ho + ", tendem=" + tendem + ", ten=" + ten + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + ", trangthai=" + trangthai + ", chucvu=" + chucvu + ", user=" + user + ", pass=" + pass + '}';
    }

}
