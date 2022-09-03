package array;import java.util.ArrayList;import java.util.HashMap;public class SimpleArrayPrograms1 {    public static void main(String[] args){    }    private void printMissingNumber(int[] array){        int currentItem = array[0];        String missingItem = "";        for(int i  = 1; i<array.length;i++){            if(currentItem+1 == array[i]){                currentItem = array[i];            }            else{                System.out.println(""+currentItem+1);            }        }    }    // How to find duplicate number on Integer array in Java?    private void printDuplicateNumbers(int[] array){        int temp = array[0];        for(int i  = 1; i<array.length;i++){            if(temp == array[i]){                System.out.println("Duplicate Number Is "+temp);            }            else{                temp = array[i];            }        }    }    // How to check if array contains a number in Java?    private void checkIfNUmberExists(int[] array, int number){        for(int i = 0; i<array.length; i++ ){            if(array[i] == number){                System.out.println(number+" is Present at "+i+" Position");            }        }    }    // How to find largest and smallest number in unsorted array?    private void findSmallestLargestNumber(int[] array){        int smallestNumber = array[0];        int biggestNumber = array[array.length-1];        for(int i = 1; i<array.length-1; i++ ){            if(smallestNumber > array[i]){                smallestNumber = array[i];            }            if(biggestNumber < array[i]){                biggestNumber = array[i];            }        }        System.out.println(biggestNumber+" is Biggest Number And "+smallestNumber+" is Smallest Number");    }    // - How to find all pairs on integer array whose sum is equal to given number ?    private void findPairsWhoseSumIsSame(int[] array, int sumOf2Numbers){        for(int i = 0; i<array.length; i++ ){            for(int j = 0; j<array.length; j++ ){                if(array[i]+array[j] == sumOf2Numbers){                    System.out.println("2 Pair sum is same "+array[i] +" AND "+array[j]);                }            }        }    }    // - How to find repeated numbers in an array if it contains multiple duplicates ?    private void findRepeatdNumbersFromArray(int[] array){        HashMap<Integer,Integer> map = new HashMap<>();        for(int i = 0; i< array.length; i++){            Integer key = array[i];            if(map.containsKey(key)){                int count = map.get(key);                map.put(key,++count);            }            else{                map.put(key,1);            }        }        map.forEach((key,value) -> {            if(value > 1){                System.out.println(key+" is Repeated "+value+" Times");            }        });    }    // Write a program to remove duplicates from array in Java?    // https://www.javatpoint.com/java-program-to-remove-duplicate-element-in-an-array}