package codingPrograms.recusrion;

import java.util.Scanner;

public class SumOfSeriesOfNumber {
    public static void main(String[] args) {
        System.out.println("Please Enter Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumOfNum = sumOfSeriesOfNumber(number);
        System.out.println("Sum of Number "+sumOfNum);
    }
    private static int sumOfSeriesOfNumber(int number){
       if(number == 0){
           return 0;
       }
       else{
           return number + sumOfSeriesOfNumber(number-1);
       }
    }
}
