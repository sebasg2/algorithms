package sorting.generics;

public class SelectionSort extends Sort {

    @Override
    public <T extends Comparable<T>> void sort(T[] vector, ISortingOrder sorting) {
        for (int i = 0; i < vector.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < vector.length; j++) {
                if (sorting.compare(vector[j], vector[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                swap(vector, i, minIndex);
            }
        }
    }
}