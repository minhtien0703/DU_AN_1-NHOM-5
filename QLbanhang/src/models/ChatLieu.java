/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class ChatLieu {
    private String id;
    private String Ten;
    
    public ChatLieu() {
    }

    public ChatLieu(String id, String Ten) {
        this.id = id;
        this.Ten = Ten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }
  

    @Override
    public String toString() {
        return  Ten ;
    }
    
    
}
