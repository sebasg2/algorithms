package sorting.generics;

public class BubbleSort extends Sort {

	   @Override
	   public  <T extends Comparable<T>> void sort(T[] vector, ISortingOrder sorting) {
	      for (int i=0; i<vector.length-1; i++)
	         for (int j=0; j<vector.length-i-1; j++) 
	            if (sorting.compare(vector[j], vector[j+1]) > 0)
	               swap(vector, j, j+1);
	   }
	    
	}
	