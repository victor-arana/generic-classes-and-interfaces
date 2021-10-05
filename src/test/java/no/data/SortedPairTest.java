package no.data;

import org.junit.Assert;
import org.junit.Test;

public class SortedPairTest {

    @Test
    public void shouldRetainOrderOfOrderedPair(){
        SortedPair<Integer> pair = new SortedPair<>(1, 2);
        Assert.assertEquals(-1, Integer.compare(pair.getFirst(), pair.getSecond()));
    }

    @Test
    public void shouldFlipOrderOfUnorderedPair(){
        SortedPair<Integer> pair = new SortedPair<>(2,1);
        Assert.assertEquals(-1, Integer.compare(pair.getFirst(), pair.getSecond()));
    }
}
