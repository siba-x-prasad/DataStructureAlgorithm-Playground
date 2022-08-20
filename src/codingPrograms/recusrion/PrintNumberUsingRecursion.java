package codingPrograms.recusrion;

import java.util.Scanner;

public class PrintNumberUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Please Enter Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printSeries(number);
    }
    private static void printSeries(int number){
        if(number >= 0){
            System.out.print(number);
            printSeries(--number);
        }
    }
}
