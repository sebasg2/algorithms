package sorting.generics;

public class HoareQuickSort extends Sort {

    private <T extends Comparable<T>> int partition(T[] vector, int low, int high, ISortingOrder sorting) {
        T pivot = vector[low];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (sorting.compare(vector[i], pivot) < 0);

            do {
                j--;
            } while (sorting.compare(vector[j], pivot) > 0);

            if (i >= j) {
                return j;
            }

            swap(vector, i, j);
        }
    }

    private <T extends Comparable<T>> void quickSort(T[] vector, int low, int high, ISortingOrder sorting) {
        if (low < high) {
            int partitionIndex = partition(vector, low, high, sorting);
            quickSort(vector, low, partitionIndex, sorting);
            quickSort(vector, partitionIndex + 1, high, sorting);
        }
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] vector, ISortingOrder sorting) {
        quickSort(vector, 0, vector.length - 1, sorting);
    }
}