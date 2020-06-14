package com.mycompany.admissionforpatan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
    String url;
    String u, p;
    SqlConnect(String server, String port, String database, boolean unicode, boolean ugdbcc, boolean uldc, String zone, String user, String pass) throws SQLException, ClassNotFoundException, IOException {
        //Class.forName("com.mysql.jdbc.Driver");//no need because already added in dependancy
        try{
        Connection con;
        url = "jdbc:mysql://" + server + ":" + port + "/" + database + "?" + "useUnicode=" + unicode + "&useJDBCCompliantTimezoneShift=" + ugdbcc + "&useLegacyDatetimeCode=" + uldc + "&serverTimezone=" + zone;
        u = user;
        p = pass;
        File f1=new File("C//SQLPMC");if(!f1.exists())f1.mkdirs();File f2=new File(f1+"/cofig.txt");if(!f2.exists())f2.createNewFile();
            try (FileWriter fw = new FileWriter(f2)) {
                fw.write(url+"\n"+user+"\n"+pass);
            }
        con = DriverManager.getConnection(url, user, pass);
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
                return url;
               
            case 1:
                retc++;
                return u;
                
            default:
                retc++;
                return p;
        }
        
    }

}












