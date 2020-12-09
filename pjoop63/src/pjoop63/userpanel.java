/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pjoop63;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.table.DefaultTableModel;


public final class userpanel extends javax.swing.JFrame {

    public userpanel() {
        initComponents();
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableuser = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 800));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        tableuser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสอาหาร", "ชื่ออาหาร", "แคลเลอรี่", "ราคา"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableuser.setRowHeight(18);
        jScrollPane1.setViewportView(tableuser);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(535, 110, 499, 552);

        jButton1.setText("แสดงเมนู");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(85, 110, 128, 53);

        jButton2.setText("ปูผัดผงกระหรี่");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(231, 252, 128, 53);

        jButton3.setText("ต้มยำกุ้ง");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(85, 181, 128, 53);

        jButton4.setText("กระเพราะไก่");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(231, 110, 128, 53);

        jButton5.setText("หมึกผัดไข่เค็ม");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(85, 252, 128, 53);

        jButton6.setText("ผัดไทย");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(231, 181, 128, 53);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/127858074_1076519749443305_1825691129174117884_n.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 800);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1200, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clear_food_row();
        showuser();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        kapaokai kp = new kapaokai();
        kp.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tomyumkung tk = new tomyumkung();
        tk.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        pudthai pt = new pudthai();
        pt.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        kraken kk = new kraken();
        kk.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        crabcr cb = new crabcr();
        cb.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    public void showuser(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pjoop63", "root", "");
            Statement st = con.createStatement();
            String sql = "select * from food4l where fstatus='มี'";
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                String fid = String.valueOf(rs.getInt("fid"));
                String fname = rs.getString("fname");
                String fcal = String.valueOf(rs.getInt("fcal"));
                String fcost = String.valueOf(rs.getInt("fcost"));
                
                String tbfuser[] = {fid, fname, fcal, fcost};
                    DefaultTableModel tbf4user = (DefaultTableModel)tableuser.getModel();
                    
                    tbf4user.addRow(tbfuser);
            }
        con.close();
        } catch (Exception e) {
        }
    }
    public void clear_food_row(){
        DefaultTableModel model = (DefaultTableModel)tableuser.getModel();
        int row_to_clear = model.getRowCount();
        for (int i = row_to_clear-1; i>=0; i--) {
            model.removeRow(i);
        }
}
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userpanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableuser;
    // End of variables declaration//GEN-END:variables
}
