/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.testUtils;

import java.security.NoSuchAlgorithmException;
import org.junit.Assert;
import org.junit.Test;
import utils.BaseUtils;

/**
 *
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
public class TestBaseUtils {

    @Test
    public void testHashingPassword_Chuan() throws NoSuchAlgorithmException {
        String matKhau = "123123";
        String alg = "SHA-256";
        String hash = BaseUtils.hashingPassword(matKhau, alg);
        Assert.assertEquals("96cae35ce8a9b0244178bf28e4966c2ce1b8385723a96a6b838858cdd6ca0a1e", hash);
    }

    @Test(expected = NoSuchAlgorithmException.class)
    public void testHashingPassword_KhongTimThayGiaiThuat() throws NoSuchAlgorithmException {
        String matKhau = "123123";
        String alg = "GIAI_THUAT_KHONG_CO_THAT";
        String hash = BaseUtils.hashingPassword(matKhau, alg);
    }
}
