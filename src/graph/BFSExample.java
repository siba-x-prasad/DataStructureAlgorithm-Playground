package graph;

import java.util.LinkedList;
import java.util.ListIterator;

public class BFSExample {
    public static void main(String[] args) {
        MyBfsGraph g = new MyBfsGraph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

//        g.printGraph();
        g.printMyBfsGraph(2);
    }
}


class MyBfsGraph {

    LinkedList<Integer> adj[];
    int size = 0;

    MyBfsGraph(int numberOfNode) {
        size = numberOfNode;
        adj = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        if (source < size) {
            adj[source].add(destination);
        }
    }

    public void printGraph() {
        int nodePos = 0;
        for(LinkedList<Integer> node : adj){
            for (Integer edge : node){
                System.out.println(nodePos+"->"+edge);
            }
            nodePos++;
        }
    }

    public void printMyBfsGraph(int node){
        boolean[] visited = new  boolean[size];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[node] = true;
        queue.add(node);

        while (queue.size() != 0){
            node = queue.poll();
            System.out.print(node+" => ");
            ListIterator<Integer> iterator = adj[node].listIterator();
            while (iterator.hasNext()){
                int n = iterator.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }


}
