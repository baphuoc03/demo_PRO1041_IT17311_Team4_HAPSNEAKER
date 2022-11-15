/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import repository.IThuocTinhSP_Repos;
import model.ThuocTinhSP_Model;
import viewmodel.ThuocTinhSP_ViewModel;
import repository.ThuocTinhSP_repos;
import service.IThuocTinhSP_Service;

/**
 *
 * @author 84353
 */

public class ThuocTinhSP_service implements IThuocTinhSP_Service{
    IThuocTinhSP_Repos repo = new ThuocTinhSP_repos();
    List<ThuocTinhSP_Model> list;
    
    public List<ThuocTinhSP_ViewModel> GetAllThuocTinhSP(){
        List<ThuocTinhSP_ViewModel> lst_view = new ArrayList<>();
        list = repo.GetAllThuocTinhSP();
        int stt = 1;
        for(ThuocTinhSP_Model t : list){
            lst_view.add(new ThuocTinhSP_ViewModel(stt, t.getId(), t.getSanPham().getMa(), String.valueOf(t.getKichThuoc().getMa()), t.getSl()));
        }
        return lst_view;
    }
    
    
}
