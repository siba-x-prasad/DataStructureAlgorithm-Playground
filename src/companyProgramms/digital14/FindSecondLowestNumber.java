package companyProgramms.digital14;

/**
 * Created by Sibaprasad Mohanty on 23/02/2022.
 * Spm Limited
 * sp.dobest@gmail.com
 */

public class FindSecondLowestNumber {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 19, 90, 1, 3, 5, 2};
        int number = findSecondMinimumElement(arr);
        System.out.println(number);
        print2Smallest(arr);
    }

    private static int findSecondMinimumElement(int[] array) {
        int minNumber = 0;
        int secondMinNumber = 0;

        if (array.length > 0) {
            minNumber = array[0];
            secondMinNumber = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] <= minNumber) {
                    secondMinNumber = minNumber;
                    minNumber = array[i];
                } else if (array[i] <= secondMinNumber && array[i] != minNumber) {
                    secondMinNumber = array[i];
                }
            }
        }
        return secondMinNumber;
    }

    static void print2Smallest(int arr[]) {
        int first, second, arr_size = arr.length;

        /* There should be atleast two elements */
        if (arr_size < 2) {
            System.out.println(" Invalid Input ");
            return;
        }

        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size; i++) {
            /* If current element is smaller than first
              then update both first and second */
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            }

            /* If arr[i] is in between first and second
               then update second  */
            else if (arr[i] < second && arr[i] != first)
                second = arr[i];
        }
        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second" +
                    "smallest element");
        else
            System.out.println("The smallest element is " +
                    first + " and second Smallest" +
                    " element is " + second);
    }

    /* Driver program to test above functions */
}


