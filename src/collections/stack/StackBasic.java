package collections.stack;


import java.util.Stack;

public class StackBasic {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(12);
        stack.addElement(12);
        stack.addElement(null);

        System.out.println("Size of Vector is " + stack.size());
        for (Integer integer : stack) {
            System.out.println("Vector Item is " + integer);
        }
        stack.clear();
        System.out.println("Size of Vector after clear " + stack.size());
    }
}
