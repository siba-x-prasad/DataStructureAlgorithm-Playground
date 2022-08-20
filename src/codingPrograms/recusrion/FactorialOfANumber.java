package codingPrograms.recusrion;

import java.util.Scanner;

/**
 * Find the factorial of a number
 * 1. using Recursion
 * 2. Using normal
 */
public class FactorialOfANumber {
    public static void main(String[] args) {
        System.out.println("Please Enter Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorialRec = getFactorialByRecusrion(number);
        System.out.println("Factorial Of a Number using recusrion "+number+" is "+factorialRec);
        int factorial = getFactorial(number);
        System.out.println("Factorial Of a Number "+number+" is "+factorial);
    }

    private static int getFactorial(int number){
        int factorial = 1;
        for(int i = 1;i <=number;i++){
            factorial *= i;
        }
        return factorial;
    }
    private static int getFactorialByRecusrion(int number){
        if(number == 0)
            return 1;
        else
            return number * getFactorialByRecusrion(number - 1);
    }

}
