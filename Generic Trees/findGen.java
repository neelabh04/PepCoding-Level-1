public class findGen {
    public static boolean find(Node node, int data) {
        if (node.data == data) {
            return true;
        }
        for (Node temp : node.children) {
            boolean exists = find(temp, data);
            if (exists) {
                return true;
            }
        }
        return false;
    }
}
