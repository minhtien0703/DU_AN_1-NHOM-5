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

    public List<ChiTietSPViewModel> getAll();

    public List<ChiTietSPViewModel> getlistbyTen(String ten);

    String Add(ChiTietSPViewModel x);

    String Update(String ma, ChiTietSPViewModel x);

    String Delete(String ma);

    public List<ChiTietSPViewModel> getSPhet();
    
}
