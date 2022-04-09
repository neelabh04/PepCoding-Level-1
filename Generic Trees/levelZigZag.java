public class levelZigZag {
    public static void levelOrderLinewiseZZ(Node node){
        Stack<Node> mainS = new Stack<>();
        Stack<Node> childS = new Stack<>();
        int level = 0;
        mainS.push(node);
        while(mainS.size() > 0){
            Node temp = mainS.pop();
            System.out.print(temp.data + " ");
            if(level % 2 == 0){
                for(int i = 0; i < temp.children.size(); i++){
                    childS.push(temp.children.get(i));
                }
            }else{
                for(int i = temp.children.size() - 1; i >= 0 ; i--){
                    childS.push(temp.children.get(i));
                }
            }
            
            if(mainS.size() == 0){
                mainS = childS;
                childS = new Stack<>();
                level++;
                System.out.println();
            }
        }
    }    
}
