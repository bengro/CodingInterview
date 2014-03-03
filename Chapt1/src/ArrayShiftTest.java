import static org.junit.Assert.*;

import org.junit.Test;


public class ArrayShiftTest {

	@Test
	public void test() {
		ArrayShift ArrayShiftObj = new ArrayShift();
		String s1 = "Mr John Smith    ";
		String solution = "Mr%20John%20Smith";
		String answer = ArrayShiftObj.replace(s1);
		System.out.println(answer);
		assertTrue(solution.equals(answer));
	}

}
