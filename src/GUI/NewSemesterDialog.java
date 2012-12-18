/**
 * @author Raman Buttar
 * CMPT275 - Team Blank
 * SFU Surrey Campus
 * March 13, 2006
 * ===============================
 * NOTE: This class defines the new semester dialog
 * 
 */
package GUI;

import java.awt.*;
import javax.swing.*;
import School.*;

public class NewSemesterDialog extends javax.swing.JDialog {
    
    public static final long serialVersionUID = 32947;
    private static NewSemesterDialog singleInstance = null;
    private static Semester result = null; 
    
    public NewSemesterDialog(java.awt.Frame parent) {
        super(parent, "Add New Semester", true);
        initComponents();
        this.getRootPane().setDefaultButton(buttonAdd);
        spinnerYear.setEditor(new JSpinner.NumberEditor(spinnerYear,"####"));
        Main.escapeDialog(this);
    }
   
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblSeason = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        comboSeason = new javax.swing.JComboBox();
        spinnerYear = new javax.swing.JSpinner();
        buttonAdd = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        lblWindowLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Semester");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblSeason.setText("Season:");

        lblYear.setText("Year:");

        comboSeason.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Spring", "Summer", "Fall" }));
        comboSeason.setName("");

        spinnerYear.setFont(new java.awt.Font("Tahoma", 0, 12));
        spinnerYear.setModel(new SpinnerNumberModel(2006, 2000, 2050, 1));
        spinnerYear.setName("");

        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        lblWindowLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblWindowLabel1.setText("Add New Semester");
        lblWindowLabel1.setFocusable(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img_topheader.jpg")));
        jLabel3.setFocusable(false);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 299, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .add(lblWindowLabel1)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(165, 165, 165)
                .add(buttonCancel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buttonAdd)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(73, 73, 73)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblSeason)
                    .add(lblYear))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(spinnerYear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(comboSeason, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 105, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblWindowLabel1)
                .add(25, 25, 25)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(comboSeason, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblSeason))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(spinnerYear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblYear))
                .add(36, 36, 36)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buttonAdd)
                    .add(buttonCancel))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        comboSeason.setSelectedIndex(0);
        spinnerYear.setValue((Integer)2006);
    }//GEN-LAST:event_formComponentShown

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        //this method is the handler to deal with when the user selects to add a semester
        
        //get the user's input for the new semester's attributes
        String season = comboSeason.getSelectedItem().toString();
        int year = Integer.parseInt(spinnerYear.getValue().toString());
        Semester sem = new Semester(season, year);
        
        //get the current student db from the main form
        Student student = MainFrame.getStudent();    
        
        //save previous student object for undo
        MainFrame.getDBHistory().studentEdited(student, "Add New Semester " + sem.getSeason() + " " + sem.getYear());
        
        //add the new semester to the student db
        if (student.addSemester(sem)){
            result = sem;
            this.setVisible(false);
        } else {
            result = null;
            String msg = "'" + sem.getSeason() + " " + sem.getYear() + "' already exists." ;
            JOptionPane.showMessageDialog(this, msg, "Semester Exists", 0);
            
            //edit failed
            MainFrame.getDBHistory().changeFailed();
        }
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        //user cancelled the add.
        result = null;
        this.setVisible(false);
    }//GEN-LAST:event_buttonCancelActionPerformed
    
    public static Semester showDialog(Frame owner) {
        result = null;
        if (singleInstance == null) {
            singleInstance = new NewSemesterDialog(owner);
        } else if (!singleInstance.getOwner().equals(owner)) {
            singleInstance = new NewSemesterDialog(owner);
        }
	Main.centerDialog(singleInstance);
        singleInstance.setVisible(true);
	
        return result;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JComboBox comboSeason;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblSeason;
    private javax.swing.JLabel lblWindowLabel1;
    private javax.swing.JLabel lblYear;
    private javax.swing.JSpinner spinnerYear;
    // End of variables declaration//GEN-END:variables
    
}
