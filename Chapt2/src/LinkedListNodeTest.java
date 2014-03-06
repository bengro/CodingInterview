import static org.junit.Assert.*;

import org.junit.Test;


public class LinkedListNodeTest {

	@Test
	public void test() {
		LinkedListNode linkedList = new LinkedListNode(10);
		linkedList.appendToTail(10);
		linkedList.appendToTail(20);
		linkedList.print();
	}

}
