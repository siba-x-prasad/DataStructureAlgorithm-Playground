package recusrion;public class FactorialOfANumber {    public static void main(String...args){        int result = factorial(10);        System.out.println(result);    }    private static int factorial(int n){        if(n > 1){            return  (n)*factorial(n-1);        }        else{            return 1;        }    }}