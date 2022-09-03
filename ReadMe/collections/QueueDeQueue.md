# Queue & DeQueue
## Queue
- Queue is nothing but a data structure which follows FIFO(First In First Out)
- Since Queue is an interface you need to instantiate a concrete implementation of the interface in order to use it.
- You can choose between the following Queue implementations in the Java Collections API:
  - java.util.LinkedList 
  - java.util.PriorityQueue

## Implementation using LinkedList
- Queue<Integer> queue = new LinkedList<>();
- queue.add(1); -> Add an element to the queue
## Add element to Queue
- queue.addFirst(111);
- queue.addLast(123);
## Remove element from  Queue
- queue.removeFirst() -> Remove the first Element
- queue.removeLast() -> Remove the last element
- queue.poll() -> 
- queue.remove();
- The poll() and remove() both removes the first element in the Queue.
- The poll() method returns null if the Queue is empty. 
- The remove() method throws an exception if the Queue is empty.
## Fetch Element from Queue
- queue.element() -> It will return the first  element  of queue, if the queue  is empty it  will throw exception
- queue.peek() -> It will return the first element of queue. It will return  null if queue is  empty.
- queue.pop(); -> It will remove the  first element, but throws exception if queue is empty
## Iteration of Queue
- Queue can be iterate using  iterator or list iterator like list or linkedlistt 
```
  Iterator iterator = LL_queue.iterator();
  while(iterator.hasNext()){
    String element = (String) iterator.next();
    System.out.print(element + " ");
  }
```

## Types of Queue
- Simple queue ->
- Circular queue -> A circular queue is the extended version of a regular queue where the last element is connected to the first element.
- Priority queue ->
  - Every item has a priority associated with it.
  - An element with high priority is dequeued before an element with low priority.
  - If two elements have the same priority, they are served according to their order in the queue.
- Double-ended queue
  - Deque or Double Ended Queue is a type of queue in which insertion and removal of elements can either be performed from the front or the rear. 
  - Thus, it does not follow FIFO rule (First In First Out).


