package no.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
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
    public void whenUsingAgeComparator_thenSortedList(){
        Collections.sort(madMen, new AgeComparator());
        Assert.assertEquals(madMen.get(0).getName(),"Peggy Olson");
        Assert.assertEquals(madMen.get(2).getName(), "Bert Cooper");
    }

}
