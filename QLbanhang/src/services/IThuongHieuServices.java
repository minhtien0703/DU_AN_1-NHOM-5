/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import models.ThuongHieu;

/**
 *
 * @author vieta
 */
public interface IThuongHieuServices {
    List<ThuongHieu> getAll();
    
    String Add(ThuongHieu th);
    
    String Update(ThuongHieu th,String id);
    
    String Delete(String id);
}
