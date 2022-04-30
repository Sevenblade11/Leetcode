package deletecharactersfancystring;

/**
 * Status: Accepted
 *
 *  28ms 95.65% faster | 42.9 mb less than 96.69% of Java submissions on 4/4/2022
 *
 * A fancy string is a string where no three consecutive characters are equal.
 * Given a string s, delete the minimum possible number of characters from s to make it fancy.
 * Return the final string after the deletion. It can be shown that the answer will always be unique.
 */

public class DeleteCharactersFancyString {
    private static final String makeFancy = "aaabaaa";
    public static void main(String[] args){
        System.out.println(makeFancyString(makeFancy));
    }
    public static String makeFancyString(String notFancyString){
        StringBuilder result = new StringBuilder();
        char lastLetter = 0;
        int duplicate = 1;
        for(int i = 0; i < notFancyString.length(); i++){
            char currentLetter = notFancyString.charAt(i);

            if (lastLetter == currentLetter)
                duplicate++;
            else
                duplicate = 1;

            if(!(duplicate >= 3))
                result.append(currentLetter);

            lastLetter = currentLetter;
        }
        return result.toString();
    }
}
