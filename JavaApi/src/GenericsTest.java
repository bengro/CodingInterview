import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class GenericsTest {

	@Test
	public void test() {
		Generics generics = new Generics();
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		generics.printList1(l1);
		generics.printList2(l1);
		
		List<Object> l2 = new ArrayList<Object>();
		l2.add("test1");
		l2.add(1);
		generics.printList3(l2);
	}

}
