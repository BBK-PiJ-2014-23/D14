
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * The test class QuickSortTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class QuickSortTester
{
    List<Integer> list;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        list = new ArrayList<Integer>();
    }

    /**
     * 
     */
    @Test
    public void checkAlreadySorted() {
        assertEquals(QuickSort.quickSort(list).toString(), "[]");
        list.add(3);
        assertEquals(QuickSort.quickSort(list).toString(), "[3]");
    }

    /**
     * 
     */
    @Test
    public void checkSorted() {
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(1);
        assertEquals(QuickSort.quickSort(list).toString(), "[1, 2, 3, 7, 9]");
    }
}
