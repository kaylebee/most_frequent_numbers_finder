package array.finder;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class MostFrequentNumbersFinderTest
    extends TestCase
{
    @Test
    public void testFindMostFrequentNumbersSingleMode() {
        Integer[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5};
        List<Integer> expected = Collections.singletonList(4);
        assertEquals(expected, MostFrequentNumbersFinder.findMostFrequentNumbers(array));
    }

    @Test
    public void testFindMostFrequentNumbersMultipleModes() {
        Integer[] array = {1, 1, 2, 2, 3, 3};
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, MostFrequentNumbersFinder.findMostFrequentNumbers(array));
    }

    @Test
    public void testFindMostFrequentNumbersSingleElement() {
        Integer[] array = {1};
        List<Integer> expected = Collections.singletonList(1);
        assertEquals(expected, MostFrequentNumbersFinder.findMostFrequentNumbers(array));
    }

    @Test
    public void testFindMostFrequentNumbersNoMode() {
        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, MostFrequentNumbersFinder.findMostFrequentNumbers(array));
    }

    @Test
    public void testFindMostFrequentNumbersEmptyArray() {
        Integer[] array = {};
        try {
            MostFrequentNumbersFinder.findMostFrequentNumbers(array);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Input array cannot be null or empty", e.getMessage());
        }
    }

    @Test
    public void testFindMostFrequentNumbersNullArray() {
        Integer[] array = null;
        try {
            MostFrequentNumbersFinder.findMostFrequentNumbers(array);
        } catch (IllegalArgumentException e) {
            assertEquals("Input array cannot be null or empty", e.getMessage());
        }
    }
}
