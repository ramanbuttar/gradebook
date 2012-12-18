/**
 * Trevor Choo - #200130530
 * CMPT 275 D100 - Team Blank
 * SFU Surrey Campus
 * March 30, 2006
 * ======================================================
 * NOTE: The class is pretty self-explanitory...
 */

package GUI;
public class AboutProjectNullDialog extends javax.swing.JDialog {
    
    public AboutProjectNullDialog(java.awt.Frame parent) {
        super(parent, "About Project Null", true);
        initComponents();
        this.getRootPane().setDefaultButton(btn_OK);
        Main.escapeDialog(this);
    }
    public void showDialog(){
        Main.centerDialog(this);
        this.setVisible(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel2 = new javax.swing.JLabel();
        lblTeamBlankMembers = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_OK = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About Project Null");
        setResizable(false);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img_topheader.jpg")));
        jLabel2.setFocusable(false);

        lblTeamBlankMembers.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblTeamBlankMembers.setText("About Project Null");
        lblTeamBlankMembers.setFocusable(false);

        jLabel1.setText("Personal Gradebook");

        btn_OK.setText("OK");
        btn_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OKActionPerformed(evt);
            }
        });

        jLabel3.setText("Version 3.0 (April 2006)");

        jTextPane1.setEditable(false);
        jTextPane1.setText("Project Null is distributed under the GNU General Public License (GPL). Some some conditions regarding its usage and/or redistribution may apply. In compliance with the GPL, this application is provided 'as-is' and is not covered under any warranty.\n\nProject Null acknowledges the contributions of the open source developer Saki for releasing \"Vista Inspirate,\" his open source icon package; portions of which are used in this application's toolbar. Please visit his site to view more of his work (http://sa-ki.deviantart.com).");
        jScrollPane1.setViewportView(jTextPane1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 326, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .add(lblTeamBlankMembers)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addContainerGap(220, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel3)
                .addContainerGap(203, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(269, Short.MAX_VALUE)
                .add(btn_OK)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblTeamBlankMembers)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btn_OK)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OKActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_OKActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_OK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblTeamBlankMembers;
    // End of variables declaration//GEN-END:variables
    
}
