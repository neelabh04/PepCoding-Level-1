public class levelOrderTraversal {
    public static void levelOrder(Node node) {
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);
        
        while(mq.size() > 0){
            int count = mq.size();
            
            for(int i = 0; i < count; i++){
                Node temp = mq.remove();
                System.out.print(temp.data+ " ");
                if(temp.left != null){
                    mq.add(temp.left);
                }if(temp.right != null){
                    mq.add(temp.right);
                }
            }
            System.out.println();
        }
}
