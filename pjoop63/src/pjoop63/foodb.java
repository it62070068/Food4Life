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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class foodb extends javax.swing.JFrame {

    public foodb() {
        initComponents();
        show_food();
    }
    //ตาราง
    public ArrayList<Food4l> food4lList(){
        ArrayList<Food4l> food4lList = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pjoop63", "root", "");
            String query1 = "SELECT * FROM food4l";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Food4l food4l;
            while(rs.next()){
                food4l = new Food4l(rs.getInt("fid"),rs.getString("fname"),rs.getInt("fcal"),rs.getFloat("fcost"),rs.getString("fstatus"));
                food4lList.add(food4l);
                
            }
        } catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(foodb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return food4lList;
    }
    public void show_food(){
        ArrayList<Food4l> list = food4lList();
        DefaultTableModel model = (DefaultTableModel)jTable_Display_Food.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getFid();           
            row[1] = list.get(i).getFname();
            row[2] = list.get(i).getFcal();
            row[3] = list.get(i).getFcost();
            row[4] = list.get(i).getFstatus();
            model.addRow(row);
        }
        
    }
    public void clear_food_row(){
        DefaultTableModel model = (DefaultTableModel)jTable_Display_Food.getModel();
        int row_to_clear = model.getRowCount();
        for (int i = row_to_clear-1; i>=0; i--) {
            model.removeRow(i);
        }
    }
    Connection con;
    PreparedStatement pst;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtfid = new javax.swing.JTextField();
        txtfname = new javax.swing.JTextField();
        txtfcal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtfcost = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Food = new javax.swing.JTable();
        Combostatus = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("จัดการรายการอาหาร"));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("รหัสอาหาร");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(69, 139, 87, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ชื่ออาหาร");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(69, 211, 77, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("แคลเลอรี่");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(69, 285, 73, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("สถานะ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(69, 431, 55, 27);
        jPanel1.add(txtfid);
        txtfid.setBounds(287, 139, 220, 40);
        jPanel1.add(txtfname);
        txtfname.setBounds(287, 211, 220, 40);

        txtfcal.setPreferredSize(new java.awt.Dimension(60, 20));
        jPanel1.add(txtfcal);
        txtfcal.setBounds(287, 285, 220, 40);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("เพิ่ม");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(84, 537, 120, 50);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("แก้ไข");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(281, 537, 125, 50);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ลบ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(84, 624, 120, 50);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ยกเลิก");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(281, 624, 125, 50);
        jPanel1.add(txtfcost);
        txtfcost.setBounds(287, 359, 220, 39);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("ราคา");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(69, 359, 41, 22);

        jTable_Display_Food.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสอาหาร", "ชื่ออาหาร", "แคลเลอรี่", "ราคา", "สถานะ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Display_Food.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_FoodMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_Food);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(544, 139, 588, 535);

        Combostatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "มี", "ไม่มี" }));
        Combostatus.setSelectedIndex(-1);
        jPanel1.add(Combostatus);
        Combostatus.setBounds(287, 432, 220, 30);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("รีเฟรชตาราง");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(84, 707, 120, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("Primary Key");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(162, 145, 72, 15);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("ย้อนกลับ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(79, 62, 120, 50);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(530, 765, 0, 0);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(405, 62, 0, 0);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/127858074_1076519749443305_1825691129174117884_n.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 1200, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//เพิ่มรายการ
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String fid = txtfid.getText();
        String fname = txtfname.getText();
        String fcal = txtfcal.getText();
        String fcost = txtfcost.getText();
        String fstatus = Combostatus.getSelectedItem().toString();
        
        try {
            clear_food_row();
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pjoop63", "root", "");
            pst = con.prepareStatement("insert into food4l(fid, fname, fcal, fcost, fstatus) values(?, ?, ?, ?, ?)");
            pst.setString(1, fid);
            pst.setString(2, fname);
            pst.setString(3, fcal);
            pst.setString(4, fcost);
            pst.setString(5, fstatus);
            pst.executeUpdate();
            show_food();
            JOptionPane.showMessageDialog(this, "เพิ่มรายการสำเร็จ...");
            
            
            txtfid.setText("");
            txtfname.setText("");
            txtfcal.setText("");
            txtfcost.setText("");
            Combostatus.setSelectedIndex(-1);
            //autoID();
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(foodb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(foodb.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed
//ปุ่มลบข้อมูล
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel d1 =(DefaultTableModel)jTable_Display_Food.getModel();
        
        int selectIndex = jTable_Display_Food.getSelectedRow();
        
            String id = d1.getValueAt(selectIndex, 0).toString();
            int dialogResult = JOptionPane.showConfirmDialog(this, "คุณเเน่ใจหรือว่าต้องการลบข้อมูลที่เลือก", "Warning",JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                try {
                    clear_food_row();//เคลียตารางด้วยความเร็วเเสง
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pjoop63", "root", "");
                    pst = con.prepareStatement("delete from food4l where fid = ?");
                    pst.setString(1, id);
                    pst.executeUpdate();
                    show_food();//เพิ่มรายการด้วยความเร็วเสียง
                    JOptionPane.showMessageDialog(this, "ลบข้อมูลสำเร็จ...");
                    txtfid.setText("");
                    txtfname.setText("");
                    txtfcal.setText("");
                    txtfcost.setText("");
                    Combostatus.setSelectedIndex(-1);
                    
                } catch (Exception ex) {
                    java.util.logging.Logger.getLogger(foodb.class.getName()).log(Level.SEVERE, null, ex);
                }
                
        }
            
        
    }//GEN-LAST:event_jButton3ActionPerformed
//ข้อมูลจะใส่เท็กฟิลต์เมื่อคลิ๊ก
    private void jTable_Display_FoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_FoodMouseClicked
       DefaultTableModel d1 = (DefaultTableModel)jTable_Display_Food.getModel();
       int selectIndex = jTable_Display_Food.getSelectedRow();
       
       txtfid.setText(d1.getValueAt(selectIndex, 0).toString());
       txtfname.setText(d1.getValueAt(selectIndex, 1).toString());
       txtfcal.setText(d1.getValueAt(selectIndex, 2).toString());
       txtfcost.setText(d1.getValueAt(selectIndex, 3).toString());
       Combostatus.setSelectedItem(d1.getValueAt(selectIndex, 4).toString());
    }//GEN-LAST:event_jTable_Display_FoodMouseClicked
//ปุ่มยกเลิก
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.txtfid.setText(null);
        this.txtfname.setText(null);
        this.txtfcal.setText(null);
        this.txtfcost.setText(null);
        Combostatus.setSelectedIndex(-1);
    }//GEN-LAST:event_jButton4ActionPerformed
//ปุ่มเเก้ไข
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel d1 =(DefaultTableModel)jTable_Display_Food.getModel();
        
        int selectIndex = jTable_Display_Food.getSelectedRow();
        
        try {
            String id = d1.getValueAt(selectIndex, 0).toString();
            String name = txtfname.getText();
            String cal = txtfcal.getText();
            String cost = txtfcost.getText();
            String Combos = Combostatus.getSelectedItem().toString();
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pjoop63", "root", "");
            pst = con.prepareStatement("update food4l set fname=?, fcal=?, fcost=?, fstatus=? where fid = ?");
            
            pst.setString(1, name);
            pst.setString(2, cal);
            pst.setString(3, cost);
            pst.setString(4, Combos);
            pst.setString(5, id);
            pst.executeUpdate();
            
            clear_food_row();
            show_food();
            
            this.txtfid.setText(null);
            this.txtfname.setText(null);
            this.txtfcal.setText(null);
            this.txtfcost.setText(null);
            Combostatus.setSelectedIndex(-1);
            
            JOptionPane.showMessageDialog(this, "อัพเดทสำเร็จ...");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed
//รีเฟรชเจเทเบิลครับพี่
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        clear_food_row();
        show_food();
        JOptionPane.showMessageDialog(this, "รีเฟรชสำเร็จ...");
    }//GEN-LAST:event_jButton6ActionPerformed
//ย้อนกลับ
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.hide();
        Main mn = new Main();
        mn.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

        
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new foodb().autoID();
                new foodb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combostatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Food;
    private javax.swing.JTextField txtfcal;
    private javax.swing.JTextField txtfcost;
    private javax.swing.JTextField txtfid;
    private javax.swing.JTextField txtfname;
    // End of variables declaration//GEN-END:variables
}
