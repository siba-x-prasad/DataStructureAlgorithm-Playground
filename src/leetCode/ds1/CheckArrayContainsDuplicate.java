package leetCode.ds1;

import java.util.HashMap;

public class CheckArrayContainsDuplicate {
    public static void main(String[] args) {

    }
    private static boolean isArrayContainsDuplicate(int[] arr){
        boolean isContainsDuplicate = false;
        for(int  i : arr){
            int count = 0;
            for(int j :  arr){
                if(i == j){
                    count++;
                    if(count >1 ){
                        return true;
                    }
                }
            }
        }
        return isContainsDuplicate;
    }

    private static boolean isArrayContainsDuplicateEffecient(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean duplicate = false;
        for(int  i : arr){
            if(map.containsKey(i)){
                return true;
            }
            else{
                map.put(i,i);
            }
        }
        return duplicate;
    }
}
