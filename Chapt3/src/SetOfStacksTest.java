import static org.junit.Assert.*;

import org.junit.Test;

public class SetOfStacksTest {

	@Test
	public void test() {
		SetOfStacks obj = new SetOfStacks(5);
		obj.push(1);
		obj.push(1);
		obj.push(1);
		obj.push(1);
		obj.push(1);
		obj.push(1);
		obj.push(1);
		obj.push(1);
		obj.push(1);
		obj.push(1);
		obj.push(1);
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
	}

}
