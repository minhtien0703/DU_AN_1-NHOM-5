/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorys;

import java.util.List;
import models.ChiTietSP;

/**
 *
 * @author vieta
 */
public interface IChiTietSPRepository {
    public List<ChiTietSP> getAll();
    
    public boolean Add(ChiTietSP ctsp);
    
    public boolean Update(ChiTietSP ctsp, int id);
    
    public boolean Delete(int id);
}
