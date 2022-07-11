package lab3.DelDuplicate;

public class DelDuplicate {
	
    /**
     * Remove adjacent duplicate characters in a string.
     * For example, delDuplicate("aaabbc") → "abc".
     * @param input is the input string.
     * @return the resulting string.
     */
    public static String delDuplicate(String input) {
        if (input.length() == 1 || input.length() == 0) {
            return input;
        }
        if (input.charAt(0) == input.charAt(1)) {
            return delDuplicate(input.substring(1));
        }
        return input.charAt(0) + delDuplicate(input.substring(1));
    }
}
