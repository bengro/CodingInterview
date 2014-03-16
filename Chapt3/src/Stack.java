/*
 * Standard Stack implementation, based on Arrays.
 */
public class Stack {
	int[] array;
	int pointer = -1;
	int size; 
	
	public Stack(int size) {
		this.size = size;
		array = new int[size];
	}
	
	int pop() {
		boolean underflow = pointer < 0;
		if(underflow) return -1;
		--pointer;
		return 1;
	}
	
	int peek() {
		if(pointer == -1) return -1;
		return array[pointer];
	}
	
	int push(int val) {
		boolean overflow = pointer + 1 >= size;
		if(overflow) return -1;
		++pointer;
		array[pointer] = val;
		return 1;
	}
	
	boolean isEmpty() {
		if(pointer == -1) return true;
		else return false;
	}
}
