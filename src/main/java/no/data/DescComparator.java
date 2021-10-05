package no.data;

import java.util.Comparator;

public class DescComparator<T> implements Comparator<T> {

    private final Comparator<T> ascComparator;

    public DescComparator(Comparator<T> ascComparator) {
        this.ascComparator = ascComparator;
    }

    @Override
    public int compare(T o1, T o2) {
        return -1 * ascComparator.compare(o1, o2);
    }
}
