
public class _98zhs {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        if ((root.left != null && root.val == root.left.val) || (root.right != null && root.right.val == root.val))
            return false;
        Long min;
        Long max;
        TreeNode min_pointer = root;
        TreeNode max_pointer = root;
        if (min_pointer.left != null) {
            min_pointer = min_pointer.left;
            while (min_pointer.right != null) {
                min_pointer = min_pointer.right;
            }
            min = (long) min_pointer.val;
        } else {
            min = Long.MIN_VALUE;
        }
        if (max_pointer.right != null) {
            max_pointer = max_pointer.right;
            while (max_pointer.left != null) {
                max_pointer = max_pointer.left;
            }
            max = (long) max_pointer.val;
        } else {
            max = Long.MAX_VALUE;
        }
        return (root.val > min) && (root.val < max) && isValidBST(root.left) && isValidBST(root.right);
    }

    public static void main(String[] args) {
        _98zhs t = new _98zhs();
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);
        System.out.println(t.isValidBST(root1));

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(3);
        root2.right.right = new TreeNode(6);
        System.out.println(t.isValidBST(root2));
    }
}