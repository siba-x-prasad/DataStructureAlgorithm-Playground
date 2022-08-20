package codingPrograms.leetcode;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("Enter a number to reverse : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int rev = reverseInteger(number);
        System.out.println("Reverse of "+ number +" is   : "+rev);
    }
    private static int reverseInteger(int num){
        int reverseInt = 0;
        while (num > 0){
            reverseInt = reverseInt*10;
            int nm = num %10;
            reverseInt = reverseInt+nm;
            num = num/10;
        }
        return reverseInt;
    }
}
