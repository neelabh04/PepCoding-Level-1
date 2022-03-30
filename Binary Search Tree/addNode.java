// Add a node in BST

public class addNode {
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

    public Node add(Node node, int data) {
        if(node == null){
            return new Node(data, null, null);
        }
        if(node.data < data){
            node.right = add(node.right, data);
        }else if(node.data > data){
            node.left =  add(node.left, data);
        }else{
            // do nothing
        }
        return node;
      }
    
}
