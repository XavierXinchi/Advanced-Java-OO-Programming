package lab2.SameFirstLetter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SameFirstLetter {

    /**
     * Create a map with first letter as key and words with that same
     * first letter separated by comma.
     * For example, numWords(["alice", "bob", "apple", "banana"]) →
     * {"a": "alice,apple", "b": "bob,banana"}.
     * @param list is a list of strings.
     * The strings are non-empty.
     * @return a map with first letter and comma-separated-words pair.
     */
    public static Map<String, String> sameFirstLetter(List<String> list) {
        Map<String, String> map = new HashMap<>();
        for (String word : list) {
            String first = word.substring(0, 1);
            if (!map.containsKey(first)) {
                map.put(first, word);
            } else {
                String value = map.get(first);
                map.put(first, value + "," + word);
            }
        }
        return map;
    }

}