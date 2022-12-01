/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorys;

import java.util.List;
import models.DanhMucSP;

/**
 *
 * @author vieta
 */
public interface IDanhMucSPRepository {
    public List<DanhMucSP> getAll();
    
    public boolean Add(DanhMucSP dmsp);
    
    public boolean Update(DanhMucSP dmsp,String id);
    
    public boolean Delete(String id);
}
