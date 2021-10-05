package no.data;

import java.util.Comparator;

public class DescComparator implements Comparator<Person> {

    private final Comparator<Person> ascComparator;

    public DescComparator(Comparator<Person> ascComparator) {
        this.ascComparator = ascComparator;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return -1 * ascComparator.compare(o1, o2);
    }
}
