/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import models.KhachHang;

/**
 *
 * @author PC
 */
public interface KhachHangSV {
      List<KhachHang > getall();

    String add(KhachHang khachHang);

    String update(int id, KhachHang khachHang);

    String delete(int id);
    
}
