import junit.framework.TestCase;
import School.*;

public class SemesterTest extends TestCase {
	Semester sem1 = new Semester("Fall", 2006);
	Course completeCourse = new Course("CMPT", 275, 4, "A+");
	Course incompleteCourse = new Course("CMPT", 354, 3);

	public void testCodeGenerator() {
		//Test method for setting semester code
		Semester sem2 = new Semester("Summer", 2006);
		int code = sem2.getCode();
		assertTrue(code == 1064);
	}

	public void testAddCourse() {
		//Test method for adding course to semester
		boolean check = sem1.addCourse(completeCourse);
		assertEquals("Check should be true", true, check);
		
		check = sem1.addCourse(incompleteCourse);
		assertEquals("Check should be true", true, check);
		
		check = sem1.addCourse(completeCourse);
		assertEquals("Check should be false", false, check);
		sem1.displayAllCourses();
	}

	public void testRemoveCourse() {
		//Test method for removing course from semester
		sem1.addCourse(completeCourse);
		sem1.addCourse(incompleteCourse);
		
		boolean check = sem1.removeCourse("CMPT", 275);
		assertEquals("Check should be true", true, check);
		
		check = sem1.removeCourse("HIST", 225);
		assertEquals("Check2 should be false", false, check);
	}

	public void testRemoveEmptyCourse() {
		//Test method for removing course from semester when there are no courses in list
		boolean check = true;
		check = sem1.removeCourse("CMPT", 275);
		assertEquals("Check1 should be true", false, check);
	}

	public void testGetCourse() {
		//Test method for getting course
		sem1.addCourse(completeCourse);
		Course course = sem1.getCourse("CMPT", 275);
		assertEquals("Courses should be equal", completeCourse, course);
	}

	public void testSetSeason() {
		//Test method for setting semester season
		sem1.setSeason("Spring");
		String season = sem1.getSeason();
		assertEquals("Season should be Spring", "Spring", season);

	}

	public void testSetYear() {
		//Test method for setting semester year
		sem1.setYear(2002);
		int year = sem1.getYear();
		assertEquals("Year should be 2002", 2002, year);
	}

	public void testGetSeason() {
		//Test method for getting semester season
		String season = sem1.getSeason();
		assertEquals("Season should be Fall", "Fall", season);
	}

	public void testGetYear() {
		//Test method for getting semester year
		int yr = sem1.getYear();
		assertEquals("Year should be 2006", 2006, yr);
	}

	public void testGetGPA() {
		//Test method for getting semester GPA
		sem1.addCourse(completeCourse);
		sem1.addCourse(incompleteCourse);
		double expected = ((4.33 * 4) + (4.33 * 3)) / 7;
		double gpa = sem1.getGPA();
		assertTrue(expected == gpa);
	}

	public void testGetCode() {
		//Test method for getting semester code
		int code = sem1.getCode();
		assertEquals("Code should be 1067", 1067, code);
	}

	public void testEditCourseItem() {
		//Test method for editing semester
		sem1.addCourse(completeCourse);
		sem1.addCourse(incompleteCourse);

		String newDept = "CMPT";
		int newNum = 300;
		double newCredits = 3.0;

		boolean result = sem1.editCourse(completeCourse, newDept, newNum, newCredits);
		assertEquals(true, result);

		newDept = incompleteCourse.getDepartment();
		newNum = incompleteCourse.getNumber();
		newCredits = incompleteCourse.getCredits();
		
		result = sem1.editCourse(completeCourse, newDept, newNum, newCredits);
		assertEquals(false, result);
	}

	public void testGetCourseIndex() {
		//Test method for getting semester index
		Course course1 = new Course("ABC", 000, 3);
		Course course3 = new Course("DEF", 000, 3);
		Course course4 = new Course("DEF", 001, 3);
		Course course2 = new Course("ABC", 001, 3);

		sem1.addCourse(course1);
		sem1.addCourse(course2);
		sem1.addCourse(course3);
		sem1.addCourse(course4);

		Course find = sem1.getCourseIndex(1);
		String dept = find.getDepartment();
		int number = find.getNumber();

		assertTrue(dept == "ABC" && number == 001);
	}
	
	public void testGetNumCourses(){
		//Test method for getting number of courses in a semester
		int num = sem1.getNumCourses();
		assertEquals(num, 0);
		
		sem1.addCourse(completeCourse);
		sem1.addCourse(incompleteCourse);
		num = sem1.getNumCourses();
		assertEquals(num, 2);
	}

	public static void main(String[] args) {
		junit.swingui.TestRunner.run(SemesterTest.class);
	}
}
