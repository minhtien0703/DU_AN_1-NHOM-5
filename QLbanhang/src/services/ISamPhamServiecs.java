/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import viewmodels.SanPhamViewModel;

/**
 *
 * @author Admin
 */
public interface ISamPhamServiecs {
      List<SanPhamViewModel> getListSanPham();
      boolean updateSoLuongSP(String Masp, int SoLuong ) ;
}