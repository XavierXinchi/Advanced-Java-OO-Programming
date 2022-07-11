package lab2.MaxStretch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxStretch {

    /**
     * Find the largest stretch in a list.
     * For example, maxStretch([8, 5, 1, 2, 3, 4, 5, 10]) = 6.
     *
     * @param list is a list of integers.
     * @return the largest stretch in list.
     */
    public static int maxStretch(List<Integer> list) {
        int max = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            int len = 0;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) == list.get(i)) {
                    len = j - i + 1;
                    if (len > max) {
                        max = len;
                    }
                    break;
                }
            }
        }
        return max;
    }
}