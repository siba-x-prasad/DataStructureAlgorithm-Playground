package codingPrograms.leetcode;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 *
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "hello"
 * Output: "holle"
 * Example 2:
 *
 * Input: s = "leetcode"
 */
public class ReverseVowels {
    public static void main(String[] args) {
        String s = "Sibaprasad Mohanty";
        String revString = reverseVowels(s);
        System.out.print("Reverse of "+s+" is "+revString);
    }

    private static boolean isVowel(char c){
        return (c ==  'a' || c ==  'A' || c ==  'e' || c ==  'E' || c ==  'i' || c ==  'I' || c ==  'o' || c ==  'O' || c ==  'u' || c ==  'U');
    }

    private static String  reverseVowels(String str){
        char[] charArray =  str.toCharArray();
        StringBuilder vowelsInStr = new StringBuilder();
        int j = 0;
        for (char c : charArray) {
            if (isVowel(c)) {
                vowelsInStr.append(c);
                j++;
            }
        }

        for(int i = 0; i< charArray.length;  i++){
            if (isVowel(charArray[i])) {
                charArray[i] = vowelsInStr.charAt(--j);
            }
        }
        return String.valueOf(charArray);
    }
}
