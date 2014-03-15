/*
 * This class supports the managing of three stacks all based on the same array.
 * Assumption: All three stacks are allocated the same size.
 */
public class ThreeStacksOneArray {
	int[] array;
	int maxSize;
	int[] pointers = {-1, -1, -1};
	
	public ThreeStacksOneArray(int maxSize) {
		array = new int[maxSize];
		this.maxSize = maxSize;	
	}
	
	private int index(int stackId, int pos) {
		return stackId * (this.maxSize/3) + Math.max(0, pos);
	}
	
	int pop(int stackId) {
		boolean underflow = index(stackId, pointers[stackId]) <= stackId*(this.maxSize/3);
		if(underflow) {
			return pointers[stackId] = -1;
		}
		--pointers[stackId];
		return array[index(stackId, pointers[stackId]+1)];
	}
	
	void push(int stackId, int value) {
		// this condition treats all stacks the same and neglects a possible bigger last stack.
		boolean overflow = index(stackId, pointers[stackId]+1) >= (stackId+1)*(this.maxSize/3);	
		if(overflow) {
			System.out.println("Overflow occured.");
			return;
		}
		++pointers[stackId];
		array[index(stackId, pointers[stackId])] = value;
	}
	
	int peek(int stackId) {
		return array[index(stackId, pointers[stackId])];
	}
	
	void print(int stackId) {
		System.out.println("Printing values of stack " + stackId);
		for(int i = 0; i <= pointers[stackId]; ++i) {
			System.out.println(array[index(stackId, i)]);
		}
	}
	
}
