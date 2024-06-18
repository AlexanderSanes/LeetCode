import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class isSymmetric101 {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetric2(root.left, root.right);
    }

    public static boolean isSymmetric2(TreeNode left, TreeNode right) {
        if (right == null && left == null)
            return true;
        if (right == null || left == null)
            return false;
        return right.val == left.val && isSymmetric2(right.right, left.left) && isSymmetric2(right.left, left.right);
    }
    public static void main(String[] args) {
        String[] items = args[0].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        Integer[] tree = new Integer[items.length];

        for (int i = 0; i < items.length; i++) {
            try {
                if (items[i].equals("null"))
                    tree[i] = null;
                else
                    tree[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            };
        }

        TreeNode root = TreeNode.fromArray(tree);
        root.printTreeNode();
        System.out.println(isSymmetric(root));
    }
}
