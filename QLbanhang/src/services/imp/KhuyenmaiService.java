/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.imp;
import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import models.KhuyenMai;
import repositorys.IKhuyenmaiRepository;
import repositorys.imp.KhuyenmaiReponsitory;
import services.IKhuyenmaiService;
import viewmodels.KhuyenmaiViewmodel;
/**
 *
 * @author ADMIN
 */
public class KhuyenmaiService implements IKhuyenmaiService{
    private IKhuyenmaiRepository repository;
    private List<KhuyenmaiViewmodel> lstKM;
    public KhuyenmaiService() {
        repository = new KhuyenmaiReponsitory();
    }

    @Override
    public List<KhuyenmaiViewmodel> GetALL() {
        List<KhuyenMai>lst = repository.GetAll();
        lstKM = new ArrayList<>();
        for (KhuyenMai x : lst) {
            lstKM.add(new KhuyenmaiViewmodel(x.getTenKm(), x.getHinhthucKM(), x.getNgaybatdau(), x.getNgayketthuc(), x.getGiatrigiam()));
        }
        return lstKM;
    }

    @Override
    public boolean Add(KhuyenmaiViewmodel km) {
        boolean isAdd = repository.Add(new KhuyenMai( km.getTenKm(), km.getHinhthucKM(), km.getNgaybatdau(), km.getNgayketthuc(), km.getGiatrigiam()));
        return isAdd;
    }

    @Override
    public boolean Update(KhuyenmaiViewmodel km, String id) {
        boolean isUpdate = repository.Update(new KhuyenMai(km.getTenKm(), km.getHinhthucKM(), km.getNgaybatdau(), km.getNgayketthuc(), km.getGiatrigiam()), id);
        return isUpdate;
    }

    @Override
    public boolean Delete(String id) {
        boolean isDelete = repository.Delete( id);
        return isDelete;    }

    @Override
    public String checktrung(String ten) {
        return repository.checktrung(ten);
    }
    
}
