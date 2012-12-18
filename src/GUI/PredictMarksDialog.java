/**
 * @author Raman Buttar
 * CMPT275 - Team Blank
 * SFU Surrey Campus
 * March 30, 2006
 * ===============================
 * NOTE: This class defines calculate cgpa dialog
 *
 */

package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import School.Course;
import javax.swing.table.TableCellRenderer;

public class PredictMarksDialog extends javax.swing.JDialog {
    private Course course;
    
    public PredictMarksDialog(java.awt.Frame parent) {
        super(parent, "Predict Course Marks", true);
        initComponents();
        tableCourseItems.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        MainFrame.hideLastColumn(tableCourseItems);
        this.getRootPane().setDefaultButton(buttonClose);
        Main.escapeDialog(this);
    }
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel2 = new javax.swing.JLabel();
        lblWindowLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboLetterGrade = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        scrollPaneTable = new javax.swing.JScrollPane();
        tableCourseItems = new javax.swing.JTable();
        lblMessage = new javax.swing.JLabel();
        buttonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Predict Marks");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img_topheader.jpg")));
        jLabel2.setFocusable(false);

        lblWindowLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblWindowLabel.setText("Predict Course Grade");
        lblWindowLabel.setFocusable(false);

        jLabel1.setText("Desired Letter Grade:");

        comboLetterGrade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D", "F" }));
        comboLetterGrade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboLetterGradeItemStateChanged(evt);
            }
        });

        jTextPane1.setEditable(false);
        jTextPane1.setText("Choose a desired final letter grade for this course and then check the required marks you must achieve on unmarked course items displayed in blue.");
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
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneTable.setViewportView(tableCourseItems);

        buttonClose.setText("Close");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 476, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(320, Short.MAX_VALUE)
                .add(lblWindowLabel)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(scrollPaneTable, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(141, 141, 141)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(comboLetterGrade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(lblMessage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 236, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(407, Short.MAX_VALUE)
                .add(buttonClose)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblWindowLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(comboLetterGrade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(scrollPaneTable, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 284, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblMessage)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(buttonClose)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        comboLetterGrade.setSelectedIndex(0);
        lblMessage.setVisible(false);
    }//GEN-LAST:event_formComponentShown

    private void comboLetterGradeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboLetterGradeItemStateChanged
        String target = comboLetterGrade.getSelectedItem().toString();
        Object[] data = course.predictMarks(target);
        if (data == null) {
            lblMessage.setText("'" + target + "' is not achievable.");
            lblMessage.setVisible(true);
        } else {
            lblMessage.setText("");
            lblMessage.setVisible(false);
            setMarkValues(data);
        }
    }//GEN-LAST:event_comboLetterGradeItemStateChanged

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCloseActionPerformed
                     
    private void setMarkValues(Object[] data){
        try {
            DefaultTableModel model = (DefaultTableModel)tableCourseItems.getModel();
            for (int i = 0; i < data.length; i++){
                model.setValueAt(data[i], i, 1);
                
            }
            tableCourseItems.addNotify();
        } catch (Exception e){
            System.out.println("EXCEPTION: PredictMarksDialog - setMarkValues(Object[] data)");
        } 
    }
       
    public void showDialog(){
        course = MainFrame.getSelectedCourse();
        MainFrame.fillTable(tableCourseItems, course.getCourseItemData());
        Main.centerDialog(this);
        this.setVisible(true);
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClose;
    private javax.swing.JComboBox comboLetterGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblWindowLabel;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable tableCourseItems;
    // End of variables declaration//GEN-END:variables
    
}
