/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import models.DanhMucSP;

/**
 *
 * @author vieta
 */
public interface IDanhMucSPServices {
    List<DanhMucSP> getAll();
    
    String Add(DanhMucSP dmsp);
    
    String Update(DanhMucSP dmsp,String id);
    
    String Delete(String id);
}
