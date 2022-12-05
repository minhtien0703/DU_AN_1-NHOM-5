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
    public int gethdday();
    public List<Thongke> getbyday(String date);
    public List<Thongke> getbymonth(String date);
    public List<Thongke> getbyyear(String date);
    public List<Thongke> getsp();
    public List<Thongke> getnv();
    public int getmonth1();
    public int getmonth2();
    public int getmonth3();
    public int getmonth4();
    public int getmonth5();
    public int getmonth6();
    public int getmonth7();
    public int getmonth8();
    public int getmonth9();
    public int getmonth10();
    public int getmonth11();
    public int getmonth12();
}
