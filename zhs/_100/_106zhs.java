import java.util.HashMap;

public class _106zhs {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    int[] p;
    int[] i;
    int post_idx;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.p = postorder;
        this.i = inorder;
        post_idx = postorder.length - 1;
        int idx = 0;
        for (Integer val : inorder) {
            map.put(val, idx++);
        }
        return helper(0, inorder.length - 1);
    }

    public TreeNode helper(int in_left, int in_right) {
        if (in_left > in_right)
            return null;
        int root_val = p[post_idx];
        TreeNode root = new TreeNode(root_val);
        int index = map.get(root_val);
        post_idx--;
        root.right = helper(index + 1, in_right);
        root.left = helper(in_left, index - 1);
        return root;
    }
}