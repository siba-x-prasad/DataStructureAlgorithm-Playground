package graph;// Java program to print DFS
// traversal from a given graph

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

// This class represents a  directed graph using adjacency list representation
class DFSGraphExample {

    // Driver Code
    public static void main(String args[]) {
        MyDfsGraph g = new MyDfsGraph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");
        g.DFS(2);
        System.out.println("\nMy Example");
        g.dfsSearch(g, 2, new boolean[4]);
    }

}
// This code is contributed by Aakash Hasija

class MyDfsGraph {
    private int V; // No. of vertices
    private LinkedList<Integer> adj[]; // Array of lists for  Adjacency List Representation

    @SuppressWarnings("unchecked")
    MyDfsGraph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w); // Add w to v's list.
    }

    // A function used by DFS
    void DFSUtil(int v, boolean visited[]) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");
        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // The function to do DFS traversal.
    // It uses recursive
    // DFSUtil()
    void DFS(int v) {
        // Mark all the vertices as
        // not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];
        // Call the recursive helper
        // function to print DFS
        // traversal
        DFSUtil(v, visited);
    }

    public void dfsSearch(MyDfsGraph graph, int pos, boolean[] visited){
        visited[pos] = true;
        ListIterator<Integer> iterator = graph.adj[pos].listIterator();
        System.out.println(pos);
        while(iterator.hasNext()){
            int n = iterator.next();
            if(!visited[n]){
                visited[n] = true;
                dfsSearch(graph, n, visited);
            }
        }
    }

}
