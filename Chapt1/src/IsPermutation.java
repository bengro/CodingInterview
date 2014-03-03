/*
 * Is a given string a permutation of another string?
 * Definition permutation: does a string contain the same characters 
 * and the same count of each character.
 * Can be solved in O(n log n) by sorting, or O(n) by creating buckets.
 */
public class IsPermutation {
	
	/*
	 * When sorting all characters we should obtain the same sequence for both strings.
	 * Additionally, if length is different they can't be permutations of each other.
	 */
	boolean isPermutationSorting(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		
		char[] s1Arr = s1.toCharArray();
		char[] s2Arr = s2.toCharArray();
		java.util.Arrays.sort(s1Arr);
		java.util.Arrays.sort(s2Arr);

		String newS1 = new String(s1Arr);
		String newS2 = new String(s2Arr);
		if(newS1.equals(newS2)) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * O(n) approach - "Bucket sort" similarity.
	 */
	boolean isPermutationBuckets(String s1, String s2) {
		int[] countsS1 = new int[256];
		int[] countsS2 = new int[256];
		
		if(s1.length() != s2.length()) return false;
		for(int i = 0; i < s1.length(); ++i) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			++countsS1[c1];
			++countsS2[c2];
		}
		
		for(int i = 0; i < countsS1.length; ++i) {
			if(countsS1[i] != countsS2[i]) return false;
		}
		return true;
	}
	
}
