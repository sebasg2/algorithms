package sorting.generics;

public class AscendingOrder implements ISortingOrder {
    
	   @Override
	   public <T extends Comparable<T>> int compare(T a, T b) {
	      return a.compareTo(b);
	   }

	}
