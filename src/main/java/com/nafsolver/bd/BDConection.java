/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafsolver.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.dbcp.BasicDataSource;

/**
 *
 * @author Admin
 */
public class BDConection {

    private static BDConection bdCon;
    private static BasicDataSource basicDataSource;

    private BDConection() {
    }

    public static void init() {
        try {

            Connection con = getConnection();
//step3 create the statement object  
            /* stmt = con.prepareStatement("SELECT table_name, column_name, data_type, data_length "
                    + "FROM USER_TAB_COLUMNS "
                    + "WHERE table_name = 'ARCCMD'");*/

//step4 execute query  
            PreparedStatement stmt = con.prepareStatement("select TABLE_NAME,  owner, tablespace_name from DBA_TABLES where owner = 'DESA46'");
            ResultSet rs = stmt.executeQuery();
            List<BDTable> tables = new ArrayList<>();
            while (rs.next()) {
                tables.add(new BDTable(rs.getString(1)));
                System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));// + "  " + rs.getObject(4) 
            }

//step5 close the connection object 
            rs.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static BDConection getBDConection() {

        if (bdCon == null) {
            bdCon = new BDConection();

        }
        return bdCon;
    }

    public static Connection getConnection() throws  SQLException {
        if (basicDataSource == null) {
            basicDataSource = new BasicDataSource();
// Ejemplo con base de datos MySQL
            basicDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
            basicDataSource.setUrl("jdbc:oracle:thin:@192.168.10.30:1521:xe");
            basicDataSource.setUsername("desa46");
            basicDataSource.setPassword("111050");

        }
        /*/step1 load the driver class  
        Class.forName("oracle.jdbc.driver.OracleDriver");

//step2 create  the connection object  
        con = DriverManager.getConnection(
                "jdbc:oracle:thin:@192.168.10.30:1521:xe", "desa46", "111050");*/
        return basicDataSource.getConnection();
    }

    public static List<BDColumn> getColumnList(String tableName) throws SQLException {
        List<BDColumn> columns = new ArrayList<>();
        Connection con = getConnection();

        PreparedStatement stmt = con.prepareStatement("select column_name, data_type, data_length, nullable "
                + "FROM USER_TAB_COLUMNS where table_name = ?");
        stmt.setString(1, tableName);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            columns.add(new BDColumn(tableName, rs.getString(1), rs.getString(2),
                    rs.getInt(3), rs.getBoolean(4)));// 
        }
        rs.close();
        con.close();

        return columns;

    }

}
