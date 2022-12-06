/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodels;

/**
 *
 * @author PC
 */
public class KhachHang02ViewMD {

    private int id;
    private String ten;
    private String tendem;
    private String ho;
    private String SDT;
    private int IDHD;
    private String ngayTao;
    private int SL;
    private double dongia;
    private int trangthai;
    private String tensp;

    public KhachHang02ViewMD() {
    }

    public KhachHang02ViewMD(int id, String ten, String tendem, String ho, String SDT, int IDHD, String ngayTao, int SL, double dongia, int trangthai, String tensp) {
        this.id = id;
        this.ten = ten;
        this.tendem = tendem;
        this.ho = ho;
        this.SDT = SDT;
        this.IDHD = IDHD;
        this.ngayTao = ngayTao;
        this.SL = SL;
        this.dongia = dongia;
        this.trangthai = trangthai;
        this.tensp = tensp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getIDHD() {
        return IDHD;
    }

    public void setIDHD(int IDHD) {
        this.IDHD = IDHD;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public Object[] toDataRow() {
        return new Object[]{id, ho + " " + tendem + " " + ten, SDT, IDHD, ngayTao,tensp, SL, dongia,  trangthai == 0 ? "chờ thanh toán" : "Đã Thanh Toán"};

    }
}
