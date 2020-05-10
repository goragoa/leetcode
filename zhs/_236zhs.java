public class _236zhs {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isAncestor(TreeNode root, TreeNode child) {
        if (root == null) {
            return false;
        }
        if (root == child) {
            return true;
        }
        return isAncestor(root.left, child) || isAncestor(root.right, child);

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (isAncestor(root.left, p) && isAncestor(root.left, q)) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (isAncestor(root.right, p) && isAncestor(root.right, q)) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    public static void main(String[] args) {
        _236zhs t = new _236zhs();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        TreeNode p = root.left;
        TreeNode q = root.left.right.right;
        System.out.println(t.lowestCommonAncestor(root, p, q).val);
    }
}