package lab2.MatchSwap;

import java.util.*;

public class MatchSwap {

    /**
     * Modify a list of strings such that two strings with same
     * first letter are swapped.
     * For example, matchSwap(["ap", "bp", "cp", "aq", "cq", "bq"]) →
     * ["aq", "bq", "cq", "ap", "cp", "bp"].
     *
     * @param list is a list of strings.
     *             The strings are non-empty.
     * @return the modified list.
     */
    public static List<String> matchSwap(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals("")) {
                String key = list.get(i).substring(0, 1);
                if (map.containsKey(key)) {
                    int match = map.get(key);
                    String temp = list.get(match);
                    list.set(match, list.get(i));
                    list.set(i, temp);
                    map.remove(key);
                } else {
                    map.put(key, i);
                }
            }
        }
        return list;
    }

}