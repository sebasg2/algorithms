package sorting.generics;

public class InsertionSort extends Sort {
    
    @Override
    public <T extends Comparable<T>> void sort(T[] vector, ISortingOrder sorting) {
        for (int i = 1; i < vector.length; i++) {
            int j = i;

            while (j > 0 && sorting.compare(vector[j - 1], vector[j]) > 0) {
                swap(vector, j - 1, j);
                j--;
            }
        }
    }
}