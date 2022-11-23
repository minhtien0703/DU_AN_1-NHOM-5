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

    private INhanvienReposytory NhanvienRepo = new NhanvienReposytory();

    @Override
    public List<NhanVienview> getAll() {
        var nhanvien = NhanvienRepo.getAll();
        List<NhanVienview> lstNhanvien = new ArrayList<>();
        for (Nhanvien x : nhanvien) {
            NhanVienview xx = new NhanVienview(x.getId(), x.getHo(), x.getTendem(), x.getTen(), x.getNgaysinh(), x.getGioitinh(), x.getTrangthai(), x.getChucvu() + "", x.getTaikhoan(), x.getMatkhau(), x.getSdt(), x.getEmail());
            lstNhanvien.add(xx);
        }
        return lstNhanvien;
    }

    @Override
    public int add(Nhanvien x) {
        return NhanvienRepo.add(x);
    }

    @Override
    public int update(Nhanvien x, String id) {
        return NhanvienRepo.update(x, id);
    }

    @Override
    public int delete(String id) {
        return NhanvienRepo.delete(id);
    }

    @Override
    public Nhanvien getbyid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
