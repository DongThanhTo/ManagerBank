/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author mssrs
 */
public class Moviesbooking extends javax.swing.JFrame {

    /**
     * Creates new form Movies
     */
    public String str;
    public String movie;
    public String time;
     public Moviesbooking() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("logo.png")));
    }
     
    public Moviesbooking(String s, String movie) {
        initComponents();
        str = s;
        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("logo.png")));
        this.movie=movie;
        theatre.setVisible(false);
        button1.setVisible(false);
        button2.setVisible(false);
        button3.setVisible(false);
        payment.setVisible(false);
        price.setVisible(false);
        gst.setVisible(false);
        total.setVisible(false);
        timelbl.setText("");
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        theatre = new javax.swing.JLabel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        location = new javax.swing.JComboBox<>();
        locationlbl = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        payment = new javax.swing.JButton();
        price = new javax.swing.JLabel();
        gst = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        timelbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/movieslable.jpg"))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("All rights reserved by 3TM PVT. LTD.");

        theatre.setText("SAI KRISHNA : 4K DOLBY THEATRE");

        button1.setText("11 : 00 ");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setText("14 : 00");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setText("18 : 00");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        location.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\t", "BHIMVARAM", "HYDERABAD", "RAJAHMUNDRY" }));
        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });

        locationlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        locationlbl.setText("Select your location");

        cancel.setText("Cancel & Go Back");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        payment.setText("Make Payment");
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });

        price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price.setText("PRICE : Rs.75");

        gst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gst.setText("GST : Rs.25");

        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total.setText("TOTAL : Rs.100");

        timelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timelbl.setText("TIME: NA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button1)
                                .addGap(18, 18, 18)
                                .addComponent(button2)
                                .addGap(18, 18, 18)
                                .addComponent(button3))
                            .addComponent(theatre)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(locationlbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(cancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(timelbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(theatre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1)
                    .addComponent(button2)
                    .addComponent(button3))
                .addGap(53, 53, 53)
                .addComponent(locationlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(price)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timelbl)
                .addGap(39, 39, 39)
                .addComponent(payment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancel)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        // TODO add your handling code here:
        if(location.getSelectedItem().equals("BHIMVARAM")){
            theatre.setText("INOX : MULTIPLEX("+this.movie+")");
            theatre.setVisible(true);
            button1.setVisible(true);
            button2.setVisible(true);
            button3.setVisible(true);
            locationlbl.setVisible(false);
            location.setVisible(false);
            
        }else if(location.getSelectedItem().equals("HYDERABAD")){
        theatre.setText("IMAX 3D 4K DOLBY("+this.movie+")");
            theatre.setVisible(true);
            button1.setVisible(true);
            button2.setVisible(true);
            button3.setVisible(true);
            locationlbl.setVisible(false);
            location.setVisible(false);
        }else if(location.getSelectedItem().equals("RAJAHMUNDRY")){
        theatre.setText("SAI KRISHNA 4K DOLBY ATMOS("+this.movie+")");
            theatre.setVisible(true);
            button1.setVisible(true);
            button2.setVisible(true);
            button3.setVisible(true);
            locationlbl.setVisible(false);
            location.setVisible(false);
        }
    }//GEN-LAST:event_locationActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        new ExploremainJframe(str).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        this.time =button1.getText();
        price.setVisible(true);
        gst.setVisible(true);
        total.setVisible(true);
        timelbl.setText("TIME : "+button1.getText());
        payment.setVisible(true);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
         this.time =button2.getText();
        price.setVisible(true);
        gst.setVisible(true);
        total.setVisible(true);
        timelbl.setText("TIME : "+button2.getText());
        payment.setVisible(true);
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        this.time =button3.getText();
        price.setVisible(true);
        gst.setVisible(true);
        total.setVisible(true);
        timelbl.setText("TIME : "+button3.getText());
        payment.setVisible(true);
    }//GEN-LAST:event_button3ActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
       try{
       Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","database","saketh6969");
       String sql = "SELECT BALANCE FROM THREETM WHERE ACCOUNTNO="+str+" AND BALANCE>=100";
       PreparedStatement pst = con.prepareCall(sql);
       ResultSet rs = pst.executeQuery();
       while(rs.next()){
       new success(this.str,"100",timelbl.getText(),this.movie).setVisible(true);
       this.setVisible(false);
       }
       }catch(Exception e){
       JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_paymentActionPerformed

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
            java.util.logging.Logger.getLogger(Moviesbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Moviesbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Moviesbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Moviesbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Moviesbooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel gst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> location;
    private javax.swing.JLabel locationlbl;
    private javax.swing.JButton payment;
    private javax.swing.JLabel price;
    private javax.swing.JLabel theatre;
    private javax.swing.JLabel timelbl;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
