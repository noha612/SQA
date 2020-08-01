/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository.impl;

import config.databaseconfig.MySQLOpenConnecter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.SinhVien;
import repository.SinhVienDAO;

/**
 * @author hoangpn
 */
public class SinhVienDAOImpl implements SinhVienDAO {

    Connection con;

    //Tim thong tin sinh vien theo msv
    @Override
    public SinhVien findSinhVienByMaSinhVien(String maSinhVien) {
        if (maSinhVien != null) {
            maSinhVien = maSinhVien.trim();
        }
        con = MySQLOpenConnecter.getConnection();

        try {
            String sql = "select * from sinh_vien "
                    + "where ma_sinh_vien = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, maSinhVien);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                SinhVien sinhVien = new SinhVien(
                        rs.getString("ma_sinh_vien").trim(),
                        rs.getString("mat_khau").trim(),
                        rs.getString("ho_ten").trim(),
                        rs.getString("lop").trim(),
                        rs.getString("khoa_hoc").trim(),
                        rs.getString("he_dao_tao").trim(),
                        rs.getString("khoa").trim(),
                        rs.getString("nganh").trim()
                );
                return sinhVien;
            }
            return null;
        } catch (SQLException ex) {
            return null;
        } finally {
            MySQLOpenConnecter.closeConnection();
        }
    }

    @Override
    public List<SinhVien> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SinhVien find(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SinhVien save(SinhVien t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SinhVien update(SinhVien t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SinhVien delete(SinhVien t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        System.out.println(new SinhVienDAOImpl().findSinhVienByMaSinhVien("B16DCCN001"));
    }

}
