/*
 * ViewGraphDialog.java
 *
 * Created on March 27, 2006, 7:09 PM
 */

package GUI;

import Features.PrintGraphs;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ViewGraphDialog extends javax.swing.JDialog {
    private BufferedImage image;
    
    /** Creates new form ViewGraphDialog */
    public ViewGraphDialog(java.awt.Frame parent, String title, BufferedImage image) {
        super(parent, title, true);
        initComponents();
        this.setTitle(title);
        this.image = image;
        Main.escapeDialog(this);
    }
            
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        graphPopUp = new javax.swing.JPopupMenu();
        graphPopUp_save = new javax.swing.JMenuItem();
        graphPopUp_print = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        graphPopUp_save.setText("Save Graph");
        graphPopUp_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphPopUp_saveActionPerformed(evt);
            }
        });

        graphPopUp.add(graphPopUp_save);

        graphPopUp_print.setText("Print Graph");
        graphPopUp_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphPopUp_printActionPerformed(evt);
            }
        });

        graphPopUp.add(graphPopUp_print);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("");
        setResizable(false);
        jLabel1.setText("Right-click on the chart below to save or print as an image.");

        lblImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblImageMouseReleased(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(lblImage))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblImage)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void graphPopUp_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphPopUp_printActionPerformed
        new PrintGraphs(MainFrame.getStudent());
    }//GEN-LAST:event_graphPopUp_printActionPerformed

    private void lblImageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageMouseReleased
        if (evt.getButton() == MouseEvent.BUTTON3) { //if right-mouse clicked
            graphPopUp.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_lblImageMouseReleased

    private static void setFileFilter(JFileChooser chooser){
        chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
             
            public boolean accept(File f) {
                return f.isDirectory() || f.getName().toLowerCase().endsWith(".jpg");
            }

            public String getDescription() {
                return "JPG Image Files";
            }
        });
            
    }      
    
    private void graphPopUp_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphPopUp_saveActionPerformed
        JFileChooser chooser = new JFileChooser();
        setFileFilter(chooser);
        int result = chooser.showSaveDialog(this);
        if (result == chooser.APPROVE_OPTION){
            File file = chooser.getSelectedFile();
            String path = file.getPath();
            if (!path.endsWith(".jpg")) {
                path += ".jpg";
            }
            saveImage(path);
        }
    }//GEN-LAST:event_graphPopUp_saveActionPerformed
    
    private void loadImage(){
        try {
            String path = "Storage\\Images\\image.jpg";
            this.saveImage(path);
            File file = new File(path);
            Image image = ImageIO.read(file);
            ImageIcon icon = new ImageIcon(image);
            lblImage.setIcon(icon);
            resizeDialog(icon);
        } catch (Exception e){
            System.out.println("EXCEPTION: MainFrame - displayImage(String name");
        }        
    }
    
    public boolean saveImage(String filename){
        //save file
        try {
            File file = new File(filename);
            ImageIO.write(this.image, "jpg", file);
            return true;
        } catch (IOException e) {
            return false;
        }
    }    
    
    private void resizeDialog(ImageIcon icon){
        ImageObserver observer = icon.getImageObserver();
        int width = icon.getImage().getWidth(observer) + 25;
        int height = icon.getImage().getHeight(observer) + 70;
        Dimension d = new Dimension(width, height);
        this.setSize(d);
    }
    
    public void showDialog(){
        loadImage();
        Main.centerDialog(this);
        this.setVisible(true);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu graphPopUp;
    private javax.swing.JMenuItem graphPopUp_print;
    private javax.swing.JMenuItem graphPopUp_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblImage;
    // End of variables declaration//GEN-END:variables
    
}
