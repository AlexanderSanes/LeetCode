import java.util.ArrayList;
import java.util.List;

public class binaryTreePaths257 {

    public static void recursivePaths(StringBuilder str, List<String> strList, TreeNode root) {
        int tmp = str.length();
        if (root.left == null && root.right == null) {
            str.append(root.val);
            strList.add(str.toString());
        } else {
            str.append(root.val + "->");
            if (root.left != null)
                recursivePaths(str, strList, root.left);
            if (root.right != null)
                recursivePaths(str, strList, root.right);
        }
        str.setLength(tmp);
    }
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        recursivePaths(new StringBuilder(), res, root);
        return res;
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
        System.out.println(binaryTreePaths(root));
    }
}
