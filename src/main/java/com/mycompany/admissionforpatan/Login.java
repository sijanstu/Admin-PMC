package com.mycompany.admissionforpatan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

//@author Sijan Bhandari
public class Login extends javax.swing.JFrame {

    class newUser {

        newUser(String p, String u) throws FileNotFoundException, IOException {
            us = u;
            ps = p;
            File passch5 = new File("D:\\Patan_APP/Admin-control-settings/"
                    + u
                    + "_"
                    + p
                    + "/Attendance");
            File passch6 = new File("D:\\Patan_APP/Admin-control-settings/"
                    + u
                    + "_"
                    + p
                    + "/Profile");
            passch5.mkdirs();
            passch6.mkdirs();
            File passch1 = new File("D:\\Patan_APP/Admin-control-settings/"
                    + u
                    + "_"
                    + p
                    + "/Attendance/Student_count.txt");
            passch1.createNewFile();
            File passch = new File("D:\\Patan_APP/Admin-control-settings/"
                    + u
                    + "_"
                    + p);
            File passch3 = new File("D:\\Patan_APP/Admin-control-settings/"
                    + u
                    + "_"
                    + p
                    + "/Attendance/Teacher_count.txt");
            passch3.createNewFile();
            File passch2 = new File("D:\\Patan_APP/Admin-control-settings/"
                    + u
                    + "_"
                    + p
                    + "/Profile/Name.txt");
            passch2.createNewFile();
            File passch4 = new File("D:\\Patan_APP/Admin-control-settings/"
                    + u
                    + "_"
                    + p
                    + "/Profile/Position.txt");
            passch4.createNewFile();
            
            passch.mkdir();
            //userch.mkdir();
            err.setText("");
            errs.setText("");
            errp.setText("ALL OK");
            setVisible(false);
            File cl;
            cl = new File("D:\\Patan_APP/Admin-control-settings/current login.txt");
            if (!cl.exists()) {
                cl.createNewFile();
            }
            try (PrintWriter pw = new PrintWriter("D:\\Patan_APP/Admin-control-settings/current login.txt")) {
                pw.write(u + "_" + p);
                pw.close();
            }
            try (PrintWriter pw = new PrintWriter(passch2)) {
                pw.write(usename.getText());
                pw.close();
            }
            try (PrintWriter pw = new PrintWriter(passch4)) {
                pw.write(position.getText());
                pw.close();
            }
            Chooser_home homel = new Chooser_home(u, p);
        }
    }

    class loginChecker {

        loginChecker(String p, String u) throws FileNotFoundException {
            us = u;
            ps = p;
            File passch = new File("D:\\Patan_APP/Admin-control-settings/"
                    + u
                    + "_"
                    + p);
            if (!passch.exists()) {
                errs.setText("login error");
            } else {
                err.setText("");
                errs.setText("");
                errp.setText("ALL OK");
                setVisible(false);
                try (PrintWriter pw = new PrintWriter("D:\\Patan_APP/Admin-control-settings/current login.txt")) {
                pw.write(u + "_" + p);
                pw.close();
            }
                Chooser_home home1 = new Chooser_home(u, p);
            }
        }
        
        
    }
    public Login() {
        initComponents();
        ImageIcon imgg = new ImageIcon("src\\main\\icons\\download.png");
        logo.setIcon(imgg);
        labelname.setVisible(false);
        usename.setVisible(false);
        pob.setVisible(false);
        pob1.setVisible(false);
        position.setVisible(false);
        un2.setVisible(false);
        pob1.setVisible(false);
    }

    public void main() {
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        un = new javax.swing.JLabel();
        pn = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        signupb = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pob = new javax.swing.JSeparator();
        pass = new javax.swing.JTextField();
        fpb = new javax.swing.JLabel();
        sbutton = new javax.swing.JButton();
        err = new javax.swing.JLabel();
        errs = new javax.swing.JLabel();
        errp = new javax.swing.JLabel();
        chkib = new javax.swing.JButton();
        signinb = new javax.swing.JLabel();
        fpb1 = new javax.swing.JLabel();
        labelname = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        usename = new javax.swing.JTextField();
        un2 = new javax.swing.JLabel();
        position = new javax.swing.JTextField();
        pob1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        neterror = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 250, 250, 250));
        setUndecorated(true);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Programming-learning\\Documents\\NetBeansProjects\\AdmissionforPatan\\src\\main\\icons\\download.png")); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 240, 280));

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        un.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        un.setForeground(new java.awt.Color(255, 255, 255));
        un.setText("Username");
        jPanel2.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, -1));

        pn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pn.setForeground(new java.awt.Color(255, 255, 255));
        pn.setText("Password");
        jPanel2.add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 100, -1));

        name.setBackground(new java.awt.Color(0, 0, 204));
        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(null);
        name.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 160, 30));

        signupb.setBackground(new java.awt.Color(255, 255, 255));
        signupb.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        signupb.setForeground(new java.awt.Color(255, 255, 255));
        signupb.setText("Sign up");
        signupb.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        signupb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupbMouseClicked(evt);
            }
        });
        jPanel2.add(signupb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 170, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 162, 10));
        jPanel2.add(pob, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 160, 10));

        pass.setBackground(new java.awt.Color(0, 0, 204));
        pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setToolTipText("");
        pass.setBorder(null);
        pass.setCaretColor(new java.awt.Color(255, 255, 255));
        pass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 160, 30));

        fpb.setForeground(new java.awt.Color(255, 255, 255));
        fpb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fpbMouseClicked(evt);
            }
        });
        jPanel2.add(fpb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 320, 40));

        sbutton.setBackground(new java.awt.Color(0, 0, 204));
        sbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sbutton.setForeground(new java.awt.Color(0, 0, 255));
        sbutton.setText("Sign in");
        sbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(sbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        err.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(err, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 160, 10));

        errs.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(errs, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 100, 20));

        errp.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(errp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 160, 20));

        chkib.setBackground(new java.awt.Color(0, 0, 204));
        chkib.setForeground(new java.awt.Color(0, 0, 255));
        chkib.setText("check Internet");
        chkib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkibActionPerformed(evt);
            }
        });
        jPanel2.add(chkib, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        signinb.setBackground(new java.awt.Color(255, 255, 255));
        signinb.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        signinb.setForeground(new java.awt.Color(255, 255, 255));
        signinb.setText("Sign in ");
        signinb.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        signinb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinbMouseClicked(evt);
            }
        });
        jPanel2.add(signinb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        fpb1.setForeground(new java.awt.Color(255, 255, 255));
        fpb1.setText("Forgot Password?");
        fpb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fpb1MouseClicked(evt);
            }
        });
        jPanel2.add(fpb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 340, 120, 40));

        labelname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelname.setForeground(new java.awt.Color(255, 255, 255));
        labelname.setText("Name");
        jPanel2.add(labelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 50, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 160, 10));

        usename.setBackground(new java.awt.Color(0, 0, 204));
        usename.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usename.setForeground(new java.awt.Color(255, 255, 255));
        usename.setBorder(null);
        usename.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(usename, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 160, 30));

        un2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        un2.setForeground(new java.awt.Color(255, 255, 255));
        un2.setText("Position");
        jPanel2.add(un2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 60, -1));

        position.setBackground(new java.awt.Color(0, 0, 204));
        position.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        position.setForeground(new java.awt.Color(255, 255, 255));
        position.setBorder(null);
        position.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(position, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 160, 30));
        jPanel2.add(pob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 160, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 320, 380));

        jLabel7.setBackground(new java.awt.Color(0, 0, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Patan Multiple Campus");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        neterror.setBackground(new java.awt.Color(0, 255, 255));
        neterror.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        neterror.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 204, 0));
        jLabel8.setText("Error 404!!");
        neterror.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 13, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("- check your Internet connection");
        neterror.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setText("- Contact to Technician");
        neterror.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 93, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 204, 0));
        jLabel11.setText("Refresh");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jLabel11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel11KeyPressed(evt);
            }
        });
        neterror.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 133, -1, -1));

        getContentPane().add(neterror, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbuttonActionPerformed
       
        if ("".equals(name.getText())) {
            err.setText("enter your username");
    
        } else {
            err.setText("");
            if ("".equals(pass.getText())) {
                errp.setText("enter your password");
              
            } else {
                errp.setText("");
                if (signupv == 0) {
                    try {
                        new loginChecker(pass.getText(), name.getText());
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                   if("".equals(position.getText())||"".equals(usename.getText()))
                   {
                       errs.setText("enter all details");
                   }
                   else
                    try {
                        new newUser(pass.getText(), name.getText());
                    } catch (IOException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        }

    }//GEN-LAST:event_sbuttonActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
//        netoffVisible netoffisible = new netoffVisible(false);
//        Login login = new Login();
//        login.main();
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel11KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel11KeyPressed

    private void chkibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkibActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false);
    }//GEN-LAST:event_chkibActionPerformed
    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
//        new Voicespeaker("enter username and password");
    }//GEN-LAST:event_jPanel2MouseEntered

    private void signupbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupbMouseClicked
        // TODO add your handling code here:
        position.setVisible(true);
        un2.setVisible(true);
        pob1.setVisible(true);
        labelname.setVisible(true);
        usename.setVisible(true);
        pob.setVisible(true);
        signupv = 1;
        fpb.setVisible(false);
        sbutton.setText("Sign up");
        pn.setText("new Password");
        signinb.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        un.setText("new Username");
        signupb.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    }//GEN-LAST:event_signupbMouseClicked
    private void signinbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinbMouseClicked
        // TODO add your handling code here:
        labelname.setVisible(false);
        signupv=0;
        usename.setVisible(false);
        pob.setVisible(false);
        sbutton.setText("Sign in");
        fpb.setVisible(true);
        signinb.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pn.setText("Password");
        signupb.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        un.setText("Username");
        pob1.setVisible(false);
        position.setVisible(false);
        un2.setVisible(false);
        pob1.setVisible(false);
    }//GEN-LAST:event_signinbMouseClicked

    private void fpbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpbMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_fpbMouseClicked

    private void fpb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpb1MouseClicked
        // TODO add your handling code here:
        fpb.setText("Go to C:\\Patan_APP\\Admin-control-settings");
    }//GEN-LAST:event_fpb1MouseClicked
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (!"Windows".equals(info.getName())) {
                } else {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chkib;
    private javax.swing.JLabel err;
    private javax.swing.JLabel errp;
    private javax.swing.JLabel errs;
    private javax.swing.JLabel fpb;
    private javax.swing.JLabel fpb1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelname;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField name;
    private javax.swing.JPanel neterror;
    private javax.swing.JTextField pass;
    private javax.swing.JLabel pn;
    private javax.swing.JSeparator pob;
    private javax.swing.JSeparator pob1;
    private javax.swing.JTextField position;
    private javax.swing.JButton sbutton;
    private javax.swing.JLabel signinb;
    private javax.swing.JLabel signupb;
    private javax.swing.JLabel un;
    private javax.swing.JLabel un2;
    private javax.swing.JTextField usename;
    // End of variables declaration//GEN-END:variables
boolean firstlogenter = true;

    public class loginVisible {

        loginVisible(boolean a) {
            setVisible(a);
        }
    }
    int signupv = 0;

    public class statuss {

        public statuss() {
            Status st = new Status(us, ps);
        }
    }
    String us, ps;
}

class Voicespeaker {
    //0 means male voice and 1 means female voice

    Voicespeaker(String vv, int gender) {
        FileWriter f8;
        int g = gender;
        try {
            File f6 = new File("D://voice.txt");
            File f7 = new File("D://voice.vbs");
            f6.delete();//deleting previous text file
            f7.delete();//deleting previous voice file
            f8 = new FileWriter("D://voice.txt");
            //f8.flush();
            f8.append("Set Sapi = Wscript.CreateObject(\"SAPI.SpVoice\")\nSet sapi.Voice = sapi.GetVoices.Item(" + g + ")\nSapi.speak \"" + vv + "\"");
            f8.close();
            File f = new File("D://voice.txt");
            File fg = new File("D://voice.vbs");
            f.renameTo(fg);
            Runtime.getRuntime().exec("wscript D://voice.vbs");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
