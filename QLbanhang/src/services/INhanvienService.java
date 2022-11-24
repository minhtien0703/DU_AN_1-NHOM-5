/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import models.Nhanvien;
import viewmodels.NhanVienview;

/**
 *
 * @author hungh
 */
public interface INhanvienService {

    public List<NhanVienview> getAllNhanVien();

    Integer add(Nhanvien nv);

    Integer update(Nhanvien id);

    Integer delete(Integer id);

    List<NhanVienview> SearchNVV(String Ten);

    public Nhanvien getbyid(String id);
}
