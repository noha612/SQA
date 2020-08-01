/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import model.BangDiem;
import model.Diem;

/**
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
public class BangDiemUtils {

    //Loai bo mon trung lap, mon khong dat
    public static BangDiem bangDiemFilter(BangDiem bangDiem) {
        List<Diem> diems = bangDiem.getDiems();
        LinkedHashMap<String, Diem> map = new LinkedHashMap<>();
        diems.forEach((i) -> {
            String ma = i.getHocPhan().getMa();
            if (i.getTkHe10() >= 4) {
                if (!map.containsKey(ma)) {
                    map.put(ma, i);
                } else {
                    Diem j = map.get(ma);
                    if (i.getTkHe10() > j.getTkHe10()) {
                        map.put(ma, i);
                    }
                }
            }
        });
        List<Diem> temp = new ArrayList<>();
        Set<String> keySet = map.keySet();
        keySet.forEach((key) -> {
            temp.add(map.get(key));
        });
        BangDiem t = new BangDiem(bangDiem);
        t.setDiems(temp);
        return t;
    }

    //Tinh tong so tin chi dat
    public static int getSoTinChiDat(BangDiem bangDiem) {
        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        int stcDat = 0;
        for (Diem i : bangDiem2.getDiems()) {
            stcDat += i.getHocPhan().getSoTC();
        }
        return stcDat;
    }

    //Tinh tong so tin chi duoc tich luy
    public static int getSoTinChiTichLuy(BangDiem bangDiem) {
        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        int stcTichLuy = 0;
        for (Diem i : bangDiem2.getDiems()) {
            if ("Có".equals(i.getHocPhan().getMonTL())) {
                stcTichLuy += i.getHocPhan().getSoTC();
            }

        }
        return stcTichLuy;
    }

    //Tinh trung binh thang diem 4
    public static double getTrungBinhHe4(BangDiem bangDiem) {
        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        double tempDiem = 0;
        for (Diem i : bangDiem2.getDiems()) {
            if ("Có".equals(i.getHocPhan().getMonTL())) {
                tempDiem += i.getTkHe4() * i.getHocPhan().getSoTC();
            }
        }
        return (double) Math.round(tempDiem / getSoTinChiTichLuy(bangDiem2) * 100) / 100;
    }

    //Danh gia ket qua bang diem
    public static String getDanhGia(double diemTbc) {
        if (diemTbc < 1) {
            return "Kém";
        }
        if (diemTbc >= 1 && diemTbc < 2) {
            return "Yếu";
        }
        if (diemTbc >= 2 && diemTbc < 2.5) {
            return "TRUNG BÌNH";
        }
        if (diemTbc >= 2.5 && diemTbc < 3.2) {
            return "KHÁ";
        }
        if (diemTbc >= 3.2 && diemTbc < 3.6) {
            return "GIỎI";
        }
        return "XUẤT SẮC";
    }
}
