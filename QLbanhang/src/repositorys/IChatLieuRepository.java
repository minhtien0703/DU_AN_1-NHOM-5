/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorys;

import java.util.List;
import models.ChatLieu;

/**
 *
 * @author vieta
 */
public interface IChatLieuRepository {
        public List<ChatLieu> getAll();

        public boolean Add(ChatLieu cl);

        public boolean Update(ChatLieu cl,String id);

        public boolean Delete(String id);
}
