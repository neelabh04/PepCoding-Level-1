public class getConnectedComponents {
    ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
    boolean[] visited = new boolean[vtces];for(
    int i = 0;i<vtces;i++)
    {
        if (visited[i] == false) {

            ArrayList<Integer> comp = new ArrayList<>();
            dfs(graph, i, visited, comp);
            comps.add(comp);
        }
    }

    public static void dfs(ArrayList< Edge>[] graph, int src, boolean[] visited, ArrayList< Integer> comp) {

        visited[src] = true;
        comp.add(src);
        for (Edge e : graph[src]) {
          if (visited[e.nbr] == false) {
            dfs(graph, e.nbr, visited, comp);
          }
        }
    }
}
