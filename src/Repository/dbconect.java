/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP probook
 */
public class dbconect {

    private static String hostName = "localhost";
    private static String account = "sa";
    private static String pass = "songlong";
    private static String dbName = "FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041";
    private static String connectionSQL = "jdbc:sqlserver://" + hostName + ":1433;databaseName=" + dbName;
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static Connection cnn;

    // LOAD DRIVER
    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {

        }
    }

    // Mo ket noi 
    static Connection openDbConnection() {
        try {
            return DriverManager.getConnection(connectionSQL, account, pass);
        } catch (SQLException ex) {
            Logger.getLogger(dbconect.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(openDbConnection());
    }
}
