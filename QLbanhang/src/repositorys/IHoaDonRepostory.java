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

    public List<HoaDon> GetAllHD();
    public List<HoaDonChiTiet> GetAllHDCT();
    Integer insertHoaDon(HoaDon hd);
    Integer insertHoaDonChiTiet(HoaDonChiTiet hdct , Integer idSP , Integer idHD );
    List<HoaDon> TimID(String ID);

}
