/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author vieta
 */
public class DanhMucSP {
   
   private String ten;

    public DanhMucSP() {
    }

    public DanhMucSP( String ten) {
       
        this.ten = ten;
    }

  

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return  ten ;
    }
   
   
}
