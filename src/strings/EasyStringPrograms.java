package strings;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EasyStringPrograms {
    public static void main(String[] args) {
        reverseStringWithoutUsingReverseMethod("siba");
        printOccuranceOfCharacter("saiba", 'a');
        removeCharacterFromString("saiba", 'a');
        countNumberOfWords("saiba prasad mo");
        swapTwoStringWithoutUsingThirdVariable("siba","Prasad");
    }

    /**
     * A Java program to convert an array to string.
     *
     * @param array
     */
    private static void convertStaringArrayToString(String[] array) {
        // using Array.ToString
        String s1 = Arrays.toString(array);
        System.out.println("Using Array Method " + s1);

        StringBuilder sb = new StringBuilder();
        for (String str : array) {
            sb.append(str + " ");
        }
        System.out.println("Using String Builder Append" + sb.toString());

        String s3 = String.join(" ", array);
        System.out.println("Using Join method " + s3);

        String s4 = Arrays.stream(array).collect(Collectors.joining());
        System.out.println("Using Collectors.joining() method " + s4);
    }

    /**
     * How to check if two strings are the same ignoring their cases?
     *
     * @param str1
     * @param str2
     */
    private static void checkIfTwoStringsAreEqual(String str1, String str2) {

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println(str1 + " And " + str2 + " Are Equal by ignoring case");
        } else {
            System.out.println(str1 + " And " + str2 + " Are Not Equal by ignoring case");
        }
    }

    /**
     * How to print duplicate characters from the string?
     *
     * @param str
     */
    private static void printDuplicateCharacterInString(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : str.toCharArray()) {
            int count = map.get(ch);
            if (count > 0) {
                map.put(ch, ++count);
            } else {
                map.put(ch, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" Contains "+entry.getValue()+" Times");
        }

        // without using any collection
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < str.length(); j++){
                if(i == j){
                    continue;
                }
                if(str.charAt(i) == str.charAt(j)){

                }
            }
        }
    }

    /**
     * How to check if two strings are anagrams of each other?
     * We can say if two strings are an anagram of each other if they contain the same characters but at different orders.
     *
     * Ex. army & mary
     *
     * @param str1
     * @param str2
     */
    private static void checkIfTwoStringAreAnagram(String str1, String str2){
        char[] str1Chars = str1.toLowerCase().toCharArray();
        char[] str2Chars = str2.toLowerCase().toCharArray();
        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);
        if(Arrays.equals(str1Chars, str2Chars)){
            System.out.println("Two Strings ARE anagrams");
        }
        else
            System.out.println("Two Strings are Not anagrams");
    }


    /**
     * How to reverse a string in Java without using the reverse method?
     * @param str
     */
    private static void reverseStringWithoutUsingReverseMethod(String str){
        char[] array = new char[str.length()];
        int position = 0;
        for(char ch : str.toCharArray()){
            position++;
            array[str.length() - position] = ch;
        }
        System.out.println("Reverse Of "+str+" is "+String.valueOf(array));
    }

    /**
     *  How to count the occurrence of the given character in a string?
     * @param str
     * @param ch
     */
    private static void printOccuranceOfCharacter(String str, char ch){
        int count = 0;
        for(char chr : str.toCharArray()){
            if(chr == ch){
                count++;
            }
        }
        System.out.println(ch+" Occurs "+count+" times in "+str);
    }

    /**
     * How to check if a string is a palindrome?
     * @param str1
     * @param str2
     */
    private static void checkPalindrome(String str1, String str2){
        if(str1.length() == str2.length()){
            boolean isPalindrome = true;
            for(int i = 0; i< str1.length(); i++){
                if(str1.charAt(i) != str2.charAt(str2.length()-1-i)){
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome)
                System.out.println(" Palindrome");
            else{
                System.out.println("Not Palindrome");
            }
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    /**
     * Write a program to remove given characters from the string?
     * @param str
     * @param ch
     */
    private static void removeCharacterFromString(String str, char ch){
        String str1 =  str.replace(ch+"", "");
        System.out.println(str +" after remove "+ch+" is "+str1);
    }

    /**
     * How to count the number of words in a given string sentence?
     * @param str
     */
    private static void countNumberOfWords(String str){
        String[] array =  str.split(" ");
        System.out.println(str+" Contains "+array.length+" of words");
    }

    /**
     * A java program to reverse the words from the given string.
     * @param inputString
     * @return
     */
    public static String reverseWordsFromString(String inputString) {

        String[] wordsArray = inputString.trim().split("\\s+");
        String stringWithReversedWords = "";

        for (String word : wordsArray) {

            stringWithReversedWords += reverseWord(word) + " ";

        }
        return stringWithReversedWords.trim();

    }

    public static String reverseWord(String word) {
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);

        }
        return reversedWord;
    }
    private static void swapTwoStringWithoutUsingThirdVariable(String str1, String str2){
        String combinationOfString = str1+str2;
        str1 = combinationOfString.substring(str1.length());
        str2= combinationOfString.substring(0, combinationOfString.length() - str1.length());
        System.out.println(str1+" And "+str2+" Swap to "+str1+" and "+str2);
    }
}
