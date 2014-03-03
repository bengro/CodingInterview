import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author bengro
 *
 */
public class UniqueCharsTest {

	@Test
	public void test() {
		UniqueChars testObj = new UniqueChars();
		
		String s1 = "Hello I'm a test.";
		String s2 = "abcdefghijklmnopqrstuvxyz";
		
		boolean res1 = testObj.isUniqueHashmap(s1);
		assertFalse("Correct - not unique Hashmap", res1);
		
		boolean res2 = testObj.isUniqueHashmap(s2);
		assertTrue("Correct - unique Hashmap", res2);
		
		boolean res3 = testObj.isUniqueInplace(s1);
		assertFalse("Correct - unique Hashmap", res3);
		
		boolean res4 = testObj.isUniqueInplace(s2);
		assertTrue("Correct - unique Hashmap", res4);
	}
}
