import static org.junit.Assert.*;

import org.junit.Test;


public class QuickSortTest {

	@Test
	public void test() {
		QuickSort sort = new QuickSort();
		int[] array = {6, 1, 2, 3, 5};
		int[] sorted = sort.quickSort(array, 0, array.length-1);
		for(int i : sorted) {
			System.out.print(i + " ");
		}
	}

}
