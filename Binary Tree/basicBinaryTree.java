// Size, Sum, Maximum And Height Of A Binary Tree

public class basicBinaryTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static int size(Node node) {
        if (node == null) {
            return 0;
        }
        int leftSize = size(node.left);
        int rightSize = size(node.right);
        int ans = leftSize + rightSize + 1;
        return ans;
    }

    public static int sum(Node node) {
        if (node == null) {
            return 0;
        }
        int leftSize = sum(node.left);
        int rightSize = sum(node.right);
        int ans = leftSize + rightSize + node.data;
        return ans;
    }

    public static int max(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int leftMax = max(node.left);
        int rightMax = max(node.right);
        int ans = Math.max(node.data, Math.max(leftMax, rightMax));
        return ans;
    }

    public static int height(Node node) {
        if (node == null) {
            return -1;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int ans = Math.max(leftHeight, rightHeight) + 1;
        
        return ans;
    }
}