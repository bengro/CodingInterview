/*
 * Linked List as suggested in Book.
 */
public class LinkedListNode {
	LinkedListNode next = null;
	int data;
	
	public LinkedListNode(int d) {
		this.data = d;
	}
	
	void appendToTail(int d) {
		LinkedListNode end = new LinkedListNode(d);
		LinkedListNode n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	
	void print() {
		LinkedListNode n = this;
		while(n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
}
