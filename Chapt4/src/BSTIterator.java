import java.util.Iterator;
import java.util.Stack;
public class BSTIterator implements Iterator<BSTNode> {

	BinarySearchTree bst;
	Stack<BSTNode> stack;
	
	public BSTIterator(BinarySearchTree binarySearchTree) {
		this.bst = binarySearchTree;
		stack = new Stack<BSTNode>();
		inorderPrint(bst.root);
	}

	/*
	 * DFS-like algorithm iterating over BST.
	 */
	@Override
	public boolean hasNext() {
		if(!stack.isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public BSTNode next() {
		return stack.pop();
	}

	@Override
	public void remove() throws UnsupportedOperationException {
		// TODO
	}

	void inorderPrint(BSTNode node) {
		if(node == null) return;
		inorderPrint(node.right);
		stack.push(node);
		inorderPrint(node.left);
	}
	
}
