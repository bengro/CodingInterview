import java.util.Comparator;
import java.util.HashSet;

/*
 * This class implements a singly-linked list.
 */
public class SinglyLinkedList<T extends Number> {
	
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
	
	/*
	 * This method partitions this linked list such that nodes < x, come before the returned node.
	 * All nodes > x, come after the returned node.
	 */
	void partition(int x) {
		Node<T> p = head;
		if(p == null) return;
		while((p != null) && (p.next.lessThan(x))) {
			p = p.next;
		}
		Node<T> i = p.next;
		Node<T> prev = p;
		
		while(i != null) {
			if(i.lessThan(x)) {
				prev.next = i.next;
				i.next = p.next;
				p.next = i;
				p = i;
			}
			prev = i;
			i = i.next;
		}
		// p is the last node < k, p+1 is >= k.
		Node<T> j = head;
		while(j != null) {
			System.out.println("Value:" + j.val);
			if(j == p) System.out.println("x");
			j = j.next;
		}
	}
}

class Node<T extends Number> {
	T val;
	Node<T> next = null;
	
	public Node(T val) {
		this.val = val;
	}
	
	// evaluates val < rhs
	public boolean lessThan(int rhs) {
		return (this.val.intValue() < rhs);
	}
}