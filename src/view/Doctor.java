/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ronald
 */
public class Doctor extends javax.swing.JFrame {

    /**
     * Creates new form Doctor
     */
    public Doctor() {
        initComponents();
        Selectional();
    }
private void Selectional(){
try{
     Con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hospital_mgt_system", "postgres","ronald");
     St = Con.createStatement();
     Rs = St.executeQuery("Select * from public.DOCTORTBL");
     DoctorTable.setModel(DbUtils.resultSetToTableModel(Rs));
} catch (Exception e){
e.printStackTrace();
}
}
   Connection Con = null;
   Statement St = null;
   ResultSet Rs = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DocId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DocName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DocPass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DocExp = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        HomeBtn2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DoctorTable = new javax.swing.JTable();
        DeleteBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KANOMBE HOSPITAL SYSTEM");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MANAGE DOCTORS");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setText("x");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("EXPERIENCE");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("             DOCTORS INFORMATION");

        DocId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DocId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocIdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("NAME");

        DocName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("ID");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        DocPass.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("PASSWORD");

        DocExp.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        UpdateBtn.setBackground(new java.awt.Color(0, 0, 0));
        UpdateBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("UPDATE");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(0, 0, 0));
        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        HomeBtn2.setBackground(new java.awt.Color(0, 0, 0));
        HomeBtn2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        HomeBtn2.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtn2.setText("HOME");
        HomeBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtn2MouseClicked(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CLEAR");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DOCTORS LIST");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(422, 422, 422))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        DoctorTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DoctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DOCTORID", "DOCTORNAME", "PASSWORD", "EXPERIENCE"
            }
        ));
        DoctorTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        DoctorTable.setRowHeight(32);
        DoctorTable.setSelectionBackground(new java.awt.Color(0, 51, 51));
        DoctorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoctorTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DoctorTable);

        DeleteBtn.setBackground(new java.awt.Color(0, 0, 0));
        DeleteBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(AddBtn)
                        .addGap(285, 285, 285)
                        .addComponent(UpdateBtn)
                        .addGap(155, 155, 155)
                        .addComponent(DeleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(132, 132, 132))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DocName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DocId, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(129, 129, 129)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DocExp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DocPass, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(484, 484, 484)
                .addComponent(HomeBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DocExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DocId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))
                            .addComponent(DocPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AddBtn)
                                    .addComponent(UpdateBtn)
                                    .addComponent(jButton4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(DeleteBtn)))
                        .addGap(13, 13, 13)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HomeBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
    
      try {
        // Validate Doctor ID is not empty
        if (DocId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Doctor ID is required.");
            return; // Exit the method if validation fails
        }

        // Validate Doctor Name is not empty and within a character range (min3, max50)
        String doctorName = DocName.getText();
        if (doctorName.isEmpty() || doctorName.length() < 3 || doctorName.length() > 50) {
            JOptionPane.showMessageDialog(this, "Doctor Name is required and should be between 3 and 50 characters.");
            return;
        }

        // Validate Experience is not empty and within a number range (min1, max50)
        String experienceText = DocExp.getText();
        if (experienceText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Experience is required.");
            return;
        }
        int experience = Integer.parseInt(experienceText);
        if (experience < 1 || experience > 50) {
            JOptionPane.showMessageDialog(this, "Experience should be between 1 and 50.");
            return;
        }

        // Validate Password is not empty and within a character range (min: 6, max: 20)
        String password = DocPass.getText();
        if (password.isEmpty() || password.length() < 6 || password.length() > 20) {
            JOptionPane.showMessageDialog(this, "Password is required and should be between 6 and 20 characters.");
            return;
        }

        // Establish a database connection
        Con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hospital_mgt_system", "postgres", "ronald");

        // Prepare an SQL statement for inserting a new record into the DOCTORTBL table
        PreparedStatement Add = Con.prepareStatement("INSERT INTO DOCTORTBL values(?,?,?,?)");

        // Set values for the parameters in the prepared statement
        Add.setInt(1, Integer.valueOf(DocId.getText()));    // Doctor ID
        Add.setString(2, DocName.getText());                // Doctor Name
        Add.setInt(3, Integer.valueOf(DocExp.getText()));   // Experience
        Add.setString(4, DocPass.getText());                 // Password

        // Execute the SQL statement and get the number of affected rows
        int row = Add.executeUpdate();

        // Display a success message using a JOptionPane
        JOptionPane.showMessageDialog(this, "Doctor Added Successfully");

        // Close the database connection
        Con.close();

        // Refresh the displayed data in the GUI by calling the Selectional method
        Selectional();

    } catch (NumberFormatException e) {
        // Handle NumberFormatException (e.g., if the user enters non-numeric values for numeric fields)
        JOptionPane.showMessageDialog(this, "Invalid numeric input. Please enter a valid number.");
    } catch (Exception e) {
        // Handle other exceptions by printing the stack trace
        e.printStackTrace();
    }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        
        DocId.setText("");
        DocName.setText("");
        DocExp.setText("");
        DocPass.setText("");
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void DoctorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoctorTableMouseClicked
        // TODO add your handling code here:
            DefaultTableModel model = (DefaultTableModel)DoctorTable.getModel();
            int Myindex = DoctorTable.getSelectedRow();
            DocId.setText(model.getValueAt(Myindex, 0).toString());
            DocName.setText(model.getValueAt(Myindex, 1).toString());
            DocExp.setText(model.getValueAt(Myindex, 2).toString());
            DocPass.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_DoctorTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        // TODO add your handling code here:
     // Validate that the Doctor ID is not empty before deleting
    if (DocId.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter the Doctor ID to be deleted");
    } else {
        try {
            // Establish a database connection
            Con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hospital_mgt_system", "postgres", "ronald");

            // Validate that the entered Doctor ID is a valid integer
            try {
                Integer.parseInt(DocId.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid Doctor ID. Please enter a valid number.");
                return;
            }

            // Construct the SQL query for deleting the doctor
            String Id = DocId.getText();
            String Query = "Delete from public.DOCTORTBL where DOCID=" + Id;

            // Create a statement and execute the delete query
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);

            // Refresh the displayed data in the GUI by calling the Selectional method
            Selectional();

            // Display a success message
            JOptionPane.showMessageDialog(this, "Doctor Successfully Deleted, MURAKOZE! THANK YOU!");

        } catch (Exception e) {
            // Handle other exceptions by printing the stack trace
            e.printStackTrace();
        } finally {
            try {
                // Close the database connection in the finally block to ensure it is always closed
                if (Con != null) {
                    Con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        // TODO add your handling code here:
  // Validate that none of the fields are empty before updating
    if (DocId.getText().isEmpty() || DocName.getText().isEmpty() || DocExp.getText().isEmpty() || DocPass.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "MISSING INFORMATION!");
    } else {
        try {
            // Establish a database connection
            Con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hospital_mgt_system", "postgres", "ronald");

            // Validate Doctor Name is not empty and within a character range (min: 3, max: 50)
            String doctorName = DocName.getText();
            if (doctorName.length() < 3 || doctorName.length() > 50) {
                JOptionPane.showMessageDialog(this, "Doctor Name should be between 3 and 50 characters.");
                return;
            }

            // Validate Experience is not empty and within a number range (min: 1, max: 50)
            String experienceText = DocExp.getText();
            if (experienceText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Experience is required.");
                return;
            }
            int experience = Integer.parseInt(experienceText);
            if (experience < 1 || experience > 50) {
                JOptionPane.showMessageDialog(this, "Experience should be between 1 and 50.");
                return;
            }

            // Validate Password is not empty and within a character range (min: 6, max: 20)
            String password = DocPass.getText();
            if (password.length() < 6 || password.length() > 20) {
                JOptionPane.showMessageDialog(this, "Password should be between 6 and 20 characters.");
                return;
            }

            // Construct the SQL query for updating the doctor information
            String Query = "Update public.DOCTORTBL set DOCNAME='" + doctorName + "', DOCEXP=" + experience + ", DOCPASS='" + password + "' where DOCID=" + DocId.getText();

            // Create a statement and execute the update query
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);

            // Display a success message
            JOptionPane.showMessageDialog(this, "Doctor information updated successfully!");

            // Refresh the displayed data in the GUI by calling the Selectional method
            Selectional();

        } catch (NumberFormatException e) {
            // Handle NumberFormatException (e.g., if the user enters non-numeric values for numeric fields)
            JOptionPane.showMessageDialog(this, "Invalid numeric input. Please enter a valid number.");
        } catch (Exception e) {
            // Handle other exceptions by printing the stack trace
            e.printStackTrace();
        } finally {
            try {
                // Close the database connection in the finally block to ensure it is always closed
                if (Con != null) {
                    Con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void HomeBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtn2MouseClicked
        // TODO add your handling code here:
          new HomeForm().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_HomeBtn2MouseClicked

    private void DocIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocIdActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField DocExp;
    private javax.swing.JTextField DocId;
    private javax.swing.JTextField DocName;
    private javax.swing.JTextField DocPass;
    private javax.swing.JTable DoctorTable;
    private javax.swing.JButton HomeBtn2;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
