package leetCode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class twoSumFromArray {
    public static void main(String[] args) {
//        printTwoSum(new int[]{2, 7, 11, 15}, 9);
        printTwoSumAnotherWay(new int[]{3, 2, 4}, 6);
        printTwoSum(new int[]{0,1,2,3,4,5,6}, 6);
    }

    private static void printTwoSum(int[] array, int targetSum) {
        Arrays.sort(array);
        HashSet<Integer> set = new HashSet<>();
        for (int j : array) {
            int currentSum = targetSum - j;
            if (set.contains(currentSum)) {
                System.out.println(j + " " + currentSum);
            } else {
                set.add(j);
            }
        }
    }

    private static int[] printTwoSumAnotherWay(int[] array, int targetSum) {
        // 324   6
        Arrays.sort(array);
        int[] arr = new int[2];
        HashMap<Integer, Integer> set = new HashMap();
        for (int i = 0; i < array.length; i++) {
            int currentSum = targetSum - array[i];
            if (set.containsKey(currentSum)) {
                System.out.println(array[i] + " => " + set.get(currentSum));
                arr[0] = i;
                arr[1] = set.get(currentSum);
            } else {
                set.put(array[i], i);
            }
        }
        return arr;
    }
}
