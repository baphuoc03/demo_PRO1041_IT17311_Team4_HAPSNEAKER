/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.ThuongHieu_Model;
import repository.IThuongHieu_Repos;
import repository.ThuongHieu_repos;
import service.IThuongHieu_Service;
import viewmodel.ThuongHieu_View;

/**
 *
 * @author baphuoc
 */
public class ThuongHieu_Service implements IThuongHieu_Service{
    IThuongHieu_Repos TH_repos = new ThuongHieu_repos();
    @Override
    public List<ThuongHieu_View> getAllThuongHieu() {
        List<ThuongHieu_Model> list = TH_repos.getAllThuongHieu();
        List<ThuongHieu_View> list_view = new ArrayList<>();
        int stt = 1;
        for (ThuongHieu_Model t : list) {
            list_view.add(new ThuongHieu_View(stt, t.getMa(), t.getTen()));
            stt++;
        }
        return list_view;
    }

    @Override
    public ThuongHieu_Model getThuongHieuByMa(String ma) {
        return TH_repos.getThuongHieuByMa(ma);
    }
    
}
