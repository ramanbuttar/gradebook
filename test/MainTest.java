import junit.framework.TestCase;
import GUI.Main;

public class MainTest extends TestCase {
	
	double num;
	String word;

	public void testRound() {
		//Test method for rounding a double number to desired number of decimal places
		num = 5.4654646546;
		assertEquals(Main.round(num, 2), 5.47);
		num = 419.046456465;
		assertEquals(Main.round(num, 1), 419.0);
		num = 6.405879;
		assertEquals(Main.round(num, 2), 6.41);
		num = 9.456646;
		assertEquals(Main.round(num, 5), 9.45665);
		num = 1346.4664;
		assertEquals(Main.round(num, 0), 1346.0);
		num = 54.5465;
		assertEquals(Main.round(num, 4), 54.5465);
		num = 7.4646557;
		assertEquals(Main.round(num, 2), 7.46);
		num = 5.005450;
		assertEquals(Main.round(num, 2), 5.01);
		num = 5.444444;
		assertEquals(Main.round(num, 4), 5.4444);
		num = 5.44445;
		assertEquals(Main.round(num, 4), 5.4445);
		num = 0.00000;
		assertEquals(Main.round(num, 2), 0.00);
	}
	
	public void testCapatalizeString() {
		//Test method for capatalizing any String
		word = "whatever";
		assertEquals(Main.capatalizeString(word), "Whatever");
		word = "add some spaces";
		assertEquals(Main.capatalizeString(word), "Add Some Spaces");
		word = "i am no. 1";
		assertEquals(Main.capatalizeString(word), "I Am No. 1");
		word = "email @hotmail.com";
		assertEquals(Main.capatalizeString(word), "Email @Hotmail.Com");
		word = "extra _underscore";
		assertEquals(Main.capatalizeString(word), "Extra _Underscore");
		word = "one more";
		assertEquals(Main.capatalizeString(word), "One More");
	}
	
	public static void main(String[] args) {
		junit.swingui.TestRunner.run(MainTest.class);
	}


}
