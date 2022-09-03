package codingPrograms;

import java.util.*;
public class NthTribonaciSeries {
    //method to calculate Tribonnaci series
    public static int tribonacciTerm(int n)
    {
        if (n < 3)
            return n;
//initializing the first three terms of the Tribonnaci series
        int a = 0, b = 1, c = 1, d;
//in the while loop --> is not an operator. These are two separate operators, -- and >.
//the conditional's code decrements n by 1, while returning n's original value not decremented value
//after that compares the original value with 3 using the > operator.
//more specifically we can write it as while ((n--) > 3)
        while (n-- > 3)
        {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term: ");
//reads an integer from the user
        int n=sc.nextInt();
//function calling
        int ans=tribonacciTerm(n);
        System.out.println("The "+n+"th term of the Tribonacci series is: "+ans);
    }
}
