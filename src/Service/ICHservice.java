/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import ViewModel.CH_VMD;
import Repository.CHrepository;
import java.util.List;

/**
 *
 * @author HP probook
 */
public class ICHservice implements CHservice {

    public ICHservice() {
    }
    CHrepository cHrepository = new CHrepository();

    @Override
    public List<CH_VMD> getListCH() {
        return cHrepository.getListCH();
    }

    public String themCH(CH_VMD c) {
        return cHrepository.themListCH(c);
    }

    public String xoaCH(String ma) {
        return cHrepository.xoaCH(ma);
    }

    public List<CH_VMD> getListCH2(String m) {
        return cHrepository.getListCH2(m);
    }

}
