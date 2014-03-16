/*
 * This is a queue implemented with two stacks.
 */
public class MyQueue {

	Stack oldest = new Stack(100);
	Stack newest = new Stack(100);
	
	int dequeue() {
		if(oldest.isEmpty()) {
			while(!newest.isEmpty()) {
				oldest.push(newest.peek());
				newest.pop();
			}
		}
		if(oldest.isEmpty()) return -1;
		int temp = oldest.peek();
		oldest.pop();
		return temp;
	}
	
	void add(int val) {
		newest.push(val);
	}
	
}
