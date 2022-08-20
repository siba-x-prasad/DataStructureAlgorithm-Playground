package array;

import java.util.*;

public class ArrayPrograms {

    public static void main(String... args) {

        int[] a = { 1, 1, 2, 2, 2 };
        int n = a.length;

        n = removeduplicates(a, n);

        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

    }


//  How to find the missing number in integer array of 1 to 100?
    private int getMissingNumbers(int[] array) {
        int length = array.length;
        int totalSum = length * (length + 1) / 2;
        int sumOfArray = 0;
        for (int j : array) {
            sumOfArray += j;
        }
        return totalSum - sumOfArray;
    }

    // How to find duplicate number on Integer array in Java ?
    private int duplicateNumber(int[] array) {
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

    // How to check if array contains a number in Java ?
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

    // How to find largest and smallest number in unsorted array ?
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

    // - How to find all pairs on integer array whose sum is equal to given number ?
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
    // How to find repeated numbers in an array if it contains multiple duplicates ?
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
    // Write a program to remove duplicates from array in Java ?
    public static int removeduplicates(int a[], int n) {
        // { 1, 1, 2, 2, 2 }
        if (n == 0 || n == 1) {
            return n;
        }

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];

        // Changing the original array
        if (j >= 0) System.arraycopy(temp, 0, a, 0, j);

        return j;
    }
    // FInd Unique elements of an array
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

    // There is an array with every element repeated twice except one. Find that element?
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
    //- How to find kth the smallest element in unsorted array?
    private int getnthSmallestElement(int[] arr, int kth){
        int kthSmallestNumber = 0;
        // Sort the given array
        Arrays.sort(arr);
        // Return k'th element in
        // the sorted array
        return arr[kth - 1];
    }
    //- How to find kth the largest element in unsorted array?
    private int getnthLargestElement(Integer[] arr, int kth){
        int kthSmallestNumber = 0;
        // Sort the given array
        Arrays.sort(arr, Collections.reverseOrder());
        // Return k'th element in
        // the sorted array
        return arr[kth - 1];
    }

// How to find common elements in three sorted array?
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
}
