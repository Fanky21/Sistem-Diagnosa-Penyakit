package com.neverlands.siskesdig.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Mysql {
    protected Connection conn;
    private String mysqlUrl;
    private String mysqlUsername;
    private String mysqlPassword;
    
    public Mysql(String mysqlUrl, String mysqlUsername, String mysqlPassword) {
        this.mysqlUrl = mysqlUrl;
        this.mysqlUsername = mysqlUsername;
        this.mysqlPassword = mysqlPassword;
        try {
            conn = DriverManager.getConnection(mysqlUrl, mysqlUsername, mysqlPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public String getUsername(){
        return mysqlUsername;
    }

    public String getPassword(){
        return mysqlPassword;
    }

    public void connectToDatabase() throws SQLException {
        conn = DriverManager.getConnection(mysqlUrl, mysqlUsername, mysqlPassword);
    }

    public void closeConnection() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
}
