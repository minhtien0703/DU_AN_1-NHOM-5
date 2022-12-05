/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.imp;

import java.util.ArrayList;
import java.util.List;
import models.HoaDon;
import models.HoaDonChiTiet;
import models.SanPham;
import repositorys.IHoaDonRepostory;
import repositorys.imp.HoaDonRepostory;
import services.IHoaDonService;
import services.ISamPhamServiecs;
import viewmodels.HoaDonCHiTietViewModel;
import viewmodels.HoaDonViewModel;

/**
 *
 * @author Win10
 */
public class HoaDonService implements IHoaDonService {

    private IHoaDonRepostory hoadon1 = new HoaDonRepostory();
    private IHoaDonRepostory hoadon2 = new HoaDonRepostory();
    private List<HoaDonViewModel> getListHD;
    private IHoaDonRepostory hoaDonRepostory;
    private List<HoaDonCHiTietViewModel> getListHDCT;
    private ISamPhamServiecs sanISamPhamServiecs;

 

    public HoaDonService(){
        getListHD = new ArrayList<>();
        getListHDCT = new ArrayList<>();
        hoaDonRepostory = new HoaDonRepostory();
        sanISamPhamServiecs = new SanPhamServiec();

    }

    public List<HoaDonViewModel> getAllHD() {
        List<HoaDonViewModel> list01 = new ArrayList<>();

        List<HoaDon> list = hoadon1.GetAllHD();
        for (HoaDon x : list) {
            list01.add(new HoaDonViewModel(x.getKhachHang(), x.getUser(), x.getMa(), x.getNgayTao(), x.getNgayThanhToan(), x.getTinhTrang(), x.getGhichu()));
        }
        return list01;

    }

    @Override
    public List<HoaDonCHiTietViewModel> getAllHDCT() {
        List<HoaDonCHiTietViewModel> list02 = new ArrayList<>();

        List<HoaDonChiTiet> List00 = hoadon2.GetAllHDCT();
        for (HoaDonChiTiet c : List00) {
            list02.add(new HoaDonCHiTietViewModel(c.getIdHoaDon(), c.getIdCTSP(), c.getSoluong(), c.getDonGia(), c.getDonKhiGiam()));
        }
        return list02;
    }

    @Override
    public List<HoaDonViewModel> TimID(String ID) {
        List<HoaDonViewModel> list01 = new ArrayList<>();

        List<HoaDon> list = hoadon1.TimID(ID);
        for (HoaDon x : list) {
            list01.add(new HoaDonViewModel(x.getIDNV(), x.getIDKH(), x.getIDNV(), x.getMa(), x.getNgayTao(), x.getNgayThanhToan(), x.getTinhTrang()));
        }
        return list01;
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
            hd.setTinhTrang(hoaDon.getTinhTrang());
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
    public Integer updateSoLuongGioHang(int SoLuong, String MaSP, String MaHD) {
        return hoaDonRepostory.updateSoLuongGioHang(SoLuong, MaSP, MaHD);

    }

}

//
//     private final HoaDonRepostory chucVuRepository = new HoaDonRepostory();
//
//    public List<HoaDonViewModel> getAllCVV() {
//    return chucVuRepository.GetAll();
//    }

