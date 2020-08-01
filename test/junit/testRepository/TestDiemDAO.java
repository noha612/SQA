/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.testRepository;

import config.databaseconfig.MySQLOpenConnecter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Diem;
import org.junit.Assert;
import org.junit.Test;
import repository.impl.DiemDAOImpl;

/**
 *
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
public class TestDiemDAO {

    Connection con = MySQLOpenConnecter.getConnection();

//findDiemByMaSinhVien(msv)
    @Test
    public void testFindDiemByMaSinhVien_Chuan() {

        String msv = "B16DCCN001";
        DiemDAOImpl diemDAOImpl = new DiemDAOImpl();

        List<Diem> list = diemDAOImpl.findDiemByMaSinhVien(msv);
        Assert.assertNotNull(list);
        Assert.assertEquals(13, list.size());
        Assert.assertEquals("BAS1106", list.get(0).getHocPhan().getMa());
        Assert.assertEquals("BAS1112", list.get(6).getHocPhan().getMa());
        Assert.assertEquals("BAS1112", list.get(12).getHocPhan().getMa());
        try {
            Assert.assertTrue(con.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(TestDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testFindDiemByMaSinhVien_KhongCoDiem() {
        String msv = "B16DCCN002";
        DiemDAOImpl diemDAOImpl = new DiemDAOImpl();

        List<Diem> list = diemDAOImpl.findDiemByMaSinhVien(msv);
        Assert.assertNotNull(list);
        Assert.assertEquals(0, list.size());
        try {
            Assert.assertTrue(con.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(TestDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testFindDiemByMaSinhVien_MSVNull() {
        String msv = null;
        DiemDAOImpl diemDAOImpl = new DiemDAOImpl();

        List<Diem> list = diemDAOImpl.findDiemByMaSinhVien(msv);
        Assert.assertNotNull(list);
        Assert.assertEquals(0, list.size());
        try {
            Assert.assertTrue(con.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(TestDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testFindDiemByMaSinhVien_MSVKhongTonTai() {
        String msv = "XXXXXXXXX";
        DiemDAOImpl diemDAOImpl = new DiemDAOImpl();

        List<Diem> list = diemDAOImpl.findDiemByMaSinhVien(msv);
        Assert.assertNotNull(list);
        Assert.assertEquals(0, list.size());
        try {
            Assert.assertTrue(con.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(TestDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//---------------------------------------------------------------
//findDiemByMaSinhVienAndKyHoc(msv,ky)
    @Test
    public void testFindDiemByMaSinhVienAndKyHoc_Chuan() {
        String msv = "B16DCCN001";
        String ky = "20161";
        DiemDAOImpl diemDAOImpl = new DiemDAOImpl();

        List<Diem> list = diemDAOImpl.findDiemByMaSinhVienAndKyHoc(msv, ky);
        Assert.assertNotNull(list);
        Assert.assertEquals(5, list.size());
        Assert.assertEquals("BAS1106", list.get(0).getHocPhan().getMa());
        Assert.assertEquals("BAS1201", list.get(2).getHocPhan().getMa());
        Assert.assertEquals("INT1154", list.get(4).getHocPhan().getMa());
        try {
            Assert.assertTrue(con.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(TestDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testFindDiemByMaSinhVienAndKyHoc_MSVNull_KyNull() {
        String msv = null;
        String ky = null;
        DiemDAOImpl diemDAOImpl = new DiemDAOImpl();

        List<Diem> list = diemDAOImpl.findDiemByMaSinhVienAndKyHoc(msv, ky);
        Assert.assertNotNull(list);
        Assert.assertEquals(0, list.size());
        try {
            Assert.assertTrue(con.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(TestDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testFindDiemByMaSinhVienAndKyHoc_MSVKhongHopLe_KyHopLe() {
        String msv = null;
        String ky = "20161";
        DiemDAOImpl diemDAOImpl = new DiemDAOImpl();

        List<Diem> list = diemDAOImpl.findDiemByMaSinhVienAndKyHoc(msv, ky);
        Assert.assertNotNull(list);
        Assert.assertEquals(0, list.size());
        try {
            Assert.assertTrue(con.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(TestDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testFindDiemByMaSinhVienAndKyHoc_MSVHopLe_KyKhongHopLe() {
        String msv = "B16DCCN001";
        String ky = "XXXXXXX";
        DiemDAOImpl diemDAOImpl = new DiemDAOImpl();

        List<Diem> list = diemDAOImpl.findDiemByMaSinhVienAndKyHoc(msv, ky);
        Assert.assertNotNull(list);
        Assert.assertEquals(0, list.size());
        try {
            Assert.assertTrue(con.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(TestDiemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    @Test
//    public void testFindDiemByMaSinhVienException() {
//        DiemDAOImpl diemDAOImpl = new DiemDAOImpl();
//        List<Diem> list = diemDAOImpl.findDiemByMaSinhVien("B16DCCN001");
//        Assert.assertNull(list);
//    }

//---------------------------------------------------------------
//unused method from interface
    @Test(expected = UnsupportedOperationException.class)
    public void testFindAll() {
        DiemDAOImpl diemDAOImpl = new DiemDAOImpl();
        diemDAOImpl.findAll();

    }

    @Test(expected = UnsupportedOperationException.class)
    public void testFind() {
        DiemDAOImpl diemDAOImpl = new DiemDAOImpl();
        diemDAOImpl.find("id");

    }

    @Test(expected = UnsupportedOperationException.class)
    public void save() {
        DiemDAOImpl diemDAOImpl = new DiemDAOImpl();
        diemDAOImpl.save(new Diem());

    }

    @Test(expected = UnsupportedOperationException.class)
    public void update() {
        DiemDAOImpl diemDAOImpl = new DiemDAOImpl();
        diemDAOImpl.update(new Diem());

    }

    @Test(expected = UnsupportedOperationException.class)
    public void delete() {
        DiemDAOImpl diemDAOImpl = new DiemDAOImpl();
        diemDAOImpl.delete(new Diem());

    }
}
