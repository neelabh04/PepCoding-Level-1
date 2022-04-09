public class mirrorTree {
    public static void mirror(Node node){
      for(Node temp: node.children){
        mirror(temp);
      }
      Collections.reverse(node.children);
    }
}
