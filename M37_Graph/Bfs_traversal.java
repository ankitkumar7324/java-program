
import java.util.*;
public class Bfs_traversal
{
    public static class edge
    {
        int src;
        int dest;
        int wt;
        public edge(int s , int d , int w)
        {
            this.src= s;
            this.dest=d;
            this.wt=w;
        }

    }

    public static void creategraph(ArrayList<edge>[] graph)
    {
        // null --> empty arraylist
         for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }

        // 0th vertex
        graph[0].add(new edge(0, 1, 1));
        graph[0].add(new edge(0, 2, 1));
        // 1st vertex
        graph[1].add(new edge(1,0 , 1));
        graph[1].add(new edge(1,3 , 1));

        // 2nd vertex
        graph[2].add(new edge(2, 0, 1));
        graph[2].add(new edge(2, 4, 1));
        
        // 3rd vertex
        graph[3].add(new edge(3, 1, 1));
        graph[3].add(new edge(3, 4, 1));
        graph[3].add(new edge(3, 5, 1));
        // 4th vertex
        graph[4].add(new edge(4, 2, 1));
        graph[4].add(new edge(4, 3, 1));
        graph[4].add(new edge(4, 5, 1));
        // 5th vertex
        graph[5].add(new edge(5, 3, 1));
        graph[5].add(new edge(5, 4, 1));
        graph[5].add(new edge(5, 6, 1));
        // 6th vertex
        graph[6].add(new edge(6, 5, 1));
    }

    public static void bfs(ArrayList<edge>[] graph)
    {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0); //source = 0

        while(!q.isEmpty())
        {
            int curr=q.remove();

            if(!vis[curr])
            {
                vis[curr]=true;
                System.out.print(curr+" ");
                for(int i=0;i<graph[curr].size();i++)
                {
                    edge e =graph[curr].get(i);
                    q.add(e.dest);
                }

            }
        }
        
    }

    public static void main(String[] args) {
        int v=7;
        ArrayList<edge>[] graph = new ArrayList[v];
        creategraph(graph);
        bfs(graph);
        
    }
     
}

// output 0 1 2 3 4 5 6 