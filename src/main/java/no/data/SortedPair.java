package no.data;

/**
 * Class that has two ordered values first, and second.
 * @param <T>
 */
public class SortedPair<T extends Comparable> {

    private final T first;
    private final T second;

    public SortedPair(T left, T right) {
        if(left.compareTo(right) <= 0) {
            this.first = left;
            this.second = right;
        } else {
            this.first = right;
            this.second = left;
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
