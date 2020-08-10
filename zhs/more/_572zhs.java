package more;

public class _572zhs {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSame(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return (a.val == b.val) && isSame(a.left, b.left) && isSame(a.right, b.right);

    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        return isSame(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    public static void main(String[] args) {
        _572zhs m = new _572zhs();
        TreeNode r = new TreeNode(3);
        r.left = new TreeNode(4);
        r.right = new TreeNode(5);
        r.left.left = new TreeNode(1);
        r.left.right = new TreeNode(2);
        r.left.right.left = new TreeNode(0);
        TreeNode t = new TreeNode(4);
        t.left = new TreeNode(1);
        t.right = new TreeNode(2);
        System.out.println(m.isSubtree(r, t));
    }
}
