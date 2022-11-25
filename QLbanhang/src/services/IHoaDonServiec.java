/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import models.HoaDonChiTiet;
import viewmodels.HoaDonCHiTietViewModel;
import viewmodels.HoaDonViewModel;

/**
 *
 * @author Admin
 */
public interface IHoaDonServiec {

    Integer saveHD(HoaDonViewModel hoaDon, int idNV);

    Integer saveHDCT(HoaDonCHiTietViewModel hoaDonChiTiet, String MaSP, String MaHD);

    List<HoaDonViewModel> getListHD(int TrangThai);

    Integer getIdHD(String MaHD);

    List<HoaDonCHiTietViewModel> getListHoaDonChiTiet(String MaHD);

    Integer deleteSanPham(int idHD, int idSP);

    Integer updateSanPhamTrenGioHang(int idHD, int idSP, int SoLuong);

    Integer clearSanPhamTrenGioHang(int idHD);
}
