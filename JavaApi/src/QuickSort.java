/*
 * Implements quick sort algorithm.
 */
public class QuickSort {
	
	int[] quickSort(int[] array, int left, int right) {
		int index = partition(array, left, right);
		if(left < index-1) {
			quickSort(array, left, index-1);
		}
		if(right > index) {
			quickSort(array, index, right);
		}
		return array;
	}
	
	/*
	 * Returns pointer to the right most sorted element.
	 */
	int partition(int[] array, int left, int right) {
		System.out.println("partition.");
		int pivot = array[(right + left) / 2];
		while(left <= right) {
			while(array[left] < pivot) ++left;
			while(array[right] > pivot) --right;
			if(left <= right) {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				++left;
				--right;
			}
			System.out.println("Checking left <= right " + left + " " + right);
		}
		System.out.println("Return: " + left);
		return left;
	}
	
}
