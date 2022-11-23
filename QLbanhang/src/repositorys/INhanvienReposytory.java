/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorys;

import java.util.List;
import models.Nhanvien;
import viewmodels.NhanVienview;

/**
 *
 * @author hungh
 */
public interface INhanvienReposytory {
    public List<Nhanvien> getAll();
    public int add(Nhanvien x);
    public int update(Nhanvien x,String id);
    public int delete(String id);
    public Nhanvien getbyid(String id);
}
