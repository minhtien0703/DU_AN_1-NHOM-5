/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorys;

import java.util.List;
import models.ThuongHieu;

/**
 *
 * @author vieta
 */
public interface IThuongHieuRepository {
    public List<ThuongHieu> getAll();
    
    public boolean Add(ThuongHieu th);
    
    public boolean Update(ThuongHieu th,String id);
    
    public boolean Delete(String id);
}
