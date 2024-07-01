import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
public class TreeNode {
    static final int COUNT = 7;
    Integer val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(Integer val) {
        this.val = val;
    }

    TreeNode(Integer val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    static TreeNode fromArray(Integer[] tree) {
        if (tree.length == 0) return null;
        TreeNode root = new TreeNode(tree[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        for (int i = 1; i < tree.length; i++) {
            TreeNode node = q.peek();
            if (node.left == null) {
                node.left = new TreeNode(tree[i]);
                if (tree[i] != null) q.add(node.left);
            } else if (node.right == null) {
                node.right = new TreeNode(tree[i]);
                if (tree[i] != null) q.add(node.right);
                q.remove();
            }
        }
        return root;
    }

    static void print2DUtil(TreeNode root, int space) {
        // Base case
        if (root == null)
            return;
        space += COUNT;
        print2DUtil(root.right, space);
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
            System.out.print(root.val + "\n");
        print2DUtil(root.left, space);
    }

    void printTreeNode() {
        print2DUtil(this, 0);
        System.out.print("\n");
    }
}
