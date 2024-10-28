package collections.linkedList;


import java.util.LinkedList;

/**
 *  Print the Middle of a given linked list
 *  Flattening a linked list
 *  Delete the elements in an linked list whose sum is equal to zero  Delete middle of linked list
 *  Remove duplicate elements from sorted linked list
 *  Add 1 to a number represented as a linked list
 *  Reverse a linked list in groups of given size
 *  Detect loop in linked list
 *  Remove loop in linked list
 *  Find nth node from the end of linked list
 *  Function to check if a singly linked list is a palindrome  Reverse alternate k node in a singly linked list
 *  Delete last occurrence of an item from linked list
 *  Rotate a linked list.
 *  Delete n nodes after m nodes of a linked list.
 *  Merge a linked list into another linked list at alternate positions.  Write a function to delete a linked list.
 *  Write a function to reverse the nodes of a linked list.
 *  Why quicksort is preferred for arrays and merge sort for linked lists.
 */
public class LinkedListProgram {
    public static void main(String[] args) {

    }

    void printMiddleOfLinkedList(){
        LinkedList<String> list = new LinkedList<>();
        list.add("as1");
        list.add("as2");
        list.add("as3");
        list.add("as4");
        list.add("as5");
        list.add("as6");
        list.add("as7");

        if (list.getFirst() != null) {
            int length = list.size();
            String temp = list.getFirst();
            int middleLength = length / 2;
            while (middleLength != 0) {
//                temp = temp.next;
                middleLength--;
            }
            System.out.print("The middle element is ["
                    + temp + "]");
            System.out.println();
        }


    }

}
