package maxpairs;

import java.util.HashMap;

/**
 * Status: Accepted
 *
 * 40ms 48.09% faster | 54 mb less than 83.97% of Java submissions on 5/04/2022
 *
 * You are given an integer array nums and an integer k.
 * In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
 * Return the maximum number of operations you can perform on the array.
 */
public class MaxNumberOfKSums {
    private static final int[] array = new int[]{2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2};
    private static final int k = 3;
    public static void main(String[] args){
        System.out.println(maxOperations(array,k));
    }

    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int targetNumber, amountRemoved = 0;
        for(int i = 0; i < nums.length; i++){
            targetNumber = k - nums[i];
            if(hashMap.containsKey(targetNumber) && hashMap.get(targetNumber) > 0){
                hashMap.put(targetNumber, hashMap.get(targetNumber) -1);
                amountRemoved++;
            }
            else
                hashMap.put(nums[i], hashMap.getOrDefault(nums[i],0)+1);
        }
       return amountRemoved;
    }
}
