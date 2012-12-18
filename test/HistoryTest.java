/**
 * Trevor Choo - #200130530
 * CMPT 275 D100 - Team Blank
 * SFU Surrey Campus
 * March 21, 2006
 * ======================================================
 * NOTE: This JUnit class tests the functionality of the HistoryManager
 * class.
 */

import Features.HistoryInterface;
import Features.HistoryManager;
import junit.framework.TestCase;
import School.*;

public class HistoryTest extends TestCase
{

    public static void testUndo()
    {//basic testing of undo, make sure all student info can be undone
        HistoryInterface test = new HistoryManager();
        Student currentStudent = new Student("Testy", "Chang", 982948293, "testyc", "password");
        
        test.studentEdited(currentStudent, "First Name changed");
        currentStudent.setFName("Testies");

        test.studentEdited(currentStudent, "Last Name changed");
        currentStudent.setLName("Channer");
        
        test.studentEdited(currentStudent, "Student Number changed");
        currentStudent.setStudNumber(11111111);

        currentStudent = test.undo(currentStudent);
        assertTrue(currentStudent.getStudNumber() == 982948293);
        
        currentStudent = test.undo(currentStudent);
        assertTrue(currentStudent.getLName().equals("Chang"));

        //back to the original
        currentStudent = test.undo(currentStudent);
        assertTrue(currentStudent.getFName().equals("Testy"));
        
        assertTrue(test.getNumUndos() == 0);
    }
    
    public static void testRedo()
    {//basic testing of redo, make sure all student info can be redone if undone
        HistoryInterface test = new HistoryManager();
        Student currentStudent = new Student("Testy", "Chang", 982948293, "testyc", "password");
        
        test.studentEdited(currentStudent, "First Name changed");
        currentStudent.setFName("Testies");

        test.studentEdited(currentStudent, "Last Name changed");
        currentStudent.setLName("Channer");
        
        test.studentEdited(currentStudent, "Student Number changed");
        currentStudent.setStudNumber(11111111);
        
        test.studentEdited(currentStudent, "Password changed");
        currentStudent.changePassword("password", "password2");
        
        //undo all changes
        while(test.getNumUndos() > 0)
            currentStudent = test.undo(currentStudent);
        
        
        //back to the original
        assertTrue(currentStudent.getFName().equals("Testy"));
        assertTrue(currentStudent.getLName().equals("Chang"));
        assertTrue(currentStudent.getStudNumber() == 982948293);
        assertTrue(currentStudent.getUserID().equals("testyc"));
        assertTrue(currentStudent.getPassword().equals("password"));
        
        //redo all changes
        currentStudent = test.redo(currentStudent);
        assertTrue(currentStudent.getFName().equals("Testies"));
        
        currentStudent = test.redo(currentStudent);
        assertTrue(currentStudent.getLName().equals("Channer"));
        
        currentStudent = test.redo(currentStudent);
        assertTrue(currentStudent.getStudNumber() == 11111111);
        
        currentStudent = test.redo(currentStudent);
        assertTrue(currentStudent.getPassword().equals("password2"));
        
        assertTrue(test.getNumRedos() == 0);
        
    }
    
    public static void testSemesters()
    {//test undo and redo of semesters in the db
        HistoryInterface test = new HistoryManager();
        Student currentStudent = new Student("Testy", "Chang", 982948293, "testyc", "password");
        
        Semester fall2006 = new Semester("Fall", 2006);
        Semester spring2006 = new Semester("Spring", 2006);
        
        test.studentEdited(currentStudent, "Semester added");
        currentStudent.addSemester(fall2006);
        
        assertTrue(currentStudent.getNumSemesters() == 1);
        
        //undoing add
        currentStudent = test.undo(currentStudent);
        assertTrue(currentStudent.getNumSemesters() == 0);
        assertTrue(currentStudent.getSemester("Fall", 2006) == null);
        
        //readding fall, adding spring
        currentStudent = test.redo(currentStudent);
        
        test.studentEdited(currentStudent, "Semester added");
        currentStudent.addSemester(spring2006);
        assertTrue(currentStudent.getSemester("Spring", 2006) != null);
        assertTrue(currentStudent.getSemester("Fall", 2006) != null);
        
        //remove both semesters
        test.studentEdited(currentStudent, "Semester removed");
        currentStudent.removeSemester("Fall", 2006);
        
        test.studentEdited(currentStudent, "Semester removed");
        currentStudent.removeSemester("Spring", 2006);
        
        assertTrue(currentStudent.getNumSemesters() == 0);
        
        //undo both deletions
        currentStudent = test.undo(currentStudent);
        currentStudent = test.undo(currentStudent);
        
        assertTrue(currentStudent.getSemester("Spring", 2006) != null);
        assertTrue(currentStudent.getSemester("Fall", 2006) != null);
        
        currentStudent = test.redo(currentStudent);
        currentStudent = test.redo(currentStudent);
        
        //redo both deletions
        assertTrue(currentStudent.getSemester("Spring", 2006) == null);
        assertTrue(currentStudent.getSemester("Fall", 2006) == null);
        
        //undo one deletion but edit firstname, so no redos are possible
        currentStudent = test.undo(currentStudent);
        assertTrue(currentStudent.getSemester("Spring", 2006) != null);
        
        test.studentEdited(currentStudent, "First Name changed");
        currentStudent.setFName("Tester");
    }
    
    public static void testCourses()
    {//test undo and redo of adding courses in db
        HistoryInterface test = new HistoryManager();
        Student currentStudent = new Student("Testy", "Chang", 982948293, "testyc", "password");
        
        Semester fall2006 = new Semester("Fall", 2006);
                
        //add semester to student
        test.studentEdited(currentStudent, "Semester added");
        currentStudent.addSemester(fall2006);
        
        //create new course and add to student
        test.studentEdited(currentStudent, "Course added");
        Course cmpt275 = new Course("CMPT", 275, 4.0);
        currentStudent.getSemester("Fall", 2006).addCourse(cmpt275);

        //check that course is in the database
        assertTrue(currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275) != null);
        
        //undo course add
        currentStudent = test.undo(currentStudent);
        
        //check course doesnt exist anymore!
        assertTrue(currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275) == null);
        
        //redo course add
        currentStudent = test.redo(currentStudent);
        assertTrue(currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275) != null);
    }
    
    public static void testCourseItems()
    {//test undo and redo of adding and removing course items from the db
        HistoryInterface test = new HistoryManager();
        Student currentStudent = new Student("Testy", "Chang", 982948293, "testyc", "password");
        
        Semester fall2006 = new Semester("Fall", 2006);
        Course cmpt275 = new Course("CMPT", 275, 4.0);
        CourseItem asn1 = new CourseItem("Assignment 1", 10, 20, 10.0);
        CourseItem asn2 = new CourseItem("Assignment 2", 30, 40, 20.0);
        
        //add semester to student
        test.studentEdited(currentStudent, "Semester added");
        currentStudent.addSemester(fall2006);
        
        //add course to student
        test.studentEdited(currentStudent, "Course added");
        currentStudent.getSemester("Fall", 2006).addCourse(cmpt275);
        
        //add asn1 to cmpt275
        test.studentEdited(currentStudent, "CourseItem added");
        currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275).addCourseItem(asn1);
        
        //make sure asn1 was added
        assertTrue(currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275).getCourseItem("Assignment 1") != null);
        
        //add asn2 to cmpt275
        test.studentEdited(currentStudent, "CourseItem added");
        currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275).addCourseItem(asn2);
        
        //make sure asn1 exists and asn2 was added
        assertTrue(currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275).getCourseItem("Assignment 1") != null);
        assertTrue(currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275).getCourseItem("Assignment 2") != null);
        
        //undo add asn2
        currentStudent = test.undo(currentStudent);
        assertTrue(currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275).getCourseItem("Assignment 1") != null);
        assertTrue(currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275).getCourseItem("Assignment 2") == null);
        
        //undo add asn1
        currentStudent = test.undo(currentStudent);
        assertTrue(currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275).getCourseItem("Assignment 1") == null);
        assertTrue(currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275).getCourseItem("Assignment 2") == null);
        
        //undo add cmpt275
        currentStudent = test.undo(currentStudent);
        assertTrue(currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275) == null);
        
        //undo add fall 2006
        currentStudent = test.undo(currentStudent);
        assertTrue(currentStudent.getSemester("Fall", 2006) == null);
        
        //redo everything and get back to asn1 and 2 existing
        while(test.getNumRedos() > 0)
            currentStudent = test.redo(currentStudent);
        
        //make sure everything exits and asn1 and 2 exist
        assertTrue(currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275).getCourseItem("Assignment 1").getStudentMark() == 10.0);
        assertTrue(currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275).getCourseItem("Assignment 2") != null);
        
        //edit student mark for assignment 1
        test.studentEdited(currentStudent, "CourseItem Student Mark changed");
        currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275).getCourseItem("Assignment 1").setStudentMark(5.0);
        
        //make sure the assignment 1 was edited
        assertTrue(currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275).getCourseItem("Assignment 1").getStudentMark() == 5.0);
        
        //undo and check to make sure assignment 1 is back to original
        currentStudent = test.undo(currentStudent);
        assertTrue(currentStudent.getSemester("Fall", 2006).getCourse("CMPT", 275).getCourseItem("Assignment 1").getStudentMark() == 10.0);
    }
    
    public static void main(String[] args)
    {
        junit.swingui.TestRunner.run(HistoryTest.class);
    }
}
