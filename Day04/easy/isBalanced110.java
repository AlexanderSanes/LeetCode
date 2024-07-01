public class isBalanced110 {

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (checkHeight(root) == -1)
            return false;
        return true;
    }
    public static int checkHeight(TreeNode root) {
        if (root == null)
            return 0;
        int left = checkHeight(root.left);
        int right = checkHeight(root.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1)
            return -1;
        return Math.max(left, right) + 1;
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
        System.out.println(isBalanced(root));
    }
}
