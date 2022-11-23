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

/**
 *
 * @author hungh
 */
public class ChucVuService implements IChucvuService {

    IChucvuRepo CVrepo = new Chucvurepo();

    @Override
    public List<Chucvu> getall() {
        List<Chucvu> lst = CVrepo.getall();
        return lst;

    }

}
