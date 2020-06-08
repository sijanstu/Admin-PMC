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
import javax.swing.ImageIcon;

/**
 *
 * @author Programming-learning
 */
public class Search extends javax.swing.JFrame {

    /**
     * Creates new form Search
     */
    public Search() {
        initComponents();
        next.setVisible(false);
        ImageIcon img = new ImageIcon("src\\main\\icons\\BRIGHTS SEARCH.png");
        setIconImage(img.getImage());
        ind.setVisible(false);
        sp1.setVisible(false);
        sp2.setVisible(false);
        sp3.setVisible(false);
        sp4.setVisible(false);
        sp5.setVisible(false);
        pre.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        search = new javax.swing.JButton();
        sresult1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sresult5 = new javax.swing.JTextField();
        sbar = new javax.swing.JTextField();
        hider1 = new javax.swing.JPanel();
        hider = new javax.swing.JPanel();
        jSeparator31 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator29 = new javax.swing.JSeparator();
        sresult2 = new javax.swing.JTextField();
        sresult3 = new javax.swing.JTextField();
        sresult4 = new javax.swing.JTextField();
        sp1 = new javax.swing.JSeparator();
        sp2 = new javax.swing.JSeparator();
        sp3 = new javax.swing.JSeparator();
        sp4 = new javax.swing.JSeparator();
        sp5 = new javax.swing.JSeparator();
        ind = new javax.swing.JLabel();
        pre = new javax.swing.JButton();
        p = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        next = new javax.swing.JButton();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator33 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText(" X");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 10, 20));

        jSeparator18.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator18.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 90, -1));

        jSeparator21.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator21.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 10, 30));

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setForeground(new java.awt.Color(0, 0, 204));
        search.setText("Search");
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        search.setFocusPainted(false);
        search.setFocusable(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 70, 30));

        sresult1.setEditable(false);
        sresult1.setBackground(new java.awt.Color(255, 255, 255));
        sresult1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        sresult1.setForeground(new java.awt.Color(0, 0, 255));
        sresult1.setBorder(null);
        sresult1.setCaretColor(new java.awt.Color(0, 0, 255));
        sresult1.setFocusable(false);
        sresult1.setOpaque(false);
        sresult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sresult1ActionPerformed(evt);
            }
        });
        jPanel1.add(sresult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 470, 32));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Search");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        sresult5.setEditable(false);
        sresult5.setBackground(new java.awt.Color(255, 255, 255));
        sresult5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        sresult5.setForeground(new java.awt.Color(0, 0, 255));
        sresult5.setBorder(null);
        sresult5.setCaretColor(new java.awt.Color(0, 0, 255));
        sresult5.setFocusable(false);
        sresult5.setOpaque(false);
        jPanel1.add(sresult5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 470, 32));

        sbar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        sbar.setForeground(new java.awt.Color(0, 0, 255));
        sbar.setBorder(null);
        sbar.setCaretColor(new java.awt.Color(0, 0, 255));
        sbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sbarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sbarMouseEntered(evt);
            }
        });
        sbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbarActionPerformed(evt);
            }
        });
        jPanel1.add(sbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 240, 32));

        hider1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout hider1Layout = new javax.swing.GroupLayout(hider1);
        hider1.setLayout(hider1Layout);
        hider1Layout.setHorizontalGroup(
            hider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        hider1Layout.setVerticalGroup(
            hider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(hider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 130, -1));

        hider.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout hiderLayout = new javax.swing.GroupLayout(hider);
        hider.setLayout(hiderLayout);
        hiderLayout.setHorizontalGroup(
            hiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        hiderLayout.setVerticalGroup(
            hiderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(hider, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 140, 30));

        jSeparator31.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator31.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator31.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 290, -1, 20));

        jSeparator28.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator28.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator28.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, 20));

        jSeparator27.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator27.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator27.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 290, -1, 20));

        jSeparator29.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator29.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 100, -1));

        sresult2.setEditable(false);
        sresult2.setBackground(new java.awt.Color(255, 255, 255));
        sresult2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        sresult2.setForeground(new java.awt.Color(0, 0, 255));
        sresult2.setBorder(null);
        sresult2.setCaretColor(new java.awt.Color(0, 0, 255));
        sresult2.setFocusable(false);
        sresult2.setOpaque(false);
        jPanel1.add(sresult2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 470, 32));

        sresult3.setEditable(false);
        sresult3.setBackground(new java.awt.Color(255, 255, 255));
        sresult3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        sresult3.setForeground(new java.awt.Color(0, 0, 255));
        sresult3.setBorder(null);
        sresult3.setCaretColor(new java.awt.Color(0, 0, 255));
        sresult3.setFocusable(false);
        sresult3.setOpaque(false);
        jPanel1.add(sresult3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 470, 32));

        sresult4.setEditable(false);
        sresult4.setBackground(new java.awt.Color(255, 255, 255));
        sresult4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        sresult4.setForeground(new java.awt.Color(0, 0, 255));
        sresult4.setBorder(null);
        sresult4.setCaretColor(new java.awt.Color(0, 0, 255));
        sresult4.setFocusable(false);
        sresult4.setOpaque(false);
        jPanel1.add(sresult4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 470, 32));

        sp1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(sp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 470, 10));

        sp2.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(sp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 470, 10));

        sp3.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(sp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 470, 10));

        sp4.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(sp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 470, 10));

        sp5.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(sp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 470, 10));

        ind.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ind.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        pre.setBackground(new java.awt.Color(0, 0, 255));
        pre.setForeground(new java.awt.Color(0, 0, 204));
        pre.setText("First page");
        pre.setFocusPainted(false);
        pre.setFocusable(false);
        pre.setOpaque(false);
        pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preActionPerformed(evt);
            }
        });
        jPanel1.add(pre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 80, 20));

        p.setForeground(new java.awt.Color(0, 0, 255));
        p.setText("Page:1");
        jPanel1.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        jSeparator15.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator15.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 20, 50));

        jSeparator16.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator16.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 530, 10));

        next.setBackground(new java.awt.Color(0, 0, 255));
        next.setForeground(new java.awt.Color(0, 0, 204));
        next.setText("Next page");
        next.setFocusPainted(false);
        next.setFocusable(false);
        next.setRequestFocusEnabled(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        jSeparator19.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator19.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 10));

        jSeparator20.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator20.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 10, 310));

        jSeparator22.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator22.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 510, 10));

        jSeparator23.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator23.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator23.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 10, 50));

        jSeparator24.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator24.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator24.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 10, 30));

        jSeparator25.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator25.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator25.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 10, 30));

        jSeparator26.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator26.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 280, 10));

        jSeparator30.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator30.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator30.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 290, 10, 20));

        jSeparator32.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator32.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 288, 100, -1));

        jSeparator33.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator33.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator33.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 10, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sresult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sresult1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sresult1ActionPerformed

    private void sbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbarActionPerformed
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
        }                sresult1.setText("");
            sresult2.setText("");
            sresult3.setText("");
            sresult4.setText("");
            sresult5.setText("");
            next.setVisible(false);
            ind.setVisible(false);
            sp1.setVisible(false);
            sp2.setVisible(false);
            sp3.setVisible(false);
            sp4.setVisible(false);
            sp5.setVisible(false);
            lastss=0;
            lastd=0;
       
        for(int i=0;i<200;i++){
            
            ss[i]=null;}
        try {
            new SearchFile(sbar.getText());
        } catch (IOException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:

    }//GEN-LAST:event_sbarActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
           hider.setVisible(true);
           hider1.setVisible(true);
           
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
        }                sresult1.setText("");
            sresult2.setText("");
            sresult3.setText("");
            sresult4.setText("");
            sresult5.setText("");
            next.setVisible(false);
            ind.setVisible(false);
            sp1.setVisible(false);
            sp2.setVisible(false);
            sp3.setVisible(false);
            sp4.setVisible(false);
            sp5.setVisible(false);
            lastss=0;
            lastd=0;
       
        for(int i=0;i<200;i++){
            
            ss[i]=null;}
        try {
            new SearchFile(sbar.getText());
        } catch (IOException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:

            sresult1.setText(ss[lastd+1]);
            sresult2.setText(ss[lastd+2]);
            sresult3.setText(ss[lastd+3]);
            sresult4.setText(ss[lastd+4]);
            sresult5.setText(ss[lastd+5]);
            lastd=lastd+5;
            pre.setVisible(true);
            hider1.setVisible(false);
            p.setText("Page:"+lastd/5);
    }//GEN-LAST:event_nextActionPerformed

    private void sbarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbarMouseEntered
        // TODO add your handling code here:
        if (sbarf == 0) {
            sbar.setText("");
        }
        sbarf = 1;
    }//GEN-LAST:event_sbarMouseEntered

    private void sbarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbarMouseClicked
        // TODO add your handling code here:
        if (sbarf == 0) {
            sbar.setText("");
        }
        sbarf = 1;
    }//GEN-LAST:event_sbarMouseClicked

    private void preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preActionPerformed
            
            sresult1.setText(ss[1]);
            sresult2.setText(ss[2]);
            sresult3.setText(ss[3]);
            sresult4.setText(ss[4]);
            sresult5.setText(ss[5]);
            lastd=5;
            p.setText("Page:1");
        // TODO add your handling code here:
    }//GEN-LAST:event_preActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        sbar.setText("");
    }//GEN-LAST:event_jLabel2MouseClicked
    int sbarf = 0;

    /**
     * @param args the command line arguments
     */
    public static void search(String args) {
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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Search().setVisible(true);
        });
    }
String up;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel hider;
    private javax.swing.JPanel hider1;
    private javax.swing.JLabel ind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JButton next;
    private javax.swing.JLabel p;
    private javax.swing.JButton pre;
    private javax.swing.JTextField sbar;
    private javax.swing.JButton search;
    private javax.swing.JSeparator sp1;
    private javax.swing.JSeparator sp2;
    private javax.swing.JSeparator sp3;
    private javax.swing.JSeparator sp4;
    private javax.swing.JSeparator sp5;
    private javax.swing.JTextField sresult1;
    private javax.swing.JTextField sresult2;
    private javax.swing.JTextField sresult3;
    private javax.swing.JTextField sresult4;
    private javax.swing.JTextField sresult5;
    // End of variables declaration//GEN-END:variables
class SearchFile {

        public SearchFile(String sdata) throws FileNotFoundException, IOException {
            File f1 = new File("D:\\Patan_APP\\Admin-control-settings\\"+up+"\\File\\Admission\\Students.txt");
            File f2 = new File("D:\\Patan_APP\\Admin-control-settings\\"+up+"\\File\\Admission\\Teachers.txt");
            try (BufferedReader br1 = new BufferedReader(new FileReader(f1))) {
                String aLine;
                while ((aLine = br1.readLine()) != null) {
                    if (sdata.toLowerCase().equals(aLine.toLowerCase())) {
                        for (int i = 1; i <= 5; i++) {
                            ss[i + lastss] = br1.readLine();

                        }
                        lastss = lastss + 5;
                    }
                }
                br1.close();
            }
            try (BufferedReader br1 = new BufferedReader(new FileReader(f2))) {
                String aLine;
                while ((aLine = br1.readLine()) != null) {
                    if (sdata.toLowerCase().equals(aLine.toLowerCase())) {
                        for (int i = 1; i <= 5; i++) {
                            ss[i + lastss] = br1.readLine();

                        }
                        lastss = lastss + 5;
                    }
                }
                br1.close();
            }
            if ("".equals(sresult1.getText())) {
                sresult1.setText("reached end of search");
            }ind.setVisible(true);
            sresult1.setText(ss[1]);sp1.setVisible(true);
            sresult2.setText(ss[2]);sp2.setVisible(true);
            sresult3.setText(ss[3]);sp3.setVisible(true);
            sresult4.setText(ss[4]);sp4.setVisible(true);
            sresult5.setText(ss[5]);sp5.setVisible(true);
            lastd=lastd+5;
            if(ss[6]!=null)
            {
                next.setVisible(true);
                hider.setVisible(false);
            }
        }

    }
    int lastss = 0,lastd=0;
    int sno = 1;
    String ss[] = new String[200];
    int nextb = 1;
}
