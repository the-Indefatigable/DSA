import java.util.ArrayList;

class AdjacencyList 
{
	static class Edge{
		int src;
		int dest;
		int wt;

		public Edge(int s , int d , int w)
		{
			src = s;
			dest = d;
			wt = w;
		}

	}


	public static void main(String[] args) {
		
		int V = 5;
		ArrayList<Edge> [] graph = new ArrayList[V]; //null Stored
	

		for (int i = 0; i < V; i++) {
			graph[i] = new ArrayList<>();
		}

		//adding vertex
		
		graph[0].add(new Edge(0,1 ,5 ));
		graph[1].add(new Edge(1, 2, 1));
		graph[1].add(new Edge(1, 0, 5));
		graph[1].add(new Edge(1, 3, 3));
		graph[2].add(new Edge(2, 1, 1));
		graph[2].add(new Edge(2, 4, 2));
		graph[2].add(new Edge(2, 3, 1));
		graph[3].add(new Edge(3, 1, 3));
		graph[3].add(new Edge(3, 2, 1));
		graph[4].add(new Edge(1, 2, 1));


	

	//neight for graph1
	for(int i = 0; i<graph[1].size();i++)
	{
		Edge e = graph[1].get(i);
		System.out.println(e.dest);

	}

	}	

}




