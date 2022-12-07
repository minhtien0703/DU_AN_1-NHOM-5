/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp;

import java.util.ArrayList;
import java.util.List;
import models.ChiTietSP;
import repositorys.IChatLieuRepository;
import repositorys.IChiTietSPRepository;
import repositorys.IDanhMucSPRepository;
import repositorys.IKhuyenmaiRepository;
import repositorys.IKichCoRepository;
import repositorys.IMauSacRepository;
import repositorys.INSXRepository;
import repositorys.IThuongHieuRepository;
import repositorys.imp.ChatLieuRepositoryimpl;
import repositorys.imp.ChiTietSPRepository;
import repositorys.imp.DanhMucSPRepository;
import repositorys.imp.KhuyenmaiReponsitory;
import repositorys.imp.KichCoRepositoryimpl;
import repositorys.imp.MauSacRepositoryimpl;
import repositorys.imp.NSXRepository;
import repositorys.imp.ThuongHieuRepository;
import services.IChiTietSPServices;
import viewmodels.ChiTietSPViewModel;

/**
 *
 * @author vieta
 */
public class ChiTietSPServices implements IChiTietSPServices {

    private IChiTietSPRepository chiTietSPRepository = new ChiTietSPRepository();
    private INSXRepository iNSX = new NSXRepository();
    private IMauSacRepository imausac = new MauSacRepositoryimpl();
    private IDanhMucSPRepository idanhmuc = new DanhMucSPRepository();
    private IKichCoRepository ikichco = new KichCoRepositoryimpl();
    private IChatLieuRepository ichatlieu = new ChatLieuRepositoryimpl();
    private IThuongHieuRepository ithuonghieu = new ThuongHieuRepository();
    private IKhuyenmaiRepository ikhuyenmai = new KhuyenmaiReponsitory();

    @Override
    public List<ChiTietSPViewModel> getAll() {
        List<ChiTietSP> list = chiTietSPRepository.getAll();
        List<ChiTietSPViewModel> lst = new ArrayList<>();
        for (ChiTietSP x : list) {
            lst.add(new ChiTietSPViewModel(
                    x.getMa(),
                    x.getTen(),
                    iNSX.getbyid(x.getIdnsx()),
                    imausac.getbyid(x.getIdmausac()),
                    idanhmuc.getdanhmucbyid(x.getIddanhmuc()),
                    ikichco.getbyid(x.getIdkc()),
                    ichatlieu.getbyid(x.getIdcl()),
                    ithuonghieu.getbyid(x.getIdth()),
                    ikhuyenmai.getbyid(x.getIdkm()),
                    x.getSoluongton(),
                    x.getGianhap(),
                    x.getGiaban(),
                    x.getMota(),
                    x.getQrcode()));
        }
        return lst;
    }

    @Override
    public List<ChiTietSPViewModel> getlistbyTen(String ten) {
        List<ChiTietSP> list = chiTietSPRepository.getlistbyTen(ten);
        List<ChiTietSPViewModel> lst = new ArrayList<>();
        for (ChiTietSP x : list) {
            lst.add(new ChiTietSPViewModel(
                    x.getMa(),
                    x.getTen(),
                    iNSX.getbyid(x.getIdnsx()),
                    imausac.getbyid(x.getIdmausac()),
                    idanhmuc.getdanhmucbyid(x.getIddanhmuc()),
                    ikichco.getbyid(x.getIdkc()),
                    ichatlieu.getbyid(x.getIdcl()),
                    ithuonghieu.getbyid(x.getIdth()),
                    ikhuyenmai.getbyid(x.getIdkm()),
                    x.getSoluongton(),
                    x.getGianhap(),
                    x.getGiaban(),
                    x.getMota(),
                    x.getQrcode()));
        }
        
        return lst;
    }

    @Override
    public String Add(ChiTietSPViewModel x) {
        System.out.println(x.toString());
        ChiTietSP ctsp = new ChiTietSP(x.getMa(), x.getTen(), x.getNsx().getId(), x.getMausac().getId(), x.getDanhmuc().getId(), x.getKichco().getId(), x.getChatlieu().getId(), x.getThuonghieu().getId(), Integer.parseUnsignedInt(x.getKhuyenmai().getID()), x.getSoluongton(), x.getGianhap(), x.getGiaban(), x.getMota(), x.getQrcode());
        if (chiTietSPRepository.insert(ctsp) == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Update(String ma, ChiTietSPViewModel x) {
        ChiTietSP ctsp = new ChiTietSP(x.getMa(), x.getTen(), x.getNsx().getId(), x.getMausac().getId(), x.getDanhmuc().getId(), x.getKichco().getId(), x.getChatlieu().getId(), x.getThuonghieu().getId(), Integer.parseUnsignedInt(x.getKhuyenmai().getID()), x.getSoluongton(), x.getGianhap(),x.getGiaban() , x.getMota(), x.getQrcode());
        if (chiTietSPRepository.update(ctsp, ma) == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Delete(String ma) {
        if (chiTietSPRepository.delete(ma) == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public List<ChiTietSPViewModel> getSPhet() {
       List<ChiTietSP> list = chiTietSPRepository.getSPhet();
        List<ChiTietSPViewModel> lst = new ArrayList<>();
        for (ChiTietSP x : list) {
            lst.add(new ChiTietSPViewModel(
                    x.getMa(),
                    x.getTen(),
                    iNSX.getbyid(x.getIdnsx()),
                    imausac.getbyid(x.getIdmausac()),
                    idanhmuc.getdanhmucbyid(x.getIddanhmuc()),
                    ikichco.getbyid(x.getIdkc()),
                    ichatlieu.getbyid(x.getIdcl()),
                    ithuonghieu.getbyid(x.getIdth()),
                    ikhuyenmai.getbyid(x.getIdkm()),
                    x.getSoluongton(),
                    x.getGianhap(),
                    x.getGiaban(),
                    x.getMota(),
                    x.getQrcode()));
        }
        return lst; 
    }

}
