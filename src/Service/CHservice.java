/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import ViewModel.CH_VMD;
import java.util.List;
import javax.print.DocFlavor;

/**
 *
 * @author HP probook
 */
public interface CHservice {

    public List<CH_VMD> getListCH();

    public String themCH(CH_VMD c);

    public String xoaCH(String ma);

    public List<CH_VMD> getListCH2(String m);

}
