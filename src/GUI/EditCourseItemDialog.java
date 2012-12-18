/**
 * @author Bryan Chan
 * CMPT275 - Team Blank
 * SFU Surrey Campus
 * March 15, 2006
 * ===============================
 * NOTE: This class defines edit the courseitem dialog box
 * 
 */
package GUI;

import School.*;
import java.awt.Frame;
import javax.swing.*;

public class EditCourseItemDialog extends javax.swing.JDialog {

    private static EditCourseItemDialog singleInstance = null;
    
    /** Creates new EditCourseItemDialog */
    public EditCourseItemDialog(java.awt.Frame parent) {
        super(parent, "Edit Course Item", true);
        initComponents();
        this.getRootPane().setDefaultButton(buttonEdit);
        Main.escapeDialog(this);
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblItemLabel = new javax.swing.JLabel();
        txtLabel = new javax.swing.JTextField();
        lblAchievedMark = new javax.swing.JLabel();
        txtAchievedMark = new javax.swing.JTextField();
        lblTotalMark = new javax.swing.JLabel();
        txtTotalMark = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        buttonCancel = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        lblWindowLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Course Item");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblItemLabel.setText("Label:");

        lblAchievedMark.setText("Achieved Mark: ");

        lblTotalMark.setText("Total Mark:");

        lblWeight.setText("Weight:");

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        lblWindowLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblWindowLabel1.setText("Edit Course Item");
        lblWindowLabel1.setFocusable(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img_topheader.jpg")));
        jLabel3.setFocusable(false);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(130, 130, 130)
                .add(buttonCancel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buttonEdit)
                .addContainerGap())
            .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 260, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .add(lblWindowLabel1)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblAchievedMark)
                    .add(lblItemLabel)
                    .add(lblTotalMark)
                    .add(lblWeight))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, txtAchievedMark)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, txtTotalMark)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, txtWeight, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(txtLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 141, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
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
                    .add(lblItemLabel)
                    .add(txtLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblAchievedMark)
                    .add(txtAchievedMark, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblTotalMark)
                    .add(txtTotalMark, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblWeight)
                    .add(txtWeight, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 23, Short.MAX_VALUE)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buttonCancel)
                    .add(buttonEdit))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        CourseItem item = MainFrame.getSelectedCourseItem();
        txtLabel.setText(item.getLabel());
        txtAchievedMark.setText("" + item.getStudentMark());
        txtTotalMark.setText("" + item.getTotalMark());
        txtWeight.setText("" + item.getWeight());
    }//GEN-LAST:event_formComponentShown

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    /** This method edits course items */
    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
    //this method allows a course item to be edited when this action is performed
        try {
            Student student = MainFrame.getStudent();
            //get the current semester that is selected
            Semester semester = MainFrame.getSelectedSemester();
            //get the current course that is selected
            Course course = MainFrame.getSelectedCourse();
            //get the current course item that is selected
            CourseItem item = MainFrame.getSelectedCourseItem();
            
            
            //save new attributes from user's input
            String newLabel = Main.capatalizeString(txtLabel.getText());
            double newAcheivedMark = Double.parseDouble(txtAchievedMark.getText());
            double newTotalMark = Double.parseDouble(txtTotalMark.getText());
            double newWeight = Double.parseDouble(txtWeight.getText());
            
            //save previous student object for undo
            MainFrame.getDBHistory().studentEdited(student, "Edit Course Item " + item.getLabel());
            
            //save changes and close window
            if(student.getSemester(semester.getSeason(), semester.getYear()).getCourse(course.getDepartment(), 
                    course.getNumber()).editCourseItem(item, newLabel, newAcheivedMark, newTotalMark, newWeight)){
                dispose();
            } else{
                String msg = "'" + newLabel + "' already exists." ;
                JOptionPane.showMessageDialog(this, msg, "Course item Exists", 0);
                MainFrame.getDBHistory().changeFailed();
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Invalid Input", "Invalid Input", 0);
        }
    }//GEN-LAST:event_buttonEditActionPerformed
   
    public static void showDialog(Frame owner){
        //init the gui widget
            if (singleInstance == null) {
                singleInstance = new EditCourseItemDialog(owner);
            } else if (!singleInstance.getOwner().equals(owner)) {
		singleInstance = new EditCourseItemDialog(owner);
                
            }
        Main.centerDialog(singleInstance);
        singleInstance.setVisible(true);
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAchievedMark;
    private javax.swing.JLabel lblItemLabel;
    private javax.swing.JLabel lblTotalMark;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblWindowLabel1;
    private javax.swing.JTextField txtAchievedMark;
    private javax.swing.JTextField txtLabel;
    private javax.swing.JTextField txtTotalMark;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
