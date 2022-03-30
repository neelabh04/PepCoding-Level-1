// Replace with sum of larger in a BST
public class replaceWithLargerSum {
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
    
    static int sum = 0;

    public void rwsol(Node node){
        if(node == null){
            return;
        }

        rwsol(node.right);
        int origData = node.data;
        node.data = sum;
        sum += origData;
        rwsol(node.left);
    }
}
