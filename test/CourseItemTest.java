import School.CourseItem;
import junit.framework.TestCase;

public class CourseItemTest extends TestCase {
	
	CourseItem markedItem = new CourseItem("assignment 1", 50, 100, 100);
	CourseItem unmarkedItem = new CourseItem("assignment 2", 100, 10);

	public void testSetLabel() {
		//Test method for setting and getting label
		markedItem.setLabel("midterm");
		String lab = markedItem.getLabel();
		assertEquals("Label should be midterm", "midterm", lab);
	}

	public void testSetStudentMark() throws Exception {
		//Test method for 'setting and getting student mark
		double mark = -1;
		for(double i = 0; i<=101; i += 0.5){
			markedItem.setStudentMark(i);
			mark = markedItem.getStudentMark();
			assertTrue(i == mark);
		}
		//double expected = 55;
		//item.setStudentMark(expected);
		//double mark = item.getStudentMark();
		//assertTrue(expected == mark);
	}

	public void testSetTotalMark() throws Exception {
		//Test method for setting and getting total mark
		double expected = 55;
		markedItem.setStudentMark(expected);
		double mark = markedItem.getStudentMark();
		assertTrue(expected == mark);
	}

	public void testSetWeight() {
		//Test method for setting and getting weight
		markedItem.setWeight(5.0);
		double weight = markedItem.getWeight();
		assertEquals("Weight should be 5.0", 5.0, weight);
	}
	
	public void testSetMarked(){
		//Test method for setting and getting marked
		boolean result = unmarkedItem.isMarked();
		assertEquals("Item should be unmarked", false, result);
		unmarkedItem.setMarked(true);
		result = unmarkedItem.isMarked();
		assertEquals("Item should be marked", true, result);
		
		result = markedItem.isMarked();
		assertEquals("Item should be marked", true, result);
		markedItem.setMarked(false);
		result = markedItem.isMarked();
		assertEquals("Item should be unmarked", false, result);
	}
	
    public static void main(String[] args) {
        junit.swingui.TestRunner.run(CourseItemTest.class);
    }
}
