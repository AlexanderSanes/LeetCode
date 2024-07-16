public class reverseList206 {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        if (head == null || head.next == null)
            return head;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }

    public static void main(String[] args) {
        String[] items = args[0].replaceAll("\\[", "").replaceAll("\\]", "").split(",");
        int[] arr = new int[items.length];
        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                System.err.println(nfe);
            }
        }
        ListNode head = ListNode.fromArray(arr);
        System.out.println(head);
        System.out.println(reverseList(head));
    }
}

//[1] -> [2] -> [3] -> [4] -> [5] -> null

//null <- [1] <- [2] <- [3] <- [4] <- [5]
