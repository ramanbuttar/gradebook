/**
 * @author Raman Buttar
 * CMPT275 - Team Blank
 * SFU Surrey Campus
 * February 8, 2006
 * ===============================
 * NOTE: This class defines change edit course dialog box
 * 
 */
package GUI;

import School.*;
import java.awt.*;
import javax.swing  .*;

public class EditCourseDialog extends javax.swing.JDialog {

	private static final long serialVersionUID = 4613349329437517234L;
	private static EditCourseDialog singleInstance = null;
    
    public EditCourseDialog(java.awt.Frame parent) {
        super(parent, "Edit Course", true);
        initComponents();
        this.getRootPane().setDefaultButton(buttonEdit);
        Main.escapeDialog(this);
    }

    public static void showDialog(Frame owner) {
        //init the gui widget
            if (singleInstance == null) {
                singleInstance = new EditCourseDialog(owner);
            } else if (!singleInstance.getOwner().equals(owner)) {
		singleInstance = new EditCourseDialog(owner);
                
            }
        Main.centerDialog(singleInstance);
        singleInstance.setVisible(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel5 = new javax.swing.JLabel();
        txtDepartment = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        buttonEdit = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCredits = new javax.swing.JTextField();
        lblWindowLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Course");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel5.setText("Department: ");

        txtDepartment.setToolTipText("Enter Course's new department");

        txtNumber.setToolTipText("Enter Course's new number");

        jLabel6.setText("Number: ");

        buttonEdit.setText("Edit");
        buttonEdit.setToolTipText("Edit this Course");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancel");
        buttonCancel.setToolTipText("Cancel editing this Course");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        jLabel7.setText("Credits: ");

        txtCredits.setToolTipText("Enter Course's new number of credits");

        lblWindowLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblWindowLabel1.setText("Edit Course");
        lblWindowLabel1.setFocusable(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img_topheader.jpg")));
        jLabel3.setFocusable(false);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 258, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .add(lblWindowLabel1)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .add(buttonCancel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buttonEdit)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel7)
                    .add(jLabel5)
                    .add(jLabel6))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, txtNumber)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, txtDepartment, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(txtCredits, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblWindowLabel1)
                .add(19, 19, 19)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(txtDepartment, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(txtCredits, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(26, 26, 26)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buttonEdit)
                    .add(buttonCancel))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        Course course = MainFrame.getSelectedCourse();
        txtDepartment.setText(course.getDepartment());
        txtNumber.setText("" + course.getNumber());
        txtCredits.setText("" + course.getCredits());
    }//GEN-LAST:event_formComponentShown
       
    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        //this allows an existing course to be edited
        try {
            Student student = MainFrame.getStudent();
            //get user's selection for semester and year to edit
            Semester semester = MainFrame.getSelectedSemester();                   
            //get the user's desired course to edit based on their selections
            Course course = MainFrame.getSelectedCourse();
            
            //get the user's new input for the new attributes
            String newDepartment = txtDepartment.getText().toUpperCase();
            int newNumber = Integer.parseInt(txtNumber.getText());
            double newCredits = Double.parseDouble(txtCredits.getText());
            
            //save previous student object for undo
            MainFrame.getDBHistory().studentEdited(student, "Edit Course " + course.getDepartment() + " " + course.getNumber());

            //save changes and close window
            if (student.getSemester(semester.getSeason(), semester.getYear()).editCourse(course, newDepartment, newNumber, newCredits)){
                dispose();
            } else {
                String msg = "'" + newDepartment + " " + newNumber + "' already exists." ;
                JOptionPane.showMessageDialog(this, msg, "Course Exists", 0);
                MainFrame.getDBHistory().changeFailed();
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Invalild Input", "Invalid Input", 0);
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblWindowLabel1;
    private javax.swing.JTextField txtCredits;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
    
}
