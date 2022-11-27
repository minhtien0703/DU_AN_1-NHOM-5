/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.HoaDon;
import models.HoaDonChiTiet;
import models.SanPham;
import models.User;
import repositorys.IHoaDonRepostory;
import repositorys.ISanPhamReposory;
import repositorys.imp.HoaDonRepostory;
import repositorys.imp.SanPhamRepostory;
import services.IHoaDonServiec;
import services.ISamPhamServiecs;
import viewmodels.HoaDonCHiTietViewModel;
import viewmodels.HoaDonViewModel;
import viewmodels.SanPhamViewModel;

/**
 *
 * @author Admin
 */
public class HoaDonServiec implements IHoaDonServiec {

    private List<HoaDonViewModel> getListHD;
    private IHoaDonRepostory hoaDonRepostory;
    private List<HoaDonCHiTietViewModel> getListHDCT;

    private ISamPhamServiecs sanISamPhamServiecs;

    public HoaDonServiec() {
        getListHD = new ArrayList<>();
        getListHDCT = new ArrayList<>();
        hoaDonRepostory = new HoaDonRepostory();
        sanISamPhamServiecs = new SanPhamServiec();

    }

    @Override
    public Integer saveHD(HoaDonViewModel hoaDon, int idNV) {
        HoaDon hd = new HoaDon();
        hd.setMa(hoaDon.getMa());
        hd.setNgayTao(hoaDon.getNgayTao());
        hd.setTinhTrang(1);

        Integer isInsert = hoaDonRepostory.insertHoaDon(hd, idNV);
        return isInsert;
    }

    @Override
    public Integer saveHDCT(HoaDonCHiTietViewModel hoaDonChiTiet, String MaSP, String MaHD) {
        HoaDonChiTiet hdct = new HoaDonChiTiet();
        hdct.setSoluong(hoaDonChiTiet.getSoluong());
        hdct.setDonGia(hoaDonChiTiet.getDonGia());
        SanPham sp = new SanPham();
        Integer idSP = sanISamPhamServiecs.getIdSanPham(MaSP);
        sp.setId(idSP);
        hdct.setSanPham(sp);
        HoaDon hd = new HoaDon();
        Integer idHD = hoaDonRepostory.getIdHD(MaHD);
        System.out.println(idHD);
        hd.setId(idHD);
        hdct.setHaoDon(hd);
        Integer isHDCT = hoaDonRepostory.insertHoaDonChiTiet(hdct);
        return isHDCT;
    }

    @Override
    public List<HoaDonViewModel> getListHD(int TrangThai) {
        List<HoaDon> list = hoaDonRepostory.getListHD(TrangThai);
        for (HoaDon hoaDon : list) {
            HoaDonViewModel hd = new HoaDonViewModel();
            hd.setMa(hoaDon.getMa());
            hd.setNgayTao(hoaDon.getNgayTao());
            hd.setTrangThai(hoaDon.getTinhTrang());
            hd.setUser(hoaDon.getUser());
            getListHD.add(hd);
        }
        return getListHD;
    }

    @Override
    public Integer getIdHD(String MaHD) {
        return hoaDonRepostory.getIdHD(MaHD);
    }

    @Override
    public List<HoaDonCHiTietViewModel> getListHoaDonChiTiet(String MaHD) {
        getListHDCT = new ArrayList<>();
        List<HoaDonChiTiet> list = hoaDonRepostory.getListHoaDonChiTiet(MaHD);
        for (HoaDonChiTiet hoaDonChiTiet : list) {
            HoaDonCHiTietViewModel hd = new HoaDonCHiTietViewModel();
            hd.setDonGia(hoaDonChiTiet.getDonGia());
            hd.setSoluong(hoaDonChiTiet.getSoluong());
            hd.setSanPham(hoaDonChiTiet.getSanPham());
            getListHDCT.add(hd);
        }
        return getListHDCT;
    }

    @Override
    public Integer deleteSanPham(int idHD, int idSP) {
        return hoaDonRepostory.deleteSanPham(idHD, idSP);
    }

    @Override
    public Integer updateSanPhamTrenGioHang(int idHD, int idSP, int SoLuong) {
        return hoaDonRepostory.updateSanPhamTrenGioHang(idHD, idSP, SoLuong);
    }

    @Override
    public Integer clearSanPhamTrenGioHang(int idHD) {
        return hoaDonRepostory.clearSanPhamTrenGioHang(idHD);
    }

    @Override
    public Integer getIDCTSP(int MaHD) {
        return hoaDonRepostory.getIDCTSP(MaHD);
    }

    @Override
    public Integer updateSoLuongGioHang(int SoLuong,String MaSP , String MaHD) {
         return hoaDonRepostory.updateSoLuongGioHang(SoLuong, MaSP, MaHD);

    }

}