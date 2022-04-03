// Print all paths

public class printAllPaths {

    boolean[] visited = new boolean[vtces];

    printAllPaths(graph, visited, src, dest, src + "");

    public static void printAllPaths(ArrayList<Edge>[] graph, boolean[] visited, int src, int dest, String psf) {
        if (src == dest) {
            System.out.println(psf);
            return;
        }

        visited[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            int nbr = e.nbr;

            if (visited[nbr] == false) {
                printAllPaths(graph, visited, nbr, dest, psf + nbr + "");
            }
        }
        visited[src] = false;
    }
}
