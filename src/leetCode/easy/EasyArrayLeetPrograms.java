package leetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EasyArrayLeetPrograms {
    public static void main(String[] args) {
//        int[] array = getConcatenation(new int[]{1,2,1});
//        int[] array = runningSum(new int[]{1, 2, 3, 4});
//        int[] array = shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
//        int[] array = decompressRLElist(new int[]{1,2,3,4});
//        System.out.println(Arrays.toString(array));
//        String result = restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3});
//        System.out.println(result);
        int[][] array = flipAndInvertImage(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}});
        System.out.println(Arrays.toString(array));
        int res = findKthMissingNumber(new int[]{1,2,3,4}, 6);
        System.out.println(res);

    }

    /**
     * https://leetcode.com/problems/concatenation-of-array/
     * <p>
     * Input: nums = [1,2,1]
     * Output: [1,2,1,1,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
     * - ans = [1,2,1,1,2,1]
     */
    public static int[] getConcatenation(int[] nums) {
        int expectedSize = nums.length * 2;
        int[] newArray = new int[expectedSize];
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[i];
            newArray[nums.length + i] = nums[i];
        }
        return newArray;
    }

    /**
     * Running Sum of 1d Array
     * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
     * <p>
     * Return the running sum of nums.
     * Input: nums = [1,2,3,4]
     * Output: [1,3,6,10]
     * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     */
    private static int[] runningSum(int[] nums) {
        int[] array = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            array[i] = sum;
        }
        return array;
    }

    /**
     * Input: operations = ["++X","++X","X++"]
     * Output: 3
     * Explanation: The operations are performed as follows:
     * Initially, X = 0.
     * ++X: X is incremented by 1, X = 0 + 1 = 1.
     * ++X: X is incremented by 1, X = 1 + 1 = 2.
     * X++: X is incremented by 1, X = 2 + 1 = 3.
     */
    private static int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for (String action : operations) {
            if (action.equalsIgnoreCase("x++") || action.equalsIgnoreCase("++x")) {
                result++;
            } else if (action.equalsIgnoreCase("x--") || action.equalsIgnoreCase("--x")) {
                result--;
            }
        }

        return result;
    }

    /**
     * Input: accounts = [[1,2,3],[3,2,1]]
     * Output: 6
     * Explanation:
     * 1st customer has wealth = 1 + 2 + 3 = 6
     * 2nd customer has wealth = 3 + 2 + 1 = 6
     * Both customers are considered the richest with a wealth of 6 each, so return 6.
     *
     * @param accounts
     * @return
     */
    private static int maximumWealth(int[][] accounts) {
        int richestHealth = 0;
        int currentHealth = 0;
        for (int[] array : accounts) {
            for (int i : array) {
                currentHealth += i;
            }
            if (richestHealth < currentHealth) {
                richestHealth = currentHealth;
            }
            currentHealth = 0;
        }
        return richestHealth;
    }

    /**
     * @param nums
     * @param n
     * @return Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
     * <p>
     * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
     * <p>
     * Input: nums = [2,5,1,3,4,7], n = 3
     * Output: [2,3,5,4,1,7]
     * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
     */

    private static int[] shuffle(int[] nums, int n) { // 0 3 1 4  2 5
        int[] array = new int[nums.length];

        int counter = 0;
        for (int i = 0; i < n * 2; i = i + 2) {

            array[i] = nums[i - counter];
            array[i + 1] = nums[n + counter];
            counter++;

        }

        return array;
    }

    /**
     * @param sentences
     * @return Maximum Number of Words Found in Sentences
     */

    private static int mostWordsFound(String[] sentences) {
        int maxNumberOfWords = 0;
        for (String str : sentences) {
            String[] array = str.split("  ");
            if (array.length > maxNumberOfWords) {
                maxNumberOfWords = array.length;
            }
        }
        return maxNumberOfWords;
    }

    /**
     * Given an array of integers nums, return the number of good pairs.
     * <p>
     * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,2,3,1,1,3]
     * Output: 4
     * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
     *
     * @param array
     * @return
     */

    private static int numIdenticalPairs(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && i < j) {
                    count++;
                }
            }
        }
        return count;

    }

    /**
     * Input: candies = [2,3,5,1,3], extraCandies = 3
     * Output: [true,true,true,false,true]
     * Explanation: If you give all extraCandies to:
     * - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
     * - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
     * - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
     * - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
     * - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
     *
     * @param candies
     * @param extraCandies
     * @return
     */
    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maxCandis = candies[0];
        for (int i : candies) {
            if (i > maxCandis) {
                maxCandis = i;
            }
        }

        for (int i : candies) {
            list.add(i + extraCandies >= maxCandis);
        }
        return list;
    }

    /**
     * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
     * <p>
     * Return the answer in an array.
     *
     * @param array
     * @return
     */

    private static int[] smallerNumbersThanCurrent(int[] array) {
        int[] smallerNumber = new int[array.length];
        int pos = 0;
        for (int i : array) {
            int count = 0;
            for (int j : array) {
                if (i > j) {
                    count++;
                }
            }
            smallerNumber[pos] = count;
            pos++;
        }
        return smallerNumber;
    }

    /**
     * https://leetcode.com/problems/decompress-run-length-encoded-list/
     *
     * @param nums
     * @return
     */
    private static int[] decompressRLElist(int[] nums) {

        // int[]  array1 = new int[Integer.MAX_VALUE];
        ArrayList<Integer> list = new ArrayList<>();

        int counter = 0;
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
//               array1[counter] = nums[i+1];
//               counter++;
                list.add(nums[i + 1]);

            }
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    /**
     * https://leetcode.com/problems/create-target-array-in-the-given-order/
     *
     * @param nums
     * @param index
     * @return
     */
    private static int[] createTargetArray(int[] nums, int[] index) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
//            array[i] =
        }
        return array;
    }

    /**
     * https://leetcode.com/problems/shuffle-string/
     *
     * @param s
     * @param indices
     * @return
     */
    private static String restoreString(String s, int[] indices) {
        char[] charArray = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            charArray[indices[i]] = s.charAt(i);
        }
        return String.valueOf(charArray);
    }

    /**
     * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
     * <p>
     * To flip an image horizontally means that each row of the image is reversed.
     * <p>
     * For example, flipping [1,1,0] horizontally results in [0,1,1].
     * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
     * <p>
     * For example, inverting [0,1,1] results in [1,0,0].
     *
     * @param image
     * @return
     */
    private static int[][] flipAndInvertImage(int[][] image) {
        int[][] resultArray = new int[image[0].length][image.length];
        for (int k = 0; k < image.length; k++) {
            int[] array = image[k];
            int count = 0;
            for (int i = array.length - 1; i >= 0; i--) {
                int res = 0;
                if (array[i] == 0) {
                    res = 1;
                }
                resultArray[k][count] = res;
            }
        }
        for (int[] arra : resultArray) {
            System.out.println(Arrays.toString(arra));
        }
        return resultArray;
    }

    /**
     * https://leetcode.com/problems/count-items-matching-a-rule/
     *
     * @param items
     * @param ruleKey
     * @param ruleValue
     * @return
     */
    private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        int itemPosition = 2;

        if (ruleKey.equalsIgnoreCase("type")) {
            itemPosition = 0;
        } else if (ruleKey.equalsIgnoreCase("color")) {
            itemPosition = 1;
        }

        for (List<String> itemsList : items) {
            if (itemsList.get(itemPosition).equalsIgnoreCase(ruleValue)) {
                count++;
                continue;
            }

        }
        return count;
    }

    /**
     * https://leetcode.com/problems/number-of-arithmetic-triplets/
     *
     * @param nums
     * @param diff
     * @return
     */
    private static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int k = i + 1; k < nums.length - 1; k++) {
                int currDiff2 = nums[k] - nums[i];
                if (currDiff2 > diff) {
                    continue;
                }
                for (int l = k + 1; l < nums.length; l++) {
                    int currDiff1 = nums[l] - nums[k];
                    if (currDiff1 > diff)
                        continue;
                    if (currDiff1 == diff && currDiff2 == diff) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    /**
     * https://haren-lin-1.gitbook.io/leetcode-training/array/1539.-kth-missing-positive-number
     *
     * @param array
     * @param k
     * @return
     */
    private static int findKthMissingNumber(int[] array, int k) {

        int number = 0;
        int result = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (i == 0) {
                number += array[0] - 1;
                if (number >= k) {
                    result = k;
                }
            } else {
                number += array[i + 1] - array[i] - 1;
                if(number >= k){
                    result = array[i]+(number-k)+1;
                }
                else{
                    result = array[i+1] + (k-number);
                }

            }
        }
        return result;
    }


}
