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
    String response;
    SqlConnect(String server, String port, String database, boolean unicode, boolean ugdbcc, boolean uldc, String zone, String user, String pass)throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con;//=DriverManager.getConnection("jdbc:mysql://localhost:3306/patan_admin","root","");
        con = DriverManager.getConnection("jdbc:mysql://"+server+":"+port+"/"+database+"?"+"useUnicode="+unicode+"&useJDBCCompliantTimezoneShift="+ugdbcc+"&useLegacyDatetimeCode="+uldc+"&serverTimezone="+zone,user,pass);

             // DriverManager.getConnection("jdbc:mysql://localhost:3306/resultout? useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root",""))
        if (con != null) {
            response="Connected to server";
            con.close();
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





















