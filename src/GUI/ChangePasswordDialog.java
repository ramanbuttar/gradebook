/**
 * @author Raman Buttar
 * CMPT275 - Team Blank
 * SFU Surrey Campus
 * February 8, 2006
 * ===============================
 * NOTE: This class defines change password dialog box
 * 
 */
package GUI;

import School.Student;
import javax.swing.*;

public class ChangePasswordDialog extends javax.swing.JDialog {
    
    public static final long serialVersionUID = 1L;
    
    public ChangePasswordDialog(java.awt.Frame parent) {
        super(parent, "Change Password", true);
        initComponents();
        this.getRootPane().setDefaultButton(buttonChange);
        Main.escapeDialog(this);
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblCurrentPass = new javax.swing.JLabel();
        lblNewPass1 = new javax.swing.JLabel();
        lblNewPass2 = new javax.swing.JLabel();
        txtCurrentPass = new javax.swing.JPasswordField();
        txtNewPass1 = new javax.swing.JPasswordField();
        txtNewPass2 = new javax.swing.JPasswordField();
        buttonChange = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        lblWindowLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Password");
        setResizable(false);
        lblCurrentPass.setText("Current Password:");

        lblNewPass1.setText("New Password:");

        lblNewPass2.setText("Confirm New Password:");

        txtCurrentPass.setToolTipText("Enter your current password");

        txtNewPass1.setToolTipText("Enter your new password");

        txtNewPass2.setToolTipText("Enter your new password again to confirm");

        buttonChange.setText("Change");
        buttonChange.setToolTipText("Change your password");
        buttonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangeActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancel");
        buttonCancel.setToolTipText("Cancel changing password");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        lblWindowLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblWindowLabel1.setText("Change Password");
        lblWindowLabel1.setFocusable(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img_topheader.jpg")));
        jLabel3.setFocusable(false);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(27, 27, 27)
                .add(buttonCancel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buttonChange)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .add(lblWindowLabel1)
                .addContainerGap())
            .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 304, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                            .add(27, 27, 27)
                            .add(lblCurrentPass))
                        .add(lblNewPass2))
                    .add(lblNewPass1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(txtNewPass1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .add(txtNewPass2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .add(txtCurrentPass, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblWindowLabel1)
                .add(19, 19, 19)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblCurrentPass)
                    .add(txtCurrentPass, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtNewPass1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblNewPass1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblNewPass2)
                    .add(txtNewPass2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(24, 24, 24)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buttonChange)
                    .add(buttonCancel))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void buttonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangeActionPerformed
        //this method is the handler to deal with when the user selects to change their password
        
        //get their old password
        String oldPass = String.valueOf(txtCurrentPass.getPassword());
        
        //get their new password
        String newPass1 = String.valueOf(txtNewPass1.getPassword());
        String newPass2 = String.valueOf(txtNewPass2.getPassword());
                
        //check the new passwords match
        if (newPass1.equals(newPass2)){
            //get the student object to change
            Student student = MainFrame.getStudent();
            
            //save previous student object for undo
            MainFrame.getDBHistory().studentEdited(student, "Change Password");
            
            //change the password
            if (student.changePassword(oldPass, newPass1)){
                //change successful, close the window
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Old Password is incorrect", "Error", 0);
                MainFrame.getDBHistory().changeFailed();
            }
        } else {
            JOptionPane.showMessageDialog(this, "New Passwords don't match", "Error", 0);
            MainFrame.getDBHistory().changeFailed();
        }
    }//GEN-LAST:event_buttonChangeActionPerformed

    public void showDialog(){
        Main.centerDialog(this);
        this.setVisible(true);
    }
    
    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        //user cancelled change password request
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonChange;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCurrentPass;
    private javax.swing.JLabel lblNewPass1;
    private javax.swing.JLabel lblNewPass2;
    private javax.swing.JLabel lblWindowLabel1;
    private javax.swing.JPasswordField txtCurrentPass;
    private javax.swing.JPasswordField txtNewPass1;
    private javax.swing.JPasswordField txtNewPass2;
    // End of variables declaration//GEN-END:variables
    
}
