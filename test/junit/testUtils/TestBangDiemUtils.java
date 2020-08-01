/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.testUtils;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import model.BangDiem;
import model.Diem;
import model.HocPhan;
import org.junit.Test;
import org.junit.Assert;
import utils.BangDiemUtils;
import utils.DiemUtils;

/**
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
public class TestBangDiemUtils {

    @Test
    public void testBangDiemFilter_Chuan_KhongLap() {
        BangDiem bangDiem = new BangDiem();
        bangDiem.setDiems(new ArrayList<>());

        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        Assert.assertEquals(bangDiem.toString(), bangDiem2.toString());
    }

    @Test
    public void testBangDiemFilter_Chuan_Lap1Lan_KhongCoMonTruot_KhongHocLai() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diems.add(diem1);

        bangDiem.setDiems(diems);

        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        Assert.assertEquals(bangDiem.toString(), bangDiem2.toString());
    }

    @Test
    public void testBangDiemFilter_Chuan_Lap1Lan_CoMonTruot_KhongHocLai() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(0);
        diems.add(diem1);

        bangDiem.setDiems(diems);

        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        Assert.assertNotEquals(bangDiem.toString(), bangDiem2.toString());
        Assert.assertEquals(0, bangDiem2.getDiems().size());
    }

    @Test
    public void testBangDiemFilter_Chuan_Lap2Lan_KhongCoMonTruot_KhongHocLai() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1202");
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(4.2);
        diems.add(diem2);

        bangDiem.setDiems(diems);

        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        Assert.assertEquals(bangDiem.toString(), bangDiem2.toString());
        Assert.assertEquals(2, bangDiem2.getDiems().size());
    }

    @Test
    public void testBangDiemFilter_Chuan_Lap2Lan_KhongCoMonTruot_CoHocLai_DiemKhongDoi() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1201");
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(4.2);
        diems.add(diem2);

        bangDiem.setDiems(diems);

        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        Assert.assertNotEquals(bangDiem.toString(), bangDiem2.toString());
        Assert.assertEquals(1, bangDiem2.getDiems().size());
        Assert.assertEquals(diem1, bangDiem2.getDiems().get(0));
    }

    @Test
    public void testBangDiemFilter_Chuan_Lap2Lan_KhongCoMonTruot_CoHocLai_DiemThayDoi() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(4.2);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1201");
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(7.8);
        diems.add(diem2);

        bangDiem.setDiems(diems);

        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        Assert.assertNotEquals(bangDiem.toString(), bangDiem2.toString());
        Assert.assertEquals(1, bangDiem2.getDiems().size());
        Assert.assertEquals(diem2, bangDiem2.getDiems().get(0));
    }

    @Test
    public void testBangDiemFilter_Chuan_Lap2Lan_CoMonTruot_KhongHocLai() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(0);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1202");
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(4.2);
        diems.add(diem2);

        bangDiem.setDiems(diems);

        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        Assert.assertNotEquals(bangDiem.toString(), bangDiem2.toString());
        Assert.assertEquals(1, bangDiem2.getDiems().size());
        Assert.assertEquals(diem2, bangDiem2.getDiems().get(0));
    }

    @Test
    public void testBangDiemFilter_Chuan_Lap2Lan_CoMonTruot_CoHocLai_DiemKhongDoi() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(4.8);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1201");
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(0);
        diems.add(diem2);

        bangDiem.setDiems(diems);

        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        Assert.assertNotEquals(bangDiem.toString(), bangDiem2.toString());
        Assert.assertEquals(1, bangDiem2.getDiems().size());
        Assert.assertEquals(diem1, bangDiem2.getDiems().get(0));
    }

    @Test
    public void testBangDiemFilter_Chuan_Lap2Lan_CoMonTruot_CoHocLai_DiemThayDoi() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(0);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1201");
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(7.8);
        diems.add(diem2);

        bangDiem.setDiems(diems);

        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        Assert.assertNotEquals(bangDiem.toString(), bangDiem2.toString());
        Assert.assertEquals(1, bangDiem2.getDiems().size());
        Assert.assertEquals(diem2, bangDiem2.getDiems().get(0));
    }

    @Test
    public void testBangDiemFilter_Chuan_Lap4Lan_KhongCoMonTruot_KhongHocLai() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1202");
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(4.2);
        diems.add(diem2);

        Diem diem3 = new Diem();
        HocPhan hocPhan3 = new HocPhan();
        hocPhan3.setMa("BAS1203");
        diem3.setHocPhan(hocPhan3);
        diem3.setTkHe10(4.2);
        diems.add(diem3);

        Diem diem4 = new Diem();
        HocPhan hocPhan4 = new HocPhan();
        hocPhan4.setMa("BAS1204");
        diem4.setHocPhan(hocPhan4);
        diem4.setTkHe10(4.2);
        diems.add(diem4);

        bangDiem.setDiems(diems);

        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        Assert.assertEquals(bangDiem.toString(), bangDiem2.toString());
        Assert.assertEquals(4, bangDiem2.getDiems().size());
    }

    @Test
    public void testBangDiemFilter_Chuan_Lap4Lan_KhongCoMonTruot_CoHocLai_DiemKhongDoi() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1202");
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(4.2);
        diems.add(diem2);

        Diem diem3 = new Diem();
        HocPhan hocPhan3 = new HocPhan();
        hocPhan3.setMa("BAS1201");
        diem3.setHocPhan(hocPhan3);
        diem3.setTkHe10(4.2);
        diems.add(diem3);

        Diem diem4 = new Diem();
        HocPhan hocPhan4 = new HocPhan();
        hocPhan4.setMa("BAS1204");
        diem4.setHocPhan(hocPhan4);
        diem4.setTkHe10(4.2);
        diems.add(diem4);

        bangDiem.setDiems(diems);

        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        Assert.assertNotEquals(bangDiem.toString(), bangDiem2.toString());
        Assert.assertEquals(3, bangDiem2.getDiems().size());
        Assert.assertEquals(diem1, bangDiem2.getDiems().get(0));
        Assert.assertEquals(diem2, bangDiem2.getDiems().get(1));
        Assert.assertEquals(diem4, bangDiem2.getDiems().get(2));
    }

    @Test
    public void testBangDiemFilter_Chuan_Lap4Lan_KhongCoMonTruot_CoHocLai_DiemThayDoi() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1202");
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(4.2);
        diems.add(diem2);

        Diem diem3 = new Diem();
        HocPhan hocPhan3 = new HocPhan();
        hocPhan3.setMa("BAS1201");
        diem3.setHocPhan(hocPhan3);
        diem3.setTkHe10(9.2);
        diems.add(diem3);

        Diem diem4 = new Diem();
        HocPhan hocPhan4 = new HocPhan();
        hocPhan4.setMa("BAS1204");
        diem4.setHocPhan(hocPhan4);
        diem4.setTkHe10(4.2);
        diems.add(diem4);

        bangDiem.setDiems(diems);

        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        Assert.assertNotEquals(bangDiem.toString(), bangDiem2.toString());
        Assert.assertEquals(3, bangDiem2.getDiems().size());
        Assert.assertEquals(diem3, bangDiem2.getDiems().get(0));
        Assert.assertEquals(diem2, bangDiem2.getDiems().get(1));
        Assert.assertEquals(diem4, bangDiem2.getDiems().get(2));
    }

    @Test
    public void testBangDiemFilter_Chuan_Lap4Lan_CoMonTruot_KhongHocLai() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1202");
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(0);
        diems.add(diem2);

        Diem diem3 = new Diem();
        HocPhan hocPhan3 = new HocPhan();
        hocPhan3.setMa("BAS1203");
        diem3.setHocPhan(hocPhan3);
        diem3.setTkHe10(4.2);
        diems.add(diem3);

        Diem diem4 = new Diem();
        HocPhan hocPhan4 = new HocPhan();
        hocPhan4.setMa("BAS1204");
        diem4.setHocPhan(hocPhan4);
        diem4.setTkHe10(4.2);
        diems.add(diem4);

        bangDiem.setDiems(diems);

        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        Assert.assertNotEquals(bangDiem.toString(), bangDiem2.toString());
        Assert.assertEquals(3, bangDiem2.getDiems().size());
        Assert.assertEquals(diem1, bangDiem2.getDiems().get(0));
        Assert.assertEquals(diem3, bangDiem2.getDiems().get(1));
        Assert.assertEquals(diem4, bangDiem2.getDiems().get(2));
    }

    @Test
    public void testBangDiemFilter_Chuan_Lap4Lan_CoMonTruot_CoHocLai_DiemKhongDoi() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1202");
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(0);
        diems.add(diem2);

        Diem diem3 = new Diem();
        HocPhan hocPhan3 = new HocPhan();
        hocPhan3.setMa("BAS1201");
        diem3.setHocPhan(hocPhan3);
        diem3.setTkHe10(4.2);
        diems.add(diem3);

        Diem diem4 = new Diem();
        HocPhan hocPhan4 = new HocPhan();
        hocPhan4.setMa("BAS1204");
        diem4.setHocPhan(hocPhan4);
        diem4.setTkHe10(4.2);
        diems.add(diem4);

        bangDiem.setDiems(diems);

        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        Assert.assertNotEquals(bangDiem.toString(), bangDiem2.toString());
        Assert.assertEquals(2, bangDiem2.getDiems().size());
        Assert.assertEquals(diem1, bangDiem2.getDiems().get(0));
        Assert.assertEquals(diem4, bangDiem2.getDiems().get(1));
    }

    @Test
    public void testBangDiemFilter_Chuan_Lap4Lan_CoMonTruot_CoHocLai_DiemThayDoi() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1202");
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(0);
        diems.add(diem2);

        Diem diem3 = new Diem();
        HocPhan hocPhan3 = new HocPhan();
        hocPhan3.setMa("BAS1201");
        diem3.setHocPhan(hocPhan3);
        diem3.setTkHe10(9.2);
        diems.add(diem3);

        Diem diem4 = new Diem();
        HocPhan hocPhan4 = new HocPhan();
        hocPhan4.setMa("BAS1204");
        diem4.setHocPhan(hocPhan4);
        diem4.setTkHe10(4.2);
        diems.add(diem4);

        bangDiem.setDiems(diems);

        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        Assert.assertNotEquals(bangDiem.toString(), bangDiem2.toString());
        Assert.assertEquals(2, bangDiem2.getDiems().size());
        Assert.assertEquals(diem3, bangDiem2.getDiems().get(0));
        Assert.assertEquals(diem4, bangDiem2.getDiems().get(1));
    }

    @Test(expected = NullPointerException.class)
    public void testBangDiemFilter_BangDiemNull() {
        BangDiem bangDiem = null;

        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        Assert.assertEquals(bangDiem.toString(), bangDiem2.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testBangDiemFilter_DiemNull() {
        BangDiem bangDiem = new BangDiem();
        bangDiem.setDiems(null);

        BangDiem bangDiem2 = BangDiemUtils.bangDiemFilter(bangDiem);
        Assert.assertEquals(bangDiem.toString(), bangDiem2.toString());
    }

    //------------------------------------------------------------------------

    @Test
    public void testGetSoTinChiDat_Chuan_KhongLap() {
        BangDiem bangDiem = new BangDiem();
        bangDiem.setDiems(new ArrayList<>());

        int stcDat = BangDiemUtils.getSoTinChiDat(bangDiem);
        Assert.assertEquals(0, stcDat);
    }

    @Test
    public void testGetSoTinChiDat_Chuan_Lap1Lan() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        hocPhan.setSoTC(4);
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diems.add(diem1);

        bangDiem.setDiems(diems);

        int stcDat = BangDiemUtils.getSoTinChiDat(bangDiem);
        Assert.assertEquals(4, stcDat);
    }

    @Test
    public void testGetSoTinChiDat_Chuan_Lap2Lan() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        hocPhan.setSoTC(4);
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1202");
        hocPhan2.setSoTC(3);
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(4.2);
        diems.add(diem2);

        bangDiem.setDiems(diems);

        int stcDat = BangDiemUtils.getSoTinChiDat(bangDiem);
        Assert.assertEquals(7, stcDat);
    }

    @Test
    public void testGetSoTinChiDat_Chuan_Lap4Lan() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        hocPhan.setSoTC(4);
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1202");
        hocPhan2.setSoTC(3);
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(4.2);
        diems.add(diem2);

        Diem diem3 = new Diem();
        HocPhan hocPhan3 = new HocPhan();
        hocPhan3.setMa("BAS1203");
        hocPhan3.setSoTC(3);
        diem3.setHocPhan(hocPhan3);
        diem3.setTkHe10(4.2);
        diems.add(diem3);

        Diem diem4 = new Diem();
        HocPhan hocPhan4 = new HocPhan();
        hocPhan4.setMa("BAS1204");
        hocPhan4.setSoTC(4);
        diem4.setHocPhan(hocPhan4);
        diem4.setTkHe10(4.2);
        diems.add(diem4);

        bangDiem.setDiems(diems);

        int stcDat = BangDiemUtils.getSoTinChiDat(bangDiem);
        Assert.assertEquals(14, stcDat);
    }

    @Test
    public void testGetSoTinChiDat_Chuan_CoMonKhongDat() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        hocPhan.setSoTC(4);
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1202");
        hocPhan2.setSoTC(3);
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(2.2);
        diems.add(diem2);

        Diem diem3 = new Diem();
        HocPhan hocPhan3 = new HocPhan();
        hocPhan3.setMa("BAS1203");
        hocPhan3.setSoTC(3);
        diem3.setHocPhan(hocPhan3);
        diem3.setTkHe10(4.2);
        diems.add(diem3);

        Diem diem4 = new Diem();
        HocPhan hocPhan4 = new HocPhan();
        hocPhan4.setMa("BAS1204");
        hocPhan4.setSoTC(4);
        diem4.setHocPhan(hocPhan4);
        diem4.setTkHe10(4.2);
        diems.add(diem4);

        bangDiem.setDiems(diems);

        int stcDat = BangDiemUtils.getSoTinChiDat(bangDiem);
        Assert.assertEquals(11, stcDat);
    }

    @Test(expected = NullPointerException.class)
    public void testGetSoTinChiDat_BangDiemNull() {
        BangDiem bangDiem = null;

        int stcDat = BangDiemUtils.getSoTinChiDat(bangDiem);
    }

    @Test(expected = NullPointerException.class)
    public void testGetSoTinChiDat_DiemNull() {
        BangDiem bangDiem = new BangDiem();
        bangDiem.setDiems(null);

        int stcDat = BangDiemUtils.getSoTinChiDat(bangDiem);
    }
    //-----------------------------------------------------------------------

    @Test
    public void testGetSoTinChiTichLuy_Chuan_KhongLap() {
        BangDiem bangDiem = new BangDiem();
        bangDiem.setDiems(new ArrayList<>());

        int stcTichLuy = BangDiemUtils.getSoTinChiTichLuy(bangDiem);
        Assert.assertEquals(0, stcTichLuy);
    }

    @Test
    public void testGetSoTinChiTichLuy_Chuan_Lap1Lan() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        hocPhan.setMonTL("Có");
        hocPhan.setSoTC(4);
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diems.add(diem1);

        bangDiem.setDiems(diems);

        int stcTichLuy = BangDiemUtils.getSoTinChiTichLuy(bangDiem);
        Assert.assertEquals(4, stcTichLuy);
    }

    @Test
    public void testGetSoTinChiTichLuy_Chuan_Lap2Lan() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        hocPhan.setMonTL("Có");
        hocPhan.setSoTC(4);
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1202");
        hocPhan2.setMonTL("Có");
        hocPhan2.setSoTC(3);
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(4.2);
        diems.add(diem2);

        bangDiem.setDiems(diems);

        int stcTichLuy = BangDiemUtils.getSoTinChiTichLuy(bangDiem);
        Assert.assertEquals(7, stcTichLuy);
    }

    @Test
    public void testGetSoTinChiTichLuy_Chuan_Lap4Lan() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        hocPhan.setMonTL("Có");
        hocPhan.setSoTC(4);
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1202");
        hocPhan2.setMonTL("Có");
        hocPhan2.setSoTC(3);
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(4.2);
        diems.add(diem2);

        Diem diem3 = new Diem();
        HocPhan hocPhan3 = new HocPhan();
        hocPhan3.setMa("BAS1203");
        hocPhan3.setMonTL("Có");
        hocPhan3.setSoTC(3);
        diem3.setHocPhan(hocPhan3);
        diem3.setTkHe10(4.2);
        diems.add(diem3);

        Diem diem4 = new Diem();
        HocPhan hocPhan4 = new HocPhan();
        hocPhan4.setMa("BAS1204");
        hocPhan4.setMonTL("Có");
        hocPhan4.setSoTC(4);
        diem4.setHocPhan(hocPhan4);
        diem4.setTkHe10(4.2);
        diems.add(diem4);

        bangDiem.setDiems(diems);

        int stcTichLuy = BangDiemUtils.getSoTinChiTichLuy(bangDiem);
        Assert.assertEquals(14, stcTichLuy);
    }

    @Test
    public void testGetSoTinChiTichLuy_Chuan_CoMonKhongTichLuy() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        hocPhan.setMonTL("Có");
        hocPhan.setSoTC(4);
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1202");
        hocPhan2.setMonTL("Có");
        hocPhan2.setSoTC(3);
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(4.2);
        diems.add(diem2);

        Diem diem3 = new Diem();
        HocPhan hocPhan3 = new HocPhan();
        hocPhan3.setMa("BAS1203");
        hocPhan3.setMonTL("Có");
        hocPhan3.setSoTC(3);
        diem3.setHocPhan(hocPhan3);
        diem3.setTkHe10(4.2);
        diems.add(diem3);

        Diem diem4 = new Diem();
        HocPhan hocPhan4 = new HocPhan();
        hocPhan4.setMa("BAS1204");
        hocPhan4.setMonTL("Không");
        hocPhan4.setSoTC(4);
        diem4.setHocPhan(hocPhan4);
        diem4.setTkHe10(4.2);
        diems.add(diem4);

        bangDiem.setDiems(diems);

        int stcTichLuy = BangDiemUtils.getSoTinChiTichLuy(bangDiem);
        Assert.assertEquals(10, stcTichLuy);
    }

    @Test(expected = NullPointerException.class)
    public void testGetSoTinChiTichLuy_BangDiemNull() {
        BangDiem bangDiem = null;

        int stcTichLuy = BangDiemUtils.getSoTinChiTichLuy(bangDiem);
    }

    @Test(expected = NullPointerException.class)
    public void testGetSoTinChiTichLuy_DiemNull() {
        BangDiem bangDiem = new BangDiem();
        bangDiem.setDiems(null);

        int stcTichLuy = BangDiemUtils.getSoTinChiTichLuy(bangDiem);
    }
    //-----------------------------------------------------------------------

    @Test
    public void testGetTrungBinhHe4_KhongLap() {
        BangDiem bangDiem = new BangDiem();
        bangDiem.setDiems(new ArrayList<>());

        double tbHe4 = BangDiemUtils.getTrungBinhHe4(bangDiem);
        Assert.assertEquals(0, tbHe4, 0);

    }

    @Test
    public void testGetTrungBinhHe4_Chuan_Chuan_Lap1Lan() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        hocPhan.setMonTL("Có");
        hocPhan.setSoTC(4);
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diem1.setTkHe4(3);
        diems.add(diem1);

        bangDiem.setDiems(diems);

        double tbHe4 = BangDiemUtils.getTrungBinhHe4(bangDiem);
        Assert.assertEquals(3, tbHe4, 0);
    }

    @Test
    public void testGetTrungBinhHe4_Chuan_Lap2Lan() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        hocPhan.setMonTL("Có");
        hocPhan.setSoTC(4);
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diem1.setTkHe4(3);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1202");
        hocPhan2.setMonTL("Có");
        hocPhan2.setSoTC(3);
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(4.2);
        diem2.setTkHe4(1);
        diems.add(diem2);

        bangDiem.setDiems(diems);

        double tbHe4 = BangDiemUtils.getTrungBinhHe4(bangDiem);
        Assert.assertEquals(2.14, tbHe4, 0);
    }

    @Test
    public void testGetTrungBinhHe4_Chuan_Lap4Lan() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        hocPhan.setMonTL("Có");
        hocPhan.setSoTC(4);
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diem1.setTkHe4(3);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1202");
        hocPhan2.setMonTL("Có");
        hocPhan2.setSoTC(3);
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(4.2);
        diem2.setTkHe4(1);
        diems.add(diem2);

        Diem diem3 = new Diem();
        HocPhan hocPhan3 = new HocPhan();
        hocPhan3.setMa("BAS1203");
        hocPhan3.setMonTL("Có");
        hocPhan3.setSoTC(3);
        diem3.setHocPhan(hocPhan3);
        diem3.setTkHe10(4.2);
        diem2.setTkHe4(1);
        diems.add(diem3);

        Diem diem4 = new Diem();
        HocPhan hocPhan4 = new HocPhan();
        hocPhan4.setMa("BAS1204");
        hocPhan4.setMonTL("Có");
        hocPhan4.setSoTC(4);
        diem4.setHocPhan(hocPhan4);
        diem4.setTkHe10(4.2);
        diem2.setTkHe4(1);
        diems.add(diem4);

        bangDiem.setDiems(diems);

        double tbHe4 = BangDiemUtils.getTrungBinhHe4(bangDiem);
        Assert.assertEquals(1.07, tbHe4, 0);
    }

    @Test
    public void testGetTrungBinhHe4_Chuan_CoMonKhongTichLuy() {
        BangDiem bangDiem = new BangDiem();
        List<Diem> diems = new ArrayList<>();

        Diem diem1 = new Diem();
        HocPhan hocPhan = new HocPhan();
        hocPhan.setMa("BAS1201");
        hocPhan.setMonTL("Có");
        hocPhan.setSoTC(4);
        diem1.setHocPhan(hocPhan);
        diem1.setTkHe10(7.8);
        diem1.setTkHe4(3);
        diems.add(diem1);

        Diem diem2 = new Diem();
        HocPhan hocPhan2 = new HocPhan();
        hocPhan2.setMa("BAS1202");
        hocPhan2.setMonTL("Có");
        hocPhan2.setSoTC(3);
        diem2.setHocPhan(hocPhan2);
        diem2.setTkHe10(4.2);
        diem2.setTkHe4(1);
        diems.add(diem2);

        Diem diem3 = new Diem();
        HocPhan hocPhan3 = new HocPhan();
        hocPhan3.setMa("BAS1203");
        hocPhan3.setMonTL("Có");
        hocPhan3.setSoTC(3);
        diem3.setHocPhan(hocPhan3);
        diem3.setTkHe10(4.2);
        diem2.setTkHe4(1);
        diems.add(diem3);

        Diem diem4 = new Diem();
        HocPhan hocPhan4 = new HocPhan();
        hocPhan4.setMa("BAS1204");
        hocPhan4.setMonTL("Không");
        hocPhan4.setSoTC(4);
        diem4.setHocPhan(hocPhan4);
        diem4.setTkHe10(4.2);
        diem2.setTkHe4(1);
        diems.add(diem4);

        bangDiem.setDiems(diems);

        double tbHe4 = BangDiemUtils.getTrungBinhHe4(bangDiem);
        Assert.assertEquals(1.5, tbHe4, 0);
    }

    @Test(expected = NullPointerException.class)
    public void testGetTrungBinhHe4_BangDiemNull() {
        BangDiem bangDiem = null;

        double tbHe4 = BangDiemUtils.getTrungBinhHe4(bangDiem);
    }

    @Test(expected = NullPointerException.class)
    public void testGetTrungBinhHe4_DiemNull() {
        BangDiem bangDiem = new BangDiem();
        bangDiem.setDiems(null);

        double tbHe4 = BangDiemUtils.getTrungBinhHe4(bangDiem);
    }

    //------------------------------------------------------------------------
    @Test
    public void testGetDanhGia_Kem() {
        double diemTbc;
        String danhGia;

        diemTbc = -1;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("Kém", danhGia);

        diemTbc = 0;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("Kém", danhGia);

        diemTbc = 0.99;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("Kém", danhGia);
    }

    @Test
    public void testGetDanhGia_Yeu() {
        double diemTbc;
        String danhGia;

        diemTbc = 1;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("Yếu", danhGia);

        diemTbc = 1.5;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("Yếu", danhGia);

        diemTbc = 1.9;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("Yếu", danhGia);
    }

    @Test
    public void testGetDanhGia_TrungBinh() {
        double diemTbc;
        String danhGia;

        diemTbc = 2;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("TRUNG BÌNH", danhGia);

        diemTbc = 2.1;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("TRUNG BÌNH", danhGia);

        diemTbc = 2.49;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("TRUNG BÌNH", danhGia);
    }

    @Test
    public void testGetDanhGia_Kha() {
        double diemTbc;
        String danhGia;

        diemTbc = 2.5;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("KHÁ", danhGia);

        diemTbc = 3.00;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("KHÁ", danhGia);

        diemTbc = 3.19;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("KHÁ", danhGia);
    }

    @Test
    public void testGetDanhGia_Gioi() {
        double diemTbc;
        String danhGia;

        diemTbc = 3.2;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("GIỎI", danhGia);

        diemTbc = 3.58;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("GIỎI", danhGia);

        diemTbc = 3.59;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("GIỎI", danhGia);
    }

    @Test
    public void testGetDanhGia_XuatSac() {
        double diemTbc;
        String danhGia;

        diemTbc = 3.6;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("XUẤT SẮC", danhGia);

        diemTbc = 3.7;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("XUẤT SẮC", danhGia);

        diemTbc = 4.00;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("XUẤT SẮC", danhGia);

        diemTbc = 1000;
        danhGia = BangDiemUtils.getDanhGia(diemTbc);
        Assert.assertEquals("XUẤT SẮC", danhGia);
    }
}
