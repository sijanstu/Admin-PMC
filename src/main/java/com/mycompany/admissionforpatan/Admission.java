/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.admissionforpatan;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Programming-learning
 */
public class Admission extends javax.swing.JFrame {

    /**
     * Creates new form Admission
     */
    public Admission() {
        initComponents();
        ImageIcon img=new ImageIcon("src\\main\\icons\\admission.png");
        setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jSeparator45 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        sname = new javax.swing.JTextField();
        others = new javax.swing.JTextField();
        sdepart = new javax.swing.JTextField();
        sparentname = new javax.swing.JTextField();
        jSeparator46 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        errs = new javax.swing.JLabel();
        fselect = new javax.swing.JComboBox<>();
        sparentno = new javax.swing.JTextField();
        jSeparator59 = new javax.swing.JSeparator();
        jSeparator60 = new javax.swing.JSeparator();
        jSeparator61 = new javax.swing.JSeparator();
        jSeparator62 = new javax.swing.JSeparator();
        jSeparator44 = new javax.swing.JSeparator();
        jSeparator47 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator55 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        sname1 = new javax.swing.JTextField();
        others1 = new javax.swing.JTextField();
        sdepart1 = new javax.swing.JTextField();
        sparentname1 = new javax.swing.JTextField();
        errs1 = new javax.swing.JLabel();
        fselect1 = new javax.swing.JComboBox<>();
        jSeparator54 = new javax.swing.JSeparator();
        jSeparator56 = new javax.swing.JSeparator();
        jSeparator41 = new javax.swing.JSeparator();
        jSeparator43 = new javax.swing.JSeparator();
        jSeparator42 = new javax.swing.JSeparator();
        subtea = new javax.swing.JButton();
        jSeparator57 = new javax.swing.JSeparator();
        jSeparator58 = new javax.swing.JSeparator();
        jSeparator50 = new javax.swing.JSeparator();
        jSeparator51 = new javax.swing.JSeparator();
        jSeparator52 = new javax.swing.JSeparator();
        jSeparator53 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 255));
        jLabel37.setText("Admission Section");
        jPanel8.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 159, -1));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setForeground(new java.awt.Color(0, 0, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
        });
        jPanel9.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Name");
        jPanel9.add(jLabel12);
        jLabel12.setBounds(50, 10, 35, 33);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel9.add(jSeparator1);
        jSeparator1.setBounds(90, 40, 230, 10);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 255));
        jLabel27.setText("Department");
        jPanel9.add(jLabel27);
        jLabel27.setBounds(20, 60, 74, 17);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 255));
        jPanel9.add(jSeparator2);
        jSeparator2.setBounds(110, 200, 220, 10);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 255));
        jLabel28.setText("Campus Roll no:");
        jPanel9.add(jLabel28);
        jLabel28.setBounds(10, 180, 100, 17);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 255));
        jPanel9.add(jSeparator3);
        jSeparator3.setBounds(100, 80, 230, 10);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 255));
        jLabel29.setText("Faculty");
        jPanel9.add(jLabel29);
        jLabel29.setBounds(40, 100, 44, 17);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 255));
        jPanel9.add(jSeparator4);
        jSeparator4.setBounds(100, 120, 230, 10);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 255));
        jLabel30.setText("Parent's Name");
        jPanel9.add(jLabel30);
        jLabel30.setBounds(8, 140, 90, 17);

        jSeparator45.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator45.setForeground(new java.awt.Color(0, 0, 255));
        jPanel9.add(jSeparator45);
        jSeparator45.setBounds(120, 210, 110, 10);

        jSeparator5.setForeground(new java.awt.Color(0, 0, 255));
        jPanel9.add(jSeparator5);
        jSeparator5.setBounds(100, 160, 230, 10);

        sname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sname.setForeground(new java.awt.Color(0, 0, 255));
        sname.setBorder(null);
        jPanel9.add(sname);
        sname.setBounds(100, 10, 230, 30);

        others.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        others.setForeground(new java.awt.Color(0, 0, 255));
        others.setBorder(null);
        others.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                othersMouseEntered(evt);
            }
        });
        jPanel9.add(others);
        others.setBounds(200, 50, 130, 30);

        sdepart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sdepart.setForeground(new java.awt.Color(0, 0, 255));
        sdepart.setBorder(null);
        jPanel9.add(sdepart);
        sdepart.setBounds(100, 90, 230, 30);

        sparentname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sparentname.setForeground(new java.awt.Color(0, 0, 255));
        sparentname.setBorder(null);
        jPanel9.add(sparentname);
        sparentname.setBounds(100, 130, 230, 30);

        jSeparator46.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator46.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator46.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel9.add(jSeparator46);
        jSeparator46.setBounds(130, 210, 20, 40);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton2);
        jButton2.setBounds(130, 210, 90, 40);

        errs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        errs.setForeground(new java.awt.Color(51, 51, 255));
        jPanel9.add(errs);
        errs.setBounds(230, 210, 110, 40);

        fselect.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        fselect.setForeground(new java.awt.Color(0, 0, 255));
        fselect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BCA", "BBA", "BIT", "BIM", "CSIT", "BHM", "others" }));
        fselect.setBorder(null);
        fselect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fselectActionPerformed(evt);
            }
        });
        jPanel9.add(fselect);
        fselect.setBounds(100, 50, 100, 30);

        sparentno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sparentno.setForeground(new java.awt.Color(0, 0, 255));
        sparentno.setBorder(null);
        jPanel9.add(sparentno);
        sparentno.setBounds(110, 170, 220, 30);

        jSeparator59.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator59.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator59.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel9.add(jSeparator59);
        jSeparator59.setBounds(0, 0, 10, 250);

        jSeparator60.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator60.setForeground(new java.awt.Color(0, 0, 255));
        jPanel9.add(jSeparator60);
        jSeparator60.setBounds(0, 0, 340, 10);

        jSeparator61.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator61.setForeground(new java.awt.Color(0, 0, 255));
        jPanel9.add(jSeparator61);
        jSeparator61.setBounds(0, 250, 340, 10);

        jSeparator62.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator62.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator62.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel9.add(jSeparator62);
        jSeparator62.setBounds(340, 0, 10, 250);

        jSeparator44.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator44.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator44.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel9.add(jSeparator44);
        jSeparator44.setBounds(132, 210, 10, 40);

        jSeparator47.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator47.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator47.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel9.add(jSeparator47);
        jSeparator47.setBounds(220, 210, 20, 40);

        jTabbedPane2.addTab("Student", jPanel9);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setForeground(new java.awt.Color(0, 0, 255));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel11MouseEntered(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 255));
        jLabel32.setText("Name");
        jPanel11.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 33));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 255));
        jPanel11.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 230, 10));

        jSeparator55.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator55.setForeground(new java.awt.Color(0, 0, 255));
        jPanel11.add(jSeparator55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 340, 10));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 255));
        jLabel33.setText("Department");
        jPanel11.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jSeparator14.setForeground(new java.awt.Color(0, 0, 255));
        jPanel11.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 230, 10));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 255));
        jLabel35.setText("Faculty");
        jPanel11.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jSeparator15.setForeground(new java.awt.Color(0, 0, 255));
        jPanel11.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 230, 10));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 255));
        jLabel36.setText("phone number");
        jPanel11.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jSeparator16.setForeground(new java.awt.Color(0, 0, 255));
        jPanel11.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 220, 10));

        sname1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sname1.setForeground(new java.awt.Color(0, 0, 255));
        sname1.setBorder(null);
        jPanel11.add(sname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 240, 30));

        others1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        others1.setForeground(new java.awt.Color(0, 0, 255));
        others1.setBorder(null);
        others1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                others1MouseEntered(evt);
            }
        });
        jPanel11.add(others1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 100, 30));

        sdepart1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sdepart1.setForeground(new java.awt.Color(0, 0, 255));
        sdepart1.setBorder(null);
        jPanel11.add(sdepart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 230, 30));

        sparentname1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sparentname1.setForeground(new java.awt.Color(0, 0, 255));
        sparentname1.setBorder(null);
        jPanel11.add(sparentname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 210, 30));

        errs1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        errs1.setForeground(new java.awt.Color(51, 51, 255));
        jPanel11.add(errs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 160, 30));

        fselect1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        fselect1.setForeground(new java.awt.Color(0, 0, 255));
        fselect1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BCA", "BBA", "BIT", "BIM", "CSIT", "BHM", "others" }));
        fselect1.setBorder(null);
        fselect1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fselect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fselect1ActionPerformed(evt);
            }
        });
        jPanel11.add(fselect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 100, 30));

        jSeparator54.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator54.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator54.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel11.add(jSeparator54, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 10, 250));

        jSeparator56.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator56.setForeground(new java.awt.Color(0, 0, 255));
        jPanel11.add(jSeparator56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 340, 10));

        jSeparator41.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator41.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator41.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel11.add(jSeparator41, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 10, 40));

        jSeparator43.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator43.setForeground(new java.awt.Color(0, 0, 255));
        jPanel11.add(jSeparator43, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 110, 10));

        jSeparator42.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator42.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator42.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel11.add(jSeparator42, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 210, 10, 40));

        subtea.setBackground(new java.awt.Color(255, 255, 255));
        subtea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subtea.setForeground(new java.awt.Color(0, 0, 255));
        subtea.setText("Submit");
        subtea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subteaActionPerformed(evt);
            }
        });
        jPanel11.add(subtea, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 90, 40));

        jSeparator57.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator57.setForeground(new java.awt.Color(0, 0, 255));
        jPanel11.add(jSeparator57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 10));

        jSeparator58.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator58.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator58.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel11.add(jSeparator58, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 250));

        jTabbedPane2.addTab("Teacher", jPanel11);

        jPanel8.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 350, 280));

        jSeparator50.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator50.setForeground(new java.awt.Color(0, 0, 255));
        jPanel8.add(jSeparator50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 340, 10));

        jSeparator51.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator51.setForeground(new java.awt.Color(0, 0, 255));
        jPanel8.add(jSeparator51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        jSeparator52.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator52.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator52.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel8.add(jSeparator52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        jSeparator53.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator53.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator53.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel8.add(jSeparator53, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 10, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void othersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_othersMouseEntered
        // TODO add your handling code here:
        if (fot == 0) {
            others.setText("");
            fot = 1;
        }
    }//GEN-LAST:event_othersMouseEntered
    int fot = 0;String up;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AssignFaculty af = new AssignFaculty();
        String facultyc = af.AssignFaculty();
        String namec = sname.getText();
        String departc = sdepart.getText();
        String parentnac = sparentname.getText();
        String parentnoc = sparentno.getText();
        String ch = "";
        if (!ch.equals(namec) && !ch.equals(facultyc) && !ch.equals(departc) && !ch.equals(parentnac) && !ch.equals(parentnoc)) {
            errs.setForeground(Color.blue);
            try {
                File f1 = new File("D:\\Patan_APP\\Admin-control-settings\\Admission.txt");
                try (FileWriter fw = new FileWriter(f1)) {
                    fw.append(namec+"\nName:"
                            + namec
                            + "\nFaculty:" + facultyc 
                            + "\nDepartment:" + departc + "\nCollege roll no:" + parentnoc +"\nParent's name:" + parentnac + "\n");
                    fw.close();
                    errs.setText("added to database");
                    File fp = new File("C://Patan_APP/Admin-control-settings/Total_Student/S");
                    if (!fp.exists()) {
                        File fp1 = new File("C://Patan_APP/Admin-control-settings/Total_Student");
                        fp1.mkdir();
                        try (FileWriter fw1 = new FileWriter("C://Patan_APP/Admin-control-settings/Total_Student/count.txt")) {
                            fw1.write(0);
                        }
                    }
                    int count;
                    try (FileReader fr = new FileReader(fp)) {
                        count = fr.read();
                        count++;
                    }
                    try (FileWriter fw12 = new FileWriter(fp)) {
                        fw12.write(count);
                    }
                }
            } catch (IOException e) {
                errs.setForeground(Color.red);
                errs.setText("writing error");
            } finally {
                sname.setText(ch);
                others.setText(ch);
                sparentname.setText(ch);
            }
        } else {
            errs.setForeground(Color.red);
            errs.setText("enter all details");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fselectActionPerformed
        // TODO add your handling code here:
        if (fselect.getSelectedIndex() == 6) {
            others.setVisible(true);
            others.setEditable(true);
            others.setEnabled(true);
            others.setText("enter here:");
            fot = 0;
        } else {

            others.setEnabled(false);
            others.setVisible(false);
        }
    }//GEN-LAST:event_fselectActionPerformed

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        // TODO add your handling code here:
        if (foas == 0) {
            others.setVisible(false);
            foas = 1;
        }
    }//GEN-LAST:event_jPanel9MouseEntered

    private void others1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_others1MouseEntered
        // TODO add your handling code here:
        if (fot1 == 0) {
            others1.setText("");
            fot1 = 1;
        }
    }//GEN-LAST:event_others1MouseEntered

    private void subteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subteaActionPerformed
        // TODO add your handling code here:
        AssignFaculty1 af = new AssignFaculty1();
        String facultyc1 = af.AssignFaculty1();
        String namec1 = sname1.getText();
        String departc1 = sdepart1.getText();
        String parentnac1 = sparentname1.getText();
        // String parentnoc1 = sparentno1.getText();
        String ch = "";
        if (!ch.equals(namec1) && !ch.equals(facultyc1) && !ch.equals(departc1) && !ch.equals(parentnac1)) {
            errs1.setForeground(Color.blue);
            try {
                File f = new File("C://Patan_APP/Teacher/" + facultyc1);
                if (!f.exists()) {
                    f.mkdirs();
                }
                try (FileWriter fw = new FileWriter("C://Patan_APP/Teacher/"
                        + facultyc1 + "/"
                        + namec1
                        + ".txt")) {
                    fw.append("Name:"
                            + namec1
                            + "\nFaculty:"
                            + facultyc1
                            + "\nDepartment:"
                            + departc1
                            + "\nPhone number:"
                            + parentnac1
                            + "\n");
                }

                errs1.setText("added to database");
                File fp = new File("C://Patan_APP/Admin-control-settings/Total_Teacher/count.txt");
                if (!fp.exists()) {
                    File fp1 = new File("C://Patan_APP/Admin-control-settings/Total_Teacher");
                    fp1.mkdir();
                    try (FileWriter fw1 = new FileWriter("C://Patan_APP/Admin-control-settings/Total_Teacher/count.txt")) {
                        fw1.write(0);
                    }
                }
                int count;
                try (FileReader fr = new FileReader(fp)) {
                    count = fr.read();
                    count++;
                }
                try (FileWriter fw = new FileWriter(fp)) {
                    fw.write(count);
                }

            } catch (IOException e) {
                errs1.setForeground(Color.red);
                errs1.setText("writing error");
            } finally {
                sname1.setText(ch);
                others1.setText(ch);
                sparentname1.setText(ch);
            }
        } else {
            errs1.setForeground(Color.red);
            errs1.setText("enter all details");
        }
    }//GEN-LAST:event_subteaActionPerformed

    private void fselect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fselect1ActionPerformed
        // TODO add your handling code here:
        if (fselect1.getSelectedIndex() == 6) {
            others1.setVisible(true);
            others1.setEditable(true);
            //others1.setEnabled(true);
            others1.setText("enter here:");
            fot1 = 0;
        } else {

            //others.setEnabled(false);
            others.setVisible(false);
        }
    }//GEN-LAST:event_fselect1ActionPerformed

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
        // TODO add your handling code here:
        if (foas1 == 0) {
            others1.setVisible(false);
            foas1 = 1;
        }
    }//GEN-LAST:event_jPanel11MouseEntered

    /**
     * //@param args the command line arguments
     */
    public static void mainAdmmission() {
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
            java.util.logging.Logger.getLogger(Admission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Admission().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errs;
    private javax.swing.JLabel errs1;
    private javax.swing.JComboBox<String> fselect;
    private javax.swing.JComboBox<String> fselect1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator44;
    private javax.swing.JSeparator jSeparator45;
    private javax.swing.JSeparator jSeparator46;
    private javax.swing.JSeparator jSeparator47;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator50;
    private javax.swing.JSeparator jSeparator51;
    private javax.swing.JSeparator jSeparator52;
    private javax.swing.JSeparator jSeparator53;
    private javax.swing.JSeparator jSeparator54;
    private javax.swing.JSeparator jSeparator55;
    private javax.swing.JSeparator jSeparator56;
    private javax.swing.JSeparator jSeparator57;
    private javax.swing.JSeparator jSeparator58;
    private javax.swing.JSeparator jSeparator59;
    private javax.swing.JSeparator jSeparator60;
    private javax.swing.JSeparator jSeparator61;
    private javax.swing.JSeparator jSeparator62;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField others;
    private javax.swing.JTextField others1;
    private javax.swing.JTextField sdepart;
    private javax.swing.JTextField sdepart1;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField sname1;
    private javax.swing.JTextField sparentname;
    private javax.swing.JTextField sparentname1;
    private javax.swing.JTextField sparentno;
    private javax.swing.JButton subtea;
    // End of variables declaration//GEN-END:variables
class AssignFaculty {

        String AssignFaculty() {
            String facultyc = null;
            if (fselect.getSelectedIndex() == 6) {
                facultyc = others.getText();
                File file = new File("C://Patan_APP/Student/"
                        + facultyc);
                file.mkdir();
            } else {
                if (fselect.getSelectedIndex() == 0) {
                    facultyc = "BCA";
                }
                if (fselect.getSelectedIndex() == 1) {
                    facultyc = "BBA";
                }
                if (fselect.getSelectedIndex() == 2) {
                    facultyc = "BIT";
                }
                if (fselect.getSelectedIndex() == 3) {
                    facultyc = "BIM";
                }
                if (fselect.getSelectedIndex() == 4) {
                    facultyc = "CSIT";
                }
                if (fselect.getSelectedIndex() == 5) {
                    facultyc = "BHM";
                }
            }
            return facultyc;
        }
    }

    class AssignFaculty1 {

        String AssignFaculty1() {
            String facultyc = null;
            if (fselect1.getSelectedIndex() == 6) {
                facultyc = others1.getText();
                File file = new File("C://Patan_APP/Student/"
                        + facultyc);
                file.mkdir();
            } else {
                if (fselect1.getSelectedIndex() == 0) {
                    facultyc = "BCA";
                }
                if (fselect1.getSelectedIndex() == 1) {
                    facultyc = "BBA";
                }
                if (fselect1.getSelectedIndex() == 2) {
                    facultyc = "BIT";
                }
                if (fselect1.getSelectedIndex() == 3) {
                    facultyc = "BIM";
                }
                if (fselect1.getSelectedIndex() == 4) {
                    facultyc = "CSIT";
                }
                if (fselect1.getSelectedIndex() == 5) {
                    facultyc = "BHM";
                }
            }
            return facultyc;
        }
    }
    int fot1 = 0, foas = 0, foas1 = 0;
    public class RecognizeUser{
        public void getinfo(){
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
    }
    public String getinfo(){
        String up1="error";
        try {
            File frchstu = new File("D:\\Patan_APP\\Admin-control-settings\\current login.txt");
            try (BufferedReader fr = new BufferedReader(new FileReader(frchstu))) {
                if (frchstu.exists()) {
                    String strLine;
                        up1=fr.readLine();
                }
                fr.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Status.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Status.class.getName()).log(Level.SEVERE, null, ex);
        }     return up1;
        }
}
