import java.util.ArrayList;

 

class HasPath
{
    public static  boolean  hasPath(ArrayList<DFS.Edge>[] graph , int src ,int des , boolean vis[])
    {
            vis[src] = true;

            for (int i = 0; i < graph[src].size(); i++) {
                DFS.Edge e = graph[src].get(i);

                if (!vis[e.dest]) {
                   hasPath(graph, e.dest, des, vis); 
                }
            }

            return vis[des];
    }


    public static void main(String[] args) {

        int V = 7;
        ArrayList<DFS.Edge>[] graph = new ArrayList[V];
        DFS.createGraph(graph);

        System.out.println(hasPath(graph, 0,6 , new boolean[V]));




    }
}
