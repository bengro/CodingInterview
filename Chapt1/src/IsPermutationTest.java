import static org.junit.Assert.*;

import org.junit.Test;

public class IsPermutationTest {

	@Test
	public void test() {
		IsPermutation isPermutationObj = new IsPermutation();
		String s1 = "Hello I'm Ben.";
		String s2 = ".neB m'I olleH";
		
		boolean res1;
		res1 = isPermutationObj.isPermutationSorting(s1, s2);
		System.out.println(res1);
		assertTrue(res1);
		res1 = isPermutationObj.isPermutationBuckets(s1, s2);
		assertTrue(res1);
		
		String s3 = "Hello!";
		String s4 = "HELLO!";
		
		boolean res2;
		res2 = isPermutationObj.isPermutationSorting(s3, s4);
		assertFalse(res2);
		res2 = isPermutationObj.isPermutationBuckets(s3, s4);
		assertFalse(res2);
	}

}
