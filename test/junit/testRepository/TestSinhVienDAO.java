/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.testRepository;

import config.databaseconfig.MySQLOpenConnecter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SinhVien;
import org.junit.*;
import repository.impl.SinhVienDAOImpl;

/**
 *
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
public class TestSinhVienDAO {

    Connection con = MySQLOpenConnecter.getConnection();
//findSinhVienByMaSinhVien

    @Test
    public void testFindSinhVienByMaSinhVien_Chuan() {

        String msv = "B16DCCN001";
        SinhVienDAOImpl sinhVienDAOImpl = new SinhVienDAOImpl();

        SinhVien sinhVien = sinhVienDAOImpl.findSinhVienByMaSinhVien(msv);
        Assert.assertNotNull(sinhVien);
        Assert.assertEquals("B16DCCN001",sinhVien.getMaSV());
        Assert.assertEquals("Đại học chính quy",sinhVien.getHeDaoTao());
        Assert.assertEquals("Ngô Bá Khá",sinhVien.getHoTen());
        Assert.assertEquals("D16CNPM3",sinhVien.getLop());
        Assert.assertEquals("Công nghệ thông tin",sinhVien.getKhoa());
        Assert.assertEquals("2016 - 2021",sinhVien.getKhoaHoc());
        Assert.assertEquals("Công nghệ phần mềm",sinhVien.getNganh());
        try {
            Assert.assertTrue(con.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(TestSinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testFindSinhVienByMaSinhVien_MSVNull() {

        String msv = null;
        SinhVienDAOImpl sinhVienDAOImpl = new SinhVienDAOImpl();

        SinhVien sinhVien = sinhVienDAOImpl.findSinhVienByMaSinhVien(msv);
        Assert.assertNull(sinhVien);
        try {
            Assert.assertTrue(con.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(TestSinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testFindSinhVienByMaSinhVien_MSVKhongHopLe() {

        String msv = "XXXXXXXXX";
        SinhVienDAOImpl sinhVienDAOImpl = new SinhVienDAOImpl();

        SinhVien sinhVien = sinhVienDAOImpl.findSinhVienByMaSinhVien(msv);
        Assert.assertNull(sinhVien);
        try {
            Assert.assertTrue(con.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(TestSinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //---------------------------------------------------------------
//unused method from interface
    @Test(expected = UnsupportedOperationException.class)
    public void testFindAll() {
        SinhVienDAOImpl sinhVienDAOImpl = new SinhVienDAOImpl();
        sinhVienDAOImpl.findAll();

    }

    @Test(expected = UnsupportedOperationException.class)
    public void testFind() {
        SinhVienDAOImpl sinhVienDAOImpl = new SinhVienDAOImpl();
        sinhVienDAOImpl.find("id");

    }

    @Test(expected = UnsupportedOperationException.class)
    public void save() {
        SinhVienDAOImpl sinhVienDAOImpl = new SinhVienDAOImpl();
        sinhVienDAOImpl.save(new SinhVien());

    }

    @Test(expected = UnsupportedOperationException.class)
    public void update() {
        SinhVienDAOImpl sinhVienDAOImpl = new SinhVienDAOImpl();
        sinhVienDAOImpl.update(new SinhVien());

    }

    @Test(expected = UnsupportedOperationException.class)
    public void delete() {
        SinhVienDAOImpl sinhVienDAOImpl = new SinhVienDAOImpl();
        sinhVienDAOImpl.delete(new SinhVien());

    }
}
