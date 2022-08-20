package codingPrograms.geeksforgeeks.strings.level1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = isPangram(s);
    }

    public static int isPangram(String str) {
        int result = 0;
        Set<Integer> chars = new HashSet<>();
        boolean isAllCharPresent = str.length() > 25 && str.chars()
                .filter(i -> i >= 'a' && i <= 'z') //only alphabet
                .filter(chars::add)                //add to our tracking set if we reach this point
                .filter(i -> chars.size() == 26)   //filter the 26th letter found
                .findAny().isPresent();//if the 26th is found, return

        if (isAllCharPresent) {
            result = 1;
        }
        return result;
    }
}
