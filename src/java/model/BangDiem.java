/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author ntnhu
 */
public class BangDiem {

    private SinhVien sinhVien;
    private String kyHoc;
    private List<Diem> diems;

    private double tbHocKyHe4;
    private double tbTichLuyHe4;
    private int soTinChiDat;
    private int soTinChiTichLuy;
    private String danhGia;

    public BangDiem() {
    }

    public BangDiem(SinhVien sinhVien, String kyHoc, List<Diem> diems) {
        this.sinhVien = sinhVien;
        this.kyHoc = kyHoc;
        this.diems = diems;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public String getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(String kyHoc) {
        this.kyHoc = kyHoc;
    }

    public List<Diem> getDiems() {
        return diems;
    }

    public void setDiems(List<Diem> diems) {
        this.diems = diems;
    }

    public double getTbHocKyHe4() {
        return tbHocKyHe4;
    }

    public void setTbHocKyHe4(double tbHocKyHe4) {
        this.tbHocKyHe4 = tbHocKyHe4;
    }

    public double getTbTichLuyHe4() {
        return tbTichLuyHe4;
    }

    public void setTbTichLuyHe4(double tbTichLuyHe4) {
        this.tbTichLuyHe4 = tbTichLuyHe4;
    }

    public int getSoTinChiDat() {
        return soTinChiDat;
    }

    public void setSoTinChiDat(int soTinChiDat) {
        this.soTinChiDat = soTinChiDat;
    }

    public int getSoTinChiTichLuy() {
        return soTinChiTichLuy;
    }

    public void setSoTinChiTichLuy(int soTinChiTichLuy) {
        this.soTinChiTichLuy = soTinChiTichLuy;
    }

    public String getDanhGia() {
        return danhGia;
    }

    public void setDanhGia(String danhGia) {
        this.danhGia = danhGia;
    }

    @Override
    public String toString() {
        return "BangDiem{" + "sinhVien=" + sinhVien + ", kyHoc=" + kyHoc + ", diems=" + diems + ", tbHocKyHe4=" + tbHocKyHe4 + ", tbTichLuyHe4=" + tbTichLuyHe4 + ", soTinChiDat=" + soTinChiDat + ", soTinChiTichLuy=" + soTinChiTichLuy + ", danhGia=" + danhGia + '}';
    }

    //Clone doi tuong
    public BangDiem(BangDiem another) {
        this.sinhVien = another.getSinhVien();
        this.danhGia = another.getDanhGia();
        this.diems = another.getDiems();
        this.kyHoc = another.getKyHoc();
        this.soTinChiDat = another.getSoTinChiDat();
        this.soTinChiTichLuy = another.getSoTinChiTichLuy();
        this.tbHocKyHe4 = another.getTbHocKyHe4();
        this.tbTichLuyHe4 = another.getTbTichLuyHe4();
    }
}
