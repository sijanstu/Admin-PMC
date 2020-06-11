/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.admissionforpatan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Programming-learning
 */
public class SqlConnect {

    Connection conn2 = null;
    String response;
    public SqlConnect() throws SQLException {
        String url2 = "jdbc:mysql://localhost:3306/test2?user=root&password=secret";
        conn2 = DriverManager.getConnection(url2);
        if (conn2 != null) {
            response="Connected to server";
            //System.out.println("Connected to the database test2");
        }
        else{
            response="Something wrong";
        }
    }
}


