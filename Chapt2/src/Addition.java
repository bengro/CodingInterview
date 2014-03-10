public class Addition {
	LinkedList add(LinkedList l1, LinkedList l2) {
		LinkedList l3 = new LinkedList();
		
		Element p1 = l1.head;
		Element p2 = l2.head;
		int R = 0;
		while(p1 != null || p2 != null) {
			int sum = R;
			if(p1 != null) {
				sum += p1.val;
				p1 = p1.next;
			}
			if(p2 != null) {
				sum += p2.val;
				p2 = p2.next;
			}
			if(sum < 10) {
				l3.append(sum);
				R = 0;
			} else {
				int digit = sum % 10;
				l3.append(digit);
				R = 1;
			}
		}
		
		return l3;
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
			tail.next = elem;
			tail = elem;
		}
	}

	public void print() {
		Element p = head;
		while(p != null) {
			System.out.print(p.val + " ");
			p = p.next;
		}
		System.out.println("");
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