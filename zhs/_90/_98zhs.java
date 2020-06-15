package _90;

public class _98zhs {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }

    public boolean helper(TreeNode node, Integer lower, Integer upper) {
        if (node == null)
            return true;
        int val = node.val;
        if (lower != null && val <= lower)
            return false;
        if (upper != null && val >= upper)
            return false;

        if (!helper(node.right, val, upper))
            return false;
        if (!helper(node.left, lower, val))
            return false;
        return true;
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
}