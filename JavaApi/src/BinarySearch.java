/*
 * Binary search on array.
 */
public class BinarySearch {

	int binarySearch(int[] array, int left, int right, int x) {
		while(left <= right) {
			int mid = (left+right)/2;
			if(array[mid] == x) return mid;
			if(array[mid] < x) left = mid+1;
			if(array[mid] > x) right = mid-1;
		}
		return -1;
	}
	
	int bin(int[] array, int left, int right, int x) {
		
		if(left > right) return -1;
		int mid = (left+right)/2;
		int pivot = array[mid];
		
		if(pivot == x) return mid;
		else if(pivot < x) return bin(array, mid+1, right, x);
		else return bin(array, left, mid-1, x);
	}
	
}
