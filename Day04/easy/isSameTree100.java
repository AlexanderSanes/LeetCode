import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class isSameTree100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p != null && q != null) {
            if (p.val == q.val)
                return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        String[] items1 = args[0].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        Integer[] tree1 = new Integer[items1.length];

        String[] items2 = args[1].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        Integer[] tree2 = new Integer[items2.length];

        for (int i = 0; i < items1.length; i++) {
            try {
                if (items1[i].equals("null"))
                    tree1[i] = null;
                else
                    tree1[i] = Integer.parseInt(items1[i]);
            } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            };
        }

        for (int i = 0; i < items2.length; i++) {
            try {
                if (items2[i].equals("null"))
                    tree2[i] = null;
                else
                    tree2[i] = Integer.parseInt(items2[i]);
            } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            };
        }
        TreeNode p = TreeNode.fromArray(tree1);
        p.printTreeNode();
        TreeNode q = TreeNode.fromArray(tree2);
        q.printTreeNode();
        System.out.println(isSameTree(p, q));
    }
}
//5,4,8,11,null,13,4,7,2,null,null,null,1
