package companyProgramms.agoda;

import java.util.*;

public class ThreeSumInArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = keyboard.nextInt();
        }
        int target = keyboard.nextInt();

        keyboard.close();

        List<Integer[]> result = findThreeSum_Sorting(nums, target);
        List<Integer[]> result1 = findThreeSumNumber(nums, target);

        for(Integer[] triplets: result1) {
            for(int num: triplets) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static List<Integer[]> findThreeSum_Sorting(int[] array, int sum){
        Arrays.sort(array);
        List<Integer[]> result = new ArrayList<>();
        for(int i = 0; i< array.length; i++){
             int left =  i+1;
             int right = array.length - 1;
            while (left < right) {
                if (array[i] + array[left] + array[right] == sum) {
                    result.add(new Integer[]{array[i], array[left], array[right]});
                    left++;
                    right--;
                }
                else if (array[i] + array[left] + array[right] < sum) {
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }

    private static List<Integer[]> findThreeSumNumber(int[] array, int targetSum ){
        ArrayList<Integer[]> threeSumList = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0;i < array.length; i++){
            HashSet<Integer> num = new HashSet<>();
            int currentTarget = targetSum - array[i];
            for(int j = i+1; j< array.length; j++){
                if(num.contains(currentTarget - array[j])){
                    threeSumList.add(new Integer[] { array[i], array[j], currentTarget - array[j] });
                }
                else{
                    num.add(array[j]);
                }
            }
        }
        return threeSumList;
    }

}
