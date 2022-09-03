package companyProgramms.agoda;

import java.util.Scanner;

public class MakeGivenStringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to Palindrom");
        String str = scanner.next();
        String output = makeStringPalindrome(str);
        System.out.println("Palindrom string "+output);
}
    private static String makeStringPalindrome(String str) {
        String palindromStr  = "";
        String st = str.substring(0,str.length()-1);
        palindromStr = str+new StringBuffer(st).reverse();
        return palindromStr;
    }
}
