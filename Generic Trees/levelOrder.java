public class levelOrder {
    public static void levelOrderTraversal(Node node){
        Queue<Node> mainQ = new ArrayDeque<>();
        mainQ.add(node);
        while(mainQ.size() > 0){
            Node temp = mainQ.remove();
            System.out.print(temp.data + " ");
            for(Node child: temp.children){
                mainQ.add(child);
            }
        }
        System.out.print(".");
    }
}
