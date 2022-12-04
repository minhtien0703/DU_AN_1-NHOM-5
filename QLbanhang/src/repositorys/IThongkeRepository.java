/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorys;

import java.util.List;
import models.Thongke;

/**
 *
 * @author ADMIN
 */
public interface IThongkeRepository {
    public List<Thongke> getbyday();
    public List<Thongke> getbymonth();
    public List<Thongke> getbyyear();
    public List<Thongke> getbyday(String date);
    public List<Thongke> getbymonth(String date);
    public List<Thongke> getbyyear(String date);
    public List<Thongke> getbyall(String day,String month,String year);
    public List<Thongke> getsp();
    public List<Thongke> getnv();
}
