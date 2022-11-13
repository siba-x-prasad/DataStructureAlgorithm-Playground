package collections.stack;

import java.util.LinkedList;

public class MyStack {
    LinkedList<Integer> data;

    MyStack() {
        data = new LinkedList<>();
    }


    public Integer pop() {
        if (data.size() > 0) {
            Integer val = data.getLast();
            data.removeFirst();
            return val;
        } else
            return -1;
    }

    public Integer peek() {
        if (data.size() > 0) {
            return data.getFirst();
        } else
            return -1;
    }

    public void push(Integer integer) {
        data.addFirst(integer);
    }

}
