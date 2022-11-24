/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.imp;

import java.util.List;
import models.Chucvu;
import repositorys.IChucvuRepo;
import repositorys.imp.Chucvurepo;
import services.IChucvuService;
import viewmodels.ChucVuView;

/**
 *
 * @author hungh
 */
public class ChucVuService implements IChucvuService {

    private final Chucvurepo chucvurepo = new Chucvurepo();
    @Override
    public List<ChucVuView> getAllChucVu() {
        return chucvurepo.getAllChucVu();
    }

    

}
