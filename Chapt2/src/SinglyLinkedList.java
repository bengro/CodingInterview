import java.util.HashSet;

/*
 * This class implements a singly-linked list.
 */
public class SinglyLinkedList<T> {
	
	Node<T> head = null;
	Node<T> tail = null;
	int size = 0;
	
	void appendTail(T val) {
		Node<T> node = new Node<T>(val);
		if(head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		++size;
	}
	
	void deleteFirst() {
		if(size == 0) return;
		else if(size == 1) head = null;
		else head = head.next;
		--size;
	}
	
	int size() {
		return size;
	}
	
	void print() {
		System.out.println("Printing all linked list elements.");
		if(size == 0) System.out.println("Empty list.");
		Node<T> i = head;
		while(i != null) {
			System.out.println(i.val);
			i = i.next;
		}
	}
	
	/*
	 * First question
	 * 1. Approach: we have some sort memory of what elements have been inserted.
	 * 2. Approach: we trade space against runtime using a runner O(n^2).
	 */
	void removeDuplicates() {
		// if we use a HashMap this method will be O(n)
		Node<T> previous = null;
		Node<T> n = head;
		HashSet<T> table = new HashSet<T>();
		while(n != null) {
			if(table.contains(n.val)) {
				previous.next = n.next;	// current node is omitted.
				if(n.next == null) tail = previous;
				--size;
			} else {
				table.add(n.val);
				previous = n;
			}
			n = n.next;
		}
	}
	
	/*
	 * Outputs the kth element.
	 * Iterative approach: We iterate over the linked list with two pointers with k distance between them.
	 */
	void findKthElement(int k) {
		kthElement(head, k);
	}
	
	int kthElement(Node<T> elem, int k) {
		if(elem == null) return 0;
		int i = kthElement(elem.next, k) + 1;
		if(k == i) {
			System.out.println("The kth element is " + elem.val);
		}
		return i;
	}
	
}

class Node<T> {
	T val;
	Node<T> next = null;
	
	public Node(T val) {
		this.val = val;
	}
}