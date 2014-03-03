import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		ReverseString classObj = new ReverseString();
		
		// input
		String s1 = "Hello!";
		
		// correct answer
		String res1 = new StringBuilder(s1).reverse().toString();
		
		// output
		String output;
		output = classObj.outputReverseOrder(s1);
		assertTrue("Backward iterator not correct.", res1.equals(output));
		
		output = classObj.reverseString(s1);
		System.out.println(output);
		assertTrue("Swap approach not correct", res1.equals(output));
	}
	

}
