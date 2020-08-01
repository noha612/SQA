/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import model.SinhVien;

/**
 *
 * @author hoangpn
 */
public interface SinhVienDAO extends BaseDAO<SinhVien>{
    SinhVien findSinhVienByMaSinhVien(String maSinhVien);
}
