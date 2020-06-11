/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.admissionforpatan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Programming-learning
 */
public class SqlConnect {

//    Connection conn2 = null;
    String response;
    public SqlConnect() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pmc_admin","root","root");  
//        String url2 = "jdbc:mysql://localhost:3306/patan_admin [root on Default schema]";
//        conn2 = DriverManager.getConnection(url2);
        //Statement stmt=con.createStatement();  
        if (con != null) {
            response="Connected to server";con.close();
            //System.out.println("Connected to the database test2");
            
        }
        else{
            response="Something wrong";
        }
          

    }
    public String Response()
    {
        return response;
    }
}










