/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys.imp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import models.Chucvu;
import repositorys.IChucvuRepo;
import utilconnext.DBConnection;

/**
 *
 * @author hungh
 */
public class Chucvurepo implements IChucvuRepo {

    final String SELECT_ALL_SQL = "SELECT Id,Ten FROM ChucVu";
    final String SELECT_BY_SQL = "SELECT Id,Ten FROM dbo.ChucVu WHERE Id = ?";

    @Override
    public List<Chucvu> getall() {
        //return getSelectSQL(SELECT_ALL_SQL);
        return getselectSQL(SELECT_ALL_SQL);
    }

//    private List<Chucvu> getSelectSQL(String SQL, Object... arvg) {
//        List<Chucvu> lst = new ArrayList<>();
//        try {
//            ResultSet rl = DBConnection.getDataFromQuery(SQL, arvg);
//            while (rl.next()) {
//                String id = (String) rl.getObject(1);
//                String ten = (String) rl.getObject(2);
//                lst.add(new Chucvu(id, ten));
//                System.out.println(lst.toString());
//            }
//        } catch (Exception e) {
//        }
//        return lst;
//    }
    private List<Chucvu> getselectSQL(String SQL, Object... args) {
        List<Chucvu> lst = new ArrayList<>();
        try {
            ResultSet rl = DBConnection.getDataFromQuery(SQL, args);
            while (rl.next()) {
                lst.add(new Chucvu(rl.getString(1),rl.getString(2)));
            }
        } catch (Exception e) {
        }
        return lst;

    }

}
