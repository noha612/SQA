/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SinhVien;
import repository.impl.SinhVienDAOImpl;
import utils.BaseUtils;

/**
 *
 * @author hoangpn
 */
public class SinhVienService {

    SinhVienDAOImpl sinhVienDAOImpl;
    static final String HASH_ALG = "SHA-256";

    //Xu ly dang nhap
    public SinhVien login(String maSinhVien, String matKhau) {
        sinhVienDAOImpl = new SinhVienDAOImpl();
        SinhVien sinhVien = sinhVienDAOImpl.findSinhVienByMaSinhVien(maSinhVien);
        if (sinhVien != null) {
            try {
                if (BaseUtils.hashingPassword(matKhau, HASH_ALG).equals(sinhVien.getMatKhau())) {
                    return sinhVien;
                }
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(SinhVienService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public static void main(String[] args){
        System.out.println(new SinhVienService().login("B16DCCN001", "010198"));
    }
}
