package com.mycompany.admissionforpatan;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Status extends javax.swing.JFrame {
    public Status() {
        initComponents();
    }
    public Status(String up, String ps) {
        new Status();
        mainsta(up, ps);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbt = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        stp = new javax.swing.JLabel();
        abss = new javax.swing.JLabel();
        sto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pt = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        teo = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();

        jLabel5.setText("jLabel5");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel3ComponentAdded(evt);
            }
        });
        jPanel3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel3ComponentShown(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbt.setBackground(new java.awt.Color(153, 255, 255));
        jbt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jbt.setForeground(new java.awt.Color(0, 0, 255));
        jbt.setText("Status");
        jPanel3.add(jbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 70, 30));

        p1.setBackground(new java.awt.Color(0, 0, 255));
        p1.setForeground(new java.awt.Color(255, 255, 255));
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p1MouseExited(evt);
            }
        });
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Students");
        p1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 100, 30));

        stp.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        stp.setForeground(new java.awt.Color(51, 255, 102));
        stp.setText("0");
        p1.add(stp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, 30));

        abss.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        abss.setForeground(new java.awt.Color(255, 0, 0));
        abss.setText("0");
        p1.add(abss, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 60, 30));

        sto.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        sto.setForeground(new java.awt.Color(255, 255, 0));
        sto.setText("0");
        p1.add(sto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 50, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 102));
        jLabel6.setText("Present");
        p1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Total");
        p1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 50, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Absent");
        p1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 50, 30));

        jPanel3.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        p2.setBackground(new java.awt.Color(0, 0, 255));
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p2MouseExited(evt);
            }
        });
        p2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teachers");
        p2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 100, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 255, 102));
        jLabel12.setText("Present");
        p2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, 30));

        pt.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        pt.setForeground(new java.awt.Color(51, 255, 102));
        pt.setText("0");
        p2.add(pt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, 30));

        jLabel14.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("0");
        p2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 60, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("Absent");
        p2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 50, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("Total");
        p2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 50, 30));

        teo.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        teo.setForeground(new java.awt.Color(255, 255, 0));
        teo.setText("0");
        p2.add(teo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 50, 30));

        jPanel3.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 190, 110));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 10, 30));

        jSeparator15.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator15.setForeground(new java.awt.Color(0, 0, 255));
        jPanel3.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 420, 10));

        jSeparator14.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 255));
        jPanel3.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 420, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 255));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 420, 10));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 10, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 100, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 10, 230));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("Refresh");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 80, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 255));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 420, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 10, 130));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 255));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 100, 10));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 10, 30));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 10, 30));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 255));
        jPanel3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 100, 10));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 0, -1, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void p1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseEntered
        
    }//GEN-LAST:event_p1MouseEntered
    private void p1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseExited
        p1.setBorder(null);
    }//GEN-LAST:event_p1MouseExited
    private void p2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseClicked

    }//GEN-LAST:event_p2MouseClicked
    private void p2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseEntered
        p2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
    }//GEN-LAST:event_p2MouseEntered
    private void p2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseExited

        p2.setBorder(null);
    }//GEN-LAST:event_p2MouseExited

    private void jPanel3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel3ComponentShown
   // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3ComponentShown

    private void jPanel3ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel3ComponentAdded
p1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
//to recognize user
File currentuser = new File("D:\\Patan_APP\\Admin-control-settings\\current login.txt");
try {
            try (BufferedReader fr = new BufferedReader(new FileReader(currentuser))) {
                if (currentuser.exists()) {
                        up=fr.readLine();
                }
                fr.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Status.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Status.class.getName()).log(Level.SEVERE, null, ex);
        }           
 //get data
 File f1=new File("D:\\Patan_APP\\Admin-control-settings\\"+up+"\\File\\Admission\\Students.txt");
        try {
            BufferedReader br=new BufferedReader(new FileReader(f1));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Status.class.getName()).log(Level.SEVERE, null, ex);
        }
    
   

    }//GEN-LAST:event_jPanel3ComponentAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    private void mainsta(String us, String pas) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Status().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abss;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel jbt;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JLabel pt;
    private javax.swing.JLabel sto;
    private javax.swing.JLabel stp;
    private javax.swing.JLabel teo;
    // End of variables declaration//GEN-END:variables
String up=null;
}
