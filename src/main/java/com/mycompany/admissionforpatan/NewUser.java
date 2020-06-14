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
                
}

class LoginChecker {

    Boolean check = false;

    LoginChecker(String u, String p) throws FileNotFoundException, IOException {
        File passch = new File("D:\\Patan_APP/Admin-control-settings/User.txt");
        String ch = u + "_"+p;
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


