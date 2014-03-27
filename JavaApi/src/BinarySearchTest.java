import static org.junit.Assert.*;

import org.junit.Test;


public class BinarySearchTest {

	@Test
	public void test() {
		BinarySearch bin = new BinarySearch();
		int[] array = {1,2, 5, 7, 10};
		int result = bin.binarySearch(array, 0, array.length-1, 10);
		System.out.println(result);
		
		int[] array2 = {1, 2, 5, 7, 10, 15};
		int result2 = bin.binarySearch(array2, 0, array.length-1, 7);
		System.out.println(result2);
		
		int result3 = bin.bin(array, 0, array.length-1, 7);
		System.out.println(result3);
		
		int result4 = bin.bin(array, 0, array.length-1, 7);
		System.out.println(result4);
		
	}

}
