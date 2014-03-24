import java.util.Iterator;
public class BSTIterator implements Iterator<BSTNode> {
	
	BSTNode min = null;
	BinarySearchTree bst;
	
	public BSTIterator(BinarySearchTree binarySearchTree) {
		this.bst = binarySearchTree;
	}

	/*
	 * DFS-like algorithm iterating over BST.
	 */
	@Override
	public boolean hasNext() {
		if(min == null) {
			// find minimum node.
			BSTNode p = bst.root;
			min = p;
			return true;
		}
		
		// find closest node
		//TODO 
		return true;

	}

	@Override
	public BSTNode next() {
		return min;
	}

	@Override
	public void remove() throws UnsupportedOperationException {
		// TODO
	}

}
