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
    SqlConnect(String server, String port, String database, boolean unicode, boolean ugdbcc, boolean uldc, String zone, String user, String pass)throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con;//=DriverManager.getConnection("jdbc:mysql://localhost:3306/patan_admin","root","");
        con = DriverManager.getConnection("jdbc:mysql://"+server+":"+port+"/"+database+"?"+"useUnicode="+unicode+"&useJDBCCompliantTimezoneShift="+ugdbcc+"&useLegacyDatetimeCode="+uldc+"&serverTimezone="+zone,user,pass);
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



























