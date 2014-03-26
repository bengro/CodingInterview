import java.util.List;

/*
 * Exploring Java Generics.
 */
public class Generics {
	
	/*
	 * Using a specific generic class T.
	 */
	public <T> void printList1(List<T> list) {
	    for (Object elem: list)
	        System.out.print(elem + " ");
	    System.out.println();
	}
	
	/*
	 * Using a wildcard.
	 */
	public void printList2(List<?> list) {
	    for (Object elem: list)
	        System.out.print(elem + " ");
	    System.out.println();
	}

	/*
	 * Using a List Objects.
	 */
	public void printList3(List<Object> list) {
	    for (Object elem : list) {
	        if(elem instanceof Integer) System.out.print("INT ");
	        	
	    	System.out.println(elem + " ");
	    }
	    System.out.println();
	}
	
}
