/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorys;

import java.util.List;
import models.NSX;

/**
 *
 * @author vieta
 */
public interface INSXRepository {

    public List<NSX> getAll();

    public boolean Add(NSX nsx);

    public boolean Update(NSX nsx, String id);

    public boolean Delete(String id);
}
