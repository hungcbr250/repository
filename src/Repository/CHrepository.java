/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import ViewModel.CH_VMD;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP probook
 */
public class CHrepository {

    dbconect db;
    PreparedStatement pst = null;
    ResultSet rs = null;
    List<CH_VMD> listCH = null;
    List<CH_VMD> listCH1 = null;

    public List<CH_VMD> getListCH() {
        listCH = new ArrayList<>();
        String sql = "select ma,ten,diachi,thanhpho,quocgia from CuaHang";
        try {
            pst = db.openDbConnection().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                CH_VMD c = new CH_VMD();
                c.setMa(rs.getString("ma"));
                c.setTen(rs.getNString("ten"));
                c.setDiaChi(rs.getNString("diachi"));
                c.setThanhPho(rs.getNString("thanhpho"));
                c.setQuocGia(rs.getNString("quocgia"));
                listCH.add(c);

            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CHrepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listCH;
    }

    public String themListCH(CH_VMD c) {

        String sql = "insert into cuahang(ma,ten,diachi,thanhpho,quocgia) values(?,?,?,?,?)";
        try {
            pst = db.openDbConnection().prepareStatement(sql);
            pst.setObject(1, c.getMa());
            pst.setObject(2, c.getTen());
            pst.setObject(3, c.getDiaChi());
            pst.setObject(4, c.getThanhPho());
            pst.setObject(5, c.getQuocGia());
            listCH.add(c);
            pst.executeUpdate();
            return "Thêm thành công";
        } catch (SQLException ex) {
            Logger.getLogger(CHrepository.class.getName()).log(Level.SEVERE, null, ex);

        }
        return "Thêm thất bại";
    }

    public String xoaCH(String ma) {

        String sql = "delete cuahang where ma=?";
        try {
            pst = db.openDbConnection().prepareStatement(sql);
            pst.setObject(1, ma);
            pst.executeUpdate();
            return "Xóa thành công";
        } catch (SQLException ex) {
            Logger.getLogger(CHrepository.class.getName()).log(Level.SEVERE, null, ex);
            return "Xóa thất bại";
        }

    }

    public List<CH_VMD> getListCH2(String m) {
        listCH1 = new ArrayList<>();
        String sql = "select ma,ten,diachi,thanhpho,quocgia from cuahang where diachi "
                + "like"+"'"+m+"%"+"'";
               // "select ma,ten,diachi,thanhpho,quocgia from cuahang where diachi like"+"'"+m+"%"+"'";
        try {
            pst = db.openDbConnection().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                CH_VMD c = new CH_VMD();
                c.setMa(rs.getString("ma"));
                c.setTen(rs.getNString("ten"));
                c.setDiaChi(rs.getNString("diachi"));
                c.setThanhPho(rs.getNString("thanhpho"));
                c.setQuocGia(rs.getNString("quocgia"));
                listCH1.add(c);

            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CHrepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listCH1;
    }

}
