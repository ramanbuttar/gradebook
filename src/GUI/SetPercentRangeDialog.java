/**
 * Trevor Choo - #200130530
 * CMPT 275 D100 - Team Blank
 * SFU Surrey Campus
 * March 30, 2006
 * ======================================================
 * NOTE: Allows the user to edit the percent range representing
 * a particular letter grade.
 */


package GUI;

import javax.swing.*;

/**
 *
 * @author  Raman
 */
public class SetPercentRangeDialog extends javax.swing.JDialog {
    
    /** Creates new form SetPercentRangeDialog */
    public SetPercentRangeDialog(java.awt.Frame parent) {
        super(parent, "Set Percentage Range", true);
        initComponents();
        this.getRootPane().setDefaultButton(buttonSet);
        Main.escapeDialog(this);
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        txtPercentD2 = new javax.swing.JTextField();
        txtPercentC3 = new javax.swing.JTextField();
        txtPercentC2 = new javax.swing.JTextField();
        txtPercentC1 = new javax.swing.JTextField();
        txtPercentB3 = new javax.swing.JTextField();
        txtPercentB2 = new javax.swing.JTextField();
        txtPercentB1 = new javax.swing.JTextField();
        txtPercentA3 = new javax.swing.JTextField();
        txtPercentA2 = new javax.swing.JTextField();
        txtPercentA1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        buttonCancel = new javax.swing.JButton();
        buttonSet = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lblWindowLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Percent Range");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel4.setText("D");

        jLabel5.setText("C-");

        jLabel6.setText("C");

        jLabel7.setText("C+");

        jLabel8.setText("B-");

        jLabel9.setText("B");

        jLabel10.setText("B+");

        jLabel11.setText("A-");

        jLabel12.setText("A");

        jLabel13.setText("A+");

        jLabel14.setText("Define the starting percentage for each Letter Grade below");

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonSet.setText("OK");
        buttonSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSetActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img_topheader.jpg")));
        jLabel2.setFocusable(false);

        lblWindowLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblWindowLabel.setText("Change Percent Range");
        lblWindowLabel.setFocusable(false);

        jLabel1.setText("%");

        jLabel3.setText("%");

        jLabel15.setText("%");

        jLabel16.setText("%");

        jLabel17.setText("%");

        jLabel18.setText("%");

        jLabel19.setText("%");

        jLabel20.setText("%");

        jLabel21.setText("%");

        jLabel22.setText("%");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .add(lblWindowLabel)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .add(buttonCancel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buttonSet)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .add(jLabel14)
                .add(18, 18, 18))
            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 325, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .add(95, 95, 95)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(jLabel13, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                        .add(jLabel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel11, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jLabel12))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, txtPercentA1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, txtPercentA2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, txtPercentA3)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, txtPercentB1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, txtPercentB2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, txtPercentB3)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, txtPercentC1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, txtPercentC2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, txtPercentC3)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, txtPercentD2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 86, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(14, 14, 14)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel22, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .add(jLabel21, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .add(jLabel20, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .add(jLabel19, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .add(jLabel18, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .add(jLabel17, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .add(jLabel15, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .add(jLabel16, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .add(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblWindowLabel)
                .add(27, 27, 27)
                .add(jLabel14)
                .add(20, 20, 20)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(txtPercentD2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(txtPercentC3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(txtPercentC2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel15))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(txtPercentC1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel16))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(txtPercentB3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel17))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(txtPercentB2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel18))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel10)
                    .add(txtPercentB1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel19))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel11)
                    .add(txtPercentA3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel20))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtPercentA2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel12)
                    .add(jLabel21))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel13)
                    .add(txtPercentA1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel22))
                .add(17, 17, 17)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buttonSet)
                    .add(buttonCancel))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSetActionPerformed
        double[] arr = new double[10];
        try {
            arr[0] = Double.parseDouble(txtPercentD2.getText());
            arr[1] = Double.parseDouble(txtPercentC3.getText());
            arr[2] = Double.parseDouble(txtPercentC2.getText());
            arr[3] = Double.parseDouble(txtPercentC1.getText());
            arr[4] = Double.parseDouble(txtPercentB3.getText());
            arr[5] = Double.parseDouble(txtPercentB2.getText());
            arr[6] = Double.parseDouble(txtPercentB1.getText());
            arr[7] = Double.parseDouble(txtPercentA3.getText());
            arr[8] = Double.parseDouble(txtPercentA2.getText());
            arr[9] = Double.parseDouble(txtPercentA1.getText());
            
            if (inAscendingOrder(arr)){
                //go for it. user has done everything right
                
                //save for undo
                MainFrame.getDBHistory().studentEdited(MainFrame.getStudent(), "Changed Percent Ranges for " + MainFrame.getSelectedCourse().getDepartment() + MainFrame.getSelectedCourse().getNumber());
                
                MainFrame.getSelectedCourse().setPercentRange(arr);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "The percentage values must be in ascending order", "Error", 0);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Invalid Input", "Invalid Input", 0);
            
        }
    }//GEN-LAST:event_buttonSetActionPerformed

    private boolean inAscendingOrder(double[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] >= arr[i+1]){
                return false;
            }
        }        
        return true;
    }
    
    public void showDialog(){
        Main.centerDialog(this);
        this.setVisible(true);
    }
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        double[] arr = MainFrame.getSelectedCourse().getPercentRange();
        
        txtPercentD2.setText("" + arr[0]);
        txtPercentC3.setText("" + arr[1]);
        txtPercentC2.setText("" + arr[2]);
        txtPercentC1.setText("" + arr[3]);
        txtPercentB3.setText("" + arr[4]);
        txtPercentB2.setText("" + arr[5]);
        txtPercentB1.setText("" + arr[6]);
        txtPercentA3.setText("" + arr[7]);
        txtPercentA2.setText("" + arr[8]);
        txtPercentA1.setText("" + arr[9]);       
    }//GEN-LAST:event_formComponentShown

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblWindowLabel;
    private javax.swing.JTextField txtPercentA1;
    private javax.swing.JTextField txtPercentA2;
    private javax.swing.JTextField txtPercentA3;
    private javax.swing.JTextField txtPercentB1;
    private javax.swing.JTextField txtPercentB2;
    private javax.swing.JTextField txtPercentB3;
    private javax.swing.JTextField txtPercentC1;
    private javax.swing.JTextField txtPercentC2;
    private javax.swing.JTextField txtPercentC3;
    private javax.swing.JTextField txtPercentD2;
    // End of variables declaration//GEN-END:variables
    
}
