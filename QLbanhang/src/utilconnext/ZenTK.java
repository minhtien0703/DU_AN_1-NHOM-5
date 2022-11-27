/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilconnext;

import java.text.Normalizer;
import java.util.regex.Pattern;

/**
 *
 * @author ADMIN
 */
public class ZenTK {
        public static String Zenma(String value){
        if ( value.equals("")) {
          return "";
        }
         String temp = value.trim().toLowerCase();
         String[] Arrs = temp.split("\\s+");
         String finalName = viethoa(Arrs[Arrs.length - 1]).trim();// cat chuoi ve mang
         for (int i = 0; i < Arrs.length-1; i++) {
             finalName += laychu(Arrs[i]);
         }
        return unAccent(finalName);
         
     }
    private static String viethoa(String value) {
        String temp = value.trim().toLowerCase();// DUNG -> dung
        return String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1) + " ";
    }
    // phuong thuc lay chu cai dau
     private static String laychu(String value) {
        String temp = value.trim().toLowerCase();// DUNG -> D
        return String.valueOf(temp.charAt(0));
    }
     
    private static String unAccent(String s) {//Convert từ tiếng việt có dấu về tiếng việt 0 dấu
    String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
    Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    return pattern.matcher(temp).replaceAll("").replaceAll("Đ", "D").replace("đ", "");
    }
}
