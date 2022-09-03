package collectionsExample.queueDequeue;

public class QueueUsingArray {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        // print Queue elements
        q.queueDisplay();

        // inserting elements in the queue
        q.queueEnqueue(20);
        q.queueEnqueue(30);
        q.queueEnqueue(40);
        q.queueEnqueue(50);

        // print Queue elements
        q.queueDisplay();

        // insert element in the queue
        q.queueEnqueue(60);

        // print Queue elements
        q.queueDisplay();
        q.queueEnqueue(60);
        q.queueDequeue();
        q.queueDequeue();
        System.out.printf("\n\nafter two node deletion\n\n");

        // print Queue elements
        q.queueDisplay();

        // print front of the queue
        q.queueFront();
    }
}

class Queue {
    int front, rear = 0;
    int capacity = 0;
    int[] queueArray;

    public Queue(int capacity) { // 3 = 5 6 7
        queueArray = new int[capacity];
        this.capacity = capacity;
    }

    public void queueEnqueue(int item) {
        if (rear == capacity) {
            System.out.println("Queue is full");
        } else {
            queueArray[rear] = item;
            rear++;
        }
    }

    public void queueDequeue() {
        if (rear == 0) {
            System.out.println("Queue is Empty");
        } else {
            rear--;
            queueArray[rear] = 0;
        }
    }

    public void queueDequeue(int position) {
        if (position >= capacity || position < 0) {
            System.out.println("Not possible to insert");
        } else {
            queueArray[position] = 0;
        }
    }

    public void queueDisplay() {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.println("Displaying Queue");
        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queueArray[i]);
        }
        System.out.println();
    }

    // print front of queue
    void queueFront() {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queueArray[front]);
        return;
    }

}
