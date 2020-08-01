/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import model.Diem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
public class DiemUtils {
    //Loai bo bang diem khong hop le, co diem am, thieu diem thanh phan
    public static List<Diem> validateDiem(List<Diem> diems) {
        for (Diem i : diems) {
            if (i.getHocPhan().getSoTC() <= 0)
                return new ArrayList<>();
            if (i.getpCC() + i.getpBT() + i.getpKT() + i.getpTH() + i.getpThi() != 100) {
                return new ArrayList<>();
            }
            if (i.getpCC() < 0 || i.getpBT() < 0 || i.getpKT() < 0 || i.getpTH() < 0 || i.getpThi() < 0) {
                return new ArrayList<>();
            }
            if (
                    (i.getCc() < 0 || i.getCc() > 10) ||
                            (i.getBt() < 0 || i.getBt() > 10) ||
                            (i.getKt() < 0 || i.getKt() > 10) ||
                            (i.getTh() < 0 || i.getTh() > 10) ||
                            (i.getThiL1() < 0 || i.getThiL1() > 10) ||
                            (i.getThiL2() < 0 || i.getThiL2() > 10)
            ) {
                return new ArrayList<>();
            }
        }
        return diems;
    }

    //Tinh tong ket diem thang 10 cua mon hoc
    public static double getTongKetHe10(Diem diem) {
        if (diem.getCc() == 0 && diem.getpCC() != 0) {
            return 0;
        }
        if (diem.getBt() == 0 && diem.getpBT() != 0) {
            return 0;
        }
        if (diem.getKt() == 0 && diem.getpKT() != 0) {
            return 0;
        }
        if (diem.getTh() == 0 && diem.getpTH() != 0) {
            return 0;
        }
        if (diem.getpThi() != 0 && diem.getThiL1() == 0 && diem.getThiL2() == 0) {
            return 0;
        }
        double diemThi;
        if (diem.getThiL2() == 0) {
            diemThi = diem.getThiL1();
        } else {
            diemThi = diem.getThiL2();
        }
        double tongKetHe10 = (double) Math.round(
                (diem.getpCC() * diem.getCc()
                        + diem.getpBT() * diem.getBt()
                        + diem.getpKT() * diem.getKt()
                        + diem.getpTH() * diem.getTh()
                        + diem.getpThi() * diemThi)
                        / 100 * 10
        ) / 10;
        return tongKetHe10;
    }

    //Chuyen doi thang 10 sang he chu
    public static String convertHe10ToHeChu(double he10) {
        if (he10 < 4) {
            return "F";
        }
        if (he10 >= 4 && he10 < 5) {
            return "D";
        }
        if (he10 >= 5 && he10 < 5.5) {
            return "D+";
        }
        if (he10 >= 5.5 && he10 < 6.5) {
            return "C";
        }
        if (he10 >= 6.5 && he10 < 7) {
            return "C+";
        }
        if (he10 >= 7 && he10 < 8) {
            return "B";
        }
        if (he10 >= 8 && he10 < 8.5) {
            return "B+";
        }
        if (he10 >= 8.5 && he10 < 9) {
            return "A";
        }
        return "A+";
    }

    //Danh gia ket qua mon hoc
    public static String getKetQuaFromHe10(double he10) {
        if (he10 < 4) {
            return "Không";
        }
        return "Đạt";
    }

    //Chuyen doi thang 10 sang thang 4
    public static double convertHe10ToHe4(double he10) {
        if (he10 < 4) {
            return 0;
        }
        if (he10 >= 4 && he10 < 5) {
            return 1;
        }
        if (he10 >= 5 && he10 < 5.5) {
            return 1.5;
        }
        if (he10 >= 5.5 && he10 < 6.5) {
            return 2;
        }
        if (he10 >= 6.5 && he10 < 7) {
            return 2.5;
        }
        if (he10 >= 7 && he10 < 8) {
            return 3;
        }
        if (he10 >= 8 && he10 < 8.5) {
            return 3.5;
        }
        if (he10 >= 8.5 && he10 < 9) {
            return 3.7;
        }
        return 4;
    }
}
