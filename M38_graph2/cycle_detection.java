import java.util.*;
public class cycle_detection
{
    public static class edge
    {
        int src;
        int dest;
        public edge(int s,int d)
        {
            this.src=s;
            this.dest = d;

        }
    }

    public static void creategraph(ArrayList<edge>[] graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }

        // 0th vertex
        graph[0].add(new edge(0, 1));
        // graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3 ));
        

        // 1st vertex
        graph[1].add(new edge(1, 0)); 
        graph[1].add(new edge(1, 2));
        
        // 2nd vertex
        // graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));
        
        // 3rd vertex
        graph[3].add(new edge(3, 0));
        graph[3].add(new edge(3, 4));
        
        // 4th vertex
        graph[4].add(new edge(4, 3));


    }
    public static boolean detechCycle(ArrayList<edge>[] graph)
    {
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                if(detechCycleUtil(graph,vis,i,-1))
                {
                    return true;
                    // cycle exists in one of the part of the graph
                }
            }
        }
        return false;
    }
    
    public static boolean detechCycleUtil(ArrayList<edge>[] graph,boolean vis[] , int curr , int par)
    {
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++)
        {
            edge e = graph[curr].get(i);

            // case 3
            if(!vis[e.dest])
            {
                if(detechCycleUtil(graph, vis, e.dest, curr))
                {
                    return true;
                }
            }
            // case1
            else if(vis[e.dest] && e.dest != par)
            {
                return true;
            }
            // case 2 --> do nothing --> continue
        }

        return false;
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<edge>[] graph = new ArrayList[v];
        creategraph(graph);
        System.out.println(detechCycle(graph));
    }
    
}

// output --> true;