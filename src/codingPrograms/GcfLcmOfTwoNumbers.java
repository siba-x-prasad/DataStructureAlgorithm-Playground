package codingPrograms;

public class GcfLcmOfTwoNumbers {
    public static void main(String[] args) {
        int gcf  = gcf(6, 9);
        int gcf1  = getGcf(6, 9);
        int gcf2  = getGcfOfNumbers(new int[]{6, 9, 12, 11});
//        int lcm  = lcm(2, 3);
        System.out.println("Gcf of 6 & 9 is "+gcf);
        System.out.println("Gcf of 6 & 9 is "+gcf1);
        System.out.println("Gcf of 6, 9, 12 is "+gcf2);
//        System.out.println("Lcm of 2 & 3 is "+lcm);
    }

    private static int gcf(int num1, int num2){
        if(num2 == 0){
            return num1;
        }
        else{
//            System.out.println("Number 2 "+num2+" num1 % num2 "+num1 % num2);
            return gcf(num2, num1 % num2);
        }
    }

    private static int lcm(int a, int  b){
        return (a*b)/gcf(a,b);
    }

    private static int getGcf(int a, int b){
        int gcf = 1;
        int largestNUmber  = a;
        if(a < b ){
            largestNUmber = b;
        }
        int count = 1;
        while(count <= largestNUmber){
            if(a%count == 0 && b % count ==0){
                gcf *= count;
            }
            count++;
        }
        return  gcf;
    }

    /**
     * find gcf of n numbers
     */
    private static int getGcfOfNumbers(int[] array){
        if (array.length <= 1){
            return 1;
        }
        int gcf = 0;
        for(int i : array){
            gcf = gcf(gcf, i);
        }
        return gcf;
    }

}
