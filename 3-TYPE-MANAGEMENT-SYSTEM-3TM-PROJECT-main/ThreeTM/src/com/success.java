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
public class success extends javax.swing.JFrame {

    /**
     * Creates new form success
     */
    public String str;
    public String amount;
    public String time;
    public String movie;
    public success() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("logo.png")));
    }
    public success(String s,String a,String time,String movie) {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("logo.png")));
        this.str=s;
        this.amount=a;
        this.time=time;
        this.movie=movie;
        try{
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","database","saketh6969");
        String sql = "select balance from threetm where accountno="+str;
        PreparedStatement pst = con.prepareCall(sql);
        ResultSet rs=pst.executeQuery();
        int existing = 0;
        while(rs.next()){
        existing = rs.getInt(1);
        }
        int b = Integer.parseInt(this.amount);
        int total = existing-b;
        String sql1 = "UPDATE THREETM SET BALANCE="+total+" WHERE ACCOUNTNO="+str;
        pst=con.prepareCall(sql1);
        pst.executeUpdate();
        status.setText("Your Ticket has been booked for movie "+this.movie +" at show time "+this.time+". COST="+this.amount);
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }
    public success(String s,String a) {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("logo.png")));
        str=s;
        amount =a;
        try{
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","database","saketh6969");
        String sql = "select balance from threetm where accountno="+str;
        PreparedStatement pst = con.prepareCall(sql);
        ResultSet rs=pst.executeQuery();
        int existing = 0;
        while(rs.next()){
        existing = rs.getInt(1);
        }
        int b = Integer.parseInt(this.amount);
        int total = existing-b;
        String sql1 = "UPDATE THREETM SET BALANCE="+total+" WHERE ACCOUNTNO="+str;
        pst=con.prepareCall(sql1);
        pst.executeUpdate();
        status.setText("Recharge with mobile number "+str+" with Rs."+amount+" is successfull");
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        status = new javax.swing.JLabel();
        mainmenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        status.setForeground(new java.awt.Color(102, 204, 0));
        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        mainmenu.setText("Go to Main Menu");
        mainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addComponent(mainmenu)
                .addGap(204, 204, 204))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(mainmenu)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuActionPerformed
        // TODO add your handling code here:
        new ExploremainJframe(str).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mainmenuActionPerformed

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
            java.util.logging.Logger.getLogger(success.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(success.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(success.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(success.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new success().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton mainmenu;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
