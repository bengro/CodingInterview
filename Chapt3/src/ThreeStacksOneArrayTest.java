import static org.junit.Assert.*;

import org.junit.Test;

public class ThreeStacksOneArrayTest {

	@Test
	public void test() {
		ThreeStacksOneArray obj = new ThreeStacksOneArray(10);
		obj.print(0);
		obj.push(0, 1);
		obj.push(0, 2);
		obj.print(0);
		obj.push(0, 3);
		obj.push(0, 4);
		obj.print(0);
		obj.push(1, 1);
		obj.push(2, 1);
		obj.print(1);
		obj.print(2);
		obj.push(2, 2);
		obj.push(2, 3);
		obj.push(2, 4);
		obj.pop(2);
		obj.print(2);
		obj.pop(2);
		obj.pop(2);
		obj.pop(2);
		obj.pop(2);
		obj.pop(2);
		obj.print(2);
	}

}
