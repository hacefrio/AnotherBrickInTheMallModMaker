/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editMod;

import compiler.Compiler;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author sebastian
 */
public class editMod extends javax.swing.JFrame {

    FileManager FM = new FileManager();
    SqLiteManager conn = new SqLiteManager();
    String tempHorizontalGfx = "";
    String tempVerticalGfx = "";
    String tempCheckoutGfx = "";

    /**
     * Creates new form editMod
     */
    public editMod() {
        initComponents();
        loadProperties();
        otherInits();
    }

    public void loadProperties() {
        String[] properties = conn.getProperties();
        modName.setText(properties[0]);
        modAuthor.setText(properties[1]);
        modDescription.setText(properties[2]);
        productCount.setText(conn.getCountProducts());
        loadProducts();
    }

    public void loadProducts() {
        conn.loadProductsList(list);
    }

    public void otherInits() {
        depletionRateBar.setMaximum(100);
        depletionRateBar.setMinimum(1);
        baseDemandBar.setMaximum(200);
        baseDemandBar.setMinimum(0);
        basePriceBar.setMaximum(200);
        basePriceBar.setMinimum(1);
        FM.setCapsuleImage(capsule);
        depletionRateCount.setText(Integer.toString(depletionRateBar.getValue()));
        depletionRatebarReefresh();
        basePriceBarRefresh();
        baseDemandBarRefresh();
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        modAuthor = new javax.swing.JTextField();
        modName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        modDescription = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        productCount = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        list = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        productCodeName = new javax.swing.JTextField();
        productName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        specialtyName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        subType = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        qualityDistribution = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        depletionRateBar = new javax.swing.JSlider();
        baseDemandBar = new javax.swing.JSlider();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        basePriceBar = new javax.swing.JSlider();
        jLabel14 = new javax.swing.JLabel();
        displayType = new javax.swing.JComboBox();
        expires = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        requiresResearch = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        basePriceCount = new javax.swing.JLabel();
        depletionRateCount = new javax.swing.JLabel();
        baseDemandCount = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        capsule = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Compile mod");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 140, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mod Author:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 20));

        modAuthor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(modAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 160, 30));

        modName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(modName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 160, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mod name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 20));

        modDescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(modDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 160, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mod description:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 20));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Change");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Change");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Change");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("cuntent Products:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        productCount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(productCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 70, -1));

        jButton5.setText("refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        list.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        list.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        jPanel2.add(list, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("products list:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Load product");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("product Codename: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        productCodeName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(productCodeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 210, -1));

        productName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(productName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 210, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Product name:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        specialtyName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(specialtyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 210, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Subtype:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("specialty name:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        subType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Food", "Beverages", "Household Items", "Health and Beauty","Tools and Materials","Electronics and Appliances","Clothing","Media","Press and Print","Plants and Gardening","Misc","Sports and Outdoors","Toys and Games" }));
        jPanel2.add(subType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 210, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("depletion rate:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        qualityDistribution.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qualityDistribution.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "no specialization (100/0/0)", "standard (75/25/0)", "high sub-category (50/50/0)", "specialty (30/30/40)","high specialty (10/30/70)","no middle (30/0/70) - typically for products in the 'Misc' sub-category","only specialty (0/0/100)" }));
        jPanel2.add(qualityDistribution, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 210, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Display type:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        depletionRateBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                depletionRateBarMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                depletionRateBarMouseMoved(evt);
            }
        });
        jPanel2.add(depletionRateBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 210, -1));

        baseDemandBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                baseDemandBarMouseDragged(evt);
            }
        });
        jPanel2.add(baseDemandBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 210, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("base demand:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("base price:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        basePriceBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                basePriceBarMouseDragged(evt);
            }
        });
        jPanel2.add(basePriceBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 210, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("quality distribution:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        displayType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        displayType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Food shelf", "Fridge only", "Fridge or food shelf (suitable for drinks)", "Table","Cloth rack","Pallet","Non-food shelf" }));
        jPanel2.add(displayType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 210, -1));

        expires.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(expires, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 210, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("expires(hours):");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        requiresResearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        requiresResearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "none","Cold chain","Alcohol license","Frozen food supplier","Chemical supplier","Clothing supplier","Electronics supplier","Media supplier","Appliances supplier","Tools supplier","Luxury supplier","Tobacco license","Newsagent supplier","Plants and Gardening supplier","E-Cigarettes supplier"}));
        jPanel2.add(requiresResearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 210, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("checkout gfx:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("requires research:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("vertical gfx:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("horizontal gfx:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setText("upload file");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setText("upload file");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton9.setText("upload file");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton10.setText("Create / Edit  Product");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 170, -1));

        basePriceCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        basePriceCount.setText("999");
        jPanel2.add(basePriceCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 210, 10));

        depletionRateCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        depletionRateCount.setText("999");
        jPanel2.add(depletionRateCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 210, 20));

        baseDemandCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baseDemandCount.setText("999");
        jPanel2.add(baseDemandCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 210, 20));

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton12.setText("Clear");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, -1));

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton13.setText("Gameplay mod");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton14.setText("Delete");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 830, 440));
        jPanel1.add(capsule, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 240, 140));

        jButton11.setText("Change mod image");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Compiler com = new Compiler();
        this.dispose();
        try {
            com.compile();
        } catch (IOException ex) {
            Logger.getLogger(editMod.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        conn.setName(modName.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        conn.setAuthor(modAuthor.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        conn.setDescription(modDescription.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        productCount.setText(conn.getCountProducts());
        loadProducts();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            // TODO add your handling code here:
            FM.changeCapsuleImage(capsule);
            FM.setCapsuleImage(capsule);
        } catch (IOException ex) {
            Logger.getLogger(editMod.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void depletionRateBarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depletionRateBarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_depletionRateBarMouseMoved

    private void depletionRateBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depletionRateBarMouseDragged
        // TODO add your handling code here:
        depletionRatebarReefresh();
    }//GEN-LAST:event_depletionRateBarMouseDragged

    private void baseDemandBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baseDemandBarMouseDragged
        // TODO add your handling code here:
        baseDemandBarRefresh();
    }//GEN-LAST:event_baseDemandBarMouseDragged

    private void basePriceBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basePriceBarMouseDragged
        // TODO add your handling code here:
        basePriceBarRefresh();
    }//GEN-LAST:event_basePriceBarMouseDragged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String[] product = conn.loadProduct((String) list.getSelectedItem());
        product tempProd = new product();
        productCodeName.setText(product[0]);
        productCodeName.setEditable(false);
        productName.setText(product[1]);
        specialtyName.setText(product[2]);
        subType.setSelectedItem(tempProd.subTypeIntToString(Integer.valueOf(product[3])));
        displayType.setSelectedItem(tempProd.displayTypeIntToString(Integer.valueOf(product[4])));
        depletionRateBar.setValue(Integer.valueOf(product[5]));
        baseDemandBar.setValue(Integer.valueOf(product[6]));
        basePriceBar.setValue(Integer.valueOf(product[7]));
        qualityDistribution.setSelectedItem(tempProd.qualityDistributionIntToString(Integer.valueOf(product[8])));
        System.out.println(product[8]);
        expires.setText(product[9]);
        requiresResearch.setSelectedItem(tempProd.requiresResearchIntToString(Integer.valueOf(product[10])));
        tempHorizontalGfx = "images/Horizontal" + productCodeName.getText() + ".png";
        tempVerticalGfx = "images/Vertical" + productCodeName.getText() + ".png";
        tempCheckoutGfx = "images/Checkout" + productCodeName.getText() + ".png";
        barrasReload();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int opcion = fc.showOpenDialog(null);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            try {
                FM.uploadProductImageHorizontal((String) fc.getSelectedFile().getAbsolutePath(), productCodeName.getText());
                tempHorizontalGfx = "images/Horizontal" + productCodeName.getText() + ".png";
            } catch (Exception ex) {
            }

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int opcion = fc.showOpenDialog(null);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            try {
                FM.uploadProductImageVertical((String) fc.getSelectedFile().getAbsolutePath(), productCodeName.getText());
                tempVerticalGfx = "images/Vertical" + productCodeName.getText() + ".png";
            } catch (Exception ex) {
            }

        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int opcion = fc.showOpenDialog(null);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            try {
                FM.uploadProductImageCheckout((String) fc.getSelectedFile().getAbsolutePath(), productCodeName.getText());
                tempCheckoutGfx = "images/Checkout" + productCodeName.getText() + ".png";
            } catch (Exception ex) {
            }

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here
        product product = new product();
        product.setCodename(productCodeName.getText());
        product.setName(productName.getText());
        product.setSpecalty_name(specialtyName.getText());
        product.setSubtype(Integer.toString(product.subTypeStringToInt((String)subType.getSelectedItem())));
        product.setDisplay_type(Integer.toString(product.displayTypeStringToInt((String) displayType.getSelectedItem())));
        product.setDepletion_rate(depletionRateCount.getText());
        product.setBase_demand(baseDemandCount.getText());
        product.setBase_price(basePriceCount.getText());
        product.setQuality_distribution(Integer.toString(product.qualityDistributionStringToInt((String) qualityDistribution.getSelectedItem())));
        product.setExpires_in_hours(expires.getText());
        product.setRequires_research(Integer.toString(product.requiresResearchStringToInt((String) requiresResearch.getSelectedItem())));
        product.setHorizontal_gfx(tempHorizontalGfx);
        product.setVertical_gfx(tempVerticalGfx);
        product.setCheckout_gfx(tempCheckoutGfx);
        
        product.saveProduct();
        loadProducts();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        conn.deleteProduct(productCodeName.getText());
        clear();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "coming soon", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton13ActionPerformed

    public void clear() {
        productCodeName.setText("");
        productCodeName.setEditable(true);
        productName.setText("");
        specialtyName.setText("");
        depletionRateBar.setValue(50);
        baseDemandBar.setValue(50);
        basePriceBar.setValue(50);
        expires.setText("");
        barrasReload();
    }

    public void barrasReload() {
        basePriceBarRefresh();
        depletionRatebarReefresh();
        baseDemandBarRefresh();
    }

    public void basePriceBarRefresh() {
        basePriceCount.setText(Integer.toString(basePriceBar.getValue()));
    }

    public void depletionRatebarReefresh() {
        depletionRateCount.setText(Integer.toString(depletionRateBar.getValue()));
    }

    public void baseDemandBarRefresh() {
        baseDemandCount.setText(Integer.toString(baseDemandBar.getValue()));
    }

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
            java.util.logging.Logger.getLogger(editMod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editMod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editMod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editMod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider baseDemandBar;
    private javax.swing.JLabel baseDemandCount;
    private javax.swing.JSlider basePriceBar;
    private javax.swing.JLabel basePriceCount;
    private javax.swing.JLabel capsule;
    private javax.swing.JSlider depletionRateBar;
    private javax.swing.JLabel depletionRateCount;
    private javax.swing.JComboBox displayType;
    private javax.swing.JTextField expires;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox list;
    private javax.swing.JTextField modAuthor;
    private javax.swing.JTextField modDescription;
    private javax.swing.JTextField modName;
    private javax.swing.JTextField productCodeName;
    private javax.swing.JTextField productCount;
    private javax.swing.JTextField productName;
    private javax.swing.JComboBox qualityDistribution;
    private javax.swing.JComboBox requiresResearch;
    private javax.swing.JTextField specialtyName;
    private javax.swing.JComboBox subType;
    // End of variables declaration//GEN-END:variables
}
