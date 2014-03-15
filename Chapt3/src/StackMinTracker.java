/*
 * This stack keeps track of the min element at any point.
 */
public class StackMinTracker {
	
	int[] array;
	int[] min_array;
	int minValue = Integer.MAX_VALUE;
	int pointer = -1;
	
	public StackMinTracker(int size) {
		array = new int[size];
		min_array = new int[size];
	}
	
	void push(int val) {
		if(pointer+1 == 100) {
			System.out.println("Overflow.");
			return;
		}
		++pointer;
		array[pointer] = val;
		minValue = Math.min(minValue, val);
		min_array[pointer] = minValue;
	}
	
	int pop() {
		if(pointer < 0) {
			System.out.println("Underflow.");
			return -1;
		}
		int temp = array[pointer];
		--pointer;
		return temp;
	}
	
	int min() {
		System.out.println("Current min value: " + min_array[pointer]);
		return min_array[pointer];
	}
}
