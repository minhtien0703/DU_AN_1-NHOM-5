/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp;

import java.util.ArrayList;
import java.util.List;
import models.ChiTietSP;
import repositorys.IChiTietSPRepository;
import repositorys.imp.ChiTietSPRepository;
import services.IChiTietSPServices;
import viewmodels.ChiTietSPViewModel;

/**
 *
 * @author vieta
 */
public class ChiTietSPServices implements IChiTietSPServices{
    private IChiTietSPRepository chiTietSPRepository;
    private List<ChiTietSPViewModel> list;
    
    public ChiTietSPServices(){
        chiTietSPRepository = new ChiTietSPRepository();
    }
    @Override
    public List<ChiTietSPViewModel> getAll(){                
        List<ChiTietSP> list1 = chiTietSPRepository.getAll();
        list = new ArrayList<>();
        for (ChiTietSP x : list1) {
            list.add(new ChiTietSPViewModel(x.getMa(),x.getTen(),x.getIdnsx(),x.getIdmausac(),x.getIddanhmuc(),x.getIdkc(),x.getIdcl(),x.getIdth(),x.getIdkm(),x.getSoluongton(),x.getGianhap(),x.getGiaban(),x.getMota(),x.getQrcode()));          
        }
        return list;
    }
    
     @Override
    public String Add(ChiTietSP ctsp){
        boolean add = chiTietSPRepository.Add(ctsp);
        if(add){
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }
    
    @Override
    public String Update(int id, ChiTietSP ctsp) {
        boolean updatehoadon = chiTietSPRepository.Update(ctsp,id);
        if (updatehoadon) {
            return "Sửa thành công id = " + id;
        }
        return "Sửa thất bại";
    }

    @Override
    public String Delete(int id) {
        boolean deleteCuaHang = chiTietSPRepository.Delete(id);
        if (deleteCuaHang) {
            return "Xóa thành công id = " + id;
        }
        return "Xóa thất bại";
    }
}
    
