package codingPrograms.geeksforgeeks.strings.level1;

import java.util.Scanner;

// Reverse words in a given string
public class ReverseWordsInSendence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter A sentence");
        String sentence = scanner.nextLine();
        String s = reverseSentence(sentence);
        System.out.println("Reverse of words Of A sentence  "+sentence+" is "+s);
    }

    public static String reverseSentence(String sentence){
        StringBuffer sb = new StringBuffer("");
        String[] arr = sentence.split(" ");
        for(String s : arr){
            String revString =  new StringBuffer(s).reverse()+" ";
            System.out.println(reverseString(s));
            sb.append(revString);
        }
        return sb.toString();
    }

    public static String reverseString(String str){
        String revStr = "";
        for( int i = str.length()-1; i>=0; i-- ){
            revStr = ""+str.charAt(i);
        }
        return revStr;
    }

}
