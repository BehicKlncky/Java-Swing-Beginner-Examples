/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Code.Check;
import Code.Flower;
import Code.Gift;
import Code.Toy;
import java.util.ArrayList;

/**
 *
 * @author OEM
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
        pnlGiftCheck.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        pnlGiftItem = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rdbtToy = new javax.swing.JRadioButton();
        rdbtFlower = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        pnlToy = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cmbTypeToy = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tfWarranity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfPirceToy = new javax.swing.JTextField();
        tfminAge = new javax.swing.JTextField();
        tfMaxAge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlFlower = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfFlowerColor = new javax.swing.JTextField();
        tfPriceFlower = new javax.swing.JTextField();
        tfPackageColor = new javax.swing.JTextField();
        tfFlowerCount = new javax.swing.JTextField();
        cmbTypeFlower = new javax.swing.JComboBox<>();
        pnlGiftCheck = new javax.swing.JPanel();
        tfPriceCheck = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfExpireDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbStoreName = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cmbGiftType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        taTextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pnlGiftItem.setBorder(javax.swing.BorderFactory.createTitledBorder("Gift Item"));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(rdbtToy);
        rdbtToy.setText("Toy");
        rdbtToy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtToyActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbtFlower);
        rdbtFlower.setText("Flower");
        rdbtFlower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtFlowerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(rdbtToy)
                .addGap(18, 18, 18)
                .addComponent(rdbtFlower)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtToy)
                    .addComponent(rdbtFlower))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel1.setText("type:");

        pnlToy.setBorder(javax.swing.BorderFactory.createTitledBorder("Toy"));

        jLabel5.setText("Type");

        cmbTypeToy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Angry Birds", "Pikachu", "Teddy Bear" }));

        jLabel6.setText("Warranity:");

        jLabel7.setText("Price:");

        jLabel8.setText("Minimum Age:");

        jLabel9.setText("Maximum Age:");

        javax.swing.GroupLayout pnlToyLayout = new javax.swing.GroupLayout(pnlToy);
        pnlToy.setLayout(pnlToyLayout);
        pnlToyLayout.setHorizontalGroup(
            pnlToyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToyLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlToyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlToyLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(115, 115, 115)
                        .addComponent(cmbTypeToy, 0, 243, Short.MAX_VALUE))
                    .addGroup(pnlToyLayout.createSequentialGroup()
                        .addGroup(pnlToyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(87, 87, 87)
                        .addGroup(pnlToyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPirceToy)
                            .addComponent(tfMaxAge)
                            .addComponent(tfWarranity)
                            .addComponent(tfminAge))))
                .addGap(28, 28, 28))
        );
        pnlToyLayout.setVerticalGroup(
            pnlToyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToyLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlToyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbTypeToy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlToyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfWarranity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlToyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(tfPirceToy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlToyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlToyLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(tfminAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfMaxAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlToyLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFlower.setBorder(javax.swing.BorderFactory.createTitledBorder("Flower"));

        jLabel10.setText("Type");

        jLabel11.setText("Price:");

        jLabel12.setText("Flower Color:");

        jLabel13.setText("Flower Count:");

        jLabel14.setText("Package Colort:");

        cmbTypeFlower.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daisy", "Lilac", "Rose" }));

        javax.swing.GroupLayout pnlFlowerLayout = new javax.swing.GroupLayout(pnlFlower);
        pnlFlower.setLayout(pnlFlowerLayout);
        pnlFlowerLayout.setHorizontalGroup(
            pnlFlowerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFlowerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlFlowerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFlowerLayout.createSequentialGroup()
                        .addGroup(pnlFlowerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFlowerLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(58, 58, 58)
                                .addComponent(tfPackageColor))
                            .addGroup(pnlFlowerLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(107, 107, 107)
                                .addComponent(tfPriceFlower))
                            .addGroup(pnlFlowerLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(70, 70, 70)
                                .addComponent(tfFlowerColor))
                            .addGroup(pnlFlowerLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(66, 66, 66)
                                .addComponent(tfFlowerCount)))
                        .addGap(51, 51, 51))
                    .addGroup(pnlFlowerLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(110, 110, 110)
                        .addComponent(cmbTypeFlower, 0, 243, Short.MAX_VALUE)
                        .addGap(33, 33, 33))))
        );
        pnlFlowerLayout.setVerticalGroup(
            pnlFlowerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFlowerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFlowerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbTypeFlower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFlowerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfPriceFlower, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlFlowerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFlowerLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(tfFlowerColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFlowerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFlowerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfFlowerCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFlowerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tfPackageColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlGiftItemLayout = new javax.swing.GroupLayout(pnlGiftItem);
        pnlGiftItem.setLayout(pnlGiftItemLayout);
        pnlGiftItemLayout.setHorizontalGroup(
            pnlGiftItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGiftItemLayout.createSequentialGroup()
                .addGroup(pnlGiftItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGiftItemLayout.createSequentialGroup()
                        .addGroup(pnlGiftItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlGiftItemLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1))
                            .addGroup(pnlGiftItemLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlToy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFlower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlGiftItemLayout.setVerticalGroup(
            pnlGiftItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGiftItemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(pnlToy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlFlower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlGiftCheck.setBorder(javax.swing.BorderFactory.createTitledBorder("Gift Check"));

        jLabel2.setText("Price:");

        jLabel3.setText("Expire Date");

        jLabel4.setText("Store Name");

        cmbStoreName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Çankaya Çiçek", "Toyzz Shop", "Dost Kitapevi" }));

        javax.swing.GroupLayout pnlGiftCheckLayout = new javax.swing.GroupLayout(pnlGiftCheck);
        pnlGiftCheck.setLayout(pnlGiftCheckLayout);
        pnlGiftCheckLayout.setHorizontalGroup(
            pnlGiftCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGiftCheckLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGiftCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPriceCheck)
                    .addComponent(tfExpireDate)
                    .addGroup(pnlGiftCheckLayout.createSequentialGroup()
                        .addGroup(pnlGiftCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbStoreName, 0, 243, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlGiftCheckLayout.setVerticalGroup(
            pnlGiftCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGiftCheckLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPriceCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tfExpireDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbStoreName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pnlGiftItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlGiftCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlGiftCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlGiftItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setText("Gift Type:");

        cmbGiftType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item", "Check", "All" }));
        cmbGiftType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGiftTypeActionPerformed(evt);
            }
        });

        taTextArea.setColumns(20);
        taTextArea.setRows(5);
        jScrollPane1.setViewportView(taTextArea);

        jButton1.setText("Display");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(cmbGiftType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cmbGiftType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbtToyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtToyActionPerformed
        pnlFlower.setVisible(false);
        pnlToy.setVisible(true);
    }//GEN-LAST:event_rdbtToyActionPerformed

    private void rdbtFlowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtFlowerActionPerformed
        pnlToy.setVisible(false);
        pnlFlower.setVisible(true);
    }//GEN-LAST:event_rdbtFlowerActionPerformed

    private void cmbGiftTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGiftTypeActionPerformed
        if(cmbGiftType.getSelectedItem().toString().equals("Item")){
            pnlGiftCheck.setVisible(false);
            pnlGiftItem.setVisible(true);
        }
        else if(cmbGiftType.getSelectedItem().toString().equals("Check")){
            pnlGiftCheck.setVisible(true);
            pnlGiftItem.setVisible(false);
        }
        else{
            pnlGiftCheck.setVisible(true);
            pnlGiftItem.setVisible(true);
        }
    }//GEN-LAST:event_cmbGiftTypeActionPerformed
    public static ArrayList<Toy> toys = new ArrayList(); 
    public static ArrayList<Flower> flowers = new ArrayList(); 
    public static ArrayList<Check> checks = new ArrayList(); 
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(cmbGiftType.getSelectedItem().toString().equals("All")){
            taTextArea.setText("Please select an Item or Check");
        }
        else if(cmbGiftType.getSelectedItem().toString().equals("Item") && rdbtToy.isSelected() ){
            Toy t = new Toy(Integer.parseInt(tfminAge.getText()),Integer.parseInt(tfMaxAge.getText()),Integer.parseInt(tfWarranity.getText()),0,cmbTypeToy.getSelectedItem().toString(),Integer.parseInt(tfPirceToy.getText()));
            toys.add(t);
            taTextArea.setText("Toy Added...");
        }
        else if(cmbGiftType.getSelectedItem().toString().equals("Item") && rdbtFlower.isSelected()) {
            Flower f = new Flower(Integer.parseInt(tfFlowerCount.getText()),tfFlowerColor.getText(),tfPackageColor.getText(),8,cmbTypeFlower.getSelectedItem().toString(),Integer.parseInt(tfPriceFlower.getText()));
            flowers.add(f);
            taTextArea.setText("Flower Added...");
        }
        else if(cmbGiftType.getSelectedItem().toString().equals("Check")){
            Check c = new Check(tfExpireDate.getText(),cmbStoreName.getSelectedItem().toString(),5,Integer.parseInt(tfPriceCheck.getText()));
            checks.add(c);
            taTextArea.setText("Check Added...");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(cmbGiftType.getSelectedItem().toString().equals("Item")){
            taTextArea.setText(toys.toString()+flowers.toString());
        }
        else if(cmbGiftType.getSelectedItem().toString().equals("Check")){
            taTextArea.setText(checks.toString());
        }
        else{
            taTextArea.setText(toys.toString()+flowers.toString()+checks.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbGiftType;
    private javax.swing.JComboBox<String> cmbStoreName;
    private javax.swing.JComboBox<String> cmbTypeFlower;
    private javax.swing.JComboBox<String> cmbTypeToy;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlFlower;
    private javax.swing.JPanel pnlGiftCheck;
    private javax.swing.JPanel pnlGiftItem;
    private javax.swing.JPanel pnlToy;
    private javax.swing.JRadioButton rdbtFlower;
    private javax.swing.JRadioButton rdbtToy;
    private javax.swing.JTextArea taTextArea;
    private javax.swing.JTextField tfExpireDate;
    private javax.swing.JTextField tfFlowerColor;
    private javax.swing.JTextField tfFlowerCount;
    private javax.swing.JTextField tfMaxAge;
    private javax.swing.JTextField tfPackageColor;
    private javax.swing.JTextField tfPirceToy;
    private javax.swing.JTextField tfPriceCheck;
    private javax.swing.JTextField tfPriceFlower;
    private javax.swing.JTextField tfWarranity;
    private javax.swing.JTextField tfminAge;
    // End of variables declaration//GEN-END:variables
}