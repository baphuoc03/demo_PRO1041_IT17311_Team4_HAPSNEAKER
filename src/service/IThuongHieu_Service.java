/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.ThuongHieu_Model;
import viewmodel.ThuongHieu_View;

/**
 *
 * @author baphuoc
 */
public interface IThuongHieu_Service {
    List<ThuongHieu_View> getAllThuongHieu();
    ThuongHieu_Model getThuongHieuByMa(String ma);
}
