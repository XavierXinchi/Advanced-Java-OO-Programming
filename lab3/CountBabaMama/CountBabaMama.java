package lab3.CountBabaMama;

public class CountBabaMama {

    /**
     * Count the number of occurrences of substrings "baba" or "mama"
     * in the input string recursively. They may overlap.
     * For example, countBabaMama("aba babaa amama ma") → 2,
     * and countBabaMama("bababamamama") → 4.
     * @param input is the input string.
     * @return the number of occurrences.
     */
    public static int countBabaMama(String input) {
        return countMama(input) + countBaba(input);
    }

    public static int countBaba(String input) {
        if (input.length() < 4) {
            return 0;
        }
        if (input.startsWith("baba")) {
            return 1 + countBaba(input.substring(1));
        }
        return countBaba(input.substring(1));
    }

    public static int countMama(String input) {
        if (input.length() < 4) {
            return 0;
        }
        if (input.startsWith("mama")) {
            return 1 + countMama(input.substring(1));
        }
        return countMama(input.substring(1));
    }

}
