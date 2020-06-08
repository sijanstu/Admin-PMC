/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.admissionforpatan;

import java.io.File;

/**
 *
 * @author Programming-learning
 */
public class isLoged {
    boolean value=false;
    public isLoged(){
        File frchstu = new File("D:\\Patan_APP\\Admin-control-settings\\current login.txt");  
        if(frchstu.exists())
        {
            value=true;
        }
}
    public boolean value(){
        return value;
    }
}
