package lab2.EvenAppend;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class EvenAppend {

    /**
     * Append words that appear the 2nd, 4th, 6th, etc. time in a list.
     * For example, evenAppend(["a", "b", "b", "a", "a", "b", "b"]) → "bab".
     *
     * @param list is a list of words.
     * @return a concatenation of even appearing words.
     */
    public static String evenAppend(List<String> list) {
        StringBuilder ans = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        for (String i : list) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                int val = map.get(i);
                if (val % 2 != 0) {
                    ans.append(i);
                }
                map.put(i, val + 1);
            }
        }
        return ans.toString();
    }

}