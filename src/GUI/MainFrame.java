/**
 * @author Raman Buttar
 * CMPT275 - Team Blank
 * SFU Surrey Campus
 * March 13, 2006
 * ===============================
 * NOTE: This class defines the main program window
 *
 */

package GUI;

import Features.*;
import School.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.*;
import javax.swing.table.*;

public class MainFrame extends JFrame {
    
    private static Student currentStudent = null;
    private static Semester currentSemester = null;
    private static Course currentCourse = null;
    private static CourseItem currentCourseItem = null;
    private static boolean notFirstLoad = false;
    private static HistoryManager dbHistory = new HistoryManager();
    
    public MainFrame() {
        //Main constructor to create this JFrame
        try {
            //Apply current OS theme to this and all child windows
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {
            
        }
        initComponents();
        
        //allow only single selection
        tableSemesters.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableCourses.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableCourseItems.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //hide last columns in Course and CourseItem tables
        hideLastColumn(tableCourses);
        hideLastColumn(tableCourseItems);
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        semPopUp = new javax.swing.JPopupMenu();
        semPopUp_addCourse = new javax.swing.JMenuItem();
        semPopUp_addTemplate = new javax.swing.JMenuItem();
        semPopUp_separator = new javax.swing.JSeparator();
        semPopUp_removeSemester = new javax.swing.JMenuItem();
        semPopUp_editSemester = new javax.swing.JMenuItem();
        coursePopUp = new javax.swing.JPopupMenu();
        coursePopUp_addCourseItem = new javax.swing.JMenuItem();
        coursePopUp_removeCourse = new javax.swing.JMenuItem();
        coursePopUp_editCourse = new javax.swing.JMenuItem();
        coursePopUp_separator = new javax.swing.JSeparator();
        coursePopUp_setComplete = new javax.swing.JMenuItem();
        coursePopUp_setRange = new javax.swing.JMenuItem();
        coursePopUp_createTemplate = new javax.swing.JMenuItem();
        coursePopUp_separator2 = new javax.swing.JSeparator();
        coursePopUp_project = new javax.swing.JMenuItem();
        coursePopUp_predict = new javax.swing.JMenuItem();
        courseItemPopUp = new javax.swing.JPopupMenu();
        courseItemPopUp_removeItem = new javax.swing.JMenuItem();
        courseItemPopUp_editItem = new javax.swing.JMenuItem();
        courseItemPopUp_separator = new javax.swing.JSeparator();
        courseItemPopUp_setMarked = new javax.swing.JMenuItem();
        mainPanel = new javax.swing.JPanel();
        userInfoPanel = new javax.swing.JPanel();
        lblStudentNumber = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblCurrentCGPA = new javax.swing.JLabel();
        lblCGPA = new javax.swing.JLabel();
        lblStudNumText = new javax.swing.JLabel();
        lbl_userId = new javax.swing.JLabel();
        TabsPane = new javax.swing.JTabbedPane();
        tabSemesters = new javax.swing.JPanel();
        scrollSemesters = new javax.swing.JScrollPane();
        tableSemesters = new javax.swing.JTable();
        tabCourses = new javax.swing.JPanel();
        scrollCourses = new javax.swing.JScrollPane();
        tableCourses = new javax.swing.JTable() {

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

        jLabel1 = new javax.swing.JLabel();
        lblCurrentSem1 = new javax.swing.JLabel();
        tabCourseItems = new javax.swing.JPanel();
        scrollCourseItems = new javax.swing.JScrollPane();
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

        jLabel2 = new javax.swing.JLabel();
        lblCurrentSem2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCurrentCourse = new javax.swing.JLabel();
        lbl_nextUndo = new javax.swing.JLabel();
        lbl_redoNext = new javax.swing.JLabel();
        buttonToolBar = new javax.swing.JToolBar();
        btn_newSem = new javax.swing.JButton();
        btn_newCourse = new javax.swing.JButton();
        btn_newCItem = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileMenu_newProfile = new javax.swing.JMenuItem();
        fileMenu_loadProfile = new javax.swing.JMenuItem();
        fileMenu_saveProfile = new javax.swing.JMenuItem();
        fileMenu_separator = new javax.swing.JSeparator();
        fileMenu_printTranscript = new javax.swing.JMenuItem();
        fileMenu_ExportTrascript = new javax.swing.JMenuItem();
        fileMenu_separator2 = new javax.swing.JSeparator();
        fileMenu_exit = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        editMenu_undo = new javax.swing.JMenuItem();
        editMenu_redo = new javax.swing.JMenuItem();
        editMenu_separator = new javax.swing.JSeparator();
        editMenu_semesterSubMenu = new javax.swing.JMenu();
        semesterSubMenu_add = new javax.swing.JMenuItem();
        semesterSubMenu_remove = new javax.swing.JMenuItem();
        semesterSubMenu_edit = new javax.swing.JMenuItem();
        semesterubMenu_separator = new javax.swing.JSeparator();
        semesterSubMenu_projectGPA = new javax.swing.JMenuItem();
        editMenu_courseSubMenu = new javax.swing.JMenu();
        courseSubMenu_add = new javax.swing.JMenuItem();
        courseSubMenu_remove = new javax.swing.JMenuItem();
        courseSubMenu_edit = new javax.swing.JMenuItem();
        courseSubMenu_separator = new javax.swing.JSeparator();
        courseSubMenu_createTemplate = new javax.swing.JMenuItem();
        courseSubMenu_loadTemplate = new javax.swing.JMenuItem();
        courseSubMenu_separator2 = new javax.swing.JSeparator();
        courseSubMenu_setComplete = new javax.swing.JMenuItem();
        courseSubMenu_setRange = new javax.swing.JMenuItem();
        courseSubMenu_separator3 = new javax.swing.JSeparator();
        courseSubMenu_project = new javax.swing.JMenuItem();
        courseSubMenu_predict = new javax.swing.JMenuItem();
        editMenu_courseitemSubMenu = new javax.swing.JMenu();
        courseitemSubMenu_add = new javax.swing.JMenuItem();
        courseitemSubMenu_remove = new javax.swing.JMenuItem();
        courseitemSubMenu_edit = new javax.swing.JMenuItem();
        courseitemSubMenu_separator = new javax.swing.JSeparator();
        courseitemSubMenu_setMarked = new javax.swing.JMenuItem();
        extrasMenu = new javax.swing.JMenu();
        extrasMenu_calcCGPA = new javax.swing.JMenuItem();
        extrasMenu_showGPAChart = new javax.swing.JMenuItem();
        extrasMenu_showGradesGraph = new javax.swing.JMenuItem();
        extrasMenu_search = new javax.swing.JMenuItem();
        optionsMenu = new javax.swing.JMenu();
        optionsMenu_password = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpMenu_shortcuts = new javax.swing.JMenuItem();
        helpMenu_teamBlank = new javax.swing.JMenuItem();
        helpMenu_PG = new javax.swing.JMenuItem();

        semPopUp_addCourse.setText("Add Course");
        semPopUp_addCourse.setToolTipText("Add a new Course to selected Semester");
        semPopUp_addCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semPopUp_addCourseActionPerformed(evt);
            }
        });

        semPopUp.add(semPopUp_addCourse);

        semPopUp_addTemplate.setText("Add Course via Template");
        semPopUp_addTemplate.setToolTipText("Add a pre-defined Course from a Template to selected Semester");
        semPopUp_addTemplate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semPopUp_addTemplateActionPerformed(evt);
            }
        });

        semPopUp.add(semPopUp_addTemplate);

        semPopUp.add(semPopUp_separator);

        semPopUp_removeSemester.setText("Remove Semester");
        semPopUp_removeSemester.setToolTipText("Remove selected Semester");
        semPopUp_removeSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semPopUp_removeSemesterActionPerformed(evt);
            }
        });

        semPopUp.add(semPopUp_removeSemester);

        semPopUp_editSemester.setText("Edit Semester");
        semPopUp_editSemester.setToolTipText("Edit selected Semester");
        semPopUp_editSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semPopUp_editSemesterActionPerformed(evt);
            }
        });

        semPopUp.add(semPopUp_editSemester);

        coursePopUp_addCourseItem.setText("Add Course Item");
        coursePopUp_addCourseItem.setToolTipText("Add a new Course Item to selected Course");
        coursePopUp_addCourseItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursePopUp_addCourseItemActionPerformed(evt);
            }
        });

        coursePopUp.add(coursePopUp_addCourseItem);

        coursePopUp_removeCourse.setText("Remove Course");
        coursePopUp_removeCourse.setToolTipText("Remove this Course");
        coursePopUp_removeCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursePopUp_removeCourseActionPerformed(evt);
            }
        });

        coursePopUp.add(coursePopUp_removeCourse);

        coursePopUp_editCourse.setText("Edit Course");
        coursePopUp_editCourse.setToolTipText("Edit this Course");
        coursePopUp_editCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursePopUp_editCourseActionPerformed(evt);
            }
        });

        coursePopUp.add(coursePopUp_editCourse);

        coursePopUp.add(coursePopUp_separator);

        coursePopUp_setComplete.setText("Set Completion Status");
        coursePopUp_setComplete.setToolTipText("Set this Course as having been completed");
        coursePopUp_setComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursePopUp_setCompleteActionPerformed(evt);
            }
        });

        coursePopUp.add(coursePopUp_setComplete);

        coursePopUp_setRange.setText("Change Percent Range");
        coursePopUp_setRange.setToolTipText("Specify custom percentage range for each letter grade in this Course");
        coursePopUp_setRange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursePopUp_setRangeActionPerformed(evt);
            }
        });

        coursePopUp.add(coursePopUp_setRange);

        coursePopUp_createTemplate.setText("Export Course as Template");
        coursePopUp_createTemplate.setToolTipText("Save this Course as a Template");
        coursePopUp_createTemplate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursePopUp_createTemplateActionPerformed(evt);
            }
        });

        coursePopUp.add(coursePopUp_createTemplate);

        coursePopUp.add(coursePopUp_separator2);

        coursePopUp_project.setText("Project Final Mark");
        coursePopUp_project.setToolTipText("Project final mark for this Course with current performance");
        coursePopUp_project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursePopUp_projectActionPerformed(evt);
            }
        });

        coursePopUp.add(coursePopUp_project);

        coursePopUp_predict.setText("Predict Marks");
        coursePopUp_predict.setToolTipText("Predict unmarked Course Items' marks to achieve a desired final grade");
        coursePopUp_predict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursePopUp_predictActionPerformed(evt);
            }
        });

        coursePopUp.add(coursePopUp_predict);

        courseItemPopUp_removeItem.setText("Remove Course Item");
        courseItemPopUp_removeItem.setToolTipText("Remove selected Course Item");
        courseItemPopUp_removeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseItemPopUp_removeItemActionPerformed(evt);
            }
        });

        courseItemPopUp.add(courseItemPopUp_removeItem);

        courseItemPopUp_editItem.setText("Edit Course Item");
        courseItemPopUp_editItem.setToolTipText("Edit selected Course Item");
        courseItemPopUp_editItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseItemPopUp_editItemActionPerformed(evt);
            }
        });

        courseItemPopUp.add(courseItemPopUp_editItem);

        courseItemPopUp.add(courseItemPopUp_separator);

        courseItemPopUp_setMarked.setText("Set As Marked");
        courseItemPopUp_setMarked.setToolTipText("Enter achieved mark and set this CourseItem as having been marked");
        courseItemPopUp_setMarked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseItemPopUp_setMarkedActionPerformed(evt);
            }
        });

        courseItemPopUp.add(courseItemPopUp_setMarked);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project Null");
        setBackground(new java.awt.Color(238, 238, 238));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        mainPanel.setBackground(null);
        mainPanel.setForeground(new java.awt.Color(238, 238, 238));
        mainPanel.setEnabled(false);
        mainPanel.setFocusable(false);
        userInfoPanel.setBackground(new java.awt.Color(255, 255, 255));
        userInfoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lblStudentNumber.setFont(new java.awt.Font("Tahoma", 0, 12));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblName.setText("Name");

        lblCurrentCGPA.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblCurrentCGPA.setText("Current CGPA:");

        lblCGPA.setFont(new java.awt.Font("Tahoma", 0, 12));

        lblStudNumText.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblStudNumText.setText("Student Number:");

        lbl_userId.setFont(new java.awt.Font("Tahoma", 0, 12));
        lbl_userId.setText("User ID");

        org.jdesktop.layout.GroupLayout userInfoPanelLayout = new org.jdesktop.layout.GroupLayout(userInfoPanel);
        userInfoPanel.setLayout(userInfoPanelLayout);
        userInfoPanelLayout.setHorizontalGroup(
            userInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(userInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(userInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblName)
                    .add(lbl_userId))
                .add(216, 216, 216)
                .add(userInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblStudNumText)
                    .add(lblCurrentCGPA))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(userInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblCGPA, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .add(lblStudentNumber))
                .addContainerGap())
        );
        userInfoPanelLayout.setVerticalGroup(
            userInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(userInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(userInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblName)
                    .add(lblStudNumText)
                    .add(lblStudentNumber))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(userInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblCurrentCGPA)
                    .add(lblCGPA, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lbl_userId))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabsPane.setBackground(new java.awt.Color(238, 238, 238));
        TabsPane.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        TabsPane.setName("");
        TabsPane.setOpaque(true);
        TabsPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TabsPaneStateChanged(evt);
            }
        });

        tabSemesters.setBackground(java.awt.SystemColor.window);
        scrollSemesters.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tableSemesters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Season", "Year", "SGPA"})
        {

            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

        });
        tableSemesters.setToolTipText("Double-Click to see Courses under this Semester");
        tableSemesters.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableSemestersKeyReleased(evt);
            }
        });
        tableSemesters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSemestersMouseClicked(evt);
            }
        });

        scrollSemesters.setViewportView(tableSemesters);

        org.jdesktop.layout.GroupLayout tabSemestersLayout = new org.jdesktop.layout.GroupLayout(tabSemesters);
        tabSemesters.setLayout(tabSemestersLayout);
        tabSemestersLayout.setHorizontalGroup(
            tabSemestersLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tabSemestersLayout.createSequentialGroup()
                .addContainerGap()
                .add(scrollSemesters, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabSemestersLayout.setVerticalGroup(
            tabSemestersLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tabSemestersLayout.createSequentialGroup()
                .addContainerGap()
                .add(scrollSemesters, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );
        TabsPane.addTab("Semesters", tabSemesters);

        tabCourses.setBackground(java.awt.SystemColor.window);
        tableCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Department", "Number", "Percent Mark", "Letter Grade", "Complete"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCourses.setToolTipText("Double-Click to see Course Items under this Course");
        tableCourses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableCoursesKeyReleased(evt);
            }
        });
        tableCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCoursesMouseClicked(evt);
            }
        });

        scrollCourses.setViewportView(tableCourses);

        jLabel1.setText("Current Semester:");

        org.jdesktop.layout.GroupLayout tabCoursesLayout = new org.jdesktop.layout.GroupLayout(tabCourses);
        tabCourses.setLayout(tabCoursesLayout);
        tabCoursesLayout.setHorizontalGroup(
            tabCoursesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tabCoursesLayout.createSequentialGroup()
                .addContainerGap()
                .add(tabCoursesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(tabCoursesLayout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lblCurrentSem1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 174, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(scrollCourses, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabCoursesLayout.setVerticalGroup(
            tabCoursesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tabCoursesLayout.createSequentialGroup()
                .addContainerGap()
                .add(tabCoursesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(lblCurrentSem1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(scrollCourses, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );
        TabsPane.addTab("Courses", tabCourses);

        tabCourseItems.setBackground(java.awt.SystemColor.window);
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
        tableCourseItems.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableCourseItemsKeyReleased(evt);
            }
        });
        tableCourseItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCourseItemsMouseClicked(evt);
            }
        });

        scrollCourseItems.setViewportView(tableCourseItems);

        jLabel2.setText("Current Semester:");

        jLabel4.setText("Current Course:");

        org.jdesktop.layout.GroupLayout tabCourseItemsLayout = new org.jdesktop.layout.GroupLayout(tabCourseItems);
        tabCourseItems.setLayout(tabCourseItemsLayout);
        tabCourseItemsLayout.setHorizontalGroup(
            tabCourseItemsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tabCourseItemsLayout.createSequentialGroup()
                .addContainerGap()
                .add(tabCourseItemsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(tabCourseItemsLayout.createSequentialGroup()
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lblCurrentSem2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(16, 16, 16)
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lblCurrentCourse, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                    .add(scrollCourseItems, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabCourseItemsLayout.setVerticalGroup(
            tabCourseItemsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tabCourseItemsLayout.createSequentialGroup()
                .addContainerGap()
                .add(tabCourseItemsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(lblCurrentSem2)
                    .add(jLabel4)
                    .add(lblCurrentCourse))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(scrollCourseItems, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );
        TabsPane.addTab("Course Items", tabCourseItems);

        lbl_nextUndo.setForeground(new java.awt.Color(102, 102, 102));
        lbl_nextUndo.setToolTipText("Click here to undo this action");
        lbl_nextUndo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_nextUndo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                undoLBLMouseClick(evt);
            }
        });

        lbl_redoNext.setForeground(new java.awt.Color(102, 102, 102));
        lbl_redoNext.setToolTipText("Click here to redo this action");
        lbl_redoNext.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_redoNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redoLblMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout mainPanelLayout = new org.jdesktop.layout.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(TabsPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .add(userInfoPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(mainPanelLayout.createSequentialGroup()
                        .add(lbl_nextUndo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 261, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 16, Short.MAX_VALUE)
                        .add(lbl_redoNext, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 249, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        mainPanelLayout.linkSize(new java.awt.Component[] {lbl_nextUndo, lbl_redoNext}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, mainPanelLayout.createSequentialGroup()
                .add(userInfoPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TabsPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 310, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(11, 11, 11)
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lbl_redoNext, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lbl_nextUndo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonToolBar.setBackground(new java.awt.Color(255, 255, 255));
        buttonToolBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        buttonToolBar.setFloatable(false);
        buttonToolBar.setToolTipText("");
        btn_newSem.setBackground(new java.awt.Color(255, 255, 255));
        btn_newSem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons/addSemester.png")));
        btn_newSem.setToolTipText("Add Semester");
        btn_newSem.setBorder(null);
        btn_newSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newSemActionPerformed(evt);
            }
        });

        buttonToolBar.add(btn_newSem);

        btn_newCourse.setBackground(new java.awt.Color(255, 255, 255));
        btn_newCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons/addCourse.png")));
        btn_newCourse.setToolTipText("Add Course");
        btn_newCourse.setBorder(null);
        btn_newCourse.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons/addCourse_disabled.png")));
        btn_newCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newCourseActionPerformed(evt);
            }
        });

        buttonToolBar.add(btn_newCourse);

        btn_newCItem.setBackground(new java.awt.Color(255, 255, 255));
        btn_newCItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons/addCourseItem.png")));
        btn_newCItem.setToolTipText("Add Course Item");
        btn_newCItem.setBorder(null);
        btn_newCItem.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons/addCourseItem_disabled.png")));
        btn_newCItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newCItemActionPerformed(evt);
            }
        });

        buttonToolBar.add(btn_newCItem);

        btn_save.setBackground(new java.awt.Color(255, 255, 255));
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons/save.png")));
        btn_save.setToolTipText("Save");
        btn_save.setBorder(null);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        buttonToolBar.add(btn_save);

        buttonToolBar.add(jLabel3);

        btn_search.setBackground(new java.awt.Color(255, 255, 255));
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons/search.png")));
        btn_search.setToolTipText("Search and Compare");
        btn_search.setBorder(null);
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        buttonToolBar.add(btn_search);

        menuBar.setBorder(null);
        fileMenu.setText("File");
        fileMenu_newProfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        fileMenu_newProfile.setText("Create New Profile");
        fileMenu_newProfile.setToolTipText("Create a new user profile");
        fileMenu_newProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenu_newProfileActionPerformed(evt);
            }
        });

        fileMenu.add(fileMenu_newProfile);

        fileMenu_loadProfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        fileMenu_loadProfile.setText("Load A Profile");
        fileMenu_loadProfile.setToolTipText("Load an existing user profile");
        fileMenu_loadProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenu_loadProfileActionPerformed(evt);
            }
        });

        fileMenu.add(fileMenu_loadProfile);

        fileMenu_saveProfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        fileMenu_saveProfile.setText("Save Profile");
        fileMenu_saveProfile.setToolTipText("Save current user profile");
        fileMenu_saveProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenu_saveProfileActionPerformed(evt);
            }
        });

        fileMenu.add(fileMenu_saveProfile);

        fileMenu.add(fileMenu_separator);

        fileMenu_printTranscript.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        fileMenu_printTranscript.setText("Print Transcript");
        fileMenu_printTranscript.setToolTipText("Print unofficial transcript");
        fileMenu_printTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenu_printTranscriptActionPerformed(evt);
            }
        });

        fileMenu.add(fileMenu_printTranscript);

        fileMenu_ExportTrascript.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        fileMenu_ExportTrascript.setText("Export Transcript");
        fileMenu_ExportTrascript.setToolTipText("Export unofficial transcript as a text file");
        fileMenu_ExportTrascript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenu_ExportTrascriptActionPerformed(evt);
            }
        });

        fileMenu.add(fileMenu_ExportTrascript);

        fileMenu.add(fileMenu_separator2);

        fileMenu_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        fileMenu_exit.setText("Exit");
        fileMenu_exit.setToolTipText("Exit Personal Gradebook");
        fileMenu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenu_exitActionPerformed(evt);
            }
        });

        fileMenu.add(fileMenu_exit);

        menuBar.add(fileMenu);

        editMenu.setText("Edit");
        editMenu_undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        editMenu_undo.setText("Undo");
        editMenu_undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenu_undoActionPerformed(evt);
            }
        });

        editMenu.add(editMenu_undo);

        editMenu_redo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        editMenu_redo.setText("Redo");
        editMenu_redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenu_redoActionPerformed(evt);
            }
        });

        editMenu.add(editMenu_redo);

        editMenu.add(editMenu_separator);

        editMenu_semesterSubMenu.setText("Semester");
        editMenu_semesterSubMenu.setToolTipText("");
        semesterSubMenu_add.setText("Add");
        semesterSubMenu_add.setToolTipText("Add a new Semester");
        semesterSubMenu_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterSubMenu_addActionPerformed(evt);
            }
        });

        editMenu_semesterSubMenu.add(semesterSubMenu_add);

        semesterSubMenu_remove.setText("Remove");
        semesterSubMenu_remove.setToolTipText("Remove selected Semester");
        semesterSubMenu_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterSubMenu_removeActionPerformed(evt);
            }
        });

        editMenu_semesterSubMenu.add(semesterSubMenu_remove);

        semesterSubMenu_edit.setText("Edit");
        semesterSubMenu_edit.setToolTipText("Edit selected Semester");
        semesterSubMenu_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterSubMenu_editActionPerformed(evt);
            }
        });

        editMenu_semesterSubMenu.add(semesterSubMenu_edit);

        editMenu_semesterSubMenu.add(semesterubMenu_separator);

        semesterSubMenu_projectGPA.setText("Project GPA");
        semesterSubMenu_projectGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterSubMenu_projectGPAActionPerformed(evt);
            }
        });

        editMenu_semesterSubMenu.add(semesterSubMenu_projectGPA);

        editMenu.add(editMenu_semesterSubMenu);

        editMenu_courseSubMenu.setText("Course");
        editMenu_courseSubMenu.setToolTipText("");
        courseSubMenu_add.setText("Add");
        courseSubMenu_add.setToolTipText("Add a new Course");
        courseSubMenu_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseSubMenu_addActionPerformed(evt);
            }
        });

        editMenu_courseSubMenu.add(courseSubMenu_add);

        courseSubMenu_remove.setText("Remove");
        courseSubMenu_remove.setToolTipText("Remove Selected Course");
        courseSubMenu_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseSubMenu_removeActionPerformed(evt);
            }
        });

        editMenu_courseSubMenu.add(courseSubMenu_remove);

        courseSubMenu_edit.setText("Edit");
        courseSubMenu_edit.setToolTipText("Edit selected Course");
        courseSubMenu_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseSubMenu_editActionPerformed(evt);
            }
        });

        editMenu_courseSubMenu.add(courseSubMenu_edit);

        editMenu_courseSubMenu.add(courseSubMenu_separator);

        courseSubMenu_createTemplate.setText("Export Course as Template");
        courseSubMenu_createTemplate.setToolTipText("Save selected Course as a Template");
        courseSubMenu_createTemplate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseSubMenu_createTemplateActionPerformed(evt);
            }
        });

        editMenu_courseSubMenu.add(courseSubMenu_createTemplate);

        courseSubMenu_loadTemplate.setText("Add Course via Template");
        courseSubMenu_loadTemplate.setToolTipText("Load a Course from a Template");
        courseSubMenu_loadTemplate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseSubMenu_loadTemplateActionPerformed(evt);
            }
        });

        editMenu_courseSubMenu.add(courseSubMenu_loadTemplate);

        editMenu_courseSubMenu.add(courseSubMenu_separator2);

        courseSubMenu_setComplete.setText("Set Completion Status");
        courseSubMenu_setComplete.setToolTipText("Set selected Course as having been completed");
        courseSubMenu_setComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseSubMenu_setCompleteActionPerformed(evt);
            }
        });

        editMenu_courseSubMenu.add(courseSubMenu_setComplete);

        courseSubMenu_setRange.setText("Change Percent Range");
        courseSubMenu_setRange.setToolTipText("Specify custom percentage range for each letter grade in selected Course");
        courseSubMenu_setRange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseSubMenu_setRangeActionPerformed(evt);
            }
        });

        editMenu_courseSubMenu.add(courseSubMenu_setRange);

        editMenu_courseSubMenu.add(courseSubMenu_separator3);

        courseSubMenu_project.setText("Project Final Mark");
        courseSubMenu_project.setToolTipText("Project final mark with current performance");
        courseSubMenu_project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseSubMenu_projectActionPerformed(evt);
            }
        });

        editMenu_courseSubMenu.add(courseSubMenu_project);

        courseSubMenu_predict.setText("Predict Marks");
        courseSubMenu_predict.setToolTipText("Predict unmarked Course Items' marks to achieve a desired final grade");
        courseSubMenu_predict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseSubMenu_predictActionPerformed(evt);
            }
        });

        editMenu_courseSubMenu.add(courseSubMenu_predict);

        editMenu.add(editMenu_courseSubMenu);

        editMenu_courseitemSubMenu.setText("Course Item");
        editMenu_courseitemSubMenu.setToolTipText("");
        courseitemSubMenu_add.setText("Add");
        courseitemSubMenu_add.setToolTipText("Add a new Course Item");
        courseitemSubMenu_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseitemSubMenu_addActionPerformed(evt);
            }
        });

        editMenu_courseitemSubMenu.add(courseitemSubMenu_add);

        courseitemSubMenu_remove.setText("Remove");
        courseitemSubMenu_remove.setToolTipText("Remove selected Course Item");
        courseitemSubMenu_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseitemSubMenu_removeActionPerformed(evt);
            }
        });

        editMenu_courseitemSubMenu.add(courseitemSubMenu_remove);

        courseitemSubMenu_edit.setText("Edit");
        courseitemSubMenu_edit.setToolTipText("Edit selected Course Item");
        courseitemSubMenu_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseitemSubMenu_editActionPerformed(evt);
            }
        });

        editMenu_courseitemSubMenu.add(courseitemSubMenu_edit);

        editMenu_courseitemSubMenu.add(courseitemSubMenu_separator);

        courseitemSubMenu_setMarked.setText("Set As Marked");
        courseitemSubMenu_setMarked.setToolTipText("Enter achieved mark and set selected CourseItem as having been marked");
        courseitemSubMenu_setMarked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseitemSubMenu_setMarkedActionPerformed(evt);
            }
        });

        editMenu_courseitemSubMenu.add(courseitemSubMenu_setMarked);

        editMenu.add(editMenu_courseitemSubMenu);

        menuBar.add(editMenu);

        extrasMenu.setText("Extras");
        extrasMenu_calcCGPA.setText("Selectively Calculate CGPA");
        extrasMenu_calcCGPA.setToolTipText("Determine which Courses should be retaken to boost your CGPA");
        extrasMenu_calcCGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extrasMenu_calcCGPAActionPerformed(evt);
            }
        });

        extrasMenu.add(extrasMenu_calcCGPA);

        extrasMenu_showGPAChart.setText("View GPA Chart");
        extrasMenu_showGPAChart.setToolTipText("Compare your GPAs at the end of each Semester");
        extrasMenu_showGPAChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extrasMenu_showGPAChartActionPerformed(evt);
            }
        });

        extrasMenu.add(extrasMenu_showGPAChart);

        extrasMenu_showGradesGraph.setText("View Grades Graph");
        extrasMenu_showGradesGraph.setToolTipText("");
        extrasMenu_showGradesGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extrasMenu_showGradesGraphActionPerformed(evt);
            }
        });

        extrasMenu.add(extrasMenu_showGradesGraph);

        extrasMenu_search.setText("Search and Compare");
        extrasMenu_search.setToolTipText("Search and compare Semesters, Courses, Course Items");
        extrasMenu_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extrasMenu_searchActionPerformed(evt);
            }
        });

        extrasMenu.add(extrasMenu_search);

        menuBar.add(extrasMenu);

        optionsMenu.setText("Options");
        optionsMenu_password.setText("Change Password");
        optionsMenu_password.setToolTipText("Change current password");
        optionsMenu_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsMenu_passwordActionPerformed(evt);
            }
        });

        optionsMenu.add(optionsMenu_password);

        menuBar.add(optionsMenu);

        helpMenu.setText("Help");
        helpMenu_shortcuts.setText("Keyboard Shortcuts");
        helpMenu_shortcuts.setToolTipText("View keyboard shortcuts");
        helpMenu_shortcuts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenu_shortcutsActionPerformed(evt);
            }
        });

        helpMenu.add(helpMenu_shortcuts);

        helpMenu_teamBlank.setText("About Team Blank");
        helpMenu_teamBlank.setToolTipText("About Project NULL's developers");
        helpMenu_teamBlank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenu_teamBlankActionPerformed(evt);
            }
        });

        helpMenu.add(helpMenu_teamBlank);

        helpMenu_PG.setText("About Project Null");
        helpMenu_PG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenu_PGActionPerformed(evt);
            }
        });

        helpMenu.add(helpMenu_PG);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(buttonToolBar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
            .add(mainPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(buttonToolBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(mainPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void semesterSubMenu_projectGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterSubMenu_projectGPAActionPerformed
        double gpa = Main.round(getSelectedSemester().projectGPA(), 2);
        JOptionPane.showMessageDialog(this, "Projected GPA: " + gpa, "Projected GPA", 1);
    }//GEN-LAST:event_semesterSubMenu_projectGPAActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //Saves profile when the main window is closed
        try {
            NewStudentDialog.saveProfile(currentStudent);
        } catch (Exception e){
            System.out.println("EXCEPTION: MainFrame - saveProfile(currentStudent");
        }        
    }//GEN-LAST:event_formWindowClosing
    
    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        //Search button in button toolbar - calls the Search Dialog
        new SearchDialog(this).showDialog();
    }//GEN-LAST:event_btn_searchActionPerformed
    
    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        //Save button in button toolbar - saves current profile
        try {
            NewStudentDialog.saveProfile(currentStudent);
        } catch (Exception e){
            System.out.println("EXCEPTION: MainFrame - saveProfile(currentStudent");
        }
    }//GEN-LAST:event_btn_saveActionPerformed
    
    private void btn_newCItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newCItemActionPerformed
        //Add Course Item button in button toolbar - calls function to add new Course Item
        addCourseItem();
    }//GEN-LAST:event_btn_newCItemActionPerformed
    
    private void btn_newCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newCourseActionPerformed
        //Add Course button in button toolbar - calls function to add new Course
        addCourse();
    }//GEN-LAST:event_btn_newCourseActionPerformed
    
    private void btn_newSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newSemActionPerformed
        //Add Semester button in button toolbar - calls function to add new Semester
        addSemester();
    }//GEN-LAST:event_btn_newSemActionPerformed
    
    public static void hideLastColumn(JTable table) {
        //Hides last column of given table by setting min, max and preferred width to 0
        table.getColumnModel().getColumn(table.getColumnCount() - 1).setMinWidth(0);
        table.getColumnModel().getColumn(table.getColumnCount() - 1).setMaxWidth(0);
        table.getColumnModel().getColumn(table.getColumnCount() - 1).setPreferredWidth(0);
    }
    
    public void display(){
        //Displays this window
        this.setVisible(true);
    }
    
	private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            //Initializes the main window using initial values from the db
            this.mainPanel.setVisible(false);
            this.buttonToolBar.setVisible(false);
            Student student = LoginDialog.showDialog(this);
            if (student != null){
                currentStudent = student;
                updateUserInfo();
                notFirstLoad = true; //initial load complete
                refreshTables();
                this.mainPanel.setVisible(true);
                this.buttonToolBar.setVisible(true);
            }
	}//GEN-LAST:event_formWindowOpened
        
	private void fileMenu_newProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenu_newProfileActionPerformed
            //New profile in File menu - calls the handler to deal with when the user selects to create a new profile
            try {
                NewStudentDialog.saveProfile(currentStudent);
            } catch (Exception e){
                System.out.println("EXCEPTION: MainFrame - saveProfile(currentStudent");
            }
            Student student = NewStudentDialog.showDialog(this);
                if (student != null){
                    currentStudent = student;
                    updateUserInfo();
                    refreshSemestersTable();
                    TabsPane.setSelectedIndex(0);
                }
	}//GEN-LAST:event_fileMenu_newProfileActionPerformed
        
	private void fileMenu_loadProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenu_loadProfileActionPerformed
            //Load profile in File menu - calls the handler to deal with when the user selects to load a profile from a file
            try {
                NewStudentDialog.saveProfile(currentStudent);
            } catch (Exception e){
                System.out.println("EXCEPTION: MainFrame - saveProfile(currentStudent");
            }
            Student student = LoginDialog.showDialog(this);
            if (student != null){
                currentStudent = student;
                updateUserInfo();
                refreshSemestersTable();
                TabsPane.setSelectedIndex(0);
            }
	}//GEN-LAST:event_fileMenu_loadProfileActionPerformed
        
	private void fileMenu_saveProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenu_saveProfileActionPerformed
            //Save profile in File menu - Calls the handler to deal with when the user selects to save their current profile
            try {
                NewStudentDialog.saveProfile(currentStudent);
            } catch (Exception e){
                System.out.println("EXCEPTION: MainFrame - saveProfile(currentStudent");
            }
	}//GEN-LAST:event_fileMenu_saveProfileActionPerformed
        
	private void fileMenu_printTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenu_printTranscriptActionPerformed
            //Print transcript in File menu - calls the handler to print transcript
            TranscriptGenerator.printTranscript(currentStudent);
	}//GEN-LAST:event_fileMenu_printTranscriptActionPerformed
        
	private void fileMenu_ExportTrascriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenu_ExportTrascriptActionPerformed
            //Export transcript in File menu - calls the handler to show the export transcript dialog box
            JFileChooser chooser = new JFileChooser();
            chooser.showSaveDialog(this);
            File file = chooser.getSelectedFile();
            try {
                TranscriptGenerator.saveTranscript(currentStudent, file.getPath());
            } catch (Exception e){
                System.out.println("EXCEPTION: MainFrame - saveTranscript(currentStudent, file.getPath()");
            }
	}//GEN-LAST:event_fileMenu_ExportTrascriptActionPerformed
        
	private void fileMenu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenu_exitActionPerformed
            //Exit in File menu - Terminate the program :(
            System.exit(0);
	}//GEN-LAST:event_fileMenu_exitActionPerformed
        
        private void editMenu_undoActionPerformed(java.awt.event.ActionEvent evt) {
            //Undo in Edit menu - user called undo
            
            //make sure there is an available undo
            if(dbHistory.getNumUndos() > 0) {
                currentStudent = dbHistory.undo(currentStudent);
                
                //refresh data tables
                refreshTables();
                
                //refresh undo/redo display
                lbl_nextUndo.setText(dbHistory.getNextUndo());
                lbl_redoNext.setText(dbHistory.getNextRedo());
            }
        }
        
        private void editMenu_redoActionPerformed(java.awt.event.ActionEvent evt) {
            //Redo in Edit menu - user called redo
            
            //make sure there is an available redo
            if(dbHistory.getNumRedos() > 0) {
                currentStudent = dbHistory.redo(currentStudent);
                
                //refresh data tables
                refreshTables();
            }
        }
        
	private void semesterSubMenu_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterSubMenu_addActionPerformed
            //Add semester in Edit menu - calls the handler to deal with adding a new semester
            addSemester();
	}//GEN-LAST:event_semesterSubMenu_addActionPerformed
        
	private void semesterSubMenu_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterSubMenu_removeActionPerformed
        //Remove semester in Edit menu - calls the handler to deal with removing a selected semester
            removeSemester();
	}//GEN-LAST:event_semesterSubMenu_removeActionPerformed
        
	private void semesterSubMenu_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterSubMenu_editActionPerformed
            //Edit semester in Edit menu - calls the handler to deal with editing a selected semester
            EditSemesterDialog.showDialog(this);
            refreshTables();
	}//GEN-LAST:event_semesterSubMenu_editActionPerformed
        
	private void courseSubMenu_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseSubMenu_addActionPerformed
            //Add course in Edit menu - calls the handler to deal with adding a new course
            addCourse();
	}//GEN-LAST:event_courseSubMenu_addActionPerformed
        
	private void courseSubMenu_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseSubMenu_editActionPerformed
            //Edit course in Edit menu - calls the handler to deal with editing a selected course
            EditCourseDialog.showDialog(this);
            refreshTables();
	}//GEN-LAST:event_courseSubMenu_editActionPerformed
        
	private void courseSubMenu_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseSubMenu_removeActionPerformed
            //Remove course in Edit menu - calls the handler to deal with removing a selected course
            removeCourse();
	}//GEN-LAST:event_courseSubMenu_removeActionPerformed
        
	private void courseSubMenu_setCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseSubMenu_setCompleteActionPerformed
            //Set course as complete in Edit menu - calls the handler to deal with setting a selected course as
                //having been completed
            setCourseComplete();
    }//GEN-LAST:event_courseSubMenu_setCompleteActionPerformed
        
    private void courseSubMenu_setRangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseSubMenu_setRangeActionPerformed
        //Set course percentage range in Edit menu - calls the handler to deal with setting percentage
            //range for a course
        new SetPercentRangeDialog(this).showDialog();
        refreshTables();
	}//GEN-LAST:event_courseSubMenu_setRangeActionPerformed
    
	private void courseSubMenu_createTemplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseSubMenu_createTemplateActionPerformed
        //Create template in Edit menu - calls the handler to deal with creating a template out of a 
            //selected course
            createTemplate();
    }//GEN-LAST:event_courseSubMenu_createTemplateActionPerformed
        
    private void courseSubMenu_loadTemplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseSubMenu_loadTemplateActionPerformed
        //Load template in Edit menu - calls the handler to deal with loading a created template
        new LoadTemplateDialog(this).showDialog();
        refreshTables();
    }//GEN-LAST:event_courseSubMenu_loadTemplateActionPerformed
    
    private void courseSubMenu_projectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseSubMenu_projectActionPerformed
        //Project mark in Edit menu - calls the handler to deal with projecting final course mark
        double mark = Main.round(getSelectedCourse().projectFinalMark(), 2);
        JOptionPane.showMessageDialog(this, "Projected Final Mark: " + mark + "%", "Final Mark Projection", 1);
	}//GEN-LAST:event_courseSubMenu_projectActionPerformed
    
	private void courseSubMenu_predictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseSubMenu_predictActionPerformed
            //Predict mark in Edit menu - calls the handler to deal with predicting marks for unmarked course items
            new PredictMarksDialog(this).showDialog();
	}//GEN-LAST:event_courseSubMenu_predictActionPerformed
        
	private void courseitemSubMenu_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseitemSubMenu_addActionPerformed
            //Add course item in Edit menu - calls the handler to deal with adding a new course item
            addCourseItem();
	}//GEN-LAST:event_courseitemSubMenu_addActionPerformed
        
	private void courseitemSubMenu_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseitemSubMenu_removeActionPerformed
            //Remove course item in Edit menu - calls the handler to deal with removing a selected course item
            removeCourseItem();
	}//GEN-LAST:event_courseitemSubMenu_removeActionPerformed
        
	private void courseitemSubMenu_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseitemSubMenu_editActionPerformed
            //Edit course item in Edit menu - calls the handler to deal with editing a selected course item
            EditCourseItemDialog.showDialog(this);
            refreshTables();
	}//GEN-LAST:event_courseitemSubMenu_editActionPerformed
        
	private void courseitemSubMenu_setMarkedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseitemSubMenu_setMarkedActionPerformed
            //Set course item as mark in Edit menu - calls the handler to deal with setting a selected 
                //course item having been marked
            setCourseItemMarked();
	}//GEN-LAST:event_courseitemSubMenu_setMarkedActionPerformed
        
	private void extrasMenu_calcCGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extrasMenu_calcCGPAActionPerformed
            //Calc CGPA in Extras menu - calls the handler to deal with selectively calculating CGPA
            new CalcCGPADialog(this).showDialog();
	}//GEN-LAST:event_extrasMenu_calcCGPAActionPerformed
        
	private void extrasMenu_showGPAChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extrasMenu_showGPAChartActionPerformed
            //this method calls the handler to show the gpa plot
            BufferedImage image = currentStudent.drawGPAChart();
            new ViewGraphDialog(this, "View GPA Chart", image).showDialog();
	}//GEN-LAST:event_extrasMenu_showGPAChartActionPerformed
        
	private void extrasMenu_showGradesGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extrasMenu_showGradesGraphActionPerformed
            //this method calls the handler to show the grades graph
            BufferedImage image = currentStudent.drawGradesGraph();
            new ViewGraphDialog(this, "View Grades Graph", image).showDialog();
	}//GEN-LAST:event_extrasMenu_showGradesGraphActionPerformed
        
	private void extrasMenu_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extrasMenu_searchActionPerformed
            new SearchDialog(this).showDialog();
    }//GEN-LAST:event_extrasMenu_searchActionPerformed
        
    private void optionsMenu_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsMenu_passwordActionPerformed
        //this method calls the handler to deal with when the user selects to change their password
        new ChangePasswordDialog(this).showDialog();
	}//GEN-LAST:event_optionsMenu_passwordActionPerformed
    
	private void helpMenu_shortcutsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenu_shortcutsActionPerformed
            new KeyboardShortcutsDialog(this).showDialog();
	}//GEN-LAST:event_helpMenu_shortcutsActionPerformed
        
	private void helpMenu_PGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenu_PGActionPerformed
            //display the about Project Null dialog box
            new AboutProjectNullDialog(this).showDialog();
	}//GEN-LAST:event_helpMenu_PGActionPerformed
        
	private void helpMenu_teamBlankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenu_teamBlankActionPerformed
            //display the about team blank dialog box
            new TeamBlankDialog(this).showDialog();
	}//GEN-LAST:event_helpMenu_teamBlankActionPerformed
        
	private void semPopUp_addCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semPopUp_addCourseActionPerformed
            addCourse();
	}//GEN-LAST:event_semPopUp_addCourseActionPerformed
        
	private void semPopUp_addTemplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semPopUp_addTemplateActionPerformed
            new LoadTemplateDialog(this).showDialog();
            refreshTables();
	}//GEN-LAST:event_semPopUp_addTemplateActionPerformed
        
	private void semPopUp_removeSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semPopUp_removeSemesterActionPerformed
            removeSemester();
	}//GEN-LAST:event_semPopUp_removeSemesterActionPerformed
        
	private void semPopUp_editSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semPopUp_editSemesterActionPerformed
            EditSemesterDialog.showDialog(this);
            refreshSemestersTable();
	}//GEN-LAST:event_semPopUp_editSemesterActionPerformed
        
	private void coursePopUp_addCourseItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursePopUp_addCourseItemActionPerformed
            addCourseItem();
	}//GEN-LAST:event_coursePopUp_addCourseItemActionPerformed
        
	private void coursePopUp_editCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursePopUp_editCourseActionPerformed
            EditCourseDialog.showDialog(this);
            refreshCoursesTable();
	}//GEN-LAST:event_coursePopUp_editCourseActionPerformed
        
	private void coursePopUp_removeCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursePopUp_removeCourseActionPerformed
            removeCourse();
	}//GEN-LAST:event_coursePopUp_removeCourseActionPerformed
        
	private void coursePopUp_setCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursePopUp_setCompleteActionPerformed
            setCourseComplete();
	}//GEN-LAST:event_coursePopUp_setCompleteActionPerformed
        
	private void coursePopUp_setRangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursePopUp_setRangeActionPerformed
            new SetPercentRangeDialog(this).showDialog();
            refreshTables();
	}//GEN-LAST:event_coursePopUp_setRangeActionPerformed
        
        private void coursePopUp_createTemplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursePopUp_createTemplateActionPerformed
            createTemplate();
        }//GEN-LAST:event_coursePopUp_createTemplateActionPerformed
        
	private void coursePopUp_projectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursePopUp_projectActionPerformed
            double mark = Main.round(getSelectedCourse().projectFinalMark(), 2);
            JOptionPane.showMessageDialog(this, "Projected Final Mark: " + mark + "%", "Final Mark Projection", 1);
	}//GEN-LAST:event_coursePopUp_projectActionPerformed
        
	private void coursePopUp_predictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursePopUp_predictActionPerformed
            new PredictMarksDialog(this).showDialog();
	}//GEN-LAST:event_coursePopUp_predictActionPerformed
        
	private void courseItemPopUp_editItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseItemPopUp_editItemActionPerformed
            EditCourseItemDialog.showDialog(this);
            refreshTables();
	}//GEN-LAST:event_courseItemPopUp_editItemActionPerformed
        
	private void courseItemPopUp_removeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseItemPopUp_removeItemActionPerformed
            removeCourseItem();
	}//GEN-LAST:event_courseItemPopUp_removeItemActionPerformed
        
	private void courseItemPopUp_setMarkedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseItemPopUp_setMarkedActionPerformed
            setCourseItemMarked();
            updateUserInfo();
	}//GEN-LAST:event_courseItemPopUp_setMarkedActionPerformed
        
	private void TabsPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TabsPaneStateChanged
            if (notFirstLoad) { //to control not loading anything on initial load before logging in
                refreshTables();
            }
	}//GEN-LAST:event_TabsPaneStateChanged
        
	private void tableSemestersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableSemestersKeyReleased
            if (evt.getKeyCode() == KeyEvent.VK_DELETE){
                removeSemester();
            } else if (evt.getKeyCode() == KeyEvent.VK_INSERT){
                addCourse();
            } else if (evt.getKeyCode() == KeyEvent.VK_TAB){
                TabsPane.setSelectedIndex(1); // show Courses Tab
            }
	}//GEN-LAST:event_tableSemestersKeyReleased
        
	private void tableCoursesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableCoursesKeyReleased
            if (evt.getKeyCode() == KeyEvent.VK_DELETE){ //if delete key pressed
                removeCourse();
            } else if (evt.getKeyCode() == KeyEvent.VK_INSERT){ //if insert key pressed
                addCourseItem();
            } else if (evt.getKeyCode() == KeyEvent.VK_TAB){ //if enter key pressed
                TabsPane.setSelectedIndex(2); // show CourseItems Tabs
            }
	}//GEN-LAST:event_tableCoursesKeyReleased
        
	private void tableCourseItemsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableCourseItemsKeyReleased
            if (evt.getKeyCode() == KeyEvent.VK_DELETE){ //if delete key pressed
                removeCourseItem();
            }
	}//GEN-LAST:event_tableCourseItemsKeyReleased
        
	private void tableSemestersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSemestersMouseClicked
            setSelectedSemester();
            if (evt.getButton() == MouseEvent.BUTTON1){ //if only left mouse button clicked
                if (evt.getClickCount() == 2){ //if double-clicked
                    TabsPane.setSelectedIndex(1); // show Courses Tab
                }
            } else if (evt.getButton() == MouseEvent.BUTTON3){ //if only left mouse button clicked
                if (currentSemester != null){ //only show pop up when row selected
                    semPopUp.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }
	}//GEN-LAST:event_tableSemestersMouseClicked
        
	private void tableCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCoursesMouseClicked
            setSelectedCourse();
            if (evt.getButton() == MouseEvent.BUTTON1){ //if only left mouse button clicked
                if (evt.getClickCount() == 2){ //if double-clicked
                    TabsPane.setSelectedIndex(2); // show Course Items Tab
                }
            } else if (evt.getButton() == MouseEvent.BUTTON3){ //if only right mouse button clicked
                if (currentCourse !=null){ //only show pop up when row selected
                    setCourseContextMenu();
                    coursePopUp.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }
	}//GEN-LAST:event_tableCoursesMouseClicked
        
	private void tableCourseItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCourseItemsMouseClicked
            setSelectedCourseItem();
            if (evt.getButton() == MouseEvent.BUTTON3){ //if only left mouse button clicked
                if (currentCourseItem != null){ //only show pop up when row selected
                    setCourseItemContextMenu();
                    courseItemPopUp.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }
	}//GEN-LAST:event_tableCourseItemsMouseClicked
        
        private void setSelectedSemester(){
            int selection = tableSemesters.getSelectedRow();
            if (selection != -1){ //if a row is selected
                DefaultTableModel model = (DefaultTableModel)tableSemesters.getModel();
                String season = String.valueOf(model.getValueAt(selection, 0));
                int year = Integer.parseInt(String.valueOf(model.getValueAt(selection, 1)));
                currentSemester = currentStudent.getSemester(season, year);
                setSemesterMenu();
            }
        }
        
        private void setSelectedCourse(){
            int selection = tableCourses.getSelectedRow();
            if (selection != -1){ //if a row is selected
                DefaultTableModel model = (DefaultTableModel)tableCourses.getModel();
                String dept = String.valueOf(model.getValueAt(selection, 0));
                int number = Integer.parseInt(String.valueOf(model.getValueAt(selection, 1)));
                currentCourse = currentStudent.getSemester(currentSemester.getSeason(),
                        currentSemester.getYear()).getCourse(dept, number);
                setCourseMenu();
            }
        }
        
        private void setSelectedCourseItem(){
            int selection = tableCourseItems.getSelectedRow();
            if (selection != -1){ //if a row is selected
                DefaultTableModel model = (DefaultTableModel)tableCourseItems.getModel();
                String label = String.valueOf(model.getValueAt(selection, 0));
                currentCourseItem = currentStudent.getSemester(currentSemester.getSeason(),
                        currentSemester.getYear()).getCourse(currentCourse.getDepartment(),
                        currentCourse.getNumber()).getCourseItem(label);
                setCourseItemMenu();
            }
        }
        
        private void setSemesterMenu(){
            boolean bool = getSelectedSemester() != null;
            semesterSubMenu_remove.setEnabled(bool);
            semesterSubMenu_edit.setEnabled(bool);
            courseSubMenu_add.setEnabled(bool);
            courseSubMenu_loadTemplate.setEnabled(bool);
            btn_newCourse.setEnabled(bool);
            semesterSubMenu_projectGPA.setEnabled(bool);
        }
        
        private void setCourseMenu(){
            boolean bool = getSelectedCourse() != null;
            courseSubMenu_remove.setEnabled(bool);
            courseSubMenu_createTemplate.setEnabled(bool);
            courseSubMenu_setRange.setEnabled(bool);
            courseSubMenu_edit.setEnabled(bool);
            courseSubMenu_setComplete.setEnabled(bool);
            courseSubMenu_project.setEnabled(bool);
            courseSubMenu_predict.setEnabled(bool);
            courseitemSubMenu_add.setEnabled(bool);
            btn_newCItem.setEnabled(bool);
            
            if (bool) {
                boolean incomplete = !getSelectedCourse().isComplete();
                courseSubMenu_edit.setEnabled(incomplete);
                courseSubMenu_setComplete.setEnabled(incomplete);
                courseSubMenu_project.setEnabled(incomplete);
                courseSubMenu_predict.setEnabled(incomplete);
                courseitemSubMenu_add.setEnabled(incomplete);
                btn_newCItem.setEnabled(incomplete);
            }
        }
        
        private void setCourseItemMenu(){
            boolean bool = getSelectedCourseItem() != null;
            courseitemSubMenu_remove.setEnabled(bool);
            courseitemSubMenu_edit.setEnabled(bool);
            courseitemSubMenu_setMarked.setEnabled(bool);
            if (bool){
                boolean unmarked = !getSelectedCourseItem().isMarked();
                courseitemSubMenu_setMarked.setEnabled(unmarked);
            }
        }
        
        private void setCourseContextMenu(){
            boolean result = !currentCourse.isComplete();
            coursePopUp_editCourse.setEnabled(result);
            coursePopUp_setComplete.setEnabled(result);
            coursePopUp_addCourseItem.setEnabled(result);
            coursePopUp_predict.setEnabled(result);
            coursePopUp_project.setEnabled(result);
        }
        
        private void setCourseItemContextMenu(){
            boolean result = !currentCourseItem.isMarked();
            courseItemPopUp_setMarked.setEnabled(result);
        }
        
	private void undoLBLMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_undoLBLMouseClick
            //user clicked on the label to undo
            
            if (evt.getButton() == evt.BUTTON1) {
                //if user double-clicks with left mouse button
                if (dbHistory.getNumUndos() > 0) {
                    //make sure there is an available undo
                    currentStudent = dbHistory.undo(currentStudent);
                    refreshTables();
                }
            }
	}//GEN-LAST:event_undoLBLMouseClick
        
	private void redoLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redoLblMouseClicked
            //user clicked on the label to redo
            
            if (evt.getButton() == evt.BUTTON1 ){
                //if user double-clicks with left mouse button
                if (dbHistory.getNumRedos() > 0) {
                    //make sure there is an available redo
                    currentStudent = dbHistory.redo(currentStudent);
                    refreshTables();
                }
            }
    }//GEN-LAST:event_redoLblMouseClicked
        
        public void refreshUndoRedoDisplay() {
            //refresh undo/redo display
            lbl_nextUndo.setText(dbHistory.getNextUndo());
            lbl_redoNext.setText(dbHistory.getNextRedo());
        }
        
        public static HistoryManager getDBHistory() {//this method allows the history manager object storing undos to be passed to other classes
            return dbHistory;
            
        }
        
        public static Student getStudent(){
            //this method allows the currently open student object to be passed to other classes
            return currentStudent;
        }
        
        public static Semester getSelectedSemester(){
            return currentSemester;
        }
        
        public static Course getSelectedCourse(){
            return currentCourse;
        }
        
        public static CourseItem getSelectedCourseItem(){
            return currentCourseItem;
        }
        
        public static boolean isFirstLoad(){
            return !notFirstLoad;
        }
        
        private void updateSelectionLabels(){
            if (currentSemester == null){
                lblCurrentSem1.setText("None");
                lblCurrentSem2.setText("None");
            } else {
                lblCurrentSem1.setText(currentSemester.getSeason() + " " + currentSemester.getYear());
                lblCurrentSem2.setText(currentSemester.getSeason() + " " + currentSemester.getYear());
            }
            if (currentCourse == null){
                lblCurrentCourse.setText("None");
            } else {
                lblCurrentCourse.setText(currentCourse.getDepartment() + " " + currentCourse.getNumber());
            }
        }
        
        private void updateUserInfo(){
            //repopulate the user information label on the main form showing name, student id, and cgpa
            lblName.setText(currentStudent.getFName() + " " + currentStudent.getLName());
            lbl_userId.setText("(" + currentStudent.getUserID() + ")");
            lblStudentNumber.setText("" + currentStudent.getStudNumber());
            updateCGPA();
        }
        
        private void updateCGPA(){
            //this method updates the cgpa data label
            double cgpa = Main.round(currentStudent.getCGPA(), 2);
            lblCGPA.setText("" + cgpa);
            if (cgpa <= 2.0){
                lblCGPA.setForeground(Color.RED);
                lblCGPA.setToolTipText("Warning: Academic Probation");
            } else {
                lblCGPA.setForeground(Color.BLACK);
                lblCGPA.setToolTipText("");
            }
        }
        
        private void refreshTables(){
            int tabIndex = TabsPane.getSelectedIndex();
            if (tabIndex == 0){ //Semesters Tab
                refreshSemestersTable();
                currentSemester = null;
            } else if (tabIndex == 1){ //Courses Tab
                refreshCoursesTable();
                currentCourse = null;
            } else if (tabIndex == 2){ //Course Items Tab
                refreshCourseItemsTable();
                currentCourseItem = null;
            }
            updateCGPA();
            refreshUndoRedoDisplay();
            setSemesterMenu();
            setCourseMenu();
            setCourseItemMenu();
        }
        
        private void refreshSemestersTable(){
            //this method populates the table with semester data
            clearTable(tableSemesters);
            refreshUndoRedoDisplay();
            fillTable(tableSemesters, currentStudent.getSemesterData());
        }
        
        private void refreshCoursesTable(){
            //this method populates the table with courses data
            clearTable(tableCourses);
            updateSelectionLabels();
            refreshUndoRedoDisplay();
            if (currentSemester != null){ //if semester selected
                Object[] data = currentStudent.getSemester(currentSemester.getSeason(), currentSemester.getYear()).getCourseData();
                fillTable(tableCourses, data);
            } else {
                //show nothing
            }
        }
        
        private void refreshCourseItemsTable(){
            //this method populates the table with courses data
            clearTable(tableCourseItems);
            updateSelectionLabels();
            refreshUndoRedoDisplay();
            if (currentCourse != null){ //if Course selected
                Object[] data = currentStudent.getSemester(currentSemester.getSeason(),
                        currentSemester.getYear()).getCourse(currentCourse.getDepartment(),
                        currentCourse.getNumber()).getCourseItemData();
                fillTable(tableCourseItems, data);
            } else {
                //show nothing
            }
        }
        
        public static void clearTable(JTable table){
            //this method clears all items currently stored in the table currently displayed
            try {
                DefaultTableModel model = (DefaultTableModel)table.getModel();
                int size = model.getRowCount();
                for (int i = size - 1; i >=0; i--){
                    model.removeRow(i);
                }
                table.addNotify();
            } catch (Exception e){
                System.out.println("EXCEPTION: MainFrame - clearTable(JTable table)");
            }
        }
        
        public static void fillTable(JTable table, Object[] rows){
            //this method repopulates the table with items from the db
            try {
                DefaultTableModel model = (DefaultTableModel)table.getModel();
                for (int i = 0; i < rows.length; i++){
                    model.addRow((String[])rows[i]);
                }
                table.addNotify();
            } catch (Exception e){
                System.out.println("EXCEPTION: MainFrame - fillTable(JTable table, Object[] rows)");
            }
        }
        
        private void setCourseComplete(){
            int ans = JOptionPane.showConfirmDialog(this, "Are you sure you want to mark this course as completed?" +
                    " Your current mark will be used as your final mark.", "Set Completion Status", 1);
            if (ans == 0){ //if user answered yes
                dbHistory.studentEdited(currentStudent, "Set " + currentCourse.getDepartment() + " " + currentCourse.getNumber() + " Completion Status");
                currentCourse.setComplete();
                refreshTables();
            }
        }
        
        public static void setFileFilter(JFileChooser chooser){
            chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
                
                public boolean accept(File f) {
                    return f.isDirectory() || f.getName().toLowerCase().endsWith(".mark");
                }
                
                public String getDescription() {
                    return "Course Template Files";
                }
            });
            
        }
        
        private void createTemplate(){
            Course courseCopy = new Course(getSelectedCourse());
            initializeTemplateData(courseCopy);
            String name = courseCopy.getDepartment().toLowerCase() + courseCopy.getNumber();
            
            JFileChooser chooser = new JFileChooser();
            chooser.setSelectedFile(new File(name));
            setFileFilter(chooser);
            int result = chooser.showSaveDialog(this);
            try {
                if (result == chooser.APPROVE_OPTION){
                    String path = chooser.getSelectedFile().getPath();
                    if (!path.endsWith(".mark")) {
                        path += ".mark";
                    }
                    saveTemplate(courseCopy, path);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(this, "Unable to save template", "Error", 0);
            }
        }
        
        private void setCourseItemMarked(){
            String msg = "Enter the achieved mark on '"  + currentCourseItem.getLabel() + "'";
            String ans = JOptionPane.showInputDialog(this, msg, "Enter Achieved Mark", 3);
            try {
                if (ans != null) {
                    double value = Double.parseDouble(ans);
                    
                    //save for undo
                    dbHistory.studentEdited(currentStudent, "Set " + currentCourseItem.getLabel() + " as marked");
                    currentCourseItem.setStudentMark(value);
                    currentCourseItem.setMarked(true);
                    refreshTables();
                    
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(this, "Invalid Mark Entered", "Invalid Input", 0);
            }
        }
        
        private void initializeTemplateData(Course course){
            String[] arr = course.getAllCourseItemsNames();
            for (int i = 0; i < arr.length; i++){
                String label = (String) arr[i];
                CourseItem item = course.getCourseItem(label);
                item.setStudentMark(0.0);
                item.setMarked(false);
            }
        }
        
        private static String getDate(){
            Calendar calendar = new GregorianCalendar();
            Date date = calendar.getTime();
            DateFormat localFormat = DateFormat.getDateInstance();
            return localFormat.format(date);
        }
        
        private static void saveTemplate(Course course, String filename) throws IOException {
            //this method is the handler to deal with when the user selects to save a course template
            //filename += course.getDepartment() + course.getNumber() + ".mark";
            try {
                FileOutputStream out = new FileOutputStream(filename);
                ObjectOutputStream s = new ObjectOutputStream(out);
                s.writeObject(course);
                s.writeObject(getDate());
                s.flush();
                out.close();
            } catch (Exception e) {
                System.out.println("EXCEPTION: MainFrame - saveTemplate(Course course, String filename)");
            }
        }
        
        private void addSemester(){
            Semester semester = NewSemesterDialog.showDialog(this);
            if (semester != null){
                refreshTables();
            }
        }
        
        private void addCourse(){
            //this allows a course to be added as a row to the courses table
            Course course = NewCourseDialog.showDialog(this);
            if (course != null){
                refreshTables();
            }
        }
        
        private void addCourseItem() {
            //this allows a course item to be added as a row to the course item table
            CourseItem courseItem = NewCourseItemDialog.showDialog(this);
            if (courseItem != null){
                refreshTables();
            }
        }
        
        private void removeSemester(){
            //this method calls the handler to deal with when the user selects to remove a semester
            if (currentSemester != null){
                String msg = "Are you sure you want to remove '" + currentSemester.getSeason() + " " +
                        currentSemester.getYear() + "' Semester?";
                int ans = JOptionPane.showConfirmDialog(this, msg, "Remove Semester", 0);
                if (ans == 0) { //if user answered yes
                    DefaultTableModel model = (DefaultTableModel)tableSemesters.getModel();
                    
                    //save student profile for future undo
                    MainFrame.getDBHistory().studentEdited(currentStudent, "Remove Semester " + currentSemester.getSeason() + " " + currentSemester.getYear());
                    
                    model.removeRow(tableSemesters.getSelectedRow());
                    currentStudent.removeSemester(currentSemester.getSeason(), currentSemester.getYear());
                    refreshTables();
                    currentSemester = null;
                    currentCourse = null;
                }
            }
        }
        
        private void removeCourse(){
            //this method calls the handler to deal with when the user selects to remove a course item
            if (currentCourse !=null){
                String msg = "Are you sure you want to remove '" + currentCourse.getDepartment() + " " +
                        currentCourse.getNumber() + "' Course?";
                int ans = JOptionPane.showConfirmDialog(this, msg, "Remove Course", 0);
                if (ans == 0) { //if user answered yes
                    DefaultTableModel model = (DefaultTableModel)tableCourses.getModel();
                    
                    //save student profile for future undo
                    MainFrame.getDBHistory().studentEdited(currentStudent, "Remove Course " + currentCourse.getDepartment() + " " + currentCourse.getNumber());
                    
                    model.removeRow(tableCourses.getSelectedRow());
                    currentStudent.getSemester(currentSemester.getSeason(),
                            currentSemester.getYear()).removeCourse(currentCourse.getDepartment(),
                            currentCourse.getNumber());
                    refreshTables();
                    currentCourse = null;
                }
            }
        }
        
        private void removeCourseItem(){
            //this method calls the handler to deal with when the user selects to remove a course item
            //CourseItem removeCourseItem = RemoveCourseItemDialog.showDialog(this);
            if (currentCourseItem != null){
                String msg = "Are you sure you want to remove '" + currentCourseItem.getLabel() + "' Course Item?";
                int ans = JOptionPane.showConfirmDialog(this, msg, "Remove Course Item", 0);
                if (ans == 0) { //if user answered yes
                    DefaultTableModel model = (DefaultTableModel)tableCourseItems.getModel();
                    model.removeRow(tableCourseItems.getSelectedRow());
                    
                    //save student profile for future undo
                    MainFrame.getDBHistory().studentEdited(currentStudent, "Remove Course Item " + currentCourseItem.getLabel());
                    
                    currentStudent.getSemester(currentSemester.getSeason(),
                            currentSemester.getYear()).getCourse(currentCourse.getDepartment(),
                            currentCourse.getNumber()).removeCourseItem(currentCourseItem.getLabel());
                    refreshTables();
                    currentCourseItem = null;
                }
            }
        }
        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabsPane;
    private javax.swing.JButton btn_newCItem;
    private javax.swing.JButton btn_newCourse;
    private javax.swing.JButton btn_newSem;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JToolBar buttonToolBar;
    private javax.swing.JPopupMenu courseItemPopUp;
    private javax.swing.JMenuItem courseItemPopUp_editItem;
    private javax.swing.JMenuItem courseItemPopUp_removeItem;
    private javax.swing.JSeparator courseItemPopUp_separator;
    private javax.swing.JMenuItem courseItemPopUp_setMarked;
    private javax.swing.JPopupMenu coursePopUp;
    private javax.swing.JMenuItem coursePopUp_addCourseItem;
    private javax.swing.JMenuItem coursePopUp_createTemplate;
    private javax.swing.JMenuItem coursePopUp_editCourse;
    private javax.swing.JMenuItem coursePopUp_predict;
    private javax.swing.JMenuItem coursePopUp_project;
    private javax.swing.JMenuItem coursePopUp_removeCourse;
    private javax.swing.JSeparator coursePopUp_separator;
    private javax.swing.JSeparator coursePopUp_separator2;
    private javax.swing.JMenuItem coursePopUp_setComplete;
    private javax.swing.JMenuItem coursePopUp_setRange;
    private javax.swing.JMenuItem courseSubMenu_add;
    private javax.swing.JMenuItem courseSubMenu_createTemplate;
    private javax.swing.JMenuItem courseSubMenu_edit;
    private javax.swing.JMenuItem courseSubMenu_loadTemplate;
    private javax.swing.JMenuItem courseSubMenu_predict;
    private javax.swing.JMenuItem courseSubMenu_project;
    private javax.swing.JMenuItem courseSubMenu_remove;
    private javax.swing.JSeparator courseSubMenu_separator;
    private javax.swing.JSeparator courseSubMenu_separator2;
    private javax.swing.JSeparator courseSubMenu_separator3;
    private javax.swing.JMenuItem courseSubMenu_setComplete;
    private javax.swing.JMenuItem courseSubMenu_setRange;
    private javax.swing.JMenuItem courseitemSubMenu_add;
    private javax.swing.JMenuItem courseitemSubMenu_edit;
    private javax.swing.JMenuItem courseitemSubMenu_remove;
    private javax.swing.JSeparator courseitemSubMenu_separator;
    private javax.swing.JMenuItem courseitemSubMenu_setMarked;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu editMenu_courseSubMenu;
    private javax.swing.JMenu editMenu_courseitemSubMenu;
    private javax.swing.JMenuItem editMenu_redo;
    private javax.swing.JMenu editMenu_semesterSubMenu;
    private javax.swing.JSeparator editMenu_separator;
    private javax.swing.JMenuItem editMenu_undo;
    private javax.swing.JMenu extrasMenu;
    private javax.swing.JMenuItem extrasMenu_calcCGPA;
    private javax.swing.JMenuItem extrasMenu_search;
    private javax.swing.JMenuItem extrasMenu_showGPAChart;
    private javax.swing.JMenuItem extrasMenu_showGradesGraph;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileMenu_ExportTrascript;
    private javax.swing.JMenuItem fileMenu_exit;
    private javax.swing.JMenuItem fileMenu_loadProfile;
    private javax.swing.JMenuItem fileMenu_newProfile;
    private javax.swing.JMenuItem fileMenu_printTranscript;
    private javax.swing.JMenuItem fileMenu_saveProfile;
    private javax.swing.JSeparator fileMenu_separator;
    private javax.swing.JSeparator fileMenu_separator2;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem helpMenu_PG;
    private javax.swing.JMenuItem helpMenu_shortcuts;
    private javax.swing.JMenuItem helpMenu_teamBlank;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCGPA;
    private javax.swing.JLabel lblCurrentCGPA;
    private javax.swing.JLabel lblCurrentCourse;
    private javax.swing.JLabel lblCurrentSem1;
    private javax.swing.JLabel lblCurrentSem2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStudNumText;
    private javax.swing.JLabel lblStudentNumber;
    private javax.swing.JLabel lbl_nextUndo;
    private javax.swing.JLabel lbl_redoNext;
    private javax.swing.JLabel lbl_userId;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu optionsMenu;
    private javax.swing.JMenuItem optionsMenu_password;
    private javax.swing.JScrollPane scrollCourseItems;
    private javax.swing.JScrollPane scrollCourses;
    private javax.swing.JScrollPane scrollSemesters;
    private javax.swing.JPopupMenu semPopUp;
    private javax.swing.JMenuItem semPopUp_addCourse;
    private javax.swing.JMenuItem semPopUp_addTemplate;
    private javax.swing.JMenuItem semPopUp_editSemester;
    private javax.swing.JMenuItem semPopUp_removeSemester;
    private javax.swing.JSeparator semPopUp_separator;
    private javax.swing.JMenuItem semesterSubMenu_add;
    private javax.swing.JMenuItem semesterSubMenu_edit;
    private javax.swing.JMenuItem semesterSubMenu_projectGPA;
    private javax.swing.JMenuItem semesterSubMenu_remove;
    private javax.swing.JSeparator semesterubMenu_separator;
    private javax.swing.JPanel tabCourseItems;
    private javax.swing.JPanel tabCourses;
    private javax.swing.JPanel tabSemesters;
    private javax.swing.JTable tableCourseItems;
    private javax.swing.JTable tableCourses;
    private javax.swing.JTable tableSemesters;
    private javax.swing.JPanel userInfoPanel;
    // End of variables declaration//GEN-END:variables
    
}
