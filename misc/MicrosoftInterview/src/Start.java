import java.util.ArrayList;
import java.util.Iterator;


public class Start {

	public static ArrayList<Integer> arrayList;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		generateData();
		
		// we create an iterator object, we define that we are iterating over Integers.
		// we link the filter as well as the array to the iterator object.
		// the methods are applied to the array only if we iterate over the iterator.
		Iterator<Integer> newArray = filterSmart(new Integer2Filter(), arrayList);
		
		// here we iterate over the array by calling hasNext() followd by next() on the array.
		while(newArray.hasNext()) {
			System.out.println("element: " + newArray.next());
		}
		
		// Why is the iterator handy? 
		// 
		
	}
	
	public static void generateData() {
		
		arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(19);
		arrayList.add(6);
		arrayList.add(31);
		arrayList.add(7);
		arrayList.add(8);
		
	}
	
	public static<T> Iterator<T> filterSmart(final IFilter<T> filter, final ArrayList<T> array) {
		
		Iterator<T> newIter = new Iterator<T>() {

			// this variable is read when java reads filterSmart(...)
			int currentPointer = 0;
			
			@Override
			public boolean hasNext() {
				
				if(currentPointer == -1) {
					return false;
				}
				
				for(int i = currentPointer; i < array.size(); i++) {
					if(filter.isMatch(array.get(i))) {
						currentPointer = i;
						return true;
					}
				}
				currentPointer = -1;
				return false;
			}

			@Override
			public T next() {
				if(currentPointer == -1) {
					return null;
				} else {
					return array.get(currentPointer++);
				}
			}

			@Override
			public void remove() {
			}
		};
		
		return newIter;
		
	}
	
	public static<T> ArrayList<T> filter(IFilter<T> filter, ArrayList<T> array) {
		
		ArrayList<T> newArray = new ArrayList<T>();
		
		for(Iterator<T> iter = array.iterator(); iter.hasNext();) {
			T element = iter.next();
			if(filter.isMatch(element)) {
				newArray.add(element);
			}
		}
		
		return newArray;
		
	}

}
