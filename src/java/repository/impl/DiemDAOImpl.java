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
import java.util.ArrayList;
import java.util.List;

import model.Diem;
import model.HocPhan;
import repository.DiemDAO;

/**
 * @author ntnhu
 */
public class DiemDAOImpl implements DiemDAO {

    Connection con;

    //Tim diem theo maSV
    @Override
    public List<Diem> findDiemByMaSinhVien(String maSinhVien) {
        if (maSinhVien != null) {
            maSinhVien = maSinhVien.trim();
        }
        con = MySQLOpenConnecter.getConnection();
        try {
            String sql = "select * from diem,hoc_phan "
                    + "where ma_sinh_vien = ? and diem.ma_hoc_phan = hoc_phan.ma_hoc_phan"
                    + " ORDER BY hoc_ky,hoc_phan.ma_hoc_phan ASC";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, maSinhVien);
            ResultSet rs = ps.executeQuery();
            List<Diem> diems = new ArrayList<>();
            while (rs.next()) {
                HocPhan hocPhan = new HocPhan(rs.getString("ma_hoc_phan").trim(),
                        rs.getString("ten_hoc_phan").trim(),
                        rs.getInt("so_tin_chi"),
                        rs.getString("mon_tich_luy").trim());
                Diem diem = new Diem(hocPhan,
                        rs.getString("hoc_ky").trim(),
                        rs.getInt("pCC"),
                        rs.getInt("pKT"),
                        rs.getInt("pTH"),
                        rs.getInt("pBT"),
                        rs.getInt("pThi"),
                        rs.getDouble("CC"),
                        rs.getDouble("KT"),
                        rs.getDouble("TH"),
                        rs.getDouble("BT"),
                        rs.getDouble("Thi_L1"),
                        rs.getDouble("Thi_L2"));
                diems.add(diem);
            }
            return diems;
        } catch (SQLException ex) {
            return null;
        } finally {
            MySQLOpenConnecter.closeConnection();
        }
    }

    //Tim diem theo msv + hoc ky
    @Override
    public List<Diem> findDiemByMaSinhVienAndKyHoc(String maSinhVien, String kyHoc) {
        if (kyHoc != null) {
            kyHoc = kyHoc.trim();
        }
        if (maSinhVien != null) {
            maSinhVien = maSinhVien.trim();
        }
        con = MySQLOpenConnecter.getConnection();
        try {
            String sql = "select * from diem,hoc_phan "
                    + "where ma_sinh_vien = ? and diem.ma_hoc_phan = hoc_phan.ma_hoc_phan and diem.hoc_ky = ? "
                    + " ORDER BY hoc_phan.ma_hoc_phan ASC";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, maSinhVien);
            ps.setString(2, kyHoc);
            ResultSet rs = ps.executeQuery();
            List<Diem> diems = new ArrayList<>();
            while (rs.next()) {
                HocPhan hocPhan = new HocPhan(rs.getString("ma_hoc_phan"),
                        rs.getString("ten_hoc_phan"),
                        rs.getInt("so_tin_chi"),
                        rs.getString("mon_tich_luy"));
                Diem diem = new Diem(hocPhan,
                        rs.getString("hoc_ky"),
                        rs.getInt("pCC"),
                        rs.getInt("pKT"),
                        rs.getInt("pTH"),
                        rs.getInt("pBT"),
                        rs.getInt("pThi"),
                        rs.getDouble("CC"),
                        rs.getDouble("KT"),
                        rs.getDouble("TH"),
                        rs.getDouble("BT"),
                        rs.getDouble("Thi_L1"),
                        rs.getDouble("Thi_L2"));
                diems.add(diem);
            }
            return diems;
        } catch (SQLException ex) {
            return null;
        } finally {
            MySQLOpenConnecter.closeConnection();
        }
    }

    @Override
    public List<Diem> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Diem find(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Diem save(Diem t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Diem update(Diem t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Diem delete(Diem t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
//        System.out.println(new DiemDAOImpl().findDiemByMaSinhVien("''"));
        System.out.println(new DiemDAOImpl().findDiemByMaSinhVienAndKyHoc("B16DCCN001", "20161"));

    }
}
