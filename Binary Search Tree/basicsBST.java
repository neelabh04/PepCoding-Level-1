// size, sum, max, min and find in BST

public class basicsBST { 
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

    public static int size (Node node){
        if(node == null){
            return 0;
        }
        int leftSize = size(node.left);
        int rightSize = size(node.right);
        int ans = leftSize + rightSize + 1;
        return ans;
    }

    public static int sum(Node node){
        if(node == null){
            return 0;
        }

        int leftSum = sum(node.left);
        int rightSum = sum(node.right);
        int total = leftSum + rightSum + node.data;
        return total;
    }

    public static int max(Node node){
        if(node == null){
            return 0;
        }
        if(node.right != null){
            return max(node.right);
        }else{
            return node.data;
        }
    }

    public static int min(Node node){
        if(node == null){
            return 0;
        }
        if(node.left != null){
            return max(node.left);
        }else{
            return node.data;
        }
    }

    public static boolean find(Node node, int data){
        if(node == null){
            return false;
        }
        if(node.data > data){
            return find(node.left, data);
        }else if(node.data < data){
            return find(node.right, data);
        }else{
            return true;
        }
    }
}