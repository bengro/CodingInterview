/*
 * This stack implementation is based on unlimited substacks of arbitrary size.
 */
public class SetOfStacks {

	// linked list of all stacks
	Node head = null;
	Node tail = null; 
	int stack_size;
	
	public SetOfStacks(int size) {
		this.stack_size = size;
	}
	
	int pop() {
		int temp = tail.stack.peek();
		int status = tail.stack.pop();
		if(status == -1) {	// underflow
			System.out.println("Removing stack, tapping preceding one.");
			if(tail.last == null) {
				head = null;
				tail = null;
				return -1;
			}
			else {
				tail = tail.last;
				temp = tail.stack.peek();
				tail.stack.pop();
			}
		}
		return temp;
	}
	
	void push(int val) {
		if(head == null) {
			Stack newStack = new Stack(stack_size);
			Node node = new Node(newStack);
			head = node;
			tail = node;
		}
		int status = tail.stack.push(val);
		if(status == -1) {	//overflow
			Stack stack = new Stack(stack_size);
			Node newNode = new Node(stack);
			newNode.last = tail;
			tail = newNode;
			tail.stack.push(val);
			System.out.println("New stack created.");
		}
	}
	
}

class Node {
	Stack stack;
	Node last = null;
	
	Node(Stack stack) {
		this.stack = stack;
	}
}
