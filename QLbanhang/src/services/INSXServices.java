/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import models.NSX;

/**
 *
 * @author vieta
 */
public interface INSXServices {
    List<NSX> getAll();
    
    String Add(NSX nsx);
    
    String Update(NSX nsx,String id);
    
    String Delete(String id);
}
