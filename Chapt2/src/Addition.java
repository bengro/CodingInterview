public class Addition {
	LinkedList add(LinkedList l1, LinkedList l2) {
		return null;
	}
}

class LinkedList {
	Element head = null;
	Element tail = null;
	
	void append(Integer val) {
		Element elem = new Element(val);
		if(head == null) {
			head = elem;
			tail = elem;
		} else {
			tail = elem;
		}
	}

	public void print() {
		Element p = head;
		while(p != null) {
			System.out.println(p.val);
			p = p.next;
		}
	}
}

class Element {
	Element next;
	Integer val;
	
	Element(Integer input) {
		this.val = input;
		next = null;
	}
}