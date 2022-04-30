package palindromenumber;

/**
 * Status: Accepted
 *
 *  14ms 50.13% faster | 44.6 mb less than 55.29% of Java submissions on 3/23/2022
 *
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 * For example, 121 is a palindrome while 123 is not.
 * Negative numbers are not Palindrome in this assignment.
 */

public class PalindromeNumber {
    private static final int NUMBER = 121;
    public static void main(String[] args){
        System.out.println(isPalindrome(NUMBER));
    }
    public static boolean isPalindrome(int x) {
        int reverse = 0, remainder = 0, number = x;
        while (number != 0){
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        return x == reverse;
    }
}
