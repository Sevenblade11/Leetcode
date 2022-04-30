package twosum;

import twosum.exceptions.NoNumberException;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Status: Accepted
 *
 *  3ms 88.49% faster | 46.3 mb less than 14.41% of Java submissions on 3/23/2022
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 */
public class TwoSum1 {

    private static final int[] NUMBERS = {3,3};
    private static final int TARGET = 6;

    public static void main(String[] args){

        try {
            System.out.println(Arrays.toString(twoSum(NUMBERS, TARGET)));
        } catch (NoNumberException e) {
            e.printStackTrace();
        }

    }

    private static int[] twoSum(int[] nums, int target) throws NoNumberException {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int subNumber;
        for(int i = 0; i < nums.length; i++){
            subNumber = target - nums[i];
            if(hashmap.containsKey(subNumber)){
                return new int[]{hashmap.get(subNumber), i};
            }
            hashmap.put(nums[i], i);
        }
        throw new NoNumberException();
    }
}
