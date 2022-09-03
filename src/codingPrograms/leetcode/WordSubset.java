package codingPrograms.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/word-subsets/
public class WordSubset {
    public static void main(String[] args) {
        String[] arr = getSubsetArray(new String[]{"amazon", "apple", "facebook", "google", "leetcode"}, new String[]{"e", "o"});
        System.out.println(Arrays.toString(arr));
    }

    private static String[] getSubsetArray(String[] arr1, String[] arr2) {
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder("");
        for (String s : arr2) {
            if (map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, ++count);
            }
            else{
                map.put(s, 1);
            }
        }

        for (String s : arr1) {
            boolean isSubset = true;
            for (Map.Entry<String, Integer> entrySet : map.entrySet()) {
                if (entrySet.getValue() == 1 && s.contains(entrySet.getKey())) {
                    isSubset= true;
                } else {
                    if (charCount(s, entrySet.getKey().charAt(0)) == entrySet.getValue()) {
                        isSubset = true;
                    } else {
                        isSubset = false;
                        break;
                    }
                }
            }
            if(isSubset){
                sb.append(s+",");
            }
        }
        String[] arr = sb.toString().split(",");
        return arr;
    }

    private static int charCount(String str, Character s) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == s) {
                count++;
            }
        }
        return count;
    }
}
