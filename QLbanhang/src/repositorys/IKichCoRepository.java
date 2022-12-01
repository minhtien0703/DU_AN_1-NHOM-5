/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorys;

import java.util.List;
import models.KichCo;

/**
 *
 * @author vieta
 */
public interface IKichCoRepository {
    public List<KichCo> getAll();
    
    public boolean Add(KichCo kc);
    
    public boolean Update(KichCo kc,String id);
    
    public boolean Delete(String id);
}
