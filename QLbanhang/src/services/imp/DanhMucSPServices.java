/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp;

import java.util.List;
import models.DanhMucSP;
import repositorys.IDanhMucSPRepository;
import repositorys.imp.DanhMucSPRepository;
import services.IDanhMucSPServices;

/**
 *
 * @author vieta
 */
public class DanhMucSPServices implements IDanhMucSPServices{
     private IDanhMucSPRepository danhMucSPRepository = new DanhMucSPRepository();
    
    @Override
    public List<DanhMucSP> getAll(){
        return danhMucSPRepository.getAll();
    }
    
    @Override
    public String Add(DanhMucSP dmsp){
        boolean add = danhMucSPRepository.Add(dmsp);
        if(add){
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }
    
    @Override
    public String Update(DanhMucSP dmsp,String id){
        boolean update = danhMucSPRepository.Update(dmsp, id);
        if(update){
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }
    
    @Override
    public String Delete(String id){
        boolean delete = danhMucSPRepository.Delete(id);
        if(delete){
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }
}
