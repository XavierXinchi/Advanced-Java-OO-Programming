package lab2.Partitionable;

import java.util.List;

public class Partitionable {

    /**
     * Decide whether a list is partitionable.
     * For example, isPartitionable([1, 1, 1, 2, 1]) -> true,
     * and isPartitionable([2, 1, 1, 2, 1]) -> false.
     * @param list is a non-empty list of integers.
     * @return true iff list is partitionable.
     */
    public static boolean isPartitionable(List<Integer> list) {
        int mid = list.size() / 2;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= mid; i++) {
            sum1 += list.get(i);
        }
        for (int i = mid + 1; i < list.size(); i++) {
            sum2 += list.get(i);
        }
        return sum1 == sum2;
    }
}