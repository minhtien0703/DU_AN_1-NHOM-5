/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.SanPham;
import repositorys.ISanPhamReposory;
import repositorys.imp.SanPhamRepostory;
import services.ISamPhamServiecs;
import viewmodels.SanPhamViewModel;

/**
 *
 * @author hungh
 */
public class SanPhamServiec implements ISamPhamServiecs{
   private ISanPhamReposory sanPhamReposory;
   private List<SanPhamViewModel> getListSP;


    public SanPhamServiec() {
   sanPhamReposory = new SanPhamRepostory();
   getListSP = new ArrayList<>();
 

    }
   
    @Override
    public List<SanPhamViewModel> getListSanPham() {
   
       try {
           List<SanPham> list = sanPhamReposory.getListSanPham();
           for (SanPham sanPham : list) {
              getListSP.add(new  SanPhamViewModel(sanPham.getMa(), sanPham.getTen(), sanPham.getMauSac(),sanPham.getKhuenMai(), sanPham.getKichCo()
                       , sanPham.getChatLieu(), sanPham.getSoLuongTon(), sanPham.getGiaBan()));
           }
           
       } catch (Exception ex) {
           Logger.getLogger(SanPhamServiec.class.getName()).log(Level.SEVERE, null, ex);
       }
       return getListSP;
    }

    @Override
    public boolean updateSoLuongSP(String Masp , int SoLuong ) {
    
     return sanPhamReposory.updateSoLuongSP(Masp, SoLuong);
    }

    @Override
    public Integer getIdSanPham(String MaSP) {
        return sanPhamReposory.getIdSanPham(MaSP);
    }

    @Override
    public List<SanPham> seachSanPham(String Ten) {
    return sanPhamReposory.seachSanPham(Ten);
       
    }
    
}
