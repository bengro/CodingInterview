import static org.junit.Assert.*;

import org.junit.Test;


public class SinglyLinkedListTest {

	@Test
	public void test() {
		SinglyLinkedList<Integer> SLL = new SinglyLinkedList<Integer>();
		SLL.appendTail(3);
		SLL.appendTail(5);
		SLL.appendTail(10);
		SLL.appendTail(10);
		SLL.appendTail(10);
		SLL.appendTail(10);
		SLL.appendTail(5);
		SLL.print();
		SLL.findKthElement(3);
	}
	
}
