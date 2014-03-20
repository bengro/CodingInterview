/* 
 * This method provides the API for maintaining a binary tree.
 */
public class BinarySearchTree {
	
	Node root = null;
	
	Node search(int val) {
		Node p = root;
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
		Node newNode = new Node(val);
		if(root == null) {
			root = newNode;
		} else {
			Node p = root;
			while(p != null) {
				if(p.value < val) {
					if(p.right == null) {
						p.right = newNode;
						break;
					} else {
						p = p.right;
					}
				} else if(p.value > val) {
					if(p.left == null) {
						p.left = newNode;
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
	
	int delete(Node node) {
		
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
	
	void preorderPrint(Node node) {
		if(node == null) {
			return;
		}
		System.out.println(node.value);
		preorderPrint(node.left);
		preorderPrint(node.right);
	}
	
	void postorderPrint(Node node) {
		if(node == null) return;
		
		postorderPrint(node.left);
		postorderPrint(node.right);
		System.out.println(node.value);
	}
	
	void inorderPrint(Node node) {
		if(node == null) return;
		
	}
	
}

class Node {
	Node left;
	Node right;
	int value;
	
	Node(int val) {
		this.value = val;
	}
	
}