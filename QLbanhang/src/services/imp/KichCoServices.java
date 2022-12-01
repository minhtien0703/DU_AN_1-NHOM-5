/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp;

import java.util.List;
import models.KichCo;
import repositorys.IKichCoRepository;
import repositorys.imp.KichCoRepositoryimpl;
import services.IKichCoServices;

/**
 *
 * @author vieta
 */
public class KichCoServices implements IKichCoServices{
    private IKichCoRepository kichCoRepository = new KichCoRepositoryimpl();
    
    @Override
    public List<KichCo> getAll(){
        return kichCoRepository.getAll();
    }
    
    @Override
    public String Add(KichCo kc){
        boolean add = kichCoRepository.Add(kc);
        if(add){
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }
    
    @Override
    public String Update(KichCo kc,String id){
        boolean update = kichCoRepository.Update(kc, id);
        if(update){
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }
    
    @Override
    public String Delete(String id){
        boolean delete = kichCoRepository.Delete(id);
        if(delete){
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }
}
