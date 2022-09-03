package codingPrograms;

/**
 * How to find and Print Armstrong number between 0 and 9999 in Java? Example
 * An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself.
 * For example, 153 is an Armstrong number, since 1**3 + 5**3 + 3**3 = 153, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371. Along with
 */

public class ArmstrongNumberInRange {
    public static void main(String[] args) {
        armstrongNumber();
    }
    private static void armstrongNumber(){
        for(int i = 0; i  <= 9999; i++){
            int sum = 0;
            int currentNum = i;
            while(currentNum >= 1){
                int num = currentNum%10;
                sum = (int) (sum+Math.pow(num, 3));
                currentNum = currentNum/10;
            }
            if(sum == i){
                System.out.println(i+" is an armstrong number");
            }
        }
    }
}
