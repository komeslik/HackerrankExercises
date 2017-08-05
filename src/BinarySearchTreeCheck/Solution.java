package BinarySearchTreeCheck;

/**
 * Created by komes on 7/20/2017.
 */
public class Solution {
    class Node {
        int data;
        Node left;
        Node right;
    }

    boolean checkBST(Node root) {
        return checkBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean checkBSTHelper(Node root, int min, int max) {
        if (root == null) return true;
        return (root.data < max &&
                root.data > min &&
                checkBSTHelper(root.left, min, root.data) &&
                checkBSTHelper(root.right, root.data, max));
    }

    public static void main(String[] args) {

    }
}
