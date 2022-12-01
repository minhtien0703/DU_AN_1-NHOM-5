/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp;

import java.util.List;
import models.NSX;
import repositorys.INSXRepository;
import repositorys.imp.NSXRepository;
import services.INSXServices;

/**
 *
 * @author vieta
 */
public class NSXServices implements INSXServices{
     private INSXRepository nSXRepository = new NSXRepository();
    
    @Override
    public List<NSX> getAll(){
        return nSXRepository.getAll();
    }
    
    @Override
    public String Add(NSX nsx){
        boolean add = nSXRepository.Add(nsx);
        if(add){
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }
    
    @Override
    public String Update(NSX nsx,String id){
        boolean update = nSXRepository.Update(nsx, id);
        if(update){
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }
    
    @Override
    public String Delete(String id){
        boolean delete = nSXRepository.Delete(id);
        if(delete){
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }
}
