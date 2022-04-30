package mergetwostrings;

/**
 * Status: Accepted
 *
 * 1ms 86.83% faster | 42.3 mb less than 54.55% of Java submissions on 4/5/2022
 *
 * You are given two strings word1 and word2.
 * Merge the strings by adding letters in alternating order, starting with word1.
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 */
public class MergeTwoStrings {
    private static final String WORD_ONE = "aba";
    private static final String WORD_TWO = "rrcc";
    public static void main(String[] args){
        System.out.println(mergeAlternately(WORD_ONE,WORD_TWO));
    }
    public static String mergeAlternately(String word1, String word2) {
        int minLength = Math.min(word1.length(), word2.length());
        StringBuilder result = new StringBuilder();

        for(int index = 0; index < minLength; index++)
            result.append(word1.charAt(index)).append(word2.charAt(index));

        if(word1.length() > word2.length())
            result.append(word1.substring(minLength));
        else if(word2.length() > word1.length())
            result.append(word2.substring(minLength));

        return result.toString();
    }
}
