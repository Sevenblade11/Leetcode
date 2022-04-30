package containmostwater;

/**
 * Status: Accepted
 *
 * 4ms 71.97% faster | 81.6 mb less than 22.28% of Java submissions on 4/5/2022
 *
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 */
public class ContainMostWater {
    private static final int[] HEIGHT = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
    public static void main(String[] args){
        System.out.println(maxArea(HEIGHT));
    }

    public static int maxArea(int[] height) {
        int right = height.length-1, left = 0, minHeight, width, maxArea = 0, curArea;
        while(right > left){
            minHeight = Math.min(height[right], height[left]);
            width = right - left;
            curArea = minHeight * width;

            if(curArea > maxArea)
                maxArea = curArea;
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
    
}
