import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;


public class GenericCounterTest {

	@Test
	public void test() {
		Collection<Integer> coll = new ArrayList<Integer>();
		coll.add(1);
		coll.add(2);
		coll.add(3);
		Filter<Integer> filter = new Filter<Integer>();
		GenericCounter counter = new GenericCounter();
		int count = counter.count(coll, filter);
		assertTrue(count == 2);
	}

}
