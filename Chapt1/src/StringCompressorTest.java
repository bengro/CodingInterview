import static org.junit.Assert.*;

import org.junit.Test;

public class StringCompressorTest {

	@Test
	public void test() {
		StringCompressor StringCompressorObj = new StringCompressor();
		
		String s = "aabccccaaa";
		String answer = StringCompressorObj.compress(s);
		String solution = "a2b1c4a3";
		System.out.println(answer);
		assertTrue(answer.equals(solution));
		
		String s2 = "abcdefg";
		String sol2 = "abcdefg";
		String ans2 = StringCompressorObj.compress(s2);
		System.out.println(ans2);
		assertTrue(ans2.equals(sol2));
	}

}
