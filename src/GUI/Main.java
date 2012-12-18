/**
 * @author Raman Buttar
 * CMPT275 - Team Blank
 * SFU Surrey Campus
 * March 23, 2006
 * ===============================
 * NOTE: This class contains common methods used by various other classes
 *
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class Main {
    
    public static void main(String[] args) {
        //main method, start and display the gui
        createFolders();
        MainFrame main = new MainFrame();
        main.display();
    }
    
    private static void createFolders(){
        //Creates required folder structure to store files during runtime
        File[] arr = new File[4];
        arr[0] = new File("Storage");
        arr[1] = new File("Storage//Images");
        arr[2] = new File("Storage//Profiles");
        arr[3] = new File("Storage//Transcripts");
        for (File file: arr){
            if (!file.isDirectory()) {
                file.mkdir();
            }
        }
    }

    public static final double round(double value, int places){
        //Rounds any given double value to desired number of places
        double output = value;
        double factor = Math.pow(10,places);
        value = Math.round(value * factor);
        output = (value) / factor;
        return output;
    }
	
    public static final String capatalizeString(String st){
        //Returns a String with first letter of each word capatalized
        st = st.trim();
        if ((st == null) || (st.length() == 0)){
            return null;
        } else {
            String newSt = "";
            char prevCh = '.';
            for (int i = 0; i < st.length(); i++){
                char ch = st.charAt(i);
                if ((Character.isLetter(ch)) && !(Character.isLetter(prevCh))){
                    newSt += Character.toUpperCase(ch);
                } else {
                    newSt += ch;
                }
		prevCh = ch;
            }
            return newSt;
        }
    }   
    
    public static void centerDialog(JDialog dialog) {
        //Centers given dialog relative to its parent's position
        int x = 0; 
        int y = 0;
        
        Container myParent = dialog.getParent();
        Dimension parentSize = myParent.getSize();
        Point topLeft = myParent.getLocationOnScreen();
        Dimension mySize = dialog.getSize();

        if (parentSize.width > mySize.width) {
            x = ((parentSize.width - mySize.width)/2) + topLeft.x;
        } else {
            x = topLeft.x;
        }

        if (parentSize.height > mySize.height) {
            y = ((parentSize.height - mySize.height)/2) + topLeft.y;
        } else {
            y = topLeft.y;
        }
            dialog.setLocation (x, y);
    }
    
    public static void escapeDialog(final JDialog dialog){
        //Disposes given dialog by pressing Escape key
        KeyStroke escape = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, false);
        Action escapeAction = new AbstractAction(){
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        };
        dialog.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(escape, "ESCAPE");
        dialog.getRootPane().getActionMap().put("ESCAPE", escapeAction);        
    }
    
    
}
