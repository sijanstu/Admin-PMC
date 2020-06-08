/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.admissionforpatan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Programming-learning
 */
public class NewUser {

    Boolean check = false;

    NewUser(String u, String p, String Name, String Position) throws FileNotFoundException, IOException {
        if ("".equals(u) || "".equals(p) || "".equals(Name) || "".equals(Position)) {
            check = true;
        } else {
            File f1 = new File("D:\\Patan_APP/Admin-control-settings/");
            File f2 = new File("D:\\Patan_APP/Admin-control-setting/Attendance.pmc");
            File f3 = new File("D:\\Patan_APP/Admin-control-settings/Admission.pmc");
            File f4 = new File("D:\\Patan_APP/Admin-control-settings/Status.pmc");
            File f5 = new File("D:\\Patan_APP/Admin-control-settings/Notice.pmc");
            File f6 = new File("D:\\Patan_APP/Admin-control-settings/User.pmc");
            File f7 = new File("D:\\Patan_APP/Admin-control-settings/profle.pmc");
            f1.mkdirs();
            f2.createNewFile();
            f3.createNewFile();
            f4.createNewFile();
            f5.createNewFile();
            f6.createNewFile();
            f7.createNewFile();
            try (PrintWriter pw = new PrintWriter(f7)) {
                pw.write(Name + "\n" + Position);
                pw.close();
            }
            try (PrintWriter pw1 = new PrintWriter(f6)) {
                pw1.write(u + "_" + p);
                pw1.close();
            }

            new Chooser_home(u, p);
        }
    }

    public String error() {
        if (check == true) {
            return "enter all fields";
        } else {
            return "All Ok";
        }
    }
}

class LoginChecker {

    Boolean check = false;

    LoginChecker(String u, String p) throws FileNotFoundException, IOException {
        File passch = new File("D:\\Patan_APP/Admin-control-settings/User.pmc");
        String ch = u + p;
        if (!passch.exists()) {
            check = true;
        } else {
            BufferedReader bf = new BufferedReader(new FileReader(passch));
            String fch = bf.readLine();
            if (fch.equals(ch)) {
                new Chooser_home(u, p);
            } else {
            }

        }
    }

    public String error() {
        if (check == true) {
            return "User not found";
        } else {
            return "All Ok";
        }
    }
}
