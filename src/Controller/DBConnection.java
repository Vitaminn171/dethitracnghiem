/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Quoc An
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private String dbName="dethitracnghiem";
    private String host="localhost";
    private String user="root";
    private String password="";
    private Connection conn = null;

    public DBConnection(){
        try {
            String dbURL = "jdbc:mysql://" + host + ";databaseName=" + dbName + ";user=" + user + ";password=" + password;
            conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                //System.out.println("DBConnected");
            }
        } catch (SQLException ex) {
            //System.err.println("Cannot connect database, " + ex);
        }
    }
    public Connection getConnect(){
        return conn;
    }
}

