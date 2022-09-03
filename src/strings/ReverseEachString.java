package strings;

import java.util.Scanner;

public class ReverseEachString {

    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.print("Reverse each String of "+sentence+" is : "+reverseStringInSentence(sentence));
    }
    private static String reverseStringInSentence(String str){
        String[] array = str.split(" ");
        StringBuilder  sb = new StringBuilder();
        for(String s : array){
            sb.append(new StringBuilder(s).reverse());
            sb.append("  ");
        }
        return sb.toString();
    }
}
