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
		if(size == 0) System.out.println("Empty list.");
		Node<T> i = head;
		while(i != null) {
			System.out.println(i.val);
			i = i.next;
		}
	}
}

class Node<T> {
	T val;
	Node<T> next = null;
	
	public Node(T val) {
		this.val = val;
	}
}