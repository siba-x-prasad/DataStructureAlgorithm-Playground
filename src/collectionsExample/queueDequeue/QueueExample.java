package collectionsExample.queueDequeue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println("Print all items in Queue");
        for(Integer i : queue){
            System.out.println(i+"=>");
        }
        System.out.println("Remove First Item and Last Item");
        queue.removeFirst();
        queue.removeLast();
        queue.poll();
        queue.remove();
        queue.pop();
        queue.addFirst(111);
        queue.addLast(123);
        Iterator iterator = queue.iterator();
//        Iterator iterator = queue.listIterator();
        while(iterator.hasNext()){
            String element = (String) iterator.next();
            System.out.print(element + " ");
        }


 // Using  Priority  Queue
 Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Siba");
        priorityQueue.remove("Siba");
        priorityQueue.poll();
        priorityQueue.peek();

    }
}
