import java.util.List;

public class countNodes222 {

    public static int countNodes(TreeNode root) {
        System.out.println(root);
        if (root == null)
            return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
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
        System.out.println(countNodes(root));
    }

}
