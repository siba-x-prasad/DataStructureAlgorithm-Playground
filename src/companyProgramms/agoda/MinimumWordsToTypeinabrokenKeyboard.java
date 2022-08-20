package companyProgramms.agoda;

// https://leetcode.com/problems/maximum-number-of-words-you-can-type/

import java.util.Arrays;
import java.util.Scanner;

/**
 * There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.
 *
 * Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.
 *
 *
 *
 * Example 1:
 *
 * Input: text = "hello world", brokenLetters = "ad"
 * Output: 1
 * Explanation: We cannot type "world" because the 'd' key is broken.
 * Example 2:
 *
 * Input: text = "leet code", brokenLetters = "lt"
 * Output: 1
 * Explanation: We cannot type "leet" because the 'l' and 't' keys are broken.
 * Example 3:
 *
 * Input: text = "leet code", brokenLetters = "e"
 * Output: 0
 * Explanation: We cannot type either word because the 'e' key is broken.
 */
public class MinimumWordsToTypeinabrokenKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Setence");
//        String sentence = scanner.next();
//        System.out.println("Enter Broken keys");
        String brokenKeys = "ab" ;//scanner.next();
        int output = minimumWordsType("my name is sibaprasad", brokenKeys);
        System.out.println("out put "+output);
    }

    private static int minimumWordsType(String str, String  brokenLetter) {
        String[] array = str.split(" ");
        String[] brokenKeyArray = brokenLetter.split("");
        System.out.println(array);
        System.out.println(brokenKeyArray);
        int count = 0;
        for (String word : array){
            count++;
            System.out.println(word);
            if(word.isEmpty()){
                continue;
            }
            for(String s : brokenKeyArray){
                System.out.println(s);
                if(word.contains(s)){
                    count--;
                    System.out.println(count);
                    break;
                }
            }
        }

        return count;
    }
}
