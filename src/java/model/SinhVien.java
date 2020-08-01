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
public class SinhVien {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String maSV;
    private String matKhau;
    private String hoTen;
    private String lop;
    private String khoaHoc;
    private String heDaoTao;
    private String khoa;
    private String nganh;

    public SinhVien(String maSV, String matKhau, String hoTen, String lop, String khoaHoc, String heDaoTao, String khoa, String nganh) {
        this.maSV = maSV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.heDaoTao = heDaoTao;
        this.khoa = khoa;
        this.nganh = nganh;
    }

    public SinhVien() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String getHeDaoTao() {
        return heDaoTao;
    }

    public void setHeDaoTao(String heDaoTao) {
        this.heDaoTao = heDaoTao;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", matKhau=" + matKhau + ", hoTen=" + hoTen + ", lop=" + lop + ", khoaHoc=" + khoaHoc + ", heDaoTao=" + heDaoTao + ", khoa=" + khoa + ", nganh=" + nganh + '}';
    }

}
