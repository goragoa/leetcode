package _90;

import java.util.LinkedList;
import java.util.List;

public class _95zhs {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public LinkedList<TreeNode> generateTrees(int start, int end) {
        LinkedList<TreeNode> all_trees = new LinkedList<TreeNode>();
        if (start > end) {
            all_trees.add(null);
            return all_trees;
        }
        for (int i = start; i <= end; i++) {
            LinkedList<TreeNode> left_trees = generateTrees(start, i - 1);
            LinkedList<TreeNode> right_trees = generateTrees(i + 1, end);
            for (TreeNode l : left_trees) {
                for (TreeNode r : right_trees) {
                    TreeNode current_tree = new TreeNode(i);
                    current_tree.left = l;
                    current_tree.right = r;
                    all_trees.add(current_tree);
                }
            }
        }
        return all_trees;
    }

    public List<TreeNode> generateTrees(int n) {
        if (n == 0)
            return new LinkedList<TreeNode>();
        return generateTrees(1, n);
    }
}