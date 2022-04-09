public class nodeToRootPath {
    public static ArrayList<Integer> nodeToRootPath(Node node, int data) {
        if (node.data == data) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(node.data);
            return list;
        }

        for (Node temp : node.children) {
            ArrayList<Integer> pathTillChild = nodeToRootPath(temp, data);
            if (pathTillChild.size() > 0) {
                pathTillChild.add(node.data);
                return pathTillChild;
            }
        }

        return new ArrayList<>();
    }
}
