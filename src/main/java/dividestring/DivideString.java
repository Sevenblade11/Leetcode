package dividestring;

import java.util.Arrays;

/**
 * Status: Accepted
 *
 *  1ms 98.36% faster | 40.6 mb less than 99.56% of Java submissions on 4/4/2022
 *
 * Given the string s, the size of each group k and the character fill,
 * return a string array denoting the composition of every group s has been divided into, using the above procedure.
 */
public class DivideString {
    private static final String STRING = "ctoyjrwtngqwt";
    public static void main(String[] args){
        System.out.println(Arrays.toString(divideString(STRING, 8, 'n')));
    }

    public static String[] divideString(String s, int k, char fill) {
        int amountOfGroups = (s.length()) / k;
        if(s.length() % k != 0)
            amountOfGroups += 1;
        String[] result = new String[amountOfGroups];
        for(int i = 0; i < amountOfGroups; i++){
           if(s.length() >= i*k+k)
                result[i] = s.substring(i*k,i*k+k);
            else {
                result[i] = s.substring(i*k);
                result[i] += String.valueOf(fill).repeat(k- result[i].length());
            }
        }
        return result;
    }

}
