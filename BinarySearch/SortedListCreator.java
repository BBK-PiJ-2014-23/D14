import java.util.*;

/**
 * Write a description of class dfs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SortedListCreator
{
    public static List<Integer> createSortedList(int size) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= size; i++) {
            int num = (int) (Math.abs(1000 * Math.random()));
            list.add(num);
        }
        return QuickSort.quickSort(list);
    }
}
