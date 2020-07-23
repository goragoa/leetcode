package _90;

import java.util.ArrayList;
import java.util.List;

public class _94zhs {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    List<Integer> output = new ArrayList<>();

    public void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        output.add(root.val);
        inorder(root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return output;
    }
}