public class levelLineWise {
    public static void levelOrderLinewise(Node node){
        Queue<Node> mainQ = new ArrayDeque<>();
        Queue<Node> childQ = new ArrayDeque<>();
        mainQ.add(node);
        while(mainQ.size() > 0){
            Node temp = mainQ.remove();
            System.out.print(temp.data + " ");
            for(Node child: temp.children){
                childQ.add(child);
            }
            if(mainQ.size() == 0){
                mainQ = childQ;
                childQ = new ArrayDeque<>();
                System.out.println();
            }
        }
    }
}
