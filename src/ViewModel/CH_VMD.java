/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModel;

/**
 *
 * @author HP probook
 */
public class CH_VMD {
    private String Ma;
    private String Ten;
    private String DiaChi;
    private String ThanhPho;
    private String QuocGia;

    public CH_VMD() {
    }

    public CH_VMD(String Ma, String Ten, String DiaChi, String ThanhPho, String QuocGia) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.DiaChi = DiaChi;
        this.ThanhPho = ThanhPho;
        this.QuocGia = QuocGia;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getThanhPho() {
        return ThanhPho;
    }

    public void setThanhPho(String ThanhPho) {
        this.ThanhPho = ThanhPho;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }
    
}
