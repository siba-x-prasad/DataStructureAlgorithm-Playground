package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
 */
public class CheckIfAGraphisCycle {
    public static void main(String[] args) {
        // Create a graph given
        // in the above diagram
        CycleDfsGraph g1 = new CycleDfsGraph(5);
        g1.addEdge(0, 1);
        g1.addEdge(1, 0);
        g1.addEdge(1, 2);
        g1.addEdge(1, 4);
        g1.addEdge(2, 1);
        g1.addEdge(2, 3);
        g1.addEdge(3, 2);
        g1.addEdge(3, 4);
        g1.addEdge(4, 1);
        g1.addEdge(4, 3);

        if (g1.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contains cycle");

        CycleDfsGraph g2 = new CycleDfsGraph(3);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);
        if (g2.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contains cycle");
    }

    public static boolean dfs(CycleDfsGraph graph, int V, boolean[] visited, int parent) {
        visited[V] = true;
        ListIterator<Integer> iterator = graph.adj[V].listIterator();

        while (iterator.hasNext()) {
            int n = iterator.next();
            if (!visited[n]) {
                if (dfs(graph, n, visited, V)) {
                    return true;
                }
            } else if (V != parent) {
                return true;
            }
        }
        // No back-edges were found in the graph
        return false;
    }
}

class CycleDfsGraph {
    int V; // No. of vertices
    LinkedList<Integer> adj[]; // Array of lists for  Adjacency List Representation

    @SuppressWarnings("unchecked")
    CycleDfsGraph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w); // Add w to v's list.
    }


    public void dfsSearch(CycleDfsGraph graph, int pos, boolean[] visited) {
        visited[pos] = true;
        ListIterator<Integer> iterator = graph.adj[pos].listIterator();
        System.out.println(pos);
        while (iterator.hasNext()) {
            int n = iterator.next();
            if (!visited[n]) {
                visited[n] = true;
                dfsSearch(graph, n, visited);
            }
        }
    }

    Boolean isCyclicUtil(int v, Boolean visited[],
                         int parent) {
        // Mark the current node as visited
        visited[v] = true;
        Integer i;

        // Recur for all the vertices
        // adjacent to this vertex
        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext()) {
            i = it.next();
            // If an adjacent is not
            // visited, then recur for that
            // adjacent
            if (!visited[i]) {
                if (isCyclicUtil(i, visited, v))
                    return true;
            }
            // If an adjacent is visited
            // and not parent of current
            // vertex, then there is a cycle.
            else if (i != parent)
                return true;
        }
        return false;
    }

    // Returns true if the graph
    // contains a cycle, else false.
    Boolean isCyclic() {
        // Mark all the vertices as
        // not visited and not part of
        // recursion collectionsExample.stack
        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;

        // Call the recursive helper
        // function to detect cycle in
        // different DFS trees
        for (int u = 0; u < V; u++) {

            // Don't recur for u if already visited
            if (!visited[u])
                if (isCyclicUtil(u, visited, -1))
                    return true;
        }

        return false;
    }

}
