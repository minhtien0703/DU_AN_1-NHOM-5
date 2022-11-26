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
import repositorys.IHoaDonRepostory;
import repositorys.imp.HoaDonRepostory;
import services.IHoaDonService;
import viewmodels.HoaDonCTViewModel;
import viewmodels.HoaDonViewModel;

/**
 *
 * @author Win10
 */
public class HoaDonService implements IHoaDonService{

    private IHoaDonRepostory hoadon1 = new HoaDonRepostory();
    private IHoaDonRepostory hoadon2 = new HoaDonRepostory();
    public List<HoaDonViewModel> getAllHD() {
        List<HoaDonViewModel> list01 = new ArrayList<>();

        List<HoaDon> list = hoadon1.GetAllHD();
        for (HoaDon x : list) {
            list01.add(new HoaDonViewModel(x.getId(), x.getIDKH(), x.getIDNV(), x.getMa(), x.getNgayTao(), x.getNgayThanhToan(), x.getTrangThai()));
        }
        return list01;

    }

    @Override
    public List<HoaDonCTViewModel> getAllHDCT() {
        List<HoaDonCTViewModel> list02 = new ArrayList<>();
        
        List<HoaDonChiTiet> List00 = hoadon2.GetAllHDCT();
        for (HoaDonChiTiet c : List00) {
           list02.add(new HoaDonCTViewModel(c.getIdHoaDon(), c.getIdCTSP(), c.getSoluong(), c.getDonGia(), c.getDonKhiGiam()));
        }
        return list02;
    }

    @Override
    public List<HoaDonViewModel> TimID(String ID) {
        List<HoaDonViewModel> list01 = new ArrayList<>();

        List<HoaDon> list = hoadon1.TimID(ID);
        for (HoaDon x : list) {
            list01.add(new HoaDonViewModel(x.getIDNV(), x.getIDKH(), x.getIDNV(), x.getMa(), x.getNgayTao(), x.getNgayThanhToan(), x.getTrangThai()));
        }
        return list01; 
    }
    

    }
     
   
//
//     private final HoaDonRepostory chucVuRepository = new HoaDonRepostory();
//
//    public List<HoaDonViewModel> getAllCVV() {
//    return chucVuRepository.GetAll();
//    }

