import junit.framework.TestCase;
import School.*;

public class CourseTest extends TestCase {
	Course incompleteCourse = new Course("CMPT", 275, 4);
	Course completeCourse = new Course("MATH", 151, 3, "A+");
	CourseItem markedItem = new CourseItem("Midterm 1", 20, 40, 20);
	CourseItem unmarkedItem = new CourseItem("Final", 75, 50);
	CourseItem overTheTop = new CourseItem("Project", 100, 100);
	
	public void testAddCourseItem() {
		//Test method for adding a CourseItem
		int result = completeCourse.addCourseItem(markedItem);
		assertEquals("Items should be equal", 1, result);

		result = completeCourse.addCourseItem(markedItem);
		assertEquals("Items should be equal", 0, result);
		
		result = completeCourse.addCourseItem(overTheTop);
		assertEquals("Items should be equal", -1, result);

	}

	public void testRemoveCourseItem() {
		//Test method for removing a CourseItem
		completeCourse.addCourseItem(markedItem);
		boolean check = completeCourse.removeCourseItem(markedItem.getLabel());
		assertEquals("check should be true", true, check);
		
		check = completeCourse.removeCourseItem("some label");
		assertEquals("check should be true", false, check);
	}

	public void testSetandIsComplete() {
		//Test method for 'Course.setComplete()' and 'Course.isComplete()'
		boolean check = completeCourse.isComplete();
		assertTrue(check == true);
		
		check = incompleteCourse.isComplete();
		assertTrue(check == false);
	}
	

	public void testGetDepartment() {
		//Test method for getting Course department
		String dept = completeCourse.getDepartment();
		assertEquals("Department should be MATH", "MATH", dept);
		
		dept = incompleteCourse.getDepartment();
		assertEquals("Department should be CMPT", "CMPT", dept);
	}

	public void testGetNumber() {
		//Test method for getting Course number
		int num = completeCourse.getNumber();
		assertEquals("Number should be 151", 151, num);
		
		num = incompleteCourse.getNumber();
		assertEquals("Number should be 275", 275, num);
	}

	public void testGetMarkPercent() {
		//Test method for getting Course percent mark
		double mark = incompleteCourse.getMarkPercent();
		assertTrue(100.0 == mark);

	}

	public void testGetMarkLetter() {
		//Test method for getting Course letter grade
		String letter = completeCourse.getMarkLetter();
		assertEquals("Letter should be A+", "A+", letter);
	}

	public void testGetGradePoints() {
		//Test method for getting Course grade points
		double gp = completeCourse.getGradePoints();
		assertTrue((4.33*completeCourse.getCredits()) == gp);
	}

	public void testGetMarkStatus() {
		//Test method for getting Course status mark
		String status = "Fail";
		status = completeCourse.getMarkStatus();
		assertEquals("Status should be Pass", "Pass", status);
		
	}

	public void testGetCredits() {
		//Test method for getting Course credits
		double credits = completeCourse.getCredits();
		assertTrue(3.0 == credits);
	}

	public void testSetCredits() {
		//Test method for setting Course credits
		completeCourse.setCredits(3.0);
		double result = completeCourse.getCredits();
		assertEquals("Year should be 3.0", 3.0, result);
	}

	public void testSetDepartment(){
		//Test method for setting Course department
		completeCourse.setDepartment("KIN");
		String result = completeCourse.getDepartment();
		assertEquals("Year should be 3.0", "KIN", result);
	}
	
	public void testSetNumber(){
		//Test method for setting Course number
		completeCourse.setNumber(110);
		int result = completeCourse.getNumber();
		assertEquals("Year should be 3.0", 110, result);
	}

	public void testEditCourseItem(){
		//Test method for editing Course Item in Course
		completeCourse.addCourseItem(markedItem);
		completeCourse.addCourseItem(unmarkedItem);
		
		String newLabel = "Midterm 2";
		double newAcheivedMark = 33.0;
		double newTotalMark = 35.0;
		double newWeight = 25.0;
		
		boolean result = completeCourse.editCourseItem(markedItem, newLabel, newAcheivedMark, newTotalMark, newWeight);
		assertEquals(true, result);
				
		//nothing changed so true is returned
		result = completeCourse.editCourseItem(markedItem, newLabel, newAcheivedMark, newTotalMark, newWeight);
		assertEquals(true, result);
		
		result = completeCourse.editCourseItem(markedItem, unmarkedItem.getLabel(), newAcheivedMark, newTotalMark, newWeight);
		assertEquals(false, result);
		
	}
	
    public static void main(String[] args) {
        junit.swingui.TestRunner.run(CourseTest.class);
    }
}
