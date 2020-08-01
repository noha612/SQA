/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.testService;

import model.SinhVien;
import org.junit.Assert;
import org.junit.Test;
import service.SinhVienService;

/**
 *
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
public class TestSinhVienService {

    @Test
    public void testLogin_Chuan() {
        String maSinhVien = "B16DCCN001";
        String matKhau = "010198";
        SinhVienService sinhVienService = new SinhVienService();
        SinhVien sinhVien = sinhVienService.login(maSinhVien, matKhau);
        Assert.assertNotNull(sinhVien);
    }

    @Test
    public void testLogin_SaiMatKhau() {
        String maSinhVien = "B16DCCN001";
        String matKhau = "123456";
        SinhVienService sinhVienService = new SinhVienService();
        SinhVien sinhVien = sinhVienService.login(maSinhVien, matKhau);
        Assert.assertNull(sinhVien);
    }

}
