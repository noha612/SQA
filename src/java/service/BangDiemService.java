/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;

import model.BangDiem;
import model.Diem;
import repository.impl.DiemDAOImpl;
import utils.BangDiemUtils;

/**
 * @author ntnhu
 */
public class BangDiemService {

    DiemDAOImpl diemDAOImpl = new DiemDAOImpl();
    DiemService diemService = new DiemService();

    //Xu ly bang diem theo thong tin tu web
    public BangDiem getBangDiem(String maSinhVien, String hocKy) {
        BangDiem bangDiem = new BangDiem();
        BangDiem bangDiemTemp;

        //Tinh diem toan bo
        if (hocKy.equals("all")) {
            List<Diem> diems = diemDAOImpl.findDiemByMaSinhVien(maSinhVien);
            diems = diemService.tinhTongKet(diems);

            bangDiem.setDiems(diems);
            bangDiem.setSoTinChiDat(BangDiemUtils.getSoTinChiDat(bangDiem));
            bangDiem.setSoTinChiTichLuy(BangDiemUtils.getSoTinChiTichLuy(bangDiem));
            bangDiem.setTbTichLuyHe4(BangDiemUtils.getTrungBinhHe4(bangDiem));
            bangDiem.setDanhGia(BangDiemUtils.getDanhGia(bangDiem.getTbTichLuyHe4()));
        } //Tinh diem theo ky hoc
        else {
            List<Diem> diems = diemDAOImpl.findDiemByMaSinhVienAndKyHoc(maSinhVien, hocKy);
            diems = diemService.tinhTongKet(diems);
            bangDiem.setKyHoc(hocKy);

            bangDiem.setDiems(diems);
            bangDiem.setSoTinChiDat(BangDiemUtils.getSoTinChiDat(bangDiem));
            bangDiem.setSoTinChiTichLuy(BangDiemUtils.getSoTinChiTichLuy(bangDiem));
            bangDiem.setTbHocKyHe4(BangDiemUtils.getTrungBinhHe4(bangDiem));
            bangDiem.setDanhGia(BangDiemUtils.getDanhGia(bangDiem.getTbHocKyHe4()));
        }

        return bangDiem;
    }

    public static void main(String[] args) {
//        System.out.println(new BangDiemService().getBangDiem("B16DCCN001", null));
        System.out.println(new BangDiemService().getBangDiem(null, "20161"));
    }
}
