/**
 * @author Bryan Chan
 * CMPT275 - Team Blank
 * SFU Surrey Campus
 * March 23, 2006
 * ===============================
 * NOTE: This class defines calculate cgpa dialog 
 * 
 */

package GUI;

import java.awt.event.*;
import javax.swing.*;
import School.*;
import javax.swing.table.DefaultTableModel;
import School.Course;

public class CalcCGPADialog extends javax.swing.JDialog {
    private static Student currentStudent = MainFrame.getStudent();
    
    /** Creates new CalcCGPADialog */
    public CalcCGPADialog(java.awt.Frame parent) {
        super(parent, "Calculate CGPA", true);
        initComponents();
        tableCourses.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        this.getRootPane().setDefaultButton(buttonClose);
        Main.escapeDialog(this);
    }
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblWindowLabel = new javax.swing.JLabel();
        buttonClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCourses = new javax.swing.JTable();
        lbReCalcCGPA = new javax.swing.JLabel();
        lblCGPA = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblWindowLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblWindowLabel.setText("Selectively Calculate CGPA");
        lblWindowLabel.setFocusable(false);

        buttonClose.setText("Close");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        tableCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Department", "Number", "Percent","Letter Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCoursesMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(tableCourses);

        lbReCalcCGPA.setFont(new java.awt.Font("Tahoma", 0, 12));
        lbReCalcCGPA.setText("Re-Calculated GPA: ");

        lblCGPA.setBackground(new java.awt.Color(255, 255, 255));
        lblCGPA.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblCGPA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img_topheader.jpg")));
        jLabel2.setFocusable(false);

        jTextPane1.setEditable(false);
        jTextPane1.setText("Select courses that you wish to contribute to the CGPA calculation in the table below. To select multiple courses, click on each item while holding the Control Key down, or to select a series of courses, click on the first item and the last item while holding Shift.");
        jTextPane1.setAutoscrolls(false);
        jTextPane1.setFocusable(false);
        jScrollPane2.setViewportView(jTextPane1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 472, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .add(lblWindowLabel)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(lbReCalcCGPA)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lblCGPA, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(buttonClose, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblWindowLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 279, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, buttonClose)
                    .add(org.jdesktop.layout.GroupLayout.BASELINE, lbReCalcCGPA, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.BASELINE, lblCGPA, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        populateTable();
        double currentCGPA = Main.round(currentStudent.getCGPA(), 2);
        lblCGPA.setText("" + currentCGPA);
    }//GEN-LAST:event_formComponentShown
    
    /** This gets the courses the user clicks */
    private void tableCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCoursesMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1){ //if only left mouse button clicked
            getSelectedCourse();
        }
    }//GEN-LAST:event_tableCoursesMouseClicked
    
    /** This method gets the courses the user selects */
    private void getSelectedCourse(){
        int selectedCourses[] = tableCourses.getSelectedRows();  //gets selected course row index
        int numSelCourses = selectedCourses.length;  //gets number of selected courses
        DefaultTableModel model = (DefaultTableModel)tableCourses.getModel();
        double credits = 0.0;
        double gradePoints = 0.0;
        
        if (numSelCourses != -1){ //if a row is selected
            for(int i=0; i<numSelCourses; i++){ //goes through the list of selected courses
                String department = String.valueOf(model.getValueAt(selectedCourses[i], 0));
                int number = Integer.parseInt(String.valueOf(model.getValueAt(selectedCourses[i], 1)));
                
                //goes through all semesters to find the selected course(s)
                for(int j=0; j<currentStudent.getAllSemesterNames().length;j++){
                    Course findCourse = currentStudent.getSemesterIndex(j).getCourse(department, number);
                    
                    if(findCourse != null){//if a course is selected get the credits of grade points of the course
                        credits = credits + findCourse.getCredits();
                        gradePoints = gradePoints + findCourse.getGradePoints();
                    }//if
                }//for
            }//for
            
            double cgpa = Main.round(gradePoints/credits, 2); //calc new cgpa on selected courses
            lblCGPA.setText("" + cgpa); //sets the label with calculated cgpa
        }//if
    }
    
    
    /** This method populates the table */
    private void populateTable(){
        int numSem = currentStudent.getAllSemesterNames().length;
        while(numSem != 0){  //while students are enrolled in at least 1 semester
            Object[] data = currentStudent.getSemesterIndex(numSem-1).getCourseData();
            if (data.length > 0){
                MainFrame.fillTable(tableCourses, data);  //populate the table
            }//if
            numSem--;
        }//while
    }
    
    public void showDialog(){
        Main.centerDialog(this);
        this.setVisible(true);
    }
    
    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCloseActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClose;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lbReCalcCGPA;
    private javax.swing.JLabel lblCGPA;
    private javax.swing.JLabel lblWindowLabel;
    private javax.swing.JTable tableCourses;
    // End of variables declaration//GEN-END:variables
    
}
