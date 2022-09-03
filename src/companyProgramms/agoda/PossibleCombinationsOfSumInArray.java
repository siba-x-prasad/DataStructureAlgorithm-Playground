package companyProgramms.agoda;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *  * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *  * You can return the answer in any order.
 */
public class PossibleCombinationsOfSumInArray {

    public static void main(String[] args) {
        int[] array  = {1,2,3,4,5,6,7,8,9,0,-4, -3};
        findTargetSumIndex(array, 5);
    }
    private static  void findTargetSumIndex(int[] array, int targetSum){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(targetSum == array[i]+array[j] ){
                    System.out.println("Index of 2 items i = "+ array[i]+" j="+array[j]+" target sum index "+i+" "+j);
                }
            }
        }
    }
}
