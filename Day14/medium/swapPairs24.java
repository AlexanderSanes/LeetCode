public class swapPairs24 {

    public static ListNode swapPairs(ListNode head) {
        ListNode res = new ListNode(0, head);
        ListNode dummy = res;
        while (dummy.next != null && dummy.next.next != null) {
            ListNode tmp1 = dummy.next.next;
            ListNode tmp2 = dummy.next.next.next;
            dummy.next.next.next = dummy.next;
            dummy.next.next = tmp2;
            dummy.next = tmp1;
            dummy = dummy.next.next;
        }
        return res.next;
    }

    public static void main(String[] args) {
        String[] items1 = args[0].replaceAll("\\[", "").replaceAll("\\]", "").split(",");
        int[] arr1 = new int[items1.length];
        for (int i = 0; i < arr1.length; i++) {
            try {
                arr1[i] = Integer.parseInt(items1[i]);
            } catch (NumberFormatException nfe) {
                System.err.println(nfe);
            }
        }

        ListNode head1 = ListNode.fromArray(arr1);
        System.out.println(head1);
        System.out.println(swapPairs(head1));
    }
}
