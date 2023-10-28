package sorting.generics;

public class LomutoQuickSort extends Sort {
    private <T extends Comparable<T>> int partition(T[] vector, int low, int high, ISortingOrder sorting) {
        T pivot = vector[high];
        int p = low;

        for (int q = low; q < high; q++) {
            if (sorting.compare(vector[q], pivot) < 0) {
                swap(vector, p, q);
                p++;
            }
        }

        swap(vector, p, high);

        return p;
    }

    private <T extends Comparable<T>> void sort(T[] vector, int low, int high, ISortingOrder sorting) {
        if (low < high) {
            int p = partition(vector, low, high, sorting);

            sort(vector, low, p - 1, sorting);
            sort(vector, p + 1, high, sorting);
        }
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] vector, ISortingOrder sorting) {
        sort(vector, 0, vector.length - 1, sorting);
    }
}