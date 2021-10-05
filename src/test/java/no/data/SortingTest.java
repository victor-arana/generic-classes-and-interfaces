package no.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingTest
{

    List<Person> madMen;

    @Before
    public void setUp(){
        madMen = new ArrayList<>();
        madMen.add(new Person("Don Draper", 89));
        madMen.add(new Person("Peggy Olson", 65));
        madMen.add(new Person("Bert Cooper", 100));
    }

    @Test
    public void whenUsingAscAgeComparator_thenSortedList(){
        Collections.sort(madMen, new AscAgeComparator());
        Assert.assertEquals(madMen.get(0).getName(),"Peggy Olson");
        Assert.assertEquals(madMen.get(2).getName(), "Bert Cooper");
    }

    @Test
    public void whenUsingAnonymousComparator_thenSortedList(){
        Collections.sort(madMen, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        Assert.assertEquals(madMen.get(0).getName(),"Peggy Olson");
        Assert.assertEquals(madMen.get(2).getName(), "Bert Cooper");
    }

    @Test
    public void whenUsingDescAgeComparator_thenSortedList(){
        Collections.sort(madMen, new DescComparator(new AscAgeComparator()));
        Assert.assertEquals(madMen.get(0).getName(), "Bert Cooper");
        Assert.assertEquals(madMen.get(madMen.size() - 1).getName(),"Peggy Olson");
    }

}
