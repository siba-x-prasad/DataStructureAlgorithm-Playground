package companyProgramms.agoda;

import java.util.Scanner;

public class FibonaciSeries {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          int number  = scanner.nextInt();
          printFibonaci(number);
        }
    }
    private static void printFibonaci(int n){
        int[] array = new int[n];
        array[0] =0;
        array[1] = 1;
        for(int i= 2; i<n;i++){
            array[i] = array[i-2]+array[i-1];
        }
        System.out.println("Fibonacci series upto "+n);
        for(int item : array){
            System.out.println(item);
        }
    }
}
