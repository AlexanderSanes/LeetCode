import java.util.List;

public class addTwoNumbers2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode tmp = res;
        int remainder = 0;
        while (l1 != null && l2 != null) {
            tmp.next = new ListNode((l1.val + l2.val + remainder) % 10);
            remainder = (l1.val + l2.val + remainder) >= 10 ? 1 : 0;
            tmp = tmp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            tmp.next = new ListNode((l1.val + remainder) % 10);
            tmp = tmp.next;
            remainder = (l1.val + remainder) >= 10 ? 1 : 0;
            l1 = l1.next;
        }
        while (l2 != null) {
            tmp.next = new ListNode((l2.val + remainder) % 10);
            tmp = tmp.next;
            remainder = (l2.val + remainder) >= 10 ? 1 : 0;
            l2 = l2.next;
        }
        if (remainder == 1)
            tmp.next = new ListNode(1);
        return res.next;
    }

    public static void main(String[] args) {
        String[] items1 = args[0].replaceAll("\\[", "").replaceAll("\\]", "").split(",");
        String[] items2 = args[1].replaceAll("\\[", "").replaceAll("\\]", "").split(",");
        int[] arr1 = new int[items1.length];
        int[] arr2 = new int[items2.length];
        for (int i = 0; i < arr1.length; i++) {
            try {
                arr1[i] = Integer.parseInt(items1[i]);
            } catch (NumberFormatException nfe) {
                System.err.println(nfe);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            try {
                arr2[i] = Integer.parseInt(items2[i]);
            } catch (NumberFormatException nfe) {
                System.err.println(nfe);
            }
        }

        ListNode head1 = ListNode.fromArray(arr1);
        ListNode head2 = ListNode.fromArray(arr2);
        System.out.println(head1);
        System.out.println(head2);
        System.out.println(addTwoNumbers(head1, head2));
    }
}
