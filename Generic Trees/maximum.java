public class maximum {
    public static int max(Node node) {
        int maxChild = Integer.MIN_VALUE;
        for (Node temp : node.children) {
            int childMax = max(temp);
            maxChild = Math.max(maxChild, childMax);
        }
        maxChild = Math.max(maxChild, node.data);
        return maxChild;
    }
}
