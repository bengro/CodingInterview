import java.util.HashMap;

/**
 * This class provides two methods to find out whether a string exists of unique chars.
 * @author bengro
 *
 */
public class UniqueChars {
	
	/*
	 * An array could be used instead. If we assume ASCII, we only have 256 indices to check.
	 */
	boolean isUniqueHashmap(String input) {
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
		for(int i = 0; i < input.length(); ++i) {
			char c = input.charAt(i);
			if(hMap.containsKey(c) && hMap.get(c) == 1) return false;
			hMap.put(c, 1);
		}
		return true;
	}
	
	/*
	 * Alternatively to bring runtime complexity down to O(n log n), we could sort the string and iterate over it once.
	 */
	boolean isUniqueInplace(String input) {
		for(int i = 0; i < input.length() - 1; ++i) {
			for(int j = i + 1; j < input.length(); ++j) {
				if(input.charAt(i) == input.charAt(j)) return false;
			}
		}
		return true;
	}
	
}
