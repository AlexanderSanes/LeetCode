import java.util.List;

public class removeNthFromEnd19 {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0, head);
        ListNode tmp = res;

        for (int i = 0; i < n; i++)
            head = head.next;
        while (head != null) {
            head = head.next;
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;

        return res.next;
    }

//    public static int listSize(ListNode head) {
//        if (head == null) return 0;
//        int size = 0;
//        while (head.next != null) {
//            size++;
//            head = head.next;
//        }
//        return size + 1;
//    }

    public static void main(String[] args) {
        String[] items1 = args[0].replaceAll("\\[", "").replaceAll("\\]", "").split(",");
        int[] arr1 = new int[items1.length];
        int n = Integer.parseInt(args[1]);
        for (int i = 0; i < arr1.length; i++) {
            try {
                arr1[i] = Integer.parseInt(items1[i]);
            } catch (NumberFormatException nfe) {
                System.err.println(nfe);
            }
        }

        ListNode head1 = ListNode.fromArray(arr1);
        System.out.println(head1);
        System.out.println(removeNthFromEnd(head1, n));
    }
}
