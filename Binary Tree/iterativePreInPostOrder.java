public class iterativePreInPostOrder {
    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void iterativePrePostInTraversal(Node node) {
        Stack<Pair> stack = new Stack<>();
        Pair rootPair = new Pair(node, 1);
        stack.push(rootPair);

        String pre = "";
        String in = "";
        String post = "";

        while (stack.size() > 0) {

            Pair top = stack.peek();

            if (top.state == 1) {

                pre += top.node.data + " ";
                top.state++;

                if (top.node.left != null) {
                    Pair leftPair = new Pair(top.node.left, 1);
                    stack.push(leftPair);
                }

            }

            else if (top.state == 2) {

                in += top.node.data + " ";
                top.state++;

                if (top.node.right != null) {
                    Pair rightPair = new Pair(top.node.right, 1);
                    stack.push(rightPair);
                }
            }

            else {

                post += top.node.data + " ";
                stack.pop();
            }
        }

        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);

    }
}
