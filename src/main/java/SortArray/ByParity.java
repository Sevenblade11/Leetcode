package SortArray;

/**
 * Status: Accepted
 *
 * 1ms 96.61% faster | 43.2 mb less than 80.94% of Java submissions on 5/1/2022
 *
 *Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 *
 */

public class ByParity {
    public int[] sortArrayByParity(int[] nums) {
        int evenIndex = 0;
        int temp;
        for(int i = 0; i < nums.length; i++)
            if(nums[i] % 2 == 0){
                temp = nums[evenIndex];
                nums[evenIndex] = nums[i];
                nums[i] = temp;
                evenIndex++;
            }
        return nums;
    }
}
