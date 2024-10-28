package codingPrograms.leetcode.arrays.easy;

public class BuildArrayfromPermutation {
    public static void main(String[] args) {

    }
    private static int[] buildArrayFromPermutation(int[] array){
        int[] newArray = new int[array.length];
        for(int i = 0; i< array.length; i++){
            newArray[i] = array[array[i]];
        }
        return newArray;
    }
}
