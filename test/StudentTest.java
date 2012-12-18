import junit.framework.TestCase;
import School.*;

public class StudentTest extends TestCase {
    Student student = new Student("Johnny", "Chase", 123456789, "jchase", "victory");
    Semester sem1 = new Semester("Fall", 2006);
    Semester sem2 = new Semester("Summer", 1999);
    Course course1 = new Course("CMPT", 275, 4);
    Course course2 = new Course("CMPT", 354, 3);
    
    public void testSetFName() {
        //Test method for 'Student.setFName(String)'
        student.setFName("Vinnie");
        String fName = student.getFName();
        assertEquals("First name should be Vinnie", "Vinnie", fName);
    }
    
    public void testSetLName() {
        //Test method for 'Student.setLName(String)'
        student.setLName("Drama");
        String lName = student.getLName();
        assertEquals("Last name should be Drama", "Drama", lName);
        
    }
    
    public void testSetStudNumber() {
        //Test method for 'Student.setStudNumber(long)'
        boolean check = false;
        boolean check2 = true;
        boolean check3 = true;
        boolean check4 = true;
        boolean check5 = true;
        long expected1 = 987654321;
        long expected2 = Long.MAX_VALUE;
        check = student.setStudNumber(expected1);
        
        long num = student.getStudNumber();
        
        assertEquals("Student num should be 987654321", expected1, num);
        
        check2 = student.setStudNumber(0);
        check3 = student.setStudNumber(-1);
        check4 = student.setStudNumber(Long.MAX_VALUE);
        check5 = student.setStudNumber(Long.MIN_VALUE);
        
        num = student.getStudNumber();
        assertEquals("Student num should be 987654321", expected2, num);
        assertEquals("Check1 should be true", true, check);
        assertEquals("Check2 should be false", false, check2);
        assertEquals("Check3 should be false", false, check3);
        assertEquals("Check4 should be true", true, check4);
        assertEquals("Check5 should be false", false, check5);
    }
    
    public void testNineDigStudNum(){
        //Test 9-digit Student numbers
        boolean check = false;
        for(long i=100000000; i<=100000100; i++){
            check = student.setStudNumber(i);
            if(check == false){
                System.out.print(i);
            }
            assertEquals("Check should assert True", true, check);
        }
    }
    
    public void testGetFName() {
        //Test method for 'Student.getFName()'
        String fName = student.getFName();
        assertEquals("First name should be Johnny", "Johnny", fName);
    }
    
    public void testGetLName() {
        //Test method for 'Student.getLName()'
        String lName = student.getLName();
        assertEquals("Last name should be Chase", "Chase", lName);
        
    }
    
    public void testGetStudNumber() {
        //Test method for 'Student.getStudNumber()'
        long num = student.getStudNumber();
        assertEquals("Student number should be 123456789", 123456789, num);
    }
    
    public void testGetSemester(){
        //Test method for 'Student.getSemester(season, year)'
        String season = sem1.getSeason();
        int year = sem1.getYear();
        assertEquals("Season should be Fall", "Fall", season);
        assertEquals("Year should be 2006", 2006, year);
    }
    
    public void testGetSemesterIndex(){
        //Test method for 'Student.getSemesterIndex(index)'
        student.addSemester(sem1);
        Semester sem = student.getSemesterIndex(0);
        assertEquals("Semester 0 should be Fall", "Fall", sem.getSeason());
        assertEquals("Semester 0 should be 2006", 2006, sem.getYear());
    }
    
    public void testAddSemester() {
        //Test method for 'Student.addSemester(Semester)'
        boolean check1 = false;
        boolean check2 = false;
        boolean check3 = true;
        check1 = student.addSemester(sem1);
        check2 = student.addSemester(sem2);
        check3 = student.addSemester(sem1);
        assertEquals("Check1 should be true", true, check1);
        assertEquals("Check2 should be true", true, check2);
        assertEquals("Check3 should be true", false, check3);
        
    }
    
    public void testRemoveSemester() {
        //Test method for 'Student.removeSemester(String, int)'
        boolean check1 = false;
        boolean check2 = false;
        boolean check3 = true;
        student.addSemester(sem1);
        student.addSemester(sem2);
        check1 = student.removeSemester("Fall", 2006);
        check2 = student.removeSemester("Summer", 1999);
        check3 = student.removeSemester("Fall", 2006);
        assertEquals("Check1 should be true", true, check1);
        assertEquals("Check2 should be true", true, check2);
        assertEquals("Check3 should be true", false, check3);
    }
    
    public void testRetreiveSemester() {
        //Test method for 'Student.retreiveSemester(String, int)'
        student.addSemester(sem1);
        Semester sem2 = student.getSemester("Fall", 2006);
        assertEquals("Semesters should be equal", sem2, sem1);
    }
    
    public void testNumSemeters() {
        //Test method for 'Student.displayAllSemeters()'
        student.addSemester(sem1);
        student.addSemester(sem2);
        int numSem = student.getNumSemesters();
        assertEquals("Student number should be 2", 2, numSem);
    }
    
    public void testGetUserID() {
        //Test method for 'Student.getUserID()'
        String uID = student.getUserID();
        assertTrue(uID == "jchase");
        assertFalse(uID == "JcHaSe");
        assertFalse(uID == "Jch$1#^ase");
    }
    
    public void testGetPassword() {
        //Test method for 'Student.getPassword()'
        String pass = student.getPassword();
        assertTrue(pass == "victory");
        assertFalse(pass == "Victory");
        assertFalse(pass == "VicTo$%#CrY");
    }
    
    public void testEditSemester(){
        //Test method for 'Student.editSemester()'
        student.addSemester(sem1);
        student.addSemester(sem2);
        
        boolean result = student.editSemester(sem2, sem1.getSeason(), sem1.getYear());
        assertEquals(false, result);
        
        String newSeason = "Fall";
        int newYear = 2007;
        
        result = student.editSemester(sem1, newSeason, newYear);
        assertEquals(true, result);
        
        Semester editedSem = student.getSemester(newSeason, newYear);
        
        result = student.editSemester(editedSem, newSeason, newYear);
        assertEquals(true, result);
    }
    
    public void testChangePassword(){
        //Test method for 'Student.changePassword()'
        String oldPass = "victory";
        String newPass = "temp";
        boolean result = student.changePassword(oldPass, newPass);
        assertEquals(true, result);
    }
    
    public static void main(String[] args) {
        junit.swingui.TestRunner.run(StudentTest.class);
    }
}
