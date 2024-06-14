import com.sun.source.tree.WhileLoopTree;

import java.util.List;
import java.util.Scanner;

public class deleteDuplicates83 {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        ListNode curr = head.next;
        ListNode prev = head;
        while (curr != null) {
            if (curr.val == prev.val) {
                prev.next = curr.next;
                curr = curr.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        Scanner in = new Scanner(System.in);
        String buf;
        while (!(buf = in.next()).equals(".")) {
            temp.next = new ListNode(Integer.valueOf(buf));
            temp = temp.next;
        }
        head.printListNode();
        ListNode delList = deleteDuplicates(head);
        delList.printListNode();
        delList = deleteDuplicates(null);
    }

}
