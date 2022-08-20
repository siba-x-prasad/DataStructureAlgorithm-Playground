package companyProgramms.agoda;

/**
 * write a program that returns "fizz"
 * if the number is a multiplier of 3,
 * return "buzz" if its multiplier of 5, and
 * return "fizzbuzz" if the number is divisible by both 3 and 5.
 */
public class FizzBuzzProblem {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++){
            if(i%15 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i%3 == 0){
                System.out.println("Fizz");
            }
            if(i%5 == 0){
                System.out.println("Buzz");
            }
        }
    }
}
