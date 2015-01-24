
import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SortedListCreatorTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SortedListCreatorTester
{
    /**
     * 
     */
    @Test
    public void sizeTester() {
        List<Integer> list = SortedListCreator.createSortedList(10);
        assertEquals(list.size(), 10);
        list = SortedListCreator.createSortedList(100);
        assertEquals(list.size(), 100);
        list = SortedListCreator.createSortedList(1000);
        assertEquals(list.size(), 1000);
    }
    
    /**
     * 
     */
    @Test
    public void sortedTester() {
        List<Integer> list = SortedListCreator.createSortedList(1000);
        for (int i = 0; i < list.size() - 1; i++) {
            assertTrue(list.get(i + 1) >= list.get(i));
        }
    }
}
