public class maxDepth104 {
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
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
        System.out.println(maxDepth(root));
    }
}
