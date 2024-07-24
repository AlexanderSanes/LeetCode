import java.util.Stack;

public class invertTree226 {

    public static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
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
            }
        }
        TreeNode root = TreeNode.fromArray(tree);
        root.printTreeNode();
        invertTree(root).printTreeNode();
    }
}
