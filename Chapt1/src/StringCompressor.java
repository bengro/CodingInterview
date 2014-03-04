/*
 * Method which compresses aabccccaaa into a2b1c4a3. 
 * If compressed string is not shorter than original, output original.
 */
public class StringCompressor {
	String compress(String s) {
		
		char[] chars = s.toCharArray();
		int count = 0;
		char lastChar = 0;
		StringBuffer answer = new StringBuffer();
		
		for(int i = 0; i < chars.length; ++i) {
			if(i == 0) {
				count = 1;
				lastChar = chars[i];
				continue;
			} 
			
			if(chars[i] == chars[i-1]) {
				++count;
			} else {
				if(answer.length() >= s.length()) return s;
				answer.append(lastChar);
				answer.append(count);
				count = 1;
				lastChar = chars[i];
			}
			
			if(i == chars.length - 1) {
				answer.append(lastChar);
				answer.append(count);
			}
		}
		
		return answer.toString();
	}
}
