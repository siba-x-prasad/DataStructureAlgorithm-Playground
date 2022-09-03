package companyProgramms.agoda;

public class RotateArray {
    public static void main(String[] args) {
        int[] array =  {1,5,4,7,8,9,1,22,45};
        int[] rotatedArray =  new int[array.length];
        System.out.println("Array Before rotate");
        for(int item  :  array){
            System.out.print(item+", ");
        }
        for(int i  =  0; i  <  array.length; i++){
            rotatedArray[i] =  array[array.length-1-i];
        }
        System.out.println("\n Array After rotate");
        for(int item  :  rotatedArray){
            System.out.print(item+", ");
        }
    }
}
