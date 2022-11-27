/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorys;

import java.util.List;
import models.HoaDon;
import models.HoaDonChiTiet;

/**
 *
 * @author Admin
 */
public interface IHoaDonRepostory {

<<<<<<< HEAD
    public List<HoaDon> GetAllHD();
    public List<HoaDonChiTiet> GetAllHDCT();
    Integer insertHoaDon(HoaDon hd);
    Integer insertHoaDonChiTiet(HoaDonChiTiet hdct , Integer idSP , Integer idHD );
    List<HoaDon> TimID(String ID);

=======
    Integer insertHoaDon(HoaDon hd, Integer idNV);

    Integer insertHoaDonChiTiet(HoaDonChiTiet hdct);

    List<HoaDon> getListHD(int TrangThai);

    Integer getIdHD(String MaHD);

    List<HoaDonChiTiet> getListHoaDonChiTiet(String MaHD);

    Integer deleteSanPham(int idHD, int idSP);

    Integer updateSanPhamTrenGioHang(int idHD, int idSP, int SoLuong);

    Integer clearSanPhamTrenGioHang(int idHD);

    Integer getIDCTSP(int MaHD);

    Integer updateSoLuongGioHang(int SoLuong,String MaSP , String MaHD);
>>>>>>> b94651137ba6c8db04c4cb80993343759178f986
}
