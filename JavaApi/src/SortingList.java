import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

/*
 * This class creates a List and sorts the elements according the specified comparator.
 */
public class SortingList {
	List<Node> myList = new ArrayList<Node>();
	
	void populate() {
		myList.add(new Node(1));
		myList.add(new Node(10));
		myList.add(new Node(2));
		myList.add(new Node(5));
		
		System.out.println(myList);
		Collections.sort(myList);
		System.out.println(myList);
		
		Collections.sort(myList, Node.DESC);
		System.out.println(myList);
	}
	
}

class Node implements Comparable<Node> {
	int id;

	Node(int id) {
		this.id = id;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.id < o.id) return -1;
		else if(this.id == o.id) return 0;
		else return 1;
	}
	
	@Override
	public String toString() {
		return "" + this.id;
	}
	
	public static final Comparator<Node> DESC = new Comparator<Node>() {
		@Override
		public int compare(Node n1, Node n2) {
			if(n1.id > n2.id) return -1;
			else if(n1.id == n2.id) return 0;
			else return 1;
		}
	};
}