import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postorderTraversal145 {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode next = stack.peek();
            if (next.left == root || next.right == root || next.left == null && next.right == null) {
                stack.pop();
                res.add(next.val);
                root = next;
            } else {
                if (next.right != null)
                    stack.push(next.right);
                if (next.left != null)
                    stack.push(next.left);
            }
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
            }
        }
        TreeNode root = TreeNode.fromArray(tree);
        root.printTreeNode();
        List<Integer> res = postorderTraversal(root);
        for (int i = 0; i < res.size(); i++)
            System.out.printf("%d ", res.get(i));
    }
}
