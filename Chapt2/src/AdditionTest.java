import static org.junit.Assert.*;

import org.junit.Test;


public class AdditionTest {

	@Test
	public void test() {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		
		l1.append(7);
		l1.append(3);
		l2.append(7);
		l2.append(2);
		l2.append(1);
		
		Addition addition = new Addition();
		LinkedList l3 = addition.add(l1, l2);
		
		l3.print();
	}

}
