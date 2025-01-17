/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ayen
 */
public class AdminMenu extends javax.swing.JFrame {

    /**
     * Creates new form AdminMenu
     */
    public AdminMenu() {
        initComponents();
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
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        EmpUserNameDel = new javax.swing.JTextField();
        ShowEmployeeRecords = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        DeleteEmp = new javax.swing.JButton();
        Password = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        ShowLoginRecords = new javax.swing.JButton();
        DeleteLogin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        UserNameDelLog = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        ShowCustomerRecords = new javax.swing.JButton();
        DeleteCustomer = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        CustomDel = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Menu");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(221, 116, 10));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Admin Menu");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setText("Employee Records");

        EmpUserNameDel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        ShowEmployeeRecords.setBackground(new java.awt.Color(255, 255, 51));
        ShowEmployeeRecords.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        ShowEmployeeRecords.setText("Show Employee Records");
        ShowEmployeeRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowEmployeeRecordsActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USERNAME", "PASSWORD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Username");

        Clear.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        DeleteEmp.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        DeleteEmp.setText("Delete Selected");
        DeleteEmp.setActionCommand("DeleteSelected");
        DeleteEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEmpActionPerformed(evt);
            }
        });

        Password.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jButton1.setText("Add Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Username");

        UserName.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel3.setText("Login Records");

        jTable3.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USERNAME", "PASSWORD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        ShowLoginRecords.setBackground(new java.awt.Color(255, 255, 51));
        ShowLoginRecords.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        ShowLoginRecords.setText("Show Login Records");
        ShowLoginRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowLoginRecordsActionPerformed(evt);
            }
        });

        DeleteLogin.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        DeleteLogin.setText("Delete Selected");
        DeleteLogin.setActionCommand("DeleteSelected");
        DeleteLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteLoginActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("Username");

        UserNameDelLog.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        UserNameDelLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameDelLogActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel2.setText("Customer Records");

        jTable2.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FIRSTNAME", "LASTNAME", "HOUSENUM", "STREET", "COFFESIZE", "COFFETEMP", "QUANTITY", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        ShowCustomerRecords.setBackground(new java.awt.Color(255, 255, 51));
        ShowCustomerRecords.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        ShowCustomerRecords.setText("Show Customer Records");
        ShowCustomerRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowCustomerRecordsActionPerformed(evt);
            }
        });

        DeleteCustomer.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        DeleteCustomer.setText("Delete Selected");
        DeleteCustomer.setActionCommand("DeleteSelected");
        DeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCustomerActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("Lastname");

        CustomDel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        jButton2.setBackground(new java.awt.Color(102, 51, 0));
        jButton2.setFont(new java.awt.Font("Showcard Gothic", 0, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Clear)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)))
                                .addGap(293, 293, 293))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DeleteLogin)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(UserNameDelLog, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(ShowLoginRecords)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(CustomDel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(ShowCustomerRecords)
                                            .addComponent(DeleteCustomer)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(EmpUserNameDel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(DeleteEmp)
                                                    .addComponent(ShowEmployeeRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(47, 47, 47)))
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(ShowEmployeeRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DeleteEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmpUserNameDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(Clear)))
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ShowLoginRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(UserNameDelLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)))
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(ShowCustomerRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustomDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ShowEmployeeRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowEmployeeRecordsActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            try (
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/NewLogin","Member2","sa")) {
                Statement st = con.createStatement();
                String sql = "select * from MANAGERRECORDS";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()){
                    String Uname = rs.getString("USERNAME");
                    String Pword = rs.getString("PASSWORD");
                    
                    String tbData[] = {Uname,Pword};
                    DefaultTableModel tbmodel1 = (DefaultTableModel)jTable1.getModel();
                    tbmodel1.addRow(tbData); 
                }
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
    }//GEN-LAST:event_ShowEmployeeRecordsActionPerformed
    }
    private void ShowLoginRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowLoginRecordsActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            try (
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/NewLogin","Member2","sa")) {
                Statement st = con.createStatement();
                String sql = "select * from LOGINS";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()){
                    String Uname = rs.getString("USERNAME");
                    String Pword = rs.getString("PASSWORD");
                    
                    String tbData[] = {Uname,Pword};
                    DefaultTableModel tbmodel1 = (DefaultTableModel)jTable3.getModel();
                    tbmodel1.addRow(tbData); 
                }
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());  
    }//GEN-LAST:event_ShowLoginRecordsActionPerformed
    }
    private void ShowCustomerRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowCustomerRecordsActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            try (
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/NewLogin","Member2","sa")) {
                Statement st = con.createStatement();
                String sql = "select * from CUSTOMERRECORDS";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()){
                    String FNAME = rs.getString("FIRSTNAME");
                    String LNAME = rs.getString("LASTNAME");
                    String Hnum = rs.getString("HOUSENUM");
                    String Str = rs.getString("STREET");
                    String Csize = rs.getString("COFFEESIZE");
                    String CTemp = rs.getString("COFFEETEMP");
                    String QUAN = rs.getString("QUANTITY");
                    String PRI = rs.getString("PRICE");
                    
                    String tbData[] = {FNAME,LNAME,Hnum,Str,Csize,CTemp,QUAN,PRI};
                    DefaultTableModel tbmodel1 = (DefaultTableModel)jTable2.getModel();
                    tbmodel1.addRow(tbData); 
                }
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());  
    }                                           
        
    }//GEN-LAST:event_ShowCustomerRecordsActionPerformed

    private void DeleteEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEmpActionPerformed
        // TODO add your handling code here:
          DefaultTableModel tb1Model = (DefaultTableModel)jTable1.getModel();
          if(jTable1.getSelectedRowCount()==1){
              tb1Model.removeRow(jTable1.getSelectedRow());
          }
          else{
              if(jTable1.getRowCount()== 0){
              JOptionPane.showMessageDialog(this,"Table Is Empty");
              }else{
                  JOptionPane.showMessageDialog(this,"Please Select A Row");
              }
          }
        if(EmpUserNameDel.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please Input Username.");
        }
          try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                //Pinalitan ko yung database rito
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/NewLogin","Member2","sa");
                PreparedStatement st=null;
                //Binago ko rin database rito para ma try 
                String sql = "Delete from MEMBER2.MANAGERRECORDS where USERNAME=?";
                st = con.prepareStatement(sql);
                st.setString(1, EmpUserNameDel.getText());
                st.executeUpdate();
                JOptionPane.showMessageDialog(this,"Account Deleted.");
                EmpUserNameDel.setText("");
          }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Connection Error.");
                e.printStackTrace();
            }     
    }//GEN-LAST:event_DeleteEmpActionPerformed

    private void DeleteLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteLoginActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tb1Model = (DefaultTableModel)jTable3.getModel();
          if(jTable3.getSelectedRowCount()==1){
              tb1Model.removeRow(jTable3.getSelectedRow());
          }
          else{
              if(jTable3.getRowCount()== 0){
              JOptionPane.showMessageDialog(this,"Table Is Empty");
              }else{
                  JOptionPane.showMessageDialog(this,"Please Select A Row");
              }
          }
          if(EmpUserNameDel.getText().equals("")){
              
        }
          try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                //Pinalitan ko yung database rito
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/NewLogin","Member2","sa");
                PreparedStatement st=null;
                //Binago ko rin database rito para ma try 
                String sql = "Delete from MEMBER2.LOGINS where USERNAME=?";
                st = con.prepareStatement(sql);
                st.setString(1, UserNameDelLog.getText());
                st.executeUpdate();
                JOptionPane.showMessageDialog(this,"Account Deleted.");
                UserNameDelLog.setText("");
          }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Connection Error.");
                e.printStackTrace();
            }
          
    }//GEN-LAST:event_DeleteLoginActionPerformed

    private void DeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCustomerActionPerformed
        // TODO add your handling code here:
          DefaultTableModel tb1Model = (DefaultTableModel)jTable2.getModel();
          if(jTable2.getSelectedRowCount()==1){
              tb1Model.removeRow(jTable2.getSelectedRow());
          }
          else{
              if(jTable2.getRowCount()== 0){
              JOptionPane.showMessageDialog(this,"Table Is Empty");
              }else{
                  JOptionPane.showMessageDialog(this,"Please Select A Row");
              }
          }
          try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                //Pinalitan ko yung database rito
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/NewLogin","Member2","sa");
                PreparedStatement st=null;
                //Binago ko rin database rito para ma try 
                String sql = "Delete from MEMBER2.CUSTOMERRECORDS where LASTNAME=?";
                st = con.prepareStatement(sql);
                st.setString(1, CustomDel.getText());
                st.executeUpdate();
                JOptionPane.showMessageDialog(this,"Account Deleted.");
                CustomDel.setText("");
          }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Connection Error.");
                e.printStackTrace();
            }
        
    }//GEN-LAST:event_DeleteCustomerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(UserName.getText().equals("")||Password.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter All Data!");
        }else{
            String data[] = {UserName.getText(),Password.getText()};
            DefaultTableModel tb1Model = (DefaultTableModel)jTable1.getModel();
            tb1Model.addRow(data);
        }
        try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                //Pinalitan ko yung database rito
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/NewLogin","Member2","sa");
                PreparedStatement st=null;
                //Binago ko rin database rito para ma try 
                String sql = "INSERT INTO MEMBER2.MANAGERRECORDS(USERNAME, PASSWORD)VALUES(?,?)";
                st = con.prepareStatement(sql);
                st.setString(1, UserName.getText());
                st.setString(2, Password.getText());
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Account Created.");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Connection Error.");
                e.printStackTrace();
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        UserName.setText("");
        Password.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Logout Successful.");
        this.dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UserNameDelLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameDelLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameDelLogActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JTextField CustomDel;
    private javax.swing.JButton DeleteCustomer;
    private javax.swing.JButton DeleteEmp;
    private javax.swing.JButton DeleteLogin;
    private javax.swing.JTextField EmpUserNameDel;
    private javax.swing.JTextField Password;
    private javax.swing.JButton ShowCustomerRecords;
    private javax.swing.JButton ShowEmployeeRecords;
    private javax.swing.JButton ShowLoginRecords;
    private javax.swing.JTextField UserName;
    private javax.swing.JTextField UserNameDelLog;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
