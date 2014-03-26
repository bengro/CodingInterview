import java.util.Collection;

/*
 * This class provides a method for couting particular elements in a collection.
 */
public class GenericCounter {
	
	<T> int count(Collection<T> coll, Filter<T> filter) {
		int count = 0;
		for(T elem : coll) {
			if(filter.isOdd(elem)) ++count;
		}
		return count;
	}
	
}

class Filter<T> {
	
	boolean isOdd(T elem) {
		int number = (Integer) elem;
		if(number % 2 == 0) return false;
		else return true;
	}
	
}
