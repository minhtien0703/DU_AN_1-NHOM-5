/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import models.ChiTietSP;
import viewmodels.ChiTietSPViewModel;

/**
 *
 * @author vieta
 */
public interface IChiTietSPServices {
    List<ChiTietSPViewModel> getAll();
    
    String Add(ChiTietSP ctsp);
    
    String Update(int id, ChiTietSP ctsp);
    
    String Delete(int id);
}
