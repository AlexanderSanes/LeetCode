public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    void printListNode() {
        ListNode head = this;
        while (head != null) {
            System.out.printf("%4d", head.val);
            head = head.next;
        }
        System.out.println();
    }
}
