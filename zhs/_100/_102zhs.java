import java.util.ArrayList;
import java.util.List;

public class _102zhs {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public void levelOrder(TreeNode r, int depth, List<List<Integer>> ans) {
        if(r==null)
            return;
        if (ans.size() - 1 < depth)
            ans.add(new ArrayList<Integer>());
        ans.get(depth).add(r.val);
        levelOrder(r.left,depth+1,ans);
        levelOrder(r.right,depth+1,ans);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        levelOrder(root, 0, ans);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        _102zhs t = new _102zhs();
        System.out.println(t.levelOrder(root));
    }
}