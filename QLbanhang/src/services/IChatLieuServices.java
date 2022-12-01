/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import models.ChatLieu;

/**
 *
 * @author vieta
 */
public interface IChatLieuServices {
    List<ChatLieu> getAll();
    
    String Add(ChatLieu cl);
    
    String Update(ChatLieu cl,String id);
    
    String Delete(String id);
}
