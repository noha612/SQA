/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.testConfiguration;

import config.Configuration;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
public class TestConfiguration {
    @Test
    public void testGetInstance(){
        Configuration c1 = Configuration.getInstance();
        Configuration c2 = Configuration.getInstance();
        
        Assert.assertNotNull(c1);
        Assert.assertNotNull(c2);
        Assert.assertEquals(c1, c2);
    }
    
    @Test
    public void testGetProperties(){
        Configuration c1 = Configuration.getInstance();
        
        Assert.assertNotNull(c1);
        Assert.assertEquals("com.mysql.cj.jdbc.Driver", c1.getClassForName());
        Assert.assertEquals("jdbc:mysql://localhost:3306/sqa_test", c1.getDbUrl());
        Assert.assertEquals("root", c1.getDbUser());
        Assert.assertEquals("123123a@", c1.getDbPass());
    }
    
}
