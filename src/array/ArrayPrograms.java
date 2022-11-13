package array;

import java.util.*;

public class ArrayPrograms {

    public static void main(String... args) {

        int[] a = { 1, 1, 2, 2, 2 };
        int n = a.length;

        n = removeDuplicates(a, n);

        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    /**
     * How to find the missing number in integer array of 1 to 100?
     * @param array
     * @return
     */
    private int getMissingNumbers(int[] array) {
        int length = array.length;
        int totalSum = length * (length + 1) / 2;
        int sumOfArray = 0;
        for (int j : array) {
            sumOfArray += j;
        }
        return totalSum - sumOfArray;
    }

    /**
     * Combine two arrays into one
     * @param combinedArray
     * @param array2
     */
    void combine(String[] combinedArray, String[] array2){
        ArrayList<String> al = new ArrayList<>();
        HashMap<String, String> hm = new HashMap<>();
        for(String item : combinedArray){
            if(hm.containsKey(item)){
                al.add(item);
            }
            else{
                hm.put(item, item);
            }
        }

        System.out.println(al);
    }

    /**
     * How to find duplicate number on Integer array in Java ?
     * @param array
     * @return
     */
    private int findDuplicateElementInArray(int[] array) {
        int duplicateNumber = 0;
        // solution 1
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == (array[j])) {
                    duplicateNumber = array[i];
                    break;
                }
            }
        }
        // solution 2 using set
        Set<Integer> set = new HashSet<>();
        for (int number : array) {
            if (!set.add(number)) {
                duplicateNumber = number;
            }
        }

        // Solution 3 using collectionsExample.hashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int number : array) {
            Integer count = map.get(number);
            if (count != null) {
                duplicateNumber = number;
            } else {
                map.put(number, 1);
            }
        }

        return duplicateNumber;

    }

    /**
     * How to check if array contains a number in Java ?
     * @param array
     * @param number
     * @return
     */
    private boolean checkIfArrayContainsNumber(int[] array, int number) {
        boolean isContainNumber = false;
        // solution 1 - compare each element with the given number
        for (int j : array) {
            if (j == number) {
                isContainNumber = true;
                break;
            }
        }
        // solution2 - convert Array tto arraylist anc use contains method
        isContainNumber = Arrays.asList(array).contains(number);
        // solution 3 - use BinarySearch on a array
        Arrays.sort(array);
        isContainNumber = Arrays.binarySearch(array, number) >= 0;

        return isContainNumber;
    }

    /**
     * How to find largest and smallest number in unsorted array ?
     * @param array
     */
    private void findLargestAndSmallestNumber(int[] array) {
        int smallestNumber = array[0];
        int largestNumber = array[0];
        for (int num : array) {
            if (num > largestNumber) {
                largestNumber = num;
            } else if (num < smallestNumber) {
                smallestNumber = num;
            }
        }

        System.out.println("Smallest " + smallestNumber + " Biggest " + largestNumber + " in " + array);

    }

    /**
     * How to find all pairs on integer array whose sum is equal to given number ?
     * @param array
     */
    private void findAllPairs(int[] array) {
        Integer[] arrayPair = new Integer[2];
        HashMap<Integer, Integer[]> map = new HashMap<>();
        int numberOfPairs = 0;
        for (int number1 : array) {
            int number2 = 0;
            arrayPair[0] = number1;
            for (int i : array) {
                number2 = i;
                arrayPair[1] = number2;
                int sum = number1 + number2;
                if (map.get(sum) == null) {
                    map.put(sum, arrayPair);
                } else {
                    numberOfPairs++;
                    System.out.println("Paired Array " + arrayPair);
                }
            }
        }
        System.out.println("Total Number of Pairs " + numberOfPairs);

        // only Pair Count is
        int count = 0; // Initialize result
        int sum = 6;
        // Consider all possible pairs and check their sums
        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if ((array[i] + array[j]) == sum)
                    count++;

        System.out.printf("Count of pairs is %d", count);
    }

    /**
     * How to find repeated numbers in an array if it contains multiple duplicates ?
     * @param array
     */
    private void findDuplicateNumbersInArray(int[] array){
        HashMap<Integer, Integer> map = new HashMap<>();
        int totalDuplicate = 0;
        for (int number : array) {
            Integer count = map.get(number);
            if (count == null) {
                map.put(number, 1);
            } else {
                count++;
                map.put(number, count);
                totalDuplicate++;
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+" repeated "+value +" Times");
        }
    }

    /**
     * Write a program to remove duplicates from array in Java ?
      */
    public static int removeDuplicates(int array[], int n) {
        // { 1, 1, 2, 2, 2 }
        if (n == 0 || n == 1) {
            return n;
        }

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }

        temp[j++] = array[n - 1];

        // Changing the original array
        if (j >= 0) System.arraycopy(temp, 0, array, 0, j);

        return j;
    }

    /**
     * Find Unique elements of an array
     * @param arr
     * @return
     */
    private int[] getUniqueElementArray(int[] arr) {
//        int [] arr = {1,1,1,2,2,2,3,3,3,4,4,5,5,6,7,8,};
        for (int j = 0; j < arr.length; j++) {
            int count1 = 0; // to find out how many time value is appeared in the arry
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr[j]) {
                    // if(arr[i] == 1 ) { once boyleydi ikinci for gelince soldaki oldu
                    count1++; // arraydeki harfleri tek tek saymak icin
                }
            }
            if (count1 == 1) {
                System.out.print(arr[j] + " ");// 6 7 8 uniqe
            }
        }
        return arr;
    }
    // Write a program to find intersection of two sorted arrays in Java?

    /**
     * There is an array with every element repeated twice except one. Find that element?
      */
    private int getNonRepeatedNumber(int[] array){
        // easy way
        // sort the array and check

        // efficient way
        // using xor operator
        int res = array[0];
        int number = 0;
        for (int i = 1;i<array.length;i++){
            res = res ^ array[i];
        }
        return res;
    }

    /**
     * How to find kth the smallest element in unsorted array?
     * @param arr
     * @param kth
     * @return
     */
    private int getNthSmallestElement(int[] arr, int kth){
        int kthSmallestNumber = 0;
        // Sort the given array
        Arrays.sort(arr);
        // Return k'th element in
        // the sorted array
        return arr[kth - 1];
    }

    /**
     * How to find kth the largest element in unsorted array?
     * @param arr
     * @param kth
     * @return
     */
    private int getNthLargestElement(Integer[] arr, int kth){
        int kthSmallestNumber = 0;
        // Sort the given array
        Arrays.sort(arr, Collections.reverseOrder());
        // Return k'th element in
        // the sorted array
        return arr[kth - 1];
    }

    /**
     * How to find common elements in three sorted array?
     * @param ar1
     * @param ar2
     * @param ar3
     */
    private void printCommonElementsIn3SortedArray(int[] ar1, int[] ar2, int[] ar3){
        int i = 0, j = 0, k = 0;

        // Iterate through three arrays while all arrays
        // have elements
        while (i < ar1.length && j < ar2.length
                && k < ar3.length) {
            // If x = y and y = z, print any of them and
            // move ahead in all arrays
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                System.out.print(ar1[i] + " ");
                i++;
                j++;
                k++;
            }

            // x < y
            else if (ar1[i] < ar2[j])
                i++;

                // y < z
            else if (ar2[j] < ar3[k])
                j++;

                // We reach here when x > y and z < y, i.e., z
                // is smallest
            else
                k++;
        }
    }

    /**
     * Find the missing number in an array
     * @param array
     */
    private void printMissingNumber(int[] array){
        int currentItem = array[0];
        String missingItem = "";
        for(int i  = 1; i<array.length;i++){
            if(currentItem+1 == array[i]){
                currentItem = array[i];
            }
            else{
                System.out.println(""+currentItem+1);
            }
        }
    }

    /**
     * How to find duplicate number on Integer array in Java?
     * @param array
     */
    private void printDuplicateNumbers(int[] array){
        int temp = array[0];
        for(int i  = 1; i<array.length;i++){
            if(temp == array[i]){
                System.out.println("Duplicate Number Is "+temp);
            }
            else{
                temp = array[i];
            }
        }
    }

    /**
     * How to check if array contains a number in Java?
     * @param array
     * @param number
     */
    private void checkIfNumberExists(int[] array, int number){
        for(int i = 0; i<array.length; i++ ){
            if(array[i] == number){
                System.out.println(number+" is Present at "+i+" Position");
            }
        }
    }

    /**
     * How to find largest and smallest number in unsorted array?
     * @param array
     */
    private void findSmallestLargestNumber(int[] array){
        int smallestNumber = array[0];
        int biggestNumber = array[array.length-1];
        for(int i = 1; i<array.length-1; i++ ){
            if(smallestNumber > array[i]){
                smallestNumber = array[i];
            }
            if(biggestNumber < array[i]){
                biggestNumber = array[i];
            }
        }
        System.out.println(biggestNumber+" is Biggest Number And "+smallestNumber+" is Smallest Number");
    }

    /**
     * How to find all pairs on integer array whose sum is equal to given number ?
     * @param array
     * @param sumOf2Numbers
     */
    private void findPairsWhoseSumIsSame(int[] array, int sumOf2Numbers){
        for(int i = 0; i<array.length; i++ ){
            for(int j = 0; j<array.length; j++ ){
                if(array[i]+array[j] == sumOf2Numbers){
                    System.out.println("2 Pair sum is same "+array[i] +" AND "+array[j]);
                }
            }
        }
    }

    /**
     * How to find repeated numbers in an array if it contains multiple duplicates ?
     * @param array
     */
    private void findRepeatedNumbersFromArray(int[] array){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< array.length; i++){
            Integer key = array[i];
            if(map.containsKey(key)){
                int count = map.get(key);
                map.put(key,++count);
            }
            else{
                map.put(key,1);
            }
        }

        map.forEach((key,value) -> {
            if(value > 1){
                System.out.println(key+" is Repeated "+value+" Times");
            }
        });
    }

    /**
     * Print Two sum Combination in Array
     * @param array
     * @param sum
     */
    private static void printTwoSumCombinationInArray(int[] array, int sum){
        HashSet<Integer> hashSetUniqueCombination = new HashSet<>();
        for(int item : array){
            int otherItem = sum - item;
            if(!hashSetUniqueCombination.contains(otherItem)){
                hashSetUniqueCombination.add(otherItem);
            }
            else{
                System.out.println(otherItem+" "+item);
            }
        }
    }

    /**
     * Print Three Sum Combination Array
     * @param array
     * @param targetSum
     * @return
     */
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

}
