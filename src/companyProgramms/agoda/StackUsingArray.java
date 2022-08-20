package companyProgramms.agoda;

public class StackUsingArray {

}

class MyStack {
    int[] array;
    int front , rear = 0;

    int  capacity, currentPosition = 0;

    MyStack(int capacity){
        this.capacity = capacity;
        array = new int[capacity];
    }

    public void insert(int item){
        if( currentPosition >= capacity ){
            System.out.println("Stack Is full");
        }
        else {
            array[currentPosition] = item;
            currentPosition++;
        }
    }

    public void removeTop(){

    }

    public void removeBottom(){

    }

}
