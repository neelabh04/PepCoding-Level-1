public class heightTree {
    public static int height(Node node) {
        int totalHeight = -1;
        for(Node temp: node.children){
            int childHeight = height(temp);
            totalHeight = Math.max(childHeight, totalHeight);
        }
        totalHeight += 1;
        return totalHeight;
    }
}
