/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author vieta
 */
public class ChiTietSP {

    private String ma;
    private String ten;
    private String idnsx;
    private String idmausac;
    private String iddanhmuc;
    private String idkc;
    private String idcl;
    private String idth;
    private String idkm;

    private int soluongton;
    private Double gianhap;
    private Double giaban;
    private String mota;
    private String qrcode;

    public ChiTietSP() {
    }

    public ChiTietSP(String ma, String ten, String idnsx, String idmausac, String iddanhmuc, String idkc, String idcl, String idth, String idkm, int soluongton, Double gianhap, Double giaban, String mota, String qrcode) {
        this.ma = ma;
        this.ten = ten;
        this.idnsx = idnsx;
        this.idmausac = idmausac;
        this.iddanhmuc = iddanhmuc;
        this.idkc = idkc;
        this.idcl = idcl;
        this.idth = idth;
        this.idkm = idkm;

        this.soluongton = soluongton;
        this.gianhap = gianhap;
        this.giaban = giaban;
        this.mota = mota;
        this.qrcode = qrcode;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getIdnsx() {
        return idnsx;
    }

    public void setIdnsx(String idnsx) {
        this.idnsx = idnsx;
    }

    public String getIdmausac() {
        return idmausac;
    }

    public void setIdmausac(String idmausac) {
        this.idmausac = idmausac;
    }

    public String getIddanhmuc() {
        return iddanhmuc;
    }

    public void setIddanhmuc(String iddanhmuc) {
        this.iddanhmuc = iddanhmuc;
    }

    public String getIdkc() {
        return idkc;
    }

    public void setIdkc(String idkc) {
        this.idkc = idkc;
    }

    public String getIdcl() {
        return idcl;
    }

    public void setIdcl(String idcl) {
        this.idcl = idcl;
    }

    public String getIdth() {
        return idth;
    }

    public void setIdth(String idth) {
        this.idth = idth;
    }

    public String getIdkm() {
        return idkm;
    }

    public void setIdkm(String idkm) {
        this.idkm = idkm;
    }

    public int getSoluongton() {
        return soluongton;
    }

    public void setSoluongton(int soluongton) {
        this.soluongton = soluongton;
    }

    public Double getGianhap() {
        return gianhap;
    }

    public void setGianhap(Double gianhap) {
        this.gianhap = gianhap;
    }

    public Double getGiaban() {
        return giaban;
    }

    public void setGiaban(Double giaban) {
        this.giaban = giaban;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    @Override
    public String toString() {
        return  ten;
    }

}
