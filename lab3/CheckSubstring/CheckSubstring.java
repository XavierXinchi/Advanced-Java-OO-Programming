package lab3.CheckSubstring;

public class CheckSubstring {

    /**
     * Check if at least n copies of a substring occur in input string.
     * They may overlap.
     * For example, checkSubstring("ababaxxxaba", "aba", 3) → true
     *
     * @param input is the input string.
     * @param subs  is the non-empty substring.
     * @param n     is non-negative number of occurrences.
     * @return true iff at least n copies of subs occur in input.
     */
    public static boolean checkSubstring(String input, String subs, int n) {
        int count = help(input, subs);
        return count == n;
    }

    public static int help(String input, String subs) {
        if (input.length() < subs.length()) {
            return 0;
        }
        if (input.startsWith(subs)) {
            return 1 + help(input.substring(1), subs);
        }
        return help(input.substring(1), subs);
    }
}
