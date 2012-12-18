/**
 * @author Bryan Chan
 * CMPT275 - Team Blank
 * SFU Surrey Campus
 * March 26, 2006
 * ===============================
 * NOTE: This class defines the search dialog
 * 
 */

package GUI;

import School.*;
import javax.swing.table.DefaultTableModel;

public class SearchDialog extends javax.swing.JDialog {
    private static Student currentStudent = MainFrame.getStudent();
    private static final int MAX_SIZE = 1000;
    public SearchDialog(java.awt.Frame parent) {
        super(parent, "Search", true);
        initComponents();
        this.getRootPane().setDefaultButton(buttonSearch);
        Main.escapeDialog(this);
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        txtSearch = new javax.swing.JTextField();
        comboSearch = new javax.swing.JComboBox();
        buttonSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableResults = new javax.swing.JTable();
        lblStatus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblWindowLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        comboSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Semesters", "Courses", "Course Items" }));
        comboSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSearchActionPerformed(evt);
            }
        });

        buttonSearch.setText("Search");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(tableResults);

        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatus.setText("Ready");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img_topheader.jpg")));
        jLabel2.setFocusable(false);

        lblWindowLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblWindowLabel.setText("Search");
        lblWindowLabel.setFocusable(false);

        jLabel4.setText("Search in");

        jTextPane2.setEditable(false);
        jTextPane2.setText("Semester - Searches for a specified SGPA\nCourse - Searches for a Percentage or Letter Grade\nCourse Item - Searches for a student's mark or total mark of the item");
        jTextPane2.setFocusable(false);
        jScrollPane2.setViewportView(jTextPane2);

        jLabel1.setText("Search Format");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 489, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(432, Short.MAX_VALUE)
                .add(lblWindowLabel)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 12, Short.MAX_VALUE)
                .add(comboSearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 117, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txtSearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 211, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(14, 14, 14)
                .add(buttonSearch)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addContainerGap(409, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(378, Short.MAX_VALUE)
                .add(lblStatus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblWindowLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buttonSearch)
                    .add(jLabel4)
                    .add(comboSearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtSearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 325, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblStatus, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSearchActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_comboSearchActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        String searchFor = comboSearch.getSelectedItem().toString();
        createTable(searchFor);
        populateTable(searchFor);
    }//GEN-LAST:event_buttonSearchActionPerformed
    
    private void createTable(String searchFor){        
        DefaultTableModel model = new DefaultTableModel();
        tableResults.setModel(model);
        model.fireTableDataChanged();

        //List of column names for specific search results
        String[] semesterColumnNames = {"Season",
                        "Year",
                        "SGPA"};
        
        String[] courseColumnNames = {"Department",
                        "Number",
                        "Percent Mark",
                        "Letter Grade"};
        
        String[] courseItemColumnNames = {"Label",
                        "Student Mark",
                        "Total Mark",
                        "Weight"};    
        
        //creates the columns according to specific search results
        if(searchFor == "Semesters"){
            for(int i=0;i<semesterColumnNames.length;i++)
                model.addColumn(semesterColumnNames[i]);
        }//if
        else if(searchFor == "Courses"){
            for(int i=0;i<courseColumnNames.length;i++)
                model.addColumn(courseColumnNames[i]);
        }//else if
        else if(searchFor == "Course Items"){
            for(int i=0;i<courseItemColumnNames.length;i++)
                model.addColumn(courseItemColumnNames[i]);           
        }//else    
    }
    
   private void populateTable(String searchFor){
        String searchItem = String.valueOf(txtSearch.getText()).trim();
        double doubleSearchItem = 0.0;
        
        //If user is searching for semesters
        if(searchFor == "Semesters"){
            try{
                doubleSearchItem = Double.parseDouble(searchItem);
                if(doubleSearchItem > 4.33){
                    lblStatus.setText("Invalid search input.");
                }//if
                else{
                    search(doubleSearchItem, searchFor);
                }//else
            }//try
            catch(Exception e){
                lblStatus.setText("Invalid search input.");
            }//catch
        }//if
        
        //if user is searching for courses
        else if(searchFor == "Courses"){
            String[] letterGrades = {"F", "D", "C-", "C", "C+", "B-", "B", "B+", "A-", "A", "A+"};

            //if user is searching a percentage
            if(searchItem.contains("%")){
                int percentIndex = searchItem.indexOf("%");
                try{
                    doubleSearchItem = Double.parseDouble(searchItem.substring(0, percentIndex));
                    search(doubleSearchItem, searchFor);    //search for doubleSearchItem
                }//try
                catch(Exception e){
                    lblStatus.setText("Invalid search input.");
                }//catch
            }//if
            
            //if user is searching a letter grade
            else{
                for(int i=0;i<letterGrades.length;i++){
                    if(searchItem.equals(letterGrades[i])){
                        search(searchItem.toUpperCase().trim());
                    }//if
                    else if(searchItem.length() >= 2){
                        if(!(searchItem.contains("+") || searchItem.contains("-"))){
                            lblStatus.setText("Invalid search input.");
                        }
                    }
                }//for
            }//else
        }//else if
        
        //If user is searching for course items
        else if(searchFor == "Course Items"){
            try{
                int slashIndex = searchItem.indexOf("/");
                double studentMark = Double.parseDouble(searchItem.substring(0,slashIndex));
                double totalMark = Double.parseDouble(searchItem.substring(slashIndex+1)); 
               
                search(studentMark, totalMark);
            }//try
            catch(Exception e){
                lblStatus.setText("Invalid search input.");
            }//catch
        }//else if
    }
    
    private void search(double d, String searchFor){
        int numSem = currentStudent.getNumSemesters();
        int results = 0;
        Object[] arr = new Object[MAX_SIZE];
        
        //if user is searching semesters
        if(searchFor == "Semesters"){
            for(int i=0; i<numSem; i++){  //if user is enrolled in at least 1 semester
                Semester sem = currentStudent.getSemesterIndex(i);
                if(Main.round(sem.getGPA(), 2) == d){
                    String[] data = new String[]{sem.getSeason(), "" + sem.getYear(), "" + Main.round(sem.getGPA(), 2)};
                    arr[results] = data;
                    results++;
                }//if
            }//for
        }//if
        
        //if user is searching courses
        if(searchFor == "Courses"){
            for(int i=0;i<numSem;i++){ //if user is enrolled in at least 1 semester
                Semester sem = currentStudent.getSemesterIndex(i);
                for(int j=0;j<sem.getNumCourses();j++){
                    Course course = currentStudent.getSemesterIndex(i).getCourseIndex(j);
                    if(course.getMarkPercent() == d){
                        String[] data = new String[]{course.getDepartment(), "" + course.getNumber(),
                            "" + Main.round(course.getMarkPercent(), 2), course.getMarkLetter()};
                        arr[results] = data;
                        results++;
                    }//if
                }//for
            }//for
        }//if
        
        if (arr.length > 0){ //display search results in table
            Object[] searchResults = new Object[results];
            for(int j= 0; j<results;j++)
                searchResults[j] = arr[j];
            MainFrame.fillTable(tableResults, searchResults);
        }//if
       lblStatus.setText("Search completed.");
    }

    private void search(String s){
        int numSem = currentStudent.getNumSemesters();
        int results = 0;
        Object[] arr = new Object[MAX_SIZE];  
        for(int i=0;i<numSem;i++){ //if user is enrolled in at least 1 semester
            Semester sem = currentStudent.getSemesterIndex(i);
                for(int j=0;j<sem.getNumCourses();j++){
                    Course course = currentStudent.getSemesterIndex(i).getCourseIndex(j);
                    if(course.getMarkLetter().equals(s)){
                        String[] data = new String[]{course.getDepartment(), "" + course.getNumber(), "" + Main.round(course.getMarkPercent(), 2), course.getMarkLetter()};
                        arr[results] = data;
                        results++;
                    }//if
                }//for
            }//for  

        if (arr.length > 0){ //display search results in table
            Object[] searchResults = new Object[results];
            for(int j= 0; j<results;j++)
                searchResults[j] = arr[j];
            MainFrame.fillTable(tableResults, searchResults);
        }//if
        lblStatus.setText("Search completed.");
    }
    
    private void search(double searchStudentMark, double searchTotalMark){
        int numSem = currentStudent.getNumSemesters();
        int results = 0;
        
        Object[] arr = new Object[MAX_SIZE];
        for(int i=0;i<numSem;i++){ //look through all semesters in student
            Semester sem = currentStudent.getSemesterIndex(i);
            for(int j=0;j<sem.getNumCourses();j++){  //look through all courses in a semester
                Course course = sem.getCourseIndex(j);
                String allCourseItems[] = course.getAllCourseItemsNames();
                for(int k=0;k<course.getCourseItemData().length;k++){ //look through all course items in a course
                    CourseItem item = course.getCourseItem(allCourseItems[k]);
                    if((item.getStudentMark() == searchStudentMark) && (item.getTotalMark() == searchTotalMark)){
                        String[] data = new String[]{item.getLabel(), "" + item.getStudentMark(), "" + item.getTotalMark(), "" + item.getWeight()};
                        arr[results] = data;
                        results++;
                    }//if
                }//for
            }//for
        }//for 
        
        if (arr.length > 0){ //display search results in table
            Object[] searchResults = new Object[results];
            for(int j= 0; j<results;j++)
                searchResults[j] = arr[j];
            MainFrame.fillTable(tableResults, searchResults);
        }//if
        lblStatus.setText("Search completed.");
    }
    
    public void showDialog(){
        Main.centerDialog(this);
        this.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSearch;
    private javax.swing.JComboBox comboSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblWindowLabel;
    private javax.swing.JTable tableResults;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    
}
