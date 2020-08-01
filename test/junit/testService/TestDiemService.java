/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.testService;

import java.util.ArrayList;
import java.util.List;
import model.BangDiem;
import model.Diem;
import model.HocPhan;
import org.junit.Assert;
import org.junit.Test;
import service.DiemService;

/**
 *
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
public class TestDiemService {

    DiemService diemService;

    @Test
    public void testTinhTongKet_Chuan_KhongLap() {
        List<Diem> diems = new ArrayList<>();
        diemService = new DiemService();
        List<Diem> diems2 = diemService.tinhTongKet(diems);
        Assert.assertNotNull(diems2);
        Assert.assertEquals(0, diems2.size());
    }

    @Test
    public void testTinhTongKet_Chuan_Lap1Lan() {
        diemService = new DiemService();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem(
                new HocPhan("BAS1201", "Đại số", 3, "Có"),
                "20161",
                10, 10, 0, 10, 70,
                10, 10, 0, 9, 7, 0//ThiL2 = 0
        );
        diems.add(diem1);

        List<Diem> diems2 = diemService.tinhTongKet(diems);

        Assert.assertNotNull(diems2);
        Assert.assertEquals(1, diems2.size());
        Assert.assertEquals(7.8, diems2.get(0).getTkHe10(), 0);
        Assert.assertEquals(3, diems2.get(0).getTkHe4(), 0);
        Assert.assertEquals("B", diems2.get(0).getTkHeChu());
        Assert.assertEquals("Đạt", diems2.get(0).getKQ());
    }

    @Test
    public void testTinhTongKet_Chuan_Lap2Lan() {
        diemService = new DiemService();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem(
                new HocPhan("BAS1201", "Đại số", 3, "Có"),
                "20161",
                10, 10, 0, 10, 70,
                10, 10, 0, 9, 7, 0//ThiL2 = 0
        );
        diems.add(diem1);
        Diem diem2 = new Diem(
                new HocPhan("INT1414", "Cơ sở dữ liệu phân tán	", 2, "Có"),
                "20161",
                10, 15, 0, 5, 70,
                10, 6, 0, 9, 7, 0//ThiL2 = 0
        );
        diems.add(diem2);

        List<Diem> diems2 = diemService.tinhTongKet(diems);

        Assert.assertNotNull(diems2);
        Assert.assertEquals(2, diems2.size());

        Assert.assertEquals(7.8, diems2.get(0).getTkHe10(), 0);
        Assert.assertEquals(3, diems2.get(0).getTkHe4(), 0);
        Assert.assertEquals("B", diems2.get(0).getTkHeChu());
        Assert.assertEquals("Đạt", diems2.get(0).getKQ());

        Assert.assertEquals(7.3, diems2.get(1).getTkHe10(), 0);
        Assert.assertEquals(3, diems2.get(1).getTkHe4(), 0);
        Assert.assertEquals("B", diems2.get(1).getTkHeChu());
        Assert.assertEquals("Đạt", diems2.get(1).getKQ());
    }

    @Test
    public void testTinhTongKet_Chuan_Lap4Lan() {
        diemService = new DiemService();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem(
                new HocPhan("BAS1201", "Đại số", 3, "Có"),
                "20161",
                10, 10, 0, 10, 70,
                10, 10, 0, 9, 7, 0
        );
        diems.add(diem1);
        
        Diem diem2 = new Diem(
                new HocPhan("INT1414", "Cơ sở dữ liệu phân tán	", 2, "Có"),
                "20161",
                10, 15, 0, 5, 70,
                10, 6, 0, 9, 7, 0
        );
        diems.add(diem2);

        Diem diem3 = new Diem(
                new HocPhan("BAS1202", "Đại số 2", 3, "Có"),
                "20161",
                10, 10, 0, 10, 70,
                10, 10, 0, 9, 7, 0
        );
        diems.add(diem3);

        Diem diem4 = new Diem(
                new HocPhan("INT1415", "Cơ sở dữ liệu phân tán 3", 2, "Có"),
                "20161",
                10, 15, 0, 5, 70,
                10, 0, 0, 9, 7, 0
        );
        diems.add(diem4);

        List<Diem> diems2 = diemService.tinhTongKet(diems);

        Assert.assertNotNull(diems2);
        Assert.assertEquals(4, diems2.size());

        Assert.assertEquals(7.8, diems2.get(0).getTkHe10(), 0);
        Assert.assertEquals(3, diems2.get(0).getTkHe4(), 0);
        Assert.assertEquals("B", diems2.get(0).getTkHeChu());
        Assert.assertEquals("Đạt", diems2.get(0).getKQ());

        Assert.assertEquals(7.3, diems2.get(1).getTkHe10(), 0);
        Assert.assertEquals(3, diems2.get(1).getTkHe4(), 0);
        Assert.assertEquals("B", diems2.get(1).getTkHeChu());
        Assert.assertEquals("Đạt", diems2.get(1).getKQ());

        Assert.assertEquals(7.8, diems2.get(2).getTkHe10(), 0);
        Assert.assertEquals(3, diems2.get(2).getTkHe4(), 0);
        Assert.assertEquals("B", diems2.get(2).getTkHeChu());
        Assert.assertEquals("Đạt", diems2.get(2).getKQ());

        Assert.assertEquals(0, diems2.get(3).getTkHe10(), 0);
        Assert.assertEquals(0, diems2.get(3).getTkHe4(), 0);
        Assert.assertEquals("F", diems2.get(3).getTkHeChu());
        Assert.assertEquals("Không", diems2.get(3).getKQ());
    }

    @Test(expected = NullPointerException.class)
    public void testTinhTongKet_Null() {
        diemService = new DiemService();
        List<Diem> diems2 = diemService.tinhTongKet(null);
    }
}
