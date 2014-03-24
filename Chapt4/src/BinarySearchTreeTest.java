import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;


public class BinarySearchTreeTest {

	@Test
	public void test() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(6);
		bst.insert(4);
		bst.insert(7);
		bst.insert(3);
		bst.insert(8);
		bst.insert(8);
		
		System.out.println("There are " + bst.size() + " nodes.");
		
		BSTNode node = bst.search(7);
		System.out.println("Value found: " + node.value);
		
		//bst.preorderPrint(bst.root);
		
		Iterator<BSTNode> it = bst.iterator();
		while(it.hasNext()) {
			System.out.println("Value: " + it.next().value);
		}
		
	}

}
