package collectionsExample.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

// https://leetcode.com/tag/hash-table/
public class MediumLeetCode {
    public static void main(String[] args) {
        printLongestSubStringWithoutRepeatingChar("acssaasaasas");
        int length = longestUniqueSubsttr("pwwkew");
        System.out.println("Substring "+length);

        int co = getGoodPairs(new int[]{1,2,3,1,1,3});
        System.out.println("getGoodPairs "+co);
    }

    /**
     * @param str
     */
    private static void printLongestSubStringWithoutRepeatingChar(String str) {
        HashSet<Character> hashSet = new HashSet();
        String subString = "";
        for (Character ch : str.toCharArray()) {
            if (!hashSet.contains(ch)) {
                subString = subString + ch;
            }
            hashSet.add(ch);
        }

        System.out.println("Longest Sub string of  " + str + "  is " + subString);
    }

    /**
     * longestUniqueSubsttr
     * @param s
     * @return
     */
    static int longestUniqueSubsttr(String str) {

        // Creating a set to store the last positions of occurrence
        HashMap<Character, Integer> seen = new HashMap<>();
        int maximum_length = 0;

        // starting the initial point of window to index 0
        int start = 0;

        for (int end = 0; end < str.length(); end++) {
            // Checking if we have already seen the element or not
            if (seen.containsKey(str.charAt(end))) {
                // If we have seen the number, move the start pointer
                // to position after the last occurrence
                start = Math.max(start, seen.get(str.charAt(end)) + 1);
            }

            // Updating the last seen value of the character
            seen.put(str.charAt(end), end);
            maximum_length = Math.max(maximum_length, end - start + 1);
        }
        return maximum_length;
    }

    /**
     * Number of Good Pairs
     *
     * Given an array of integers nums, return the number of good pairs.
     *
     * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
     *
     * Example 1:
     *
     * Input: nums = [1,2,3,1,1,3]
     * Output: 4
     * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
     *
     * @param array
     * @return
     */
    private static int getGoodPairs(int[] array){
        int count = 0;
        int ct = 0;
        Hashtable<Integer, Integer> hashTable = new Hashtable<>();
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] == array[j] && i < j){
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * How Many Numbers Are Smaller Than the Current Number
     * Input: nums = [8,1,2,2,3]
     * Output: [4,0,1,1,3]
     * Explanation:
     * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
     * For nums[1]=1 does not exist any smaller number than it.
     * For nums[2]=2 there exist one smaller number than it (1).
     * For nums[3]=2 there exist one smaller number than it (1).
     * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
     * @param array
     * @return
     */
    private static int[] findNumberOfElementsSmaller(int[] array){
        int[] smallerNumber = new int[array.length];
//        Arrays.sort(array);
        for(int i  : array){
            int count  =  0;
            for(int  j : array){
                if(i  > j){
                    count++;
                }
            }
            smallerNumber[i]  = count;
        }
        return smallerNumber;
    }

}
