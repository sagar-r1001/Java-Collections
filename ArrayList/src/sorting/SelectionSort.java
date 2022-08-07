package sorting;

import common.SortingCommonInterface;

import java.util.ArrayList;

/**
 * This algorithm sorts an array by repeatedly searching for the minimum element in the unsorted sub-array and adds it to the sorted sub-array.
 * Time Complexity: O(N^2)
 */
public class SelectionSort implements SortingCommonInterface {

    /**
     * @param list
     * @inheritDoc
     */
    @Override
    public void sort (ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int minIndex = i;
            for (int j = minIndex + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temporary = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temporary);
        }
    }

    /**
     * @param list In sorted array, the objects with equal values will appear in the same order as it was in the unsorted one.
     */
    public void stableSort (ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int minIndex = i;
            for (int j = minIndex + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temporary = list.get(minIndex);
            while (minIndex > i) {
                list.set(minIndex, list.get(minIndex - 1));
                minIndex--;
            }

            list.set(i, temporary);
        }
    }
}
