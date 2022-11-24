/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp;

import java.util.ArrayList;
import java.util.List;
import models.Nhanvien;
import repositorys.INhanvienReposytory;
import repositorys.imp.NhanvienReposytory;
import services.INhanvienService;
import viewmodels.NhanVienview;

/**
 *
 * @author hungh
 */
public class NhanVienService implements INhanvienService {

    private final NhanvienReposytory nhanvienReposytory = new NhanvienReposytory();

    @Override
    public List<NhanVienview> getAllNhanVien() {
        return nhanvienReposytory.getAllNhanVien();
    }

    @Override
    public Integer add(Nhanvien nv) {
        return nhanvienReposytory.add(nv);
    }

    @Override
    public Integer update(Nhanvien id) {
        return nhanvienReposytory.update(id);
    }

    @Override
    public Integer delete(Integer id) {
        return nhanvienReposytory.delete(id);
    }

    @Override
    public List<NhanVienview> SearchNVV(String Ten) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Nhanvien getbyid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
