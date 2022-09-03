package strings;

import java.util.Scanner;

import static java.lang.Character.isUpperCase;

/**
 * input : Siba Prasad
 * output : aBIS dASARP
 */
public class ReverseToggleEachWord {
    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.print("  Reverse Toggle of "+sentence+" is : "+reverseToggleEachWord(sentence));
    }
    private static String reverseToggleEachWord(String sentence){
        if(sentence.isEmpty())
            return "";

        String[] array = sentence.split(" ");

        StringBuilder  sb = new StringBuilder();
        for(String str   : array){
            for(int i = str.length()-1; i >= 0 ; i--){
                Character  ch =  str.charAt(i);
                if(i  == str.length()-1){
                    sb.append(Character.toLowerCase(ch));
                }
                else{
                    sb.append(Character.toUpperCase(ch));
                }
            }
            sb.append(" ");
        }

        return sb.toString();
    }
}
