/*
 * This class provides a method for sorting a stack with just one additional stack.
 */
public class SortingStack {

	Stack sort(Stack s) {
		Stack r = new Stack(100);
		while(!s.isEmpty()) {
			int tmp = s.peek();
			s.pop();
			while(!r.isEmpty() && r.peek() > tmp) {
				s.push(r.peek());
				r.pop();
			}
			r.push(tmp);
		}
		
		return r;
	}
	
}
