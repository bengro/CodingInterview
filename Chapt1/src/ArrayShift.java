/*
 * We are given a string (array). 
 * Every whitespace character must be replaced with following three chars %20.
 */
public class ArrayShift {
	String replace(String s) {
		char[] chars = s.toCharArray();
		for(int i = 0; i < s.length(); ++i) {
			if(chars[i] == ' ') {
				for(int j = s.length() - 3; j > i; --j) {
					chars[j+2] = chars[j];
				}
				chars[i] = '%';
				chars[i+1] = '2';
				chars[i+2] = '0';
			}
		}
		
		return new String(chars);
	}
}
