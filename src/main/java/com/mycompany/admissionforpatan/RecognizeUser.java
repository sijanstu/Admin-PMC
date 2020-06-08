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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @Sijan Bhandari
 */
public class RecognizeUser {
    String up;
    public RecognizeUser(){
    try {
            File frchstu = new File("D:\\Patan_APP\\Admin-control-settings\\current login.txt");
            try (BufferedReader fr = new BufferedReader(new FileReader(frchstu))) {
                if (frchstu.exists()) {
                    String strLine;
                        up=fr.readLine();
                }
                fr.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Status.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Status.class.getName()).log(Level.SEVERE, null, ex);
        }  
}
    public String getValue()
    {
        return up;
    }
}