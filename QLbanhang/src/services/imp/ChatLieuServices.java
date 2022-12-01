/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp;

import java.util.List;
import models.ChatLieu;
import repositorys.IChatLieuRepository;
import repositorys.imp.ChatLieuRepositoryimpl;
import services.IChatLieuServices;

/**
 *
 * @author vieta
 */
public class ChatLieuServices implements IChatLieuServices{
     private IChatLieuRepository chatLieuRepository = new ChatLieuRepositoryimpl();
    
    @Override
    public List<ChatLieu> getAll(){
        return chatLieuRepository.getAll();
    }
    
    @Override
    public String Add(ChatLieu cl){
        boolean add = chatLieuRepository.Add(cl);
        if(add){
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }
    
    @Override
    public String Update(ChatLieu cl,String id){
        boolean update = chatLieuRepository.Update(cl, id);
        if(update){
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }
    
    @Override
    public String Delete(String id){
        boolean delete = chatLieuRepository.Delete(id);
        if(delete){
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }
}
