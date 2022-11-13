/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomaiModel;

/**
 *
 * @author HP probook
 */
public class CH {

    private String id;
    private String Ma;
    private String Ten;
    private String DiaChi;
    private String ThanhPho;
    private String QuocGia;

    public CH() {
    }

    public CH(String id, String Ma, String Ten, String DiaChi, String ThanhPho, String QuocGia) {
        this.id = id;
        this.Ma = Ma;
        this.Ten = Ten;
        this.DiaChi = DiaChi;
        this.ThanhPho = ThanhPho;
        this.QuocGia = QuocGia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
