/**
 * @author Bryan Chan
 * CMPT275 - Team Blank
 * SFU Surrey Campus
 * March 13, 2006
 * ===============================
 * NOTE: This class defines the new course dialog
 * 
 */
package GUI;

import java.awt.*;
import javax.swing.*;
import School.*;

public class NewCourseItemDialog extends javax.swing.JDialog {
    private static NewCourseItemDialog singleInstance = null;
    private static CourseItem result = null; 

    /** Creates newCourseitemDialog */
    public NewCourseItemDialog(java.awt.Frame parent) {
        super(parent, "Add New Course Item", true);
        initComponents();
        this.getRootPane().setDefaultButton(buttonAdd);
        Main.escapeDialog(this);
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblItemLabel = new javax.swing.JLabel();
        txtCourseLabel = new javax.swing.JTextField();
        lblAchievedMark = new javax.swing.JLabel();
        txtAchievedMark = new javax.swing.JTextField();
        lblTotalMark = new javax.swing.JLabel();
        txtTotalMark = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        lblMarked = new javax.swing.JLabel();
        checkMarked = new javax.swing.JCheckBox();
        buttonCancel = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        lblWindowLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Course Item");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblItemLabel.setText("Label:");

        lblAchievedMark.setText("Achieved Mark: ");

        txtAchievedMark.setToolTipText("Check CourseItem as Marked to enter Achieved Mark");

        lblTotalMark.setText("Total Mark:");

        lblWeight.setText("Weight:");

        lblMarked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img_topheader.jpg")));
        lblMarked.setFocusable(false);

        checkMarked.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        checkMarked.setMargin(new java.awt.Insets(0, 0, 0, 0));
        checkMarked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMarkedActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        lblWindowLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblWindowLabel1.setText("Add New Course Item");
        lblWindowLabel1.setFocusable(false);

        jLabel1.setText("Marked:");

        jLabel2.setText("%");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(lblMarked, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 291, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .add(lblWindowLabel1)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .add(buttonCancel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buttonAdd)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .add(lblItemLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txtCourseLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 117, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(41, 41, 41))
            .add(layout.createSequentialGroup()
                .add(55, 55, 55)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblAchievedMark)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(lblWeight)
                            .add(lblTotalMark))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(txtTotalMark)
                    .add(txtAchievedMark, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .add(txtWeight))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2)
                .addContainerGap(114, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(92, 92, 92)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(checkMarked)
                .addContainerGap(144, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(lblMarked)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblWindowLabel1)
                .add(31, 31, 31)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtCourseLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblItemLabel))
                .add(12, 12, 12)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(checkMarked)
                    .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblAchievedMark)
                    .add(txtAchievedMark, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtTotalMark, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblTotalMark))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblWeight)
                    .add(txtWeight, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .add(15, 15, 15)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buttonAdd)
                    .add(buttonCancel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkMarkedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMarkedActionPerformed
        if (checkMarked.isSelected()){
            txtAchievedMark.setEnabled(true);
        } else {
            txtAchievedMark.setEnabled(false);
        }
    }//GEN-LAST:event_checkMarkedActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        txtWeight.setText("");
        txtTotalMark.setText("");
        txtAchievedMark.setText("");
        txtCourseLabel.setText("");
        txtAchievedMark.setEnabled(false);
        checkMarked.setSelected(false);
    }//GEN-LAST:event_formComponentShown
           
    /** This method adds new course item */
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        //this method is the handler to deal with when the user selects to add a course item
        
        try {
            //parse the user's input for the new course item
            String label = Main.capatalizeString(txtCourseLabel.getText());
            double studentMark = 0.0;
            double totalMark = Double.parseDouble(txtTotalMark.getText()); 
            double weight = Double.parseDouble(txtWeight.getText());
        
            //create new courseitem object
            CourseItem newItem = null;
            if (checkMarked.isSelected()) {
                studentMark = Double.parseDouble(txtAchievedMark.getText());
                newItem = new CourseItem(label, studentMark, totalMark, weight);
            } else {
                newItem = new CourseItem(label, totalMark, weight);
            }

            //get the curernt student object from the main dialog
            Student student = MainFrame.getStudent();
            //get which semester to add to
            Semester semester = MainFrame.getSelectedSemester();
            //get which course to add to
            Course course = MainFrame.getSelectedCourse();

            //save previous student object for undo
            MainFrame.getDBHistory().studentEdited(student, "Add New Course Item " + newItem.getLabel());
            
            //add new course item, but make sure add was successful and weight didn't exceed 100%
            int ans = student.getSemester(semester.getSeason(), semester.getYear()).getCourse(course.getDepartment(),
                    course.getNumber()).addCourseItem(newItem);
            if (ans == 1){
                result = newItem;
                dispose();
            } else if (ans == -1) {
                result = null;
                String msg = "Adding new weight exceeds 100%. " + 
                              "Choose a different weight";
                JOptionPane.showMessageDialog(this, msg, "Error", 0);
                MainFrame.getDBHistory().changeFailed();
            } else if (ans == 0){
                result = null;
                String msg = "'" + newItem.getLabel() + "' already exists in '" + course.getDepartment() + " " + 
                        course.getNumber() + "'";
                JOptionPane.showMessageDialog(this, msg, "Error", 0);
                MainFrame.getDBHistory().changeFailed();
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Invalid Input", "Invalid Input", 0);
        }
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        result = null;
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed
    
    public static CourseItem showDialog(Frame owner) {
        result = null;
        if (singleInstance == null) {
            singleInstance = new NewCourseItemDialog(owner);
        } else if (!singleInstance.getOwner().equals(owner)) {
            singleInstance = new NewCourseItemDialog(owner);
        }
        Main.centerDialog(singleInstance);
        singleInstance.setVisible(true);
        return result;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JCheckBox checkMarked;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAchievedMark;
    private javax.swing.JLabel lblItemLabel;
    private javax.swing.JLabel lblMarked;
    private javax.swing.JLabel lblTotalMark;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblWindowLabel1;
    private javax.swing.JTextField txtAchievedMark;
    private javax.swing.JTextField txtCourseLabel;
    private javax.swing.JTextField txtTotalMark;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
    
}
