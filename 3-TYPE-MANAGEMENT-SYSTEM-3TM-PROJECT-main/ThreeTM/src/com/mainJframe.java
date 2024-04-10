/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com;

import java.awt.Toolkit;

/**
 *
 * @author mssrs
 */
public class mainJframe extends javax.swing.JFrame {

    /**
     * Creates new form mainJframe
     */
    public mainJframe() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("logo.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainframe = new javax.swing.JPanel();
        headerframe = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tmwelcomebg = new javax.swing.JPanel();
        tmwelome = new javax.swing.JLabel();
        Expplore = new javax.swing.JButton();
        managetmaccount = new javax.swing.JButton();
        register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ThreeTM : Joy of Spendin,Ease of managing");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        mainframe.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Picsart_22-03-14_16-52-54-188.png"))); // NOI18N

        javax.swing.GroupLayout headerframeLayout = new javax.swing.GroupLayout(headerframe);
        headerframe.setLayout(headerframeLayout);
        headerframeLayout.setHorizontalGroup(
            headerframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerframeLayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(121, 121, 121))
        );
        headerframeLayout.setVerticalGroup(
            headerframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerframeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tmwelcomebg.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        tmwelome.setText("Welcome to Three Type Management System");
        tmwelome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout tmwelcomebgLayout = new javax.swing.GroupLayout(tmwelcomebg);
        tmwelcomebg.setLayout(tmwelcomebgLayout);
        tmwelcomebgLayout.setHorizontalGroup(
            tmwelcomebgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tmwelcomebgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tmwelome, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        tmwelcomebgLayout.setVerticalGroup(
            tmwelcomebgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tmwelcomebgLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tmwelome)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Expplore.setText("Explore 3TM Account");
        Expplore.setToolTipText("Explore");
        Expplore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpploreActionPerformed(evt);
            }
        });

        managetmaccount.setText("Manage 3TM Bank Account");
        managetmaccount.setToolTipText("Manage");
        managetmaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managetmaccountActionPerformed(evt);
            }
        });

        register.setText("Open 3TM Bank Account");
        register.setToolTipText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainframeLayout = new javax.swing.GroupLayout(mainframe);
        mainframe.setLayout(mainframeLayout);
        mainframeLayout.setHorizontalGroup(
            mainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerframe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainframeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(mainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Expplore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(managetmaccount, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tmwelcomebg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainframeLayout.setVerticalGroup(
            mainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainframeLayout.createSequentialGroup()
                .addComponent(headerframe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tmwelcomebg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Expplore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(managetmaccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(register)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainframe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainframe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExpploreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpploreActionPerformed
        // TODO add your handling code here:
        new ExploreLogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ExpploreActionPerformed

    private void managetmaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managetmaccountActionPerformed
        // TODO add your handling code here:
        new ManageLogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_managetmaccountActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
        new RegisterJframe().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registerActionPerformed

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
            java.util.logging.Logger.getLogger(mainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new mainJframe().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Expplore;
    private javax.swing.JPanel headerframe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainframe;
    private javax.swing.JButton managetmaccount;
    private javax.swing.JButton register;
    private javax.swing.JPanel tmwelcomebg;
    private javax.swing.JLabel tmwelome;
    // End of variables declaration//GEN-END:variables
}
