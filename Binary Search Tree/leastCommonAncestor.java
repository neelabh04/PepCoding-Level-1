// Print the least common ancestor present between the two values

public class leastCommonAncestor {
    public static class Node {
        int data;
        Node left;
        Node right;
    
        Node(int data, Node left, Node right) {
          this.data = data;
          this.left = left;
          this.right = right;
        }
    }
    
    public int lca(Node node, int d1, int d2){
        if(node == null){
            return 0;
        }

        if(node.data < d1 && node.data < d2){
            return lca(node.right, d1, d2);
        }else if(node.data > d1 && node.data > d2){
            return lca(node.left, d1, d2);
        }else{
            return node.data;
        }
    }
}
