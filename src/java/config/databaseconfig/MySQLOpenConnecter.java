/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config.databaseconfig;

import config.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ntnhu
 */
public class MySQLOpenConnecter {
    //Singleton pattern
    private static Connection connect;

    //Tao ket noi DB
    private static void openConnection() {
        try {
            Class.forName(Configuration.getInstance().getClassForName());
        } catch (ClassNotFoundException ex) {
            try {
                throw new Exception("Invalid Driver!!Please check this drver....");
            } catch (Exception ex1) {
                Logger.getLogger(MySQLOpenConnecter.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

        String url = Configuration.getInstance().getDbUrl();
        try {
            connect = DriverManager.getConnection(url, Configuration.getInstance().getDbUser(), Configuration.getInstance().getDbPass());
        } catch (SQLException e) {
            try {
                throw new Exception(e.getMessage() + "Connect failed to database ....");
            } catch (Exception ex) {
                Logger.getLogger(MySQLOpenConnecter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //Dong ket noi DB
    public static void closeConnection() {
        try {
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLOpenConnecter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Singleton pattern
    public static Connection getConnection() {
        try {
            if (connect == null || connect.isClosed()) {
                openConnection();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQLOpenConnecter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connect;
    }

}
