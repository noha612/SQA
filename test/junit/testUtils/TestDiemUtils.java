/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.testUtils;

import model.Diem;
import model.HocPhan;
import org.junit.Assert;
import org.junit.Test;
import service.DiemService;
import utils.DiemUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
public class TestDiemUtils {
    @Test
    public void testValidateDiem_Chuan_KhongLap() {
        List<Diem> diems = new ArrayList<>();
        List<Diem> diems2 = DiemUtils.validateDiem(diems);
        Assert.assertNotNull(diems2);
        Assert.assertEquals(diems, diems2);
    }

    @Test
    public void testValidateDiem_Chuan_Lap1Lan() {
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem(
                new HocPhan("BAS1201", "Đại số", 3, "Có"),
                "20161",
                10, 10, 0, 10, 70,
                10, 10, 0, 9, 7, 0//ThiL2 = 0
        );
        diems.add(diem1);

        List<Diem> diems2 = DiemUtils.validateDiem(diems);
        Assert.assertNotNull(diems2);
        Assert.assertEquals(diems, diems2);
    }

    @Test
    public void testValidateDiem_Chuan_Lap2Lan() {
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
        diems.add(diem1);

        List<Diem> diems2 = DiemUtils.validateDiem(diems);
        Assert.assertNotNull(diems2);
        Assert.assertEquals(diems, diems2);
    }

    @Test
    public void testValidateDiem_Chuan_Lap4Lan() {
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

        List<Diem> diems2 = DiemUtils.validateDiem(diems);
        Assert.assertNotNull(diems2);
        Assert.assertEquals(diems, diems2);
    }

    @Test
    public void testValidateDiem_LoiSoTinChi() {
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem(
                new HocPhan("BAS1201", "Đại số", -1, "Có"),
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

        List<Diem> diems2 = DiemUtils.validateDiem(diems);
        Assert.assertNotNull(diems2);
        Assert.assertNotEquals(diems, diems2);
        Assert.assertEquals(0, diems2.size());
    }

    @Test
    public void testValidateDiem_LoiHeSoDiem() {
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem(
                new HocPhan("BAS1201", "Đại số", 3, "Có"),
                "20161",
                10, 10, 0, 10, 60,
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

        List<Diem> diems2 = DiemUtils.validateDiem(diems);
        Assert.assertNotNull(diems2);
        Assert.assertNotEquals(diems, diems2);
        Assert.assertEquals(0, diems2.size());
    }

    @Test
    public void testValidateDiem_LoiHeSoDiem2() {
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem(
                new HocPhan("BAS1201", "Đại số", 3, "Có"),
                "20161",
                10, -10, 0, 10, 70,
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

        List<Diem> diems2 = DiemUtils.validateDiem(diems);
        Assert.assertNotNull(diems2);
        Assert.assertNotEquals(diems, diems2);
        Assert.assertEquals(0, diems2.size());
    }

    @Test
    public void testValidateDiem_LoiDiem() {
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem(
                new HocPhan("BAS1201", "Đại số", 3, "Có"),
                "20161",
                10, 10, 0, 10, 70,
                -10, -10, 0, -9, -7, 0
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

        List<Diem> diems2 = DiemUtils.validateDiem(diems);
        Assert.assertNotNull(diems2);
        Assert.assertNotEquals(diems, diems2);
        Assert.assertEquals(0, diems2.size());
    }

    @Test
    public void testGetTongKetHe10_Chuan1_ThiL2Bang0() {
        Diem diem = new Diem(
                new HocPhan("BAS1201", "Đại số", 3, "Có"),
                "20161",
                10, 10, 0, 10, 70,
                10, 10, 0, 9, 7, 0//ThiL2 = 0
        );
        double tongKetHe10 = DiemUtils.getTongKetHe10(diem);
        Assert.assertEquals(new Double("7.8"), new Double(tongKetHe10));
    }

    @Test
    public void testGetTongKetHe10_Chuan1_ThiL2Khac0() {
        Diem diem = new Diem(
                new HocPhan("BAS1201", "Đại số", 3, "Có"),
                "20161",
                10, 10, 0, 10, 70,
                10, 10, 0, 9, 5, 7//ThiL2 != 0
        );
        double tongKetHe10 = DiemUtils.getTongKetHe10(diem);
        Assert.assertEquals(new Double("7.8"), new Double(tongKetHe10));
    }

    @Test
    public void testGetTongKetHe10_Chuan1_TruotCc() {
        Diem diem = new Diem(
                new HocPhan("BAS1201", "Đại số", 3, "Có"),
                "20161",
                10, 10, 0, 10, 70,
                0, 10, 0, 9, 5, 7//ThiL2 != 0
        );
        double tongKetHe10 = DiemUtils.getTongKetHe10(diem);
        Assert.assertEquals(new Double("0"), new Double(tongKetHe10));
    }

    @Test
    public void testGetTongKetHe10_Chuan1_TruotKt() {
        Diem diem = new Diem(
                new HocPhan("BAS1201", "Đại số", 3, "Có"),
                "20161",
                10, 10, 0, 10, 70,
                10, 0, 0, 9, 5, 7//ThiL2 != 0
        );
        double tongKetHe10 = DiemUtils.getTongKetHe10(diem);
        Assert.assertEquals(new Double("0"), new Double(tongKetHe10));
    }

    @Test
    public void testGetTongKetHe10_Chuan1_TruotTh() {
        Diem diem = new Diem(
                new HocPhan("BAS1201", "Đại số", 3, "Có"),
                "20161",
                10, 5, 5, 10, 70,
                10, 10, 0, 9, 5, 7//ThiL2 != 0
        );
        double tongKetHe10 = DiemUtils.getTongKetHe10(diem);
        Assert.assertEquals(new Double("0"), new Double(tongKetHe10));
    }

    @Test
    public void testGetTongKetHe10_Chuan1_TruotBT() {
        Diem diem = new Diem(
                new HocPhan("BAS1201", "Đại số", 3, "Có"),
                "20161",
                10, 5, 5, 10, 70,
                10, 10, 5, 0, 5, 7//ThiL2 != 0
        );
        double tongKetHe10 = DiemUtils.getTongKetHe10(diem);
        Assert.assertEquals(new Double("0"), new Double(tongKetHe10));
    }

    @Test
    public void testGetTongKetHe10_Chuan1_TruotThi() {
        Diem diem = new Diem(
                new HocPhan("BAS1201", "Đại số", 3, "Có"),
                "20161",
                10, 5, 5, 10, 70,
                10, 10, 5, 7, 0, 0//ThiL2 != 0
        );
        double tongKetHe10 = DiemUtils.getTongKetHe10(diem);
        Assert.assertEquals(new Double("0"), new Double(tongKetHe10));
    }

    //----------------------------------------------------
    @Test
    public void testConvertHe10ToHeChu_Chuan1_F() {
        double he10;
        String heChu;

        he10 = -1;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("F", heChu);

        he10 = 0;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("F", heChu);
        he10 = 3.666666666666;

        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("F", heChu);

        he10 = 3.9999999999;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("F", heChu);
    }

    @Test
    public void testConvertHe10ToHeChu_Chuan1_D() {
        double he10;
        String heChu;

        he10 = 4;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("D", heChu);

        he10 = 4.500000;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("D", heChu);

        he10 = 4.999999999;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("D", heChu);
    }

    @Test
    public void testConvertHe10ToHeChu_Chuan1_Dplus() {
        double he10;
        String heChu;

        he10 = 5;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("D+", heChu);

        he10 = 5.2;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("D+", heChu);

        he10 = 5.4999999;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("D+", heChu);
    }

    @Test
    public void testConvertHe10ToHeChu_Chuan1_C() {
        double he10;
        String heChu;

        he10 = 5.5;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("C", heChu);

        he10 = 6.0;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("C", heChu);

        he10 = 6.49999999;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("C", heChu);
    }

    @Test
    public void testConvertHe10ToHeChu_Chuan1_Cplus() {
        double he10;
        String heChu;

        he10 = 6.5;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("C+", heChu);

        he10 = 6.65773747;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("C+", heChu);

        he10 = 6.999999999;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("C+", heChu);
    }

    @Test
    public void testConvertHe10ToHeChu_Chuan1_B() {
        double he10;
        String heChu;

        he10 = 7;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("B", heChu);

        he10 = 7.56565656565655656565656565665656565;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("B", heChu);

        he10 = 7.99999999;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("B", heChu);
    }

    @Test
    public void testConvertHe10ToHeChu_Chuan1_Bplus() {
        double he10;
        String heChu;

        he10 = 8;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("B+", heChu);

        he10 = 8.3;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("B+", heChu);

        he10 = 8.49;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("B+", heChu);
    }

    @Test
    public void testConvertHe10ToHeChu_Chuan1_A() {
        double he10;
        String heChu;

        he10 = 8.50;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("A", heChu);

        he10 = 8.555;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("A", heChu);

        he10 = 8.989899;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("A", heChu);
    }

    @Test
    public void testConvertHe10ToHeChu_Chuan1_Aplus() {
        double he10;
        String heChu;

        he10 = 9;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("A+", heChu);

        he10 = 9.67;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("A+", heChu);

        he10 = 10;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("A+", heChu);

        he10 = 10000;
        heChu = DiemUtils.convertHe10ToHeChu(he10);
        Assert.assertEquals("A+", heChu);
    }

    //----------------------------------------------------
    @Test
    public void testGetKetQuaFromHe10_Chuan_KhongDat() {
        double he10;
        String ketQua;

        he10 = -1;
        ketQua = DiemUtils.getKetQuaFromHe10(he10);
        Assert.assertEquals("Không", ketQua);

        he10 = 0;
        ketQua = DiemUtils.getKetQuaFromHe10(he10);
        Assert.assertEquals("Không", ketQua);

        he10 = 2.2;
        ketQua = DiemUtils.getKetQuaFromHe10(he10);
        Assert.assertEquals("Không", ketQua);

        he10 = 3.9999;
        ketQua = DiemUtils.getKetQuaFromHe10(he10);
        Assert.assertEquals("Không", ketQua);
    }

    @Test
    public void testGetKetQuaFromHe10_Chuan_Dat() {
        double he10;
        String ketQua;

        he10 = 4;
        ketQua = DiemUtils.getKetQuaFromHe10(he10);
        Assert.assertEquals("Đạt", ketQua);

        he10 = 6.66;
        ketQua = DiemUtils.getKetQuaFromHe10(he10);
        Assert.assertEquals("Đạt", ketQua);

        he10 = 10;
        ketQua = DiemUtils.getKetQuaFromHe10(he10);
        Assert.assertEquals("Đạt", ketQua);

        he10 = 1000;
        ketQua = DiemUtils.getKetQuaFromHe10(he10);
        Assert.assertEquals("Đạt", ketQua);
    }

    //----------------------------------------------------
    @Test
    public void testConvertHe10ToHe4_Chuan1_F() {
        double he10;
        double he4;

        he10 = -1;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(0, he4, 0);

        he10 = 0;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(0, he4, 0);
        he10 = 3.666666666666;

        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(0, he4, 0);

        he10 = 3.9999999999;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(0, he4, 0);
    }

    @Test
    public void testConvertHe10ToHe4_Chuan1_D() {
        double he10;
        double he4;

        he10 = 4;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(1, he4, 0);

        he10 = 4.500000;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(1, he4, 0);

        he10 = 4.999999999;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(1, he4, 0);
    }

    @Test
    public void testConvertHe10ToHe4_Chuan1_Dplus() {
        double he10;
        double he4;

        he10 = 5;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(1.5, he4, 0);

        he10 = 5.2;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(1.5, he4, 0);

        he10 = 5.4999999;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(1.5, he4, 0);
    }

    @Test
    public void testConvertHe10ToHe4_Chuan1_C() {
        double he10;
        double he4;

        he10 = 5.5;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(2, he4, 0);

        he10 = 6.0;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(2, he4, 0);

        he10 = 6.49999999;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(2, he4, 0);
    }

    @Test
    public void testConvertHe10ToHe4_Chuan1_Cplus() {
        double he10;
        double he4;

        he10 = 6.5;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(2.5, he4, 0);

        he10 = 6.65773747;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(2.5, he4, 0);

        he10 = 6.999999999;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(2.5, he4, 0);
    }

    @Test
    public void testConvertHe10ToHe4_Chuan1_B() {
        double he10;
        double he4;

        he10 = 7;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(3, he4, 0);

        he10 = 7.56565656565655656565656565665656565;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(3, he4, 0);

        he10 = 7.99999999;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(3, he4, 0);
    }

    @Test
    public void testConvertHe10ToHe4_Chuan1_Bplus() {
        double he10;
        double he4;

        he10 = 8;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(3.5, he4, 0);

        he10 = 8.3;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(3.5, he4, 0);

        he10 = 8.49;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(3.5, he4, 0);
    }

    @Test
    public void testConvertHe10ToHe4_Chuan1_A() {
        double he10;
        double he4;

        he10 = 8.50;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(3.7, he4, 0);

        he10 = 8.555;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(3.7, he4, 0);

        he10 = 8.989899;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(3.7, he4, 0);
    }

    @Test
    public void testConvertHe10ToHe4_Chuan1_Aplus() {
        double he10;
        double he4;

        he10 = 9;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(4, he4, 0);

        he10 = 9.67;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(4, he4, 0);

        he10 = 10;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(4, he4, 0);

        he10 = 10000;
        he4 = DiemUtils.convertHe10ToHe4(he10);
        Assert.assertEquals(4, he4, 0);
    }
}
