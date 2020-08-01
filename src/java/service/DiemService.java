package service;

import model.Diem;
import utils.DiemUtils;

import java.util.List;

public class DiemService {

    //Tinh tong ket cho toan bo diem
    public List<Diem> tinhTongKet(List<Diem> diems) {
        diems = DiemUtils.validateDiem(diems);
        for (Diem i : diems) {
            i.setTkHe10(DiemUtils.getTongKetHe10(i));
            i.setTkHe4(DiemUtils.convertHe10ToHe4(i.getTkHe10()));
            i.setTkHeChu(DiemUtils.convertHe10ToHeChu(i.getTkHe10()));
            i.setKQ(DiemUtils.getKetQuaFromHe10(i.getTkHe10()));
        }
        return diems;
    }
}
