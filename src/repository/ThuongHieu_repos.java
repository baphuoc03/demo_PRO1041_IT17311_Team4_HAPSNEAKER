/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.ThuongHieu_Model;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import ultinities.JDBC_Helper;

/**
 *
 * @author baphuoc
 */
public class ThuongHieu_repos implements IThuongHieu_Repos{

    @Override
    public List<ThuongHieu_Model> getAllThuongHieu() {
        List<ThuongHieu_Model> list = new ArrayList<>();
        String sql = "SELECT * FROM hap_sneaker.thuonghieu";
        ResultSet rs= JDBC_Helper.Query(sql);
        try {
            while(rs.next()){
                list.add(new ThuongHieu_Model(rs.getString(1),rs.getString(2)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public ThuongHieu_Model getThuongHieuByMa(String ma) {
        ThuongHieu_Model TH = null;
        String sql = "SELECT * FROM hap_sneaker.thuonghieu WHERE MaThuongHieu = ?";
        ResultSet rs= JDBC_Helper.Query(sql);
        try {
            while(rs.next()){
                TH = new ThuongHieu_Model(rs.getString(1),rs.getString(2));
            }
            return TH;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
}
