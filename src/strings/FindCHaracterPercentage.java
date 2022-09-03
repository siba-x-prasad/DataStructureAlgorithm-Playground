package strings;

import java.util.Scanner;

public class FindCHaracterPercentage {
    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        findPercentageOfLowerUpperDigittAndSpecialCharacter(sentence);
    }

    private static void findPercentageOfLowerUpperDigittAndSpecialCharacter(String str){
        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;
        int specialChar = 0;
        for(Character ch : str.toCharArray()){
            if(Character.isUpperCase(ch)){
                upperCase++;
            }
            else if(Character.isLowerCase(ch)){
                lowerCase++;
            }
            else if(Character.isDigit(ch)){
                digit++;
            }
            else{
                specialChar++;
            }
        }
        int total = str.length();
        System.out.println("Upper Case Percentage : "+(upperCase*100/total));
        System.out.println("Lower Case Percentage : "+(lowerCase*100/total));
        System.out.println("Digit Percentage : "+(digit*100/total));
        System.out.println("Special Char Percentage : "+(specialChar*100/total));
    }

}
