package strings;

import java.util.Scanner;

import static java.lang.Character.isUpperCase;

/**
 * Convert the  strings
 * If in  upper character make lowercase
 * If in lowercase, make it upper case
 *
 * I am SibaPrasad -> i AM sIBApRASAD
 */
public class ToggleEachWord {
    public static void main(String[] args) {
        System.out.print("ENter a String : ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.print(sentence+"  Converted sentence to : "+convertString(sentence));
    }
    private static String convertString(String sentence){
        if(sentence.isEmpty())
            return "";
        StringBuilder  sb = new StringBuilder();
        for(Character ch : sentence.toCharArray()){
            char c = ch;
            if(isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }
            else{
                sb.append(Character.toUpperCase(ch));
            }
        }
        return sb.toString();
    }
}
