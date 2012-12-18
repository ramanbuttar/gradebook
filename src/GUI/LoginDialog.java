/**
 * @author Bryan Chan
 * CMPT275 - Team Blank
 * SFU Surrey Campus
 * March 15, 2006
 * ===============================
 * NOTE: This class defines edit the login dialog box
 * 
 */
package GUI;

import java.awt.*;
import javax.swing.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import School.Student;

public class LoginDialog extends JDialog {
    
    public static final long serialVersionUID = 32947;
    private static LoginDialog singleInstance = null;
    private static Student result = null; 
    
    public LoginDialog(Frame parent) {
        super(parent, "Login", true);
        initComponents();
        this.getRootPane().setDefaultButton(buttonOK);
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblUserID = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        buttonOK = new javax.swing.JButton();
        buttonNewUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblLoginText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        lblUserID.setText("User ID:");

        lblPassword.setText("Password:");

        buttonOK.setText("Login");
        buttonOK.setToolTipText("Login");
        buttonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOKActionPerformed(evt);
            }
        });

        buttonNewUser.setText("New User");
        buttonNewUser.setToolTipText("Create a new profile");
        buttonNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewUserActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img_topheader.jpg")));

        lblLoginText.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblLoginText.setText("Login");
        lblLoginText.setFocusable(false);

        jLabel2.setText("Existing Users");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 289, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(98, 98, 98)
                .add(buttonNewUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buttonOK, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .add(lblLoginText)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(42, 42, 42)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblPassword)
                    .add(lblUserID))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(txtUserID)
                        .add(txtPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 131, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblLoginText)
                .add(5, 5, 5)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblUserID)
                    .add(txtUserID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblPassword)
                    .add(txtPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 21, Short.MAX_VALUE)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buttonOK)
                    .add(buttonNewUser))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //prevent closing of login box before logging in
        if (MainFrame.isFirstLoad()) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //initialize the states of the textboxes
        txtPassword.setText("");
        txtUserID.setText("");
        if (!MainFrame.isFirstLoad()) {
            buttonNewUser.setVisible(false);
            Main.escapeDialog(this);
        }
    }//GEN-LAST:event_formComponentShown

    private void buttonNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewUserActionPerformed
        //user wants to create new account, trash the login window and call the new account dialog
        dispose();
        result = NewStudentDialog.showDialog(null);
    }//GEN-LAST:event_buttonNewUserActionPerformed

    public Student loadProfile(String filename) throws IOException, ClassNotFoundException {
        //this method allows an existing student profile to be loaded -> uses object serialization.
        filename = "Storage//Profiles//" + filename + ".null";
            try {
                FileInputStream in = new FileInputStream(filename);
                ObjectInputStream s = new ObjectInputStream(in);
                Student std = (Student) s.readObject();
                in.close();
            	return std;
	} catch (Exception e) {
		return null;
	}
}
	
    public static Student showDialog(Frame owner) {
        //init the gui widget
        result = null;
            if (singleInstance == null) {
                singleInstance = new LoginDialog(owner);
            } else if (!singleInstance.getOwner().equals(owner)) {
		singleInstance = new LoginDialog(owner);
                
            }
        Main.centerDialog(singleInstance);
        singleInstance.setVisible(true);
	
            return result;
    }
    
    private void buttonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOKActionPerformed
        //the user has filled out the login form, now need to fetch his student profile from disk
        String user = txtUserID.getText();
        String password = String.valueOf(txtPassword.getPassword());
        try {
            result = loadProfile(user);
        } catch (Exception e) {
            result = null;
        }
        //check file opened successfully
        if (result != null){
            //check security: check password
            if (result.getPassword().equals(password)) {
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Password. Try Again", "Login Failed", 1);
                txtPassword.setText("");
            }
        } else {
            //profile not found on disk.
            JOptionPane.showMessageDialog(this, "Profile Not Found. Try Again", "Login Failed", 1);
            txtUserID.setText("");
            txtPassword.setText("");
        }
    }//GEN-LAST:event_buttonOKActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonNewUser;
    private javax.swing.JButton buttonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblLoginText;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
    
}
