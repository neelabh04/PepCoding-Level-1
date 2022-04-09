public class totalsize  {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static int size(Node node){
        int totalSize = 0;
        for(Node temp: node.children){
            int childSize = size(temp);
            totalSize += childSize;
        }
        totalSize += 1;
        return totalSize;
    }
}
