public class hasCycle141 {
    public static boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow.equals(fast))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] items = args[0].replaceAll("\\[","").replaceAll("\\]","").split(",");
        int pos = Integer.valueOf(args[1]);
        int[] arr = new int[items.length];
        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                System.err.println(nfe);
            }
        }
        ListNode head = ListNode.fromArray(arr);
        head.printListNode(head);
        head.makeCycle(pos);
        System.out.println(hasCycle(head));
    }
}
