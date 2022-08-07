package sorting;

import common.SortingCommonInterface;

import java.util.ArrayList;

/**
 * This sorting algorithm repeatedly swaps the adjacent elements until they are not in the sorted order.
 * O(N^2)
 */
public class BubbleSort implements SortingCommonInterface {
    /**
     * @param list It'll sort the input arrayList using recursion.
     */
    @Override
    public void sort (ArrayList<Integer> list) {
        int swapCount = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) < list.get(i)) {
                list.set(i, list.get(i + 1) + list.get(i));
                list.set(i + 1, list.get(i) - list.get(i + 1));
                list.set(i, list.get(i) - list.get(i + 1));
                swapCount++;
            }
        }
        if (swapCount != 0) {
            sort(list);
        }
    }

    public void sortWithOutRecursion (ArrayList<Integer> list) {
        for (int j = 0; j < list.size() - 1; j++) {
            for (int i = 0; i < (list.size() - j - 1); i++) {
                if (list.get(i + 1) < list.get(i)) {
                    list.set(i, list.get(i + 1) + list.get(i));
                    list.set(i + 1, list.get(i) - list.get(i + 1));
                    list.set(i, list.get(i) - list.get(i + 1));
                }
            }
        }
    }
}
