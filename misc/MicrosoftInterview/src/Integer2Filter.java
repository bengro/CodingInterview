
public class Integer2Filter implements IFilter<Integer> {

	public boolean isMatch(Integer element) {
		if((element % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
