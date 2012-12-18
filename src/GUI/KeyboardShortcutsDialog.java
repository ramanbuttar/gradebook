/**
 * Trevor Choo - #200130530
 * CMPT 275 D100 - Team Blank
 * SFU Surrey Campus
 * April 3, 2006
 * ======================================================
 * NOTE: The class is pretty self-explanitory...
 */

package GUI;
public class KeyboardShortcutsDialog extends javax.swing.JDialog {
    
    /** Creates new form KeyboardShortcutsDialog */
    public KeyboardShortcutsDialog(java.awt.Frame parent) {
        super(parent, "Keyboard/Mouse Shortcuts", true);
        initComponents();
        Main.escapeDialog(this);
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel2 = new javax.swing.JLabel();
        lblTeamBlankMembers = new javax.swing.JLabel();
        Btn_close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Keyboard/Mouse Shortcuts");
        setResizable(false);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img_topheader.jpg")));
        jLabel2.setFocusable(false);

        lblTeamBlankMembers.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblTeamBlankMembers.setText("Keyboard Shortcuts");
        lblTeamBlankMembers.setFocusable(false);

        Btn_close.setText("Close");
        Btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_closeActionPerformed(evt);
            }
        });

        jTextPane1.setEditable(false);
        jTextPane1.setText("To help make the program easier and faster to navigate, here is a list of handy shortcut combinations.");
        jTextPane1.setFocusable(false);
        jScrollPane1.setViewportView(jTextPane1);

        jLabel1.setText("General");

        jLabel3.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel3.setText("Escape");

        jLabel4.setText("Closes any currently selected open window");

        jLabel5.setText("Semester Table");

        jLabel6.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel6.setText("Tab or Double Click");

        jLabel7.setText("Opens Courses tab that shows all Courses under the currently selected Semester");

        jLabel8.setText("Remove the currently selected Semester");

        jLabel9.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel9.setText("Delete");

        jLabel10.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel10.setText("Insert");

        jLabel11.setText("Add a Course to the currently selected Semester");

        jLabel12.setText("Semester's Table");

        jLabel13.setText("View Courses tab that shows all Courses under the currently selected Semester");

        jLabel14.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel14.setText("Enter or Double Click");

        jLabel15.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel15.setText("Delete");

        jLabel16.setText("Remove the currently selected Semester");

        jLabel17.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel17.setText("Insert");

        jLabel18.setText("Add a course under the currently selected Semester");

        jLabel19.setText("Course Table");

        jLabel20.setText("Opens CoursesItems tab that shows all items contained in the the currently selected Course");

        jLabel21.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel21.setText("Tab or Double Click");

        jLabel26.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel26.setText("Delete");

        jLabel27.setText("Remove the currently selected Course");

        jLabel28.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel28.setText("Insert");

        jLabel29.setText("Add a Course Item to the currently selected Course");

        jLabel30.setText("Course Items Table");

        jLabel31.setText("Remove the currently selected Course Item");

        jLabel32.setFont(new java.awt.Font("MS Sans Serif", 1, 11));
        jLabel32.setText("Delete");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .add(lblTeamBlankMembers)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addContainerGap(446, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel5)
                    .add(layout.createSequentialGroup()
                        .add(28, 28, 28)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel7)
                            .add(jLabel6)
                            .add(jLabel9)
                            .add(jLabel8)
                            .add(jLabel10)
                            .add(jLabel11))))
                .addContainerGap(65, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(38, 38, 38)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel4)
                    .add(jLabel3))
                .addContainerGap(248, Short.MAX_VALUE))
            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 493, Short.MAX_VALUE)
            .add(jLabel12)
            .add(jLabel13)
            .add(jLabel14)
            .add(jLabel15)
            .add(jLabel16)
            .add(jLabel17)
            .add(jLabel18)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel19)
                .addContainerGap(420, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(38, 38, 38)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel29)
                    .add(jLabel28)
                    .add(jLabel27)
                    .add(jLabel26)
                    .add(jLabel20)
                    .add(jLabel21))
                .addContainerGap(14, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel30)
                .addContainerGap(390, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(37, 37, 37)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel31)
                    .add(jLabel32))
                .addContainerGap(247, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(424, Short.MAX_VALUE)
                .add(Btn_close)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lblTeamBlankMembers))
                    .add(jLabel12)
                    .add(jLabel13)
                    .add(jLabel14)
                    .add(jLabel15)
                    .add(jLabel16)
                    .add(jLabel17)
                    .add(jLabel18))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel4)
                .add(9, 9, 9)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel8)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel10)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel11)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel19)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel21)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel26)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel27)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel28)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel29)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel30)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel32)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel31)
                .add(29, 29, 29)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(Btn_close)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_Btn_closeActionPerformed
    
    public void showDialog(){
        Main.centerDialog(this);
        this.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_close;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblTeamBlankMembers;
    // End of variables declaration//GEN-END:variables
    
}
