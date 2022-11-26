/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import viewmodels.HoaDonCTViewModel;

import viewmodels.HoaDonViewModel;

/**
 *
 * @author Win10
 */
public interface IHoaDonService {
public List<HoaDonViewModel> getAllHD();
public List<HoaDonCTViewModel> getAllHDCT();

    List<HoaDonViewModel> TimID(String ID);
}
