
package collections.linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAsDequeue {
    public static void main(String[] args) {
        List<Integer> numbersList = new LinkedList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);
        Integer[] numbers = new Integer[numbersList.size()];
        numbers = numbersList.toArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}