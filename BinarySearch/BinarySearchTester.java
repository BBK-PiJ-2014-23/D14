
import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BinarySearchTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BinarySearchTester
{
    /**
     * 
     */
    @Test
    public void findInEmpty() {
        List<Integer> empty = new ArrayList<Integer>();
        assertEquals(empty.size(), 0);
        assertFalse(BinarySearch.binarySearch(empty, 0));
        assertFalse(BinarySearch.binarySearch(empty, 1));
    }

    /**
     * 
     */
    @Test
    public void findInFilled() {
        List<Integer> list = SortedListCreator.createSortedList(10);
        if (list.contains(0)) {
            assertTrue(BinarySearch.binarySearch(list, 0));
        } else {
            assertFalse(BinarySearch.binarySearch(list, 0));
        }
        if (list.contains(200)) {
            assertTrue(BinarySearch.binarySearch(list, 200));
        } else {
            assertFalse(BinarySearch.binarySearch(list, 200));
        }
        list = SortedListCreator.createSortedList(100);
        if (list.contains(0)) {
            assertTrue(BinarySearch.binarySearch(list, 0));
        } else {
            assertFalse(BinarySearch.binarySearch(list, 0));
        }
        if (list.contains(200)) {
            assertTrue(BinarySearch.binarySearch(list, 200));
        } else {
            assertFalse(BinarySearch.binarySearch(list, 200));
        }
        list = SortedListCreator.createSortedList(1000);
        if (list.contains(0)) {
            assertTrue(BinarySearch.binarySearch(list, 0));
        } else {
            assertFalse(BinarySearch.binarySearch(list, 0));
        }
        if (list.contains(200)) {
            assertTrue(BinarySearch.binarySearch(list, 200));
        } else {
            assertFalse(BinarySearch.binarySearch(list, 200));
        }
    }
}
