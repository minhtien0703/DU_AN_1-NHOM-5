/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp;

import java.util.List;
import models.ThuongHieu;
import repositorys.IThuongHieuRepository;
import repositorys.imp.ThuongHieuRepository;
import services.IThuongHieuServices;

/**
 *
 * @author vieta
 */
public class ThuongHieuServices implements IThuongHieuServices{
     private IThuongHieuRepository thuongHieuRepository = new ThuongHieuRepository();
    
    @Override
    public List<ThuongHieu> getAll(){
        return thuongHieuRepository.getAll();
    }
    
    @Override
    public String Add(ThuongHieu th){
        boolean add = thuongHieuRepository.Add(th);
        if(add){
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }
    
    @Override
    public String Update(ThuongHieu th,String id){
        boolean update = thuongHieuRepository.Update(th, id);
        if(update){
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }
    
    @Override
    public String Delete(String id){
        boolean delete = thuongHieuRepository.Delete(id);
        if(delete){
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }
}
