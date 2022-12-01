/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import models.MauSac;

/**
 *
 * @author vieta
 */
public interface IMauSacServices {
    List<MauSac> getAll();
    
    String Add(MauSac ms);
    
    String Update(MauSac ms,String id);
    
    String Delete(String id);
}
