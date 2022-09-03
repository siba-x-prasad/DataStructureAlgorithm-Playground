package array;

import java.util.*;

public class ThreeSumCombinationInArray {
    public static void main(String[] args) {
        printThreeSumCombinationInArray(new int[]{0, 1, 2, 3, 4, 5, 6, 7}, 8);
//        printTwoSumCombinationInArray(new int[]{0, 1, 2, 3, 4, 5, 6, 7}, 6);
    }

    private static List<List<Integer>> printThreeSumCombinationInArray(int[] array, int targetSum) {
        Arrays.sort(array);

        HashSet<Integer>  hs  = new HashSet<>();
        for(int i : array){
            hs.add(i);
        }

        int[] array1 = new int[hs.size()];
        int pos = 0;
        for(Integer s :  hs){
           array1[pos] = s;
        }

        List<List<Integer>> threeSumCombinationList = new ArrayList<>();

        for (int i = 0; i < array.length - 2; i++) {
            HashSet<Integer> set = new HashSet<>();

            int currentSum = targetSum - array[i];

            for (int j = i+1; j < array.length; j++) {
                if (set.contains(currentSum - array[j]) ) {
                    System.out.println(array[i] + " + " + array[j] + " + " + (currentSum - array[j])+" = "+targetSum);
                    List<Integer> result = new ArrayList<>();
                    result.add(array[i]);
                    result.add(array[j]);
                    result.add(currentSum - array[j]);
                    threeSumCombinationList.add(result);
                }
                set.add(array[j]);
            }
        }
        return threeSumCombinationList;
    }

    private static void printTwoSumCombinationInArray(int[] array, int targetSum) {
        Arrays.sort(array);
        HashSet<Integer> set = new HashSet<>();
        for (int i : array) {
            int otherItems = targetSum - i;
            if (set.contains(otherItems)) {
                System.out.println(i + " " +" " + otherItems);
            } else {
                set.add(i);
            }
        }
    }
}
