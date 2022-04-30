package twosum;

import twosum.exceptions.NoNumberException;

import java.util.Arrays;

/**
 * Status: Declined
 *
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 * Your solution must use only constant extra space.
 */
public class TwoSum2 {
    private static final int[] numbers = {1,2,3,4,4,9,56,90};
    private static final int target = 8;

    public static void main(String[] args){
        try {
            System.out.println(Arrays.toString(twoSum(numbers, target)));
        } catch (NoNumberException e) {
            e.printStackTrace();
        }
    }

    public static int[] twoSum(int[] numbers, int target) throws NoNumberException {
        int subNumber = 0;
        int binaryResult = 0;
        for(int index = 0; index < numbers.length; index++){
            subNumber = target - numbers[index];
            binaryResult = binarySearch(numbers,index,subNumber);
            if(binaryResult != -1)
                return new int[] {index+1, binaryResult+1};
        }
        throw new NoNumberException();
    }

    private static int binarySearch(int[] numbers, int leftNumber, int target){
        int middle, rightNumber = numbers.length-1;
        leftNumber -= 1;
        while(leftNumber < rightNumber){
            middle = (leftNumber + (rightNumber)) / 2;
            System.out.println(numbers[middle]);
            if(numbers[middle] == target)
                return middle;
            else if(numbers[middle] < target)
                leftNumber = middle +1;
            else
                rightNumber = middle -1;
        }
        return -1;
    }
}
