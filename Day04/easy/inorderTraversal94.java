import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class inorderTraversal94 {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.add(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
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
            };
        }
        TreeNode root = TreeNode.fromArray(tree);
        root.printTreeNode();
        List<Integer> res = inorderTraversal(root);
        for (int i = 0; i < res.size(); i++)
            System.out.printf("%d ", res.get(i));
    }
}
//5,4,8,11,null,13,4,7,2,null,null,null,1
