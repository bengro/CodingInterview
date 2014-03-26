/*
 * Find the common ancestor of two given BST nodes.
 */
public class CommonAncestor {
	
	/* 
	 * Returns true, if p is a descendant of root 
	 */
	boolean covers(BSTNode root, BSTNode p) {
		if(root == null) return false;
		if(root == p) return true;
		return covers(root.left, p) || covers(root.right, p);
	}
	
	BSTNode commonAncestorHelper(BSTNode root, BSTNode p, BSTNode q) {
		boolean p_in_left_tree = covers(root, p);
		boolean q_in_left_tree = covers(root, q);
		
		if(p_in_left_tree && !q_in_left_tree) return root;
		
		BSTNode newRoot;
		newRoot = (p_in_left_tree) ? root.left : root.right;
		return commonAncestorHelper(newRoot, p, q);
	}
	
	BSTNode commonAncestor(BSTNode root, BSTNode p, BSTNode q) {
		if(!covers(root, p) || !covers(root, q)) return null;
		return commonAncestorHelper(root, p, q);
	}
	
}
