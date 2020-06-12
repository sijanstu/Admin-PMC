package com.mycompany.admissionforpatan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sijan Bhandari
 */
/*This Class can be used to check database connection in mysql
    use dependancy in pom file to use mysql connector automatically:
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.18</version>
        </dependency>
 */
public class SqlConnect {

    String response;
    int retc = 0;
    String convalue;
    String u, p;
    SqlConnect(String server, String port, String database, boolean unicode, boolean ugdbcc, boolean uldc, String zone, String user, String pass) throws SQLException, ClassNotFoundException {
        //Class.forName("com.mysql.jdbc.Driver");  
        try{
        Connection con;
        convalue = "jdbc:mysql://" + server + ":" + port + "/" + database + "?" + "useUnicode=" + unicode + "&useJDBCCompliantTimezoneShift=" + ugdbcc + "&useLegacyDatetimeCode=" + uldc + "&serverTimezone=" + zone;
        u = user;
        p = pass;
        con = DriverManager.getConnection(convalue, user, pass);
        if (con != null) {
            response = "Connected to server";
            con.close();
        } else {
            response = "null database returned";
        }
        }
        catch(SQLException e)
        {
            response="connection error";
        }
    }
    public String Response() {
        return response;
    }
    public String Returncon() {
        switch (retc) {
            case 0:
                retc++;
                return convalue;
               
            case 1:
                retc++;
                return u;
                
            default:
                retc++;
                return p;
        }
        
    }

}






