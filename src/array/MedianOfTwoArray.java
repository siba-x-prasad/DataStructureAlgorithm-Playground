package array;

import java.util.Arrays;
import java.util.HashSet;


/**
 * [0,0,0,0,0]
 * [-1,0,0,0,0,0,1]
 *
 * Expected
 * 0.00000
 *
 * [1,1]
 * [1,2]
 * Expected Output = 1.5
 */
public class MedianOfTwoArray {
    public static void main(String[] args) {
        getMedianOfTwoSortedArray(new int[]{1,1}, new int[]{1,2});

        // geeks for geeks solution
        int a[] = { 1, 2 };
        int n = a.length;

        // Function call
        System.out.println("Mean = " + findMean(a, n));
        System.out.println("Median = " + findMedian(a, n));
    }

    private static double getMedianOfTwoSortedArray(int[] array1, int[] array2){

        double median = 0.0;
        HashSet<Integer> hs = new HashSet<>();
        for(int item : array1){
            hs.add(item);
        }
        for(int item : array2){
            hs.add(item);
        }

        Object[] array = hs.toArray();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int pos = 0;
        if(hs.size()%2 == 0 ){
            pos = hs.size()/2 - 1;
            int item1 = (Integer) array[pos];
            int item2 = (Integer) array[pos+1];
            median = (double) ((item1+item2) )/2;
        }
        else{
            pos =  hs.size()/2;
            int item1 = (int) array[pos];
            median = item1;
        }
        System.out.println(median);
        return median;
    }
    // Geeks for keeks solution
    // Function for calculating mean
    public static double findMean(int a[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];

        return (double)sum / (double)n;
    }

    // Function for calculating median
    public static double findMedian(int a[], int n)
    {
        // First we sort the array
        Arrays.sort(a);

        // check for even case
        if (n % 2 != 0)
            return (double)a[n / 2];

        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }
}
