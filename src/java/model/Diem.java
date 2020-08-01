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
public class Diem {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private HocPhan hocPhan;

    private String ky;

    private int pCC;
    private int pKT;
    private int pTH;
    private int pBT;
    private int pThi;

    private double cc;
    private double kt;
    private double th;
    private double bt;
    private double thiL1;
    private double thiL2;

    private double tkHe10;
    private String tkHeChu;
    private double tkHe4;
    private String KQ;

    public Diem() {
    }

    public Diem(HocPhan hocPhan, String ky, int pCC, int pKT, int pTH, int pBT, int pThi, double cc, double kt, double th, double bt, double thiL1, double thiL2) {
        this.hocPhan = hocPhan;
        this.ky = ky;
        this.pCC = pCC;
        this.pKT = pKT;
        this.pTH = pTH;
        this.pBT = pBT;
        this.pThi = pThi;
        this.cc = cc;
        this.kt = kt;
        this.th = th;
        this.bt = bt;
        this.thiL1 = thiL1;
        this.thiL2 = thiL2;
    }

    public HocPhan getHocPhan() {
        return hocPhan;
    }

    public void setHocPhan(HocPhan hocPhan) {
        this.hocPhan = hocPhan;
    }

    public String getKy() {
        return ky;
    }

    public void setKy(String ky) {
        this.ky = ky;
    }

    public int getpCC() {
        return pCC;
    }

    public void setpCC(int pCC) {
        this.pCC = pCC;
    }

    public int getpKT() {
        return pKT;
    }

    public void setpKT(int pKT) {
        this.pKT = pKT;
    }

    public int getpTH() {
        return pTH;
    }

    public void setpTH(int pTH) {
        this.pTH = pTH;
    }

    public int getpBT() {
        return pBT;
    }

    public void setpBT(int pBT) {
        this.pBT = pBT;
    }

    public int getpThi() {
        return pThi;
    }

    public void setpThi(int pThi) {
        this.pThi = pThi;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public double getKt() {
        return kt;
    }

    public void setKt(double kt) {
        this.kt = kt;
    }

    public double getTh() {
        return th;
    }

    public void setTh(double th) {
        this.th = th;
    }

    public double getBt() {
        return bt;
    }

    public void setBt(double bt) {
        this.bt = bt;
    }

    public double getThiL1() {
        return thiL1;
    }

    public void setThiL1(double thiL1) {
        this.thiL1 = thiL1;
    }

    public double getThiL2() {
        return thiL2;
    }

    public void setThiL2(double thiL2) {
        this.thiL2 = thiL2;
    }

    public double getTkHe10() {
        return tkHe10;
    }

    public void setTkHe10(double tkHe10) {
        this.tkHe10 = tkHe10;
    }

    public String getTkHeChu() {
        return tkHeChu;
    }

    public void setTkHeChu(String tkHeChu) {
        this.tkHeChu = tkHeChu;
    }

    public String getKQ() {
        return KQ;
    }

    public void setKQ(String KQ) {
        this.KQ = KQ;
    }

    public double getTkHe4() {
        return tkHe4;
    }

    public void setTkHe4(double tkHe4) {
        this.tkHe4 = tkHe4;
    }

    @Override
    public String toString() {
        return "Diem{" + "id=" + id + ", hocPhan=" + hocPhan + ", ky=" + ky + ", pCC=" + pCC + ", pKT=" + pKT + ", pTH=" + pTH + ", pBT=" + pBT + ", pThi=" + pThi + ", cc=" + cc + ", kt=" + kt + ", th=" + th + ", bt=" + bt + ", thiL1=" + thiL1 + ", thiL2=" + thiL2 + ", tkHe10=" + tkHe10 + ", tkHeChu=" + tkHeChu + ", tkHe4=" + tkHe4 + ", KQ=" + KQ + '}';
    }

}
