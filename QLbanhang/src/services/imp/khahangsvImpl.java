/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp;

import java.util.ArrayList;
import java.util.List;
import models.KhachHang;
import repositorys.KhachHangRP;
import repositorys.imp.KhachHangRPImpl;
import services.KhachHangSV;
import viewmodels.KhachHangViewMD;

/**
 *
 * @author PC
 */
public class khahangsvImpl implements KhachHangSV {

    private KhachHangRP khachHang01 = new KhachHangRPImpl();

    @Override
    public List<KhachHangViewMD> getall() {
        List<KhachHangViewMD> list01 = new ArrayList<>();

        List<KhachHang> list = khachHang01.getall();
        for (KhachHang x : list) {
            list01.add(new KhachHangViewMD(x.getId(), x.getTen(), x.getTendem(), x.getHo(), x.getGioitinh(), x.getNgaysinh(), x.getSdt(), x.getEmail(), x.getDiemthuong()));
        }
        return list01;

    }

    @Override
    public String add(KhachHang khachHang) {
        boolean addkhachhang = khachHang01.add(khachHang);
        if (addkhachhang) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(int id, KhachHang khachHang) {
        boolean updatehoadon = khachHang01.update(id, khachHang);
        if (updatehoadon) {
            return "Sửa thành công id = " + id;
        }
        return "Sửa thất bại";
    }

    @Override
    public String delete(int id) {
        boolean deleteCuaHang = khachHang01.delete(id);
        if (deleteCuaHang) {
            return "Xóa thành công id = " + id;
        }
        return "Xóa thất bại";
    }

}
