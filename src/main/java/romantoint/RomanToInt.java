package romantoint;

import java.util.HashMap;

/**
 * Status: Accepted
 *
 *  11ms 37.74% faster | 42.4 mb less than 91.61% of Java submissions on 4/4/2022
 *
 * Given a roman numeral, convert it to an integer.
 */
public class RomanToInt {
    private static final String roman = "MCMXCIV";
    public static void main(String[] args){
        System.out.println(toInt2(roman));
    }

    // Brute Force
    public static int toInt(String roman){
        int number = 0;
        roman = roman.toUpperCase();
        for(int i = 0; i < roman.length(); i++){
                if(roman.charAt(i) == 'I')
                    number += 1;
                else if(roman.charAt(i) == 'V')
                    number += 5;
                else if(roman.charAt(i) == 'X')
                    number += 10;
                else if(roman.charAt(i) == 'L')
                    number += 50;
                else if(roman.charAt(i) == 'D')
                    number += 500;
                else if(roman.charAt(i) == 'C')
                    number += 100;
                else if(roman.charAt(i) == 'M')
                    number += 1000;
                if(i+1 < roman.length())
                    if(roman.charAt(i) == 'I' && (roman.charAt(i+1) == 'V' || roman.charAt(i+1) == 'X'))
                        number -= 2;
                    else if(roman.charAt(i) == 'X' && (roman.charAt(i+1) == 'L' || roman.charAt(i+1) == 'C'))
                        number -= 20;
                    else if(roman.charAt(i) == 'C' && (roman.charAt(i+1) == 'D' || roman.charAt(i+1) == 'M'))
                        number -= 200;
        }
        return number;
    }

    // Hashmap
    private static int toInt2(String roman){
        int number = 0;
        HashMap<Character, Integer> romanNum = new HashMap<>();
        romanNum.put('I',1);
        romanNum.put('V',5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);

        HashMap<String, Integer> romanCombo = new HashMap<>();
        romanCombo.put("IV", 1);
        romanCombo.put("IX", 1);
        romanCombo.put("XL", 10);
        romanCombo.put("XC", 10);
        romanCombo.put("CD", 100);
        romanCombo.put("CM", 100);


        for(int i = 0; i < roman.length(); i++){
            char currentLetter = roman.charAt(i);
            if(i+1 < roman.length() && romanCombo.containsKey(currentLetter+""+roman.charAt(i+1)))
                number -= romanCombo.get(currentLetter+""+roman.charAt(i+1));
            else if(romanNum.containsKey(currentLetter))
                number += romanNum.get(currentLetter);
        }
        return number;
    }
}
