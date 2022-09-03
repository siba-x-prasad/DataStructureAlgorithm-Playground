package strings;

import java.util.Scanner;

public class CapitalizeAString {
    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.print("  Capitalize of "+sentence+" is : "+capitaliseOfString(sentence));
    }
    private static String capitaliseOfString(String sentence){
        String[] array = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s : array){
           String firstChar = s.substring(0,1);
            firstChar = firstChar.toUpperCase();
            String secondChar = s.substring(1,s.length()).toLowerCase();
            sb.append(firstChar);
            sb.append(secondChar);
            sb.append(" ");
        }
        return sb.toString();
    }
}
