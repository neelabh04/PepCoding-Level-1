// Remove a node in BST
public class removeNode {
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
  
    public static Node remove(Node node, int data) {
      if(node == null){
          return null;
      }
      
      if(node.data < data){
          node.right = remove(node.right, data);
      }else if(node.data > data){
          node.left = remove(node.left, data);
      }else{
          if(node.left != null && node.right != null){
              int leftMax = max(node.left);
              node.data = leftMax;
              node.left = remove(node.left, leftMax);
              return node;
          }else if(node.left != null){
              return node.left;
          }else if(node.right != null){
              return node.right;
          }else{
              return null;
          }
      }
      
      return node;
    }
}

