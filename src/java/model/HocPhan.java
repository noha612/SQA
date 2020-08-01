/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ntnhu
 */
public class HocPhan {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String ma;
    private String ten;
    private int soTC;
    private String monTL;

    public HocPhan() {
    }

    public HocPhan(String ma, String ten, int soTC, String monTL) {
        this.ma = ma;
        this.ten = ten;
        this.soTC = soTC;
        this.monTL = monTL;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public String getMonTL() {
        return monTL;
    }

    public void setMonTL(String monTL) {
        this.monTL = monTL;
    }

    @Override
    public String toString() {
        return "HocPhan{" + "ma=" + ma + ", ten=" + ten + ", soTC=" + soTC + ", monTL=" + monTL + '}';
    }

}
