package _100;

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
    int postIdx;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.p = postorder;
        this.i = inorder;
        postIdx = postorder.length - 1;
        int idx = 0;
        for (Integer val : inorder) {
            map.put(val, idx++);
        }
        return helper(0, inorder.length - 1);
    }

    public TreeNode helper(int inLeft, int inRight) {
        if (inLeft > inRight) {
            return null;
        }
        int rootVal = p[postIdx];
        TreeNode root = new TreeNode(rootVal);
        int index = map.get(rootVal);
        postIdx--;
        root.right = helper(index + 1, inRight);
        root.left = helper(inLeft, index - 1);
        return root;
    }
}