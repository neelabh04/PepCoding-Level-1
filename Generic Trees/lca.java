import java.util.ArrayList;

public class lca {
    public static ArrayList<Integer> nodeToRootPath(Node node, int data){
        if(node.data == data){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(node.data);
            return list;
        }
        for(Node temp: node.children){
            ArrayList<Integer> childPath = nodeToRootPath(temp, data);
            if(childPath.size() > 1){
                childPath.add(node.data);
                return childPath;
            }
        }

        return new ArrayList<>();
    }
    public static int leastCommonAncestor(Node node, int d1, int d2){
        ArrayList<Integer> path1 = leastCommonAncestor(node, d1);
        ArrayList<Integer> path2 = leastCommonAncestor(node, d2);

        int i = path1.size() - 1;
        int j = path2.size() - 1;

        while(i >= 0 && j >= 0 && path1.get(i) == path2.get(j)){
            i--;
            j--;
        }

        i++;

        return path1.get(i);
    }
}
