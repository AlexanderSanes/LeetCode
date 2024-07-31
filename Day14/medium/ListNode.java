public class ListNode {
    int val = 0;
    ListNode next = null;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode fromArray(int[] arr) {
        ListNode head = new ListNode();
        ListNode tmp = head;
        for (int i = 0; i < arr.length - 1; i++) {
            head.val = arr[i];
            head.next = new ListNode();
            head = head.next;
        }
        head.val = arr[arr.length - 1];
        return tmp;
    }

    public static ListNode intersect(int[] arrB, int skipA, int skipB, ListNode headA) {
        ListNode intersectNode = headA;
        while (skipA-- > 0)
            intersectNode = intersectNode.next;
        int i = 0;
        ListNode headB = new ListNode();
        ListNode tmp = headB;
        while (i != skipB - 1) {
            headB.val = arrB[i++];
            headB.next = new ListNode();
            headB = headB.next;
        }
        headB.val = arrB[i];
        headB.next = intersectNode;
        return tmp;
    }

    public void makeCycle(int pos) {
        if (pos >= 0) {
            ListNode cycleNode = this;
            while (pos-- > 0 && cycleNode.next != null)
                cycleNode = cycleNode.next;
            ListNode tmp = cycleNode;
            while (tmp.next != null)
                tmp = tmp.next;
            tmp.next = cycleNode;
        }
    }

    public void printListNode(ListNode head) {
        while (head != null) {
            System.out.printf("%4d", head.val);
            head = head.next;
        }
        System.out.println();
    }

    @Override
    public String toString(){
        ListNode head = this;
        StringBuilder res = new StringBuilder();
        while (head != null) {
            res.append(head.val + " ");
            head = head.next;
        }
        return res.toString();
    }

}
