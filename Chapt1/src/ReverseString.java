/**
 * This class contains two methods "reversing a string".
 * There are two ways to do it. 
 * We can change the underlying data by swapping chars, or we can simply output the reverse
 * order without moving data.
 * @author bengro
 *
 */
public class ReverseString {

	/*
	 * Outputting the reverse order of the string. Creates a new string.
	 */
	String outputReverseOrder(String input) {
		StringBuffer output = new StringBuffer();
		StringBackwardIterator iter = new StringBackwardIterator(input);
		while(iter.hasNext()) {
			Character c = iter.next();
			output.append(c.toString());
		}
		return output.toString();
	}
	
	/*
	 * Swapping elements. Reuses the existing string.
	 * Note: String are immutable in Java. You can't change them.
	 */
	String reverseString(String input) {
		char[] charArr = input.toCharArray();
		for(int i = 0; i < input.length() / 2; ++i) {
			int j = charArr.length - 1 - i;
			char temp = charArr[i];
			charArr[i] = charArr[j];
			charArr[j] = temp;
		}
		return new String(charArr);
	}
	
}

/*  
 * Forward iterator.
 */
class StringIterator {
	String s;
	int pos = 0;
	
	public StringIterator(String s) {
		this.s = s;
	}
	
	boolean hasNext() {
		if(pos < s.length()) return true;
		return false;
	}
	
	char next() {
		char c = s.charAt(pos);
		++pos;
		return c;
	}
}

/*
 * Backward iterator.
 */
class StringBackwardIterator {
	String s;
	int pos;
	
	public StringBackwardIterator(String s) {
		this.s = s;
		pos = s.length() - 1;
	}
	
	boolean hasNext() {
		if(pos >= 0) return true;
		return false;
	}
	
	char next() {
		char c = s.charAt(pos);
		--pos;
		return c;
	}
}