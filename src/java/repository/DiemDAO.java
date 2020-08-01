/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.List;
import model.Diem;

/**
 *
 * @author ntnhu
 */
public interface DiemDAO extends BaseDAO<Diem> {

    List<Diem> findDiemByMaSinhVien(String maSinhVien);

    List<Diem> findDiemByMaSinhVienAndKyHoc(String maSinhVien, String kyHoc);
}
