/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.testService;

import model.BangDiem;
import org.junit.Assert;
import org.junit.Test;
import service.BangDiemService;

/**
 *
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
public class TestBangDiemService {

    @Test
    public void testGetBangDiem_Chuan_All() {
        String msv = "B16DCCN001";
        String hocKy = "all";
        BangDiem bangDiem = new BangDiemService().getBangDiem(msv, hocKy);

        Assert.assertEquals(28, bangDiem.getSoTinChiDat());
        Assert.assertEquals(24, bangDiem.getSoTinChiTichLuy());
        Assert.assertEquals(0, bangDiem.getTbHocKyHe4(), 0);
        Assert.assertEquals(1.98, bangDiem.getTbTichLuyHe4(), 0);
        Assert.assertEquals("Yếu", bangDiem.getDanhGia());
    }

    @Test
    public void testGetBangDiem_Chuan_HocKy() {
        String msv = "B16DCCN001";
        String hocKy = "20161";
        BangDiem bangDiem = new BangDiemService().getBangDiem(msv, hocKy);

        Assert.assertEquals(12, bangDiem.getSoTinChiDat());
        Assert.assertEquals(10, bangDiem.getSoTinChiTichLuy());
        Assert.assertEquals(1.55, bangDiem.getTbHocKyHe4(), 0);
        Assert.assertEquals(0, bangDiem.getTbTichLuyHe4(), 0);
        Assert.assertEquals("Yếu", bangDiem.getDanhGia());
    }

    @Test(expected = NullPointerException.class)
    public void testGetBangDiem_msvNull(){
        String msv = "B16DCCN001";
        String hocKy = null;
        BangDiem bangDiem = new BangDiemService().getBangDiem(msv, hocKy);
    }
}
