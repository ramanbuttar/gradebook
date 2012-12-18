/**
 * @author Raman Buttar
 * CMPT275 - Team Blank
 * SFU Surrey Campus
 * March 28, 2006
 * ===============================
 * NOTE: This class defines load template dialog
 *
 */

package GUI;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import School.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import School.Course;
import javax.swing.table.TableCellRenderer;

public class LoadTemplateDialog extends javax.swing.JDialog {
    private Course course;
    private CourseItem currentCourseItem;
    private DefaultTableModel model;
    
    public LoadTemplateDialog(java.awt.Frame parent) {
        super(parent, "Load Marking Scheme", true);
        initComponents();
        model = (DefaultTableModel)tableCourseItems.getModel();
        tableCourseItems.getModel().addTableModelListener(new TableModelListener() {
            
            public void tableChanged(TableModelEvent e) {
                updateData();
            }
        });
        MainFrame.hideLastColumn(tableCourseItems);
        tableCourseItems.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.getRootPane().setDefaultButton(buttonImport);
        Main.escapeDialog(this);
    }
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        templatePopUp = new javax.swing.JPopupMenu();
        templatePopUp_Marked = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        lblWindowLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCourse = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        scrollPaneTable = new javax.swing.JScrollPane();
        tableCourseItems = new javax.swing.JTable() {

	public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int vColIndex) {
            Component c = super.prepareRenderer(renderer, rowIndex, vColIndex);
            boolean result = Boolean.parseBoolean(this.getValueAt(rowIndex, this.getColumnCount() - 1).toString());
	    
            if (result == true) {
                c.setForeground(Color.BLACK);
            } else {
                // If not shaded, match the table's background
                c.setForeground(Color.BLUE);
            }
            return c;
        }
	};  

        buttonCancel = new javax.swing.JButton();
        buttonImport = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        templatePopUp_Marked.setText("Set Marked");
        templatePopUp_Marked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                templatePopUp_MarkedActionPerformed(evt);
            }
        });

        templatePopUp.add(templatePopUp_Marked);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img_topheader.jpg")));
        jLabel2.setFocusable(false);

        lblWindowLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblWindowLabel.setText("Add Course via Template");
        lblWindowLabel.setFocusable(false);

        jLabel1.setText("Course:");

        lblCourse.setFont(new java.awt.Font("Tahoma", 1, 11));

        jLabel3.setText("Created On:");

        jTextPane1.setEditable(false);
        jTextPane1.setText("Edit the course item data below by filling in your marks. To allow editing, first right click on the item to be edited, and select Marked. After the item is set as marked, double click the entry under the Student Mark column, and enter the mark you recieved.");
        jTextPane1.setAutoscrolls(false);
        jTextPane1.setFocusable(false);
        jScrollPane2.setViewportView(jTextPane1);

        tableCourseItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Label", "Student Mark", "Total Mark", "Weight", "Marked"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCourseItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableCourseItemsMouseReleased(evt);
            }
        });

        scrollPaneTable.setViewportView(tableCourseItems);

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonImport.setText("Import");
        buttonImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonImportActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 472, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(scrollPaneTable, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(108, 108, 108)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblCourse)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 167, Short.MAX_VALUE)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblDate)
                .add(89, 89, 89))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .add(buttonCancel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buttonImport, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(9, 9, 9))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .add(lblWindowLabel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblWindowLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(lblCourse)
                    .add(jLabel3)
                    .add(lblDate))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(scrollPaneTable, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 278, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(19, 19, 19)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 43, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buttonCancel)
                    .add(buttonImport))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableCourseItemsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCourseItemsMouseReleased
        setCurrentCourseItem();
        if (evt.getButton() == evt.BUTTON3) { //if right-clicked on table
            if (currentCourseItem != null) {
                setContextMenu();
                templatePopUp.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_tableCourseItemsMouseReleased
    
    private void colourMarkedRow(){
        int selection = tableCourseItems.getSelectedRow();
        if (selection != -1){ //if a row is selected
            model.setValueAt(true, selection, model.getColumnCount() - 1);
            tableCourseItems.addNotify();
        }
    }
    
    private void setContextMenu(){
        if (currentCourseItem.isMarked()){
                templatePopUp_Marked.setEnabled(false);
            } else {
                templatePopUp_Marked.setEnabled(true);
            }
    }
    
    private void templatePopUp_MarkedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_templatePopUp_MarkedActionPerformed
        currentCourseItem.setMarked(true);
        colourMarkedRow();
    }//GEN-LAST:event_templatePopUp_MarkedActionPerformed
    
    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed
       
    private void chooseFile(){
        JFileChooser chooser = new JFileChooser();
        MainFrame.setFileFilter(chooser);
        int result = chooser.showOpenDialog(this);
        if (result == chooser.APPROVE_OPTION) { //if user presses cancel while browsing for a file
            Course course = loadTemplate(chooser.getSelectedFile().getPath());
            if (course == null) { //if user chooses an invalid file (not a template)
                JOptionPane.showMessageDialog(this, "Invalid File Selected", "Error", 0);
                this.course = null;
            } else {
                this.course = course;
            }
        } else {
            this.course = null;
        }
    }
    
    private Course loadTemplate(String path){
        try {
            FileInputStream in = new FileInputStream(path);
            ObjectInputStream s = new ObjectInputStream(in);
            Course course = (Course) s.readObject();
            String date = (String) s.readObject();
            lblDate.setText(date);
            in.close();
            return course;
        } catch (Exception e) {
            return null;
        }
    }
      
    private void setCurrentCourseItem(){
        int selection = tableCourseItems.getSelectedRow();
        if (selection != -1){ //if a row is selected
            String label = String.valueOf(model.getValueAt(selection, 0));
            currentCourseItem = course.getCourseItem(label);
        }
    }
    
    private void updateData() {
        int selection = tableCourseItems.getSelectedRow();
        if (selection != -1){ //if a row is selected
            try {
                double mark = Double.parseDouble(model.getValueAt(selection, 1).toString());
                if ((mark >= 0.0) && currentCourseItem.isMarked()) {
                    currentCourseItem.setStudentMark(mark);
                } else {
                    //need the two currentCourseItem.setMarked(boolean) lines to avoid stackOverflow
                    currentCourseItem.setMarked(true);
                    model.setValueAt(0.0, selection, 1);
                    currentCourseItem.setMarked(false);
                }
            } catch (Exception e){
                model.setValueAt(0.0, selection, 1);
            }
        }
    }
       
    public void showDialog(){
        chooseFile();
        if (this.course != null) { //if valid template file loaded successfully
            lblCourse.setText(course.getDepartment() + " " + course.getNumber());
            MainFrame.fillTable(tableCourseItems, course.getCourseItemData());
            Main.centerDialog(this);
            this.setVisible(true);
        } else {
            dispose();
        }
    }
    
    private void buttonImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonImportActionPerformed
        
        //save profile for undo
        MainFrame.getDBHistory().studentEdited(MainFrame.getStudent(), "Loaded Template for " + course.getDepartment() + " " + course.getNumber());
        
        boolean result = MainFrame.getSelectedSemester().addCourse(course);
        if (result == false) {
            String msg = "'" + course.getDepartment() + " " + course.getNumber() + "' already exists.";
            JOptionPane.showMessageDialog(this, msg, "Error", 0);
            MainFrame.getDBHistory().changeFailed();
        }
        dispose();
    }//GEN-LAST:event_buttonImportActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonImport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblWindowLabel;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable tableCourseItems;
    private javax.swing.JPopupMenu templatePopUp;
    private javax.swing.JMenuItem templatePopUp_Marked;
    // End of variables declaration//GEN-END:variables
    
}
