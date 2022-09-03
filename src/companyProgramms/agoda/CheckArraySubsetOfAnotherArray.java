package companyProgramms.agoda;


/**
 *
 * Given two arrays: arr1[0..m-1] and arr2[0..n-1].
 * Find whether arr2[] is a subset of arr1[] or not. Both the arrays are not in sorted order.
 * It may be assumed that elements in both array are distinct.
 * array1 = [1,2,3,4,5,6,7,8,9]
 * array2 = [11, 7,8,9]
 */
public class CheckArraySubsetOfAnotherArray {
    public static void main(String[] args) {
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };
        checkIfSubsetArray(arr1, arr2);
    }

    public static void checkIfSubsetArray(int[] array1, int[] array2){
        outer:
        for(int array2Item  : array2){
            boolean isPresent = false;
            for(int array1Item  : array1){
                if(array2Item == array1Item){
                    isPresent = true;
                    break;
                }
            }
            if(!isPresent){
                System.out.println("Both array are not subset");
             break outer;
            } else if (array2Item == array2[array2.length-1]) {
                System.out.println("Both array are  subset");
            }
        }
    }
}
