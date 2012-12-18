/**
 * @author Bryan Chan
 * CMPT275 - Team Blank
 * SFU Surrey Campus
 * March 15, 2006
 * ===============================
 * NOTE: This class defines edit the semester dialog box
 * 
 */

package GUI;

import School.*;
import java.awt.*;
import javax.swing  .*;

public class EditSemesterDialog extends javax.swing.JDialog {
    
    private static EditSemesterDialog singleInstance = null;
    
    /** Creates new EditSemesterDialog */
    public EditSemesterDialog(java.awt.Frame parent) {
        super(parent, "Edit Semester", true);
        initComponents();
        this.getRootPane().setDefaultButton(buttonEdit);
        spinnerYear.setEditor(new JSpinner.NumberEditor(spinnerYear,"####"));
        Main.escapeDialog(this);
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        buttonEdit = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        comboSeasons = new javax.swing.JComboBox();
        spinnerYear = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblWindowLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        comboSeasons.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Spring", "Summer", "Fall" }));

        spinnerYear.setModel(new SpinnerNumberModel(2006, 2000, 2050, 1));

        jLabel4.setText("Season:");

        jLabel5.setText("Year:");

        lblWindowLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblWindowLabel1.setText("Edit Semester");
        lblWindowLabel1.setFocusable(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img_topheader.jpg")));
        jLabel3.setFocusable(false);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 289, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .add(lblWindowLabel1)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .add(buttonCancel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buttonEdit)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel5)
                    .add(jLabel4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(comboSeasons, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 153, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(spinnerYear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(40, 40, 40))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblWindowLabel1)
                .add(20, 20, 20)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(comboSeasons, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .add(19, 19, 19)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(spinnerYear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 39, Short.MAX_VALUE)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buttonEdit)
                    .add(buttonCancel))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** This method refreshes combobox*/
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        Semester semester = MainFrame.getSelectedSemester();
        if (semester.getSeason().equals("Spring")){
            comboSeasons.setSelectedIndex(0);
        } else if (semester.getSeason().equals("Summer")){
            comboSeasons.setSelectedIndex(1);
        } else {
            comboSeasons.setSelectedIndex(2);
        }
        spinnerYear.setValue((Integer)semester.getYear());
        
    }//GEN-LAST:event_formComponentShown

    /** This method edits semester */
    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        //this method allows a semester to be edited
        try {
            //get the new attributes
            String newSeason = comboSeasons.getSelectedItem().toString();
            int newYear = Integer.parseInt(spinnerYear.getValue().toString());
        
            //get student from mainFrame
            Student student = MainFrame.getStudent();
            //get the semester the user wants to edit
            Semester semester = MainFrame.getSelectedSemester();
            
            //save previous student object for undo
            MainFrame.getDBHistory().studentEdited(student, "Edit Semester " + semester.getSeason() + " " + semester.getYear());
            
            //save changes and close window
            if(student.editSemester(semester, newSeason, newYear)){
                dispose();
            } else {
                String msg = "'" + newSeason + " " + newYear + "' already exists." ;
                JOptionPane.showMessageDialog(this, msg, "Semester Exists", 0);
                MainFrame.getDBHistory().changeFailed();
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Invalid Input", "Invalid Input", 0);
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed
        
    public static void showDialog(Frame owner) {
        //init the gui widget
            if (singleInstance == null) {
                singleInstance = new EditSemesterDialog(owner);
            } else if (!singleInstance.getOwner().equals(owner)) {
		singleInstance = new EditSemesterDialog(owner);
                
            }
        Main.centerDialog(singleInstance);
        singleInstance.setVisible(true);
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JComboBox comboSeasons;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblWindowLabel1;
    private javax.swing.JSpinner spinnerYear;
    // End of variables declaration//GEN-END:variables
    
}
