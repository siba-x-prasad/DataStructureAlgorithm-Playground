package codingPrograms.leetcode.arrays.difficult;

import java.util.Arrays;

/**
 * Given an unsorted integer array nums, return the smallest missing positive integer.
 *
 * You must implement an algorithm that runs in O(n) time and uses constant extra space.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,0]
 * Output: 3
 * Example 2:
 *
 * Input: nums = [3,4,-1,1]
 * Output: 2
 * Example 3:
 *
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 */
public class FirstMissingPositiveNumber {

    public static void main(String[] args) {
        firstMissingPositive(new int[]{3,4,-1,1});
    }

    private static int firstMissingPositive(int[] nums) {
        int missingNumber = 1;
        Arrays.stream(nums).filter(it -> it >= 0);
        Arrays.sort(nums);

        if(nums[0] > 1){
            return 1;
        }

        for(int  i = 0; i < nums.length - 1; i++){
            if(nums[i] > 0 && nums[i] + 1 != nums[i+1]  ){
                missingNumber = nums[i] + 1;
                break;
            }
            else{
                missingNumber = nums[nums.length -1]+1;
            }
        }
        return missingNumber;
    }
}
