import static org.junit.Assert.*;

import org.junit.Test;


public class StackMinTrackerTest {

	@Test
	public void test() {
		StackMinTracker obj = new StackMinTracker(100);
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.min();
		obj.push(40);
		obj.push(50);
		obj.push(1);
		obj.min();
		obj.push(-10);
		obj.min();
	}

}
