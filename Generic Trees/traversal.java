public class traversal {
    public static void traversals(Node node){
        System.out.println("Node Pre " + node.data);
        for (Node temp : node.children) {
          System.out.println("Edge Pre " + node.data + "--"+ temp.data);
          traversals(temp);
          System.out.println("Edge Post " + node.data + "--"+ temp.data);
        }
        System.out.println("Node Post " + node.data);
    } 
}
