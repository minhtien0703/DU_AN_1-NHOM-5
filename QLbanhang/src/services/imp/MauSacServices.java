/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp;

import java.util.List;
import models.MauSac;
import repositorys.IMauSacRepository;
import repositorys.imp.MauSacRepositoryimpl;
import services.IMauSacServices;

/**
 *
 * @author vieta
 */
public class MauSacServices implements IMauSacServices{
    private IMauSacRepository mauSacRepository = new MauSacRepositoryimpl();
    
    @Override
    public List<MauSac> getAll(){
        return mauSacRepository.getAll();
    }
    
    @Override
    public String Add(MauSac ms){
        boolean add = mauSacRepository.Add(ms);
        if(add){
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }
    
    @Override
    public String Update(MauSac ms,String id){
        boolean update = mauSacRepository.Update(ms, id);
        if(update){
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }
    
    @Override
    public String Delete(String id){
        boolean delete = mauSacRepository.Delete(id);
        if(delete){
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }
}
