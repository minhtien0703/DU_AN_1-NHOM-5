/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorys;

import java.util.List;
import models.MauSac;

/**
 *
 * @author vieta
 */
public interface IMauSacRepository {
    public List<MauSac> getAll();
    
    public boolean Add(MauSac ms);
    
    public boolean Update(MauSac ms,String id);
    
    public boolean Delete(String id);
}
