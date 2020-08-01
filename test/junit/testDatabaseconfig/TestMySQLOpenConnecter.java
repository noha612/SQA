/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.testDatabaseconfig;

import config.databaseconfig.MySQLOpenConnecter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLNonTransientConnectionException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
public class TestMySQLOpenConnecter {

    Connection con;

    @Before
    public void open() {
        con = MySQLOpenConnecter.getConnection();
    }

    @After
    public void close() {
        MySQLOpenConnecter.closeConnection();
    }

    @Test
    public void testOpenConnection() {
        Assert.assertNotNull(con);

    }

    @Test(expected = SQLNonTransientConnectionException.class)
    public void testCloseConnection() throws SQLException {
        Assert.assertNotNull(con);
        MySQLOpenConnecter.closeConnection();
        con.getMetaData();
    }

    //Dam bao chi co duy nhat 1 connection duoc tao ra
    @Test
    public void testInstanceOfConnection() {
        Connection con2 = MySQLOpenConnecter.getConnection();
        Assert.assertEquals(true, con.toString().equals(con2.toString()));

    }
}
