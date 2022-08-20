package graph;

import java.util.LinkedList;

public class ShortestPathBetweenTwoPoints {

}

class Edge{
    int source, dest, weight;
    Edge(int source, int dest, int weight){
        this.source = source;
        this.dest = dest;
        this.weight = weight;
    }
}

class WeightGraph{
    int vertices;
    LinkedList<Edge> [] adjacencylist;

    WeightGraph(int vertices){
        this.vertices = vertices;
        adjacencylist = new LinkedList[vertices];
        for(int i = 0;i <vertices; i++){
            adjacencylist[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination, int weight){
        Edge edge = new Edge(source, destination, weight);
        adjacencylist[source].add(edge);
    }

    public void printWeightedGraph(){
        int position = 0;
       for(LinkedList<Edge> list : adjacencylist){
           for(Edge edge : list){
               System.out.println(position+" =  "+ edge.weight+"  => "+edge.dest);
           }
       }
    }

    public int shortestPath(int source, int destination){
        int shortestPath = 0;


        return shortestPath;
    }

}
