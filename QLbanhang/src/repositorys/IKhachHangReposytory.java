/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorys;

import java.util.List;
import models.KhachHang;
import models.KhuyenMai;
import viewmodels.KhachHangViewMD;

/**
 *
 * @author PC
 */
public interface IKhachHangReposytory {

    List<KhachHang> getall();

    boolean add(KhachHang khachhang);

    boolean update(int id, KhachHang khachhang);

    boolean delete(int id);

}