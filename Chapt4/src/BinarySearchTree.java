import java.util.Iterator;

/* 
 * This method provides the API for maintaining a binary tree.
 */
public class BinarySearchTree {
	
	BSTNode root = null;
	int size = 0;
	
	BSTNode search(int val) {
		BSTNode p = root;
		while(p != null && p.value != val) {
			if(p.value >= val) {
				p = p.left;
			} else {
				p = p.right;
			}
		}
		return p;
	}
	
	void insert(int val) {
		BSTNode newNode = new BSTNode(val);
		if(root == null) {
			root = newNode;
			++size;
		} else {
			BSTNode p = root;
			while(p != null) {
				if(p.value < val) {
					if(p.right == null) {
						p.right = newNode;
						++size;
						break;
					} else {
						p = p.right;
					}
				} else if(p.value > val) {
					if(p.left == null) {
						p.left = newNode;
						++size;
						break;
					} else {
						p = p.left;
					}
				} else if(p.value == val) {
					System.out.println("Illegal operation. Value " + val + " already exists.");
					break;
				}
			}
		}
	}
	
	int delete(BSTNode node) {
		
		if(node.left == null && node.right == null) {
			// disconnect parent with child
		} else if(node.left == null) {
			// connect parent with right
		} else if(node.right == null) {
			// connect parent with left
		} else {
			// find biggest element in left subtree. 
		}
		
		return 1;
	}
	
	void preorderPrint(BSTNode node) {
		if(node == null) {
			return;
		}
		System.out.println(node.value);
		preorderPrint(node.left);
		preorderPrint(node.right);
	}
	
	void postorderPrint(BSTNode node) {
		if(node == null) return;
		
		postorderPrint(node.left);
		postorderPrint(node.right);
		System.out.println(node.value);
	}
	
	void inorderPrint(BSTNode node) {
		if(node == null) return;
		inorderPrint(node.left);
		System.out.println(node.value);
		inorderPrint(node.right);
	}
	
	public Iterator<BSTNode> iterator() {
		return new BSTIterator(this);
	}
	
	public int size() {
		return size;
	}
	
}