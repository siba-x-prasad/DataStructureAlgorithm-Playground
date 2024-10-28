package codingPrograms.leetcode.arrays.difficult;

import java.util.Arrays;

/**
 * 2035. Partition Array Into Two Arrays to Minimize Sum Difference
 * <p>
 * You are given an integer array nums of 2 * n integers. You need to partition nums into two arrays of length n to minimize the absolute difference of the sums of the arrays. To partition nums, put each element of nums into one of the two arrays.
 * <p>
 * Return the minimum possible absolute difference.
 * <p>
 * example-1
 * Input: nums = [3,9,7,3]
 * Output: 2
 * Explanation: One optimal partition is: [3,9] and [7,3].
 * The absolute difference between the sums of the arrays is abs((3 + 9) - (7 + 3)) = 2.
 */
public class PartitionArrayIntoTwoArrayToMinimizeSum {
    public static void main(String[] args) {

    }

    private static int getMinimalDifferenceBetweenTwoArray(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);


        return 2;
    }
}
