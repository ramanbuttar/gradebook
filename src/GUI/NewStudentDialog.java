/**
 * @author Raman Buttar
 * CMPT275 - Team Blank
 * SFU Surrey Campus
 * March 13, 2006
 * ===============================
 * NOTE: This class defines the new student dialog
 *
 */

package GUI;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.*;

import School.Student;

public class NewStudentDialog extends javax.swing.JDialog {
    
    public static final long serialVersionUID = 32947;
    private static NewStudentDialog singleInstance = null;
    private static Student result = null;
    
    public NewStudentDialog(java.awt.Frame parent) {
        super(parent, "Create New Student", true);
        initComponents();
        this.getRootPane().setDefaultButton(buttonCreate);
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblStudentNumber = new javax.swing.JLabel();
        lblUserID = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtStudentNumber = new javax.swing.JTextField();
        txtUserID = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        buttonCreate = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblCreateStudent = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create New Profile");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblFirstName.setText("First Name:");

        lblLastName.setText("Last Name:");

        lblStudentNumber.setText("Student Number:");

        lblUserID.setText("User ID:");

        lblPassword.setText("Desired Password:");

        buttonCreate.setText("Create");
        buttonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img_topheader.jpg")));
        jLabel1.setFocusable(false);

        lblCreateStudent.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblCreateStudent.setText("New Student Record");
        lblCreateStudent.setFocusable(false);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 286, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .add(lblCreateStudent)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblPassword)
                    .add(lblFirstName)
                    .add(lblLastName)
                    .add(lblStudentNumber)
                    .add(lblUserID))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, txtStudentNumber, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, txtLastName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .add(txtFirstName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))
                    .add(txtPassword, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, txtUserID, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .add(buttonCancel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buttonCreate)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblCreateStudent)
                .add(34, 34, 34)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtFirstName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblFirstName))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtLastName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblLastName))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtStudentNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblStudentNumber))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtUserID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblUserID))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblPassword)
                    .add(txtPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 22, Short.MAX_VALUE)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buttonCreate)
                    .add(buttonCancel))
                .addContainerGap())
        );

        layout.linkSize(new java.awt.Component[] {lblFirstName, lblLastName, lblPassword, lblStudentNumber, lblUserID}, org.jdesktop.layout.GroupLayout.VERTICAL);

        layout.linkSize(new java.awt.Component[] {txtFirstName, txtLastName, txtPassword, txtStudentNumber, txtUserID}, org.jdesktop.layout.GroupLayout.VERTICAL);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (MainFrame.isFirstLoad()){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        txtPassword.setText("");
        txtUserID.setText("");
        txtStudentNumber.setText("");
        txtLastName.setText("");
        txtFirstName.setText("");
        if (!MainFrame.isFirstLoad()) {
            Main.escapeDialog(this);
        }
    }//GEN-LAST:event_formComponentShown
    
    private void buttonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateActionPerformed
        //this method is the handler to deal with when the user selects to create a new student profile
        
        //get the user's input for their profile information
        String firstName = Main.capatalizeString(txtFirstName.getText());
        String lastName = Main.capatalizeString(txtLastName.getText());
        String user = txtUserID.getText();
        String password = String.valueOf(txtPassword.getPassword());
        
        //check to make sure they filled in all fields
        if(firstName != null)
            if(lastName != null) {//all fields have input; that's good (they can have no password if they want)...
            try {
                long studentNumber = Integer.parseInt(txtStudentNumber.getText());
                
                //create new student object
                
                //one last check for userid
                if(user != null && user.length() > 0) {
                    result = new Student(firstName, lastName, studentNumber, user, password);
                    
                    //save the new profile to a file
                    saveProfile(result);
                    
                    //reset history for new object
                    MainFrame.getDBHistory().reset();
                    
                    this.setVisible(false);
                } else
                    JOptionPane.showMessageDialog(this, "You must enter a username.", "Missing Username", 1);
            } catch (Exception e) {
                result = null;
                JOptionPane.showMessageDialog(this, "Invalid Input for student number. Try Again.", "Invalid Input", 1);
                txtStudentNumber.setText("");
            }
            } else
                JOptionPane.showMessageDialog(this, "You must enter your last name.", "Missing Last Name", 1);
        else
            JOptionPane.showMessageDialog(this, "You must enter your first name.", "Missing First Name", 1);
        
    }//GEN-LAST:event_buttonCreateActionPerformed
    
    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        if (MainFrame.isFirstLoad()) {
            System.exit(0);
        } else {
            dispose();
        }
    }//GEN-LAST:event_buttonCancelActionPerformed
    
    public static void saveProfile(Student std) throws IOException {
        //this method is the handler to deal with when the user selects to save their profile
        try {
            String filename = std.getUserID();
            filename = "Storage//Profiles//" + filename + ".null";
            FileOutputStream out = new FileOutputStream(filename);
            ObjectOutputStream s = new ObjectOutputStream(out);
            s.writeObject(std);
            s.flush();
            out.close();
        } catch (Exception e) {
            System.out.println("EXCEPTION: NewStudentDialog - saveProfile(Student std)");
        }
    }
    
    public static Student showDialog(Frame owner) {
        result = null;
        if (singleInstance == null) {
            singleInstance = new NewStudentDialog(owner);
        } else if (!singleInstance.getOwner().equals(owner)){
            singleInstance = new NewStudentDialog(owner);
        }
        
        //Main.centerDialog(singleInstance);
        singleInstance.setVisible(true);
        return result;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCreateStudent;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblStudentNumber;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtStudentNumber;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
    
}
