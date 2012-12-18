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

import School.*;
import java.awt.*;
import javax.swing  .*;

public class NewCourseDialog extends javax.swing.JDialog {
    private static NewCourseDialog singleInstance = null;
    private static Course result = null; 
    
    /** Creates new form NewCourseDialog */
    public NewCourseDialog(java.awt.Frame parent) {
        super(parent, "Add New Course", true);
        initComponents();
        this.getRootPane().setDefaultButton(buttonAdd);
        Main.escapeDialog(this);
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblCourseDepartment = new javax.swing.JLabel();
        lblCourseNumber = new javax.swing.JLabel();
        lblCredits = new javax.swing.JLabel();
        txtCourseDepartment = new javax.swing.JTextField();
        txtCourseNumber = new javax.swing.JTextField();
        txtCredits = new javax.swing.JTextField();
        buttonCancel = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblWindowLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        checkComplete = new javax.swing.JCheckBox();
        lblFinalMark = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        comboLetterGrade = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Course");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblCourseDepartment.setText("Course Department: ");

        lblCourseNumber.setText("Course number: ");

        lblCredits.setText("Credits: ");

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img_topheader.jpg")));
        jLabel2.setFocusable(false);

        lblWindowLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblWindowLabel.setText("Add New Course");
        lblWindowLabel.setFocusable(false);

        checkComplete.setText("  Course Completed");
        checkComplete.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        checkComplete.setMargin(new java.awt.Insets(0, 0, 0, 0));
        checkComplete.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkCompleteStateChanged(evt);
            }
        });

        lblFinalMark.setText("Final Mark: ");

        comboLetterGrade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D", "F" }));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 292, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .add(lblWindowLabel)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(49, 49, 49)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(lblCourseNumber)
                            .add(lblCourseDepartment))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txtCourseNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtCourseDepartment, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(lblCredits)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtCredits, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .add(buttonCancel)
                .add(7, 7, 7)
                .add(buttonAdd)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(88, 88, 88)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(checkComplete, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(lblFinalMark)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(comboLetterGrade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblWindowLabel)
                .add(22, 22, 22)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtCourseDepartment, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblCourseDepartment))
                .add(14, 14, 14)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblCourseNumber)
                    .add(txtCourseNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(15, 15, 15)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtCredits, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblCredits))
                .add(30, 30, 30)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(checkComplete)
                .add(16, 16, 16)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblFinalMark)
                    .add(comboLetterGrade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 19, Short.MAX_VALUE)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buttonCancel)
                    .add(buttonAdd))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** This method enables text boxes */
    private void checkCompleteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkCompleteStateChanged
        if (checkComplete.isSelected()){
            comboLetterGrade.setEnabled(true);
        } else {
            comboLetterGrade.setEnabled(false);
        }
    }//GEN-LAST:event_checkCompleteStateChanged

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        txtCredits.setText("");
        txtCourseNumber.setText("");
        txtCourseDepartment.setText("");
        checkComplete.setSelected(false);
        comboLetterGrade.setSelectedIndex(0);
        comboLetterGrade.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    /** This method creates new course */
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        //this method calls the handler to deal with when the user selects to add a course
        try {
            //parse the user's input for the new course number, dept and num of credits
            String department = txtCourseDepartment.getText().toUpperCase();
            int number = Integer.parseInt(txtCourseNumber.getText());
            double credits = Double.parseDouble(txtCredits.getText());
            
            Course newCourse = null;
            if (checkComplete.isSelected()){
                String finalMark = comboLetterGrade.getSelectedItem().toString();
                //create complete new course item
                newCourse = new Course(department, number, credits, finalMark);
            } else {
                //create incomplete new course item
                newCourse = new Course(department, number, credits);
            }
                        
            //get the student db
            Student student = MainFrame.getStudent();
            Semester semester = MainFrame.getSelectedSemester();
        
            //save previous student object for undo
            MainFrame.getDBHistory().studentEdited(student, "Add Course " + newCourse.getDepartment() + " " + newCourse.getNumber());
            
            //add the new course to the current student and selected semester
            if(student.getSemester(semester.getSeason(), semester.getYear()).addCourse(newCourse)){
                result = newCourse;
                this.setVisible(false);
            } else {
                result = null;
                String msg = "'" + newCourse.getDepartment() + " " + newCourse.getNumber() + "' already exists." ;
                JOptionPane.showMessageDialog(this, msg, "Semester Exists", 0);
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
    
    public static Course showDialog(Frame owner) {
        //init the gui widget
        result = null;
        if (singleInstance == null) {
            singleInstance = new NewCourseDialog(owner);
        } else if (!singleInstance.getOwner().equals(owner)) {
            singleInstance = new NewCourseDialog(owner);
                
        }
        Main.centerDialog(singleInstance);
        singleInstance.setVisible(true);
        return result;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JCheckBox checkComplete;
    private javax.swing.JComboBox comboLetterGrade;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCourseDepartment;
    private javax.swing.JLabel lblCourseNumber;
    private javax.swing.JLabel lblCredits;
    private javax.swing.JLabel lblFinalMark;
    private javax.swing.JLabel lblWindowLabel;
    private javax.swing.JTextField txtCourseDepartment;
    private javax.swing.JTextField txtCourseNumber;
    private javax.swing.JTextField txtCredits;
    // End of variables declaration//GEN-END:variables
    
}
