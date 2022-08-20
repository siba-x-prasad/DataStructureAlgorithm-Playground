package codingPrograms.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * https://leetcode.com/problems/two-sum/
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSumInAnArray {
    public static void main(String[] args) {
        int[] res = getSumArray(new int[]{2, 7, 11, 15},  9);
        System.out.println(Arrays.toString(res));
        printpairs(new int[]{2, 7, 11, 15},  9);

    }
    private static int[] getSumArray(int[] array, int sum){
        int[] resArray =  new int[2];
        for(int i : array ){
            for(int j : array ){
                if(i+j == sum) {
                    resArray[0] = i;
                    resArray[1] = j;
                }
            }
        }
        return resArray;
    }
    private static void printpairs(int[] array, int sum){
        HashSet<Integer> set = new HashSet<>();

        for(int item : array){
            int temp = sum - item;
            if(set.contains(temp)){
                System.out.println(
                        "Pair with given sum "
                                + sum + " is (" + item
                                + ", " + temp + ")");
            }
            else{
                set.add(temp);
            }
        }
    }
}
