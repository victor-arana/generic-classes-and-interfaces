package no.data;

import java.util.Comparator;

public class DescAgeComparator implements Comparator<Person> {

    private final Comparator<Person> ascAgeComparator;

    public DescAgeComparator(Comparator<Person> ascAgeComparator) {
        this.ascAgeComparator = ascAgeComparator;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return -1 * ascAgeComparator.compare(o1, o2);
    }
}
