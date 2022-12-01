/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import models.KichCo;

/**
 *
 * @author vieta
 */
public interface IKichCoServices {
    List<KichCo> getAll();
    
    String Add(KichCo kc);
    
    String Update(KichCo kc,String id);
    
    String Delete(String id);
}
