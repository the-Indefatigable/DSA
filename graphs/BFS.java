import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BFS{

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s , int d , int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph)
    {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        
        graph[1].add(new Edge(1, 3, 1));
        graph[1].add(new Edge(1, 0, 1));

        graph[2].add(new Edge(2, 4, 1));
        graph[2].add(new Edge(2, 0, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));


        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));


        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));

    }

    public static void bfs(ArrayList<Edge>[]graph)
       
    {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];

        //Let's Start by adding src node
        q.add(0);
        while (!q.isEmpty()) {
            int current = q.remove();

            if (!visited[current]) {
                System.out.print(current + " ");
                visited[current] = true;

                //Neighbours
                for (int i = 0; i < graph[current].size(); i++) {
                    Edge e  = graph[current].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    
 public static void main(String[] args) {
     

     int V = 7;
     ArrayList<Edge> [] graph = new ArrayList[V];
     createGraph(graph);
     bfs(graph);
 }



    
}
