package codingPrograms.geeksforgeeks.strings.level1;

/**
 * Input:
 * N = 4
 * arr[] = {geeksforgeeks, geeks, geek,
 *          geezer}
 * Output: gee
 * Explanation: "gee" is the longest common
 * prefix in all the given strings.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
//        String  s = getLongestCommonPrefix(new String[]{"geeksforgeeks", "geeks", "geek", "geezer"});
        String  s = getLongestCommonPrefix(new String[]{"d", "d", "d", "d"});
        System.out.println("Output is "+s);
    }

    public static String  getLongestCommonPrefix(String[] arr){
        int length = arr[0].length();
        String commonPref = "";
        if(length >= 1){
            commonPref = arr[0].substring(0,1);
        }
        System.out.println(commonPref);
        String cms = "";
        outerloop:
        for(int i = 0; i< length;i++) {
            commonPref = arr[0].substring(0, i);
            boolean isTrue = false;
            for (String str : arr) {
                if(commonPref.equals(str.substring(0, i))){
                    System.out.println(commonPref);
                    isTrue = true;
                }
                else{
                    isTrue = false;

                }
            }
            if(isTrue){
                cms = commonPref;
            }
            else{
                break outerloop;
            }
        }
        return cms;
    }
}
