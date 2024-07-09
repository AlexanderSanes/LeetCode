public class getIntersectionNode160 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            if (a == null)
                a = headB;
            else a = a.next;
            if (b == null)
                b = headA;
            else b = b.next;
        }
        return a;
    }

    public static void main(String[] args) {
        int intersectVal = Integer.valueOf(args[0]);
        String[] itemsA = args[1].replaceAll("\\[","").replaceAll("\\]","").split(",");
        String[] itemsB = args[2].replaceAll("\\[","").replaceAll("\\]","").split(",");
        int skipA = Integer.valueOf(args[3]);
        int skipB = Integer.valueOf(args[4]);

        int[] arrA = new int[itemsA.length];
        int[] arrB = new int[itemsB.length];

        for (int i = 0; i < arrA.length; i++) {
            try {
                arrA[i] = Integer.parseInt(itemsA[i]);
            } catch (NumberFormatException nfe) {
                System.err.println(nfe);
            }
        }
        for (int i = 0; i < arrB.length; i++) {
            try {
                arrB[i] = Integer.parseInt(itemsB[i]);
            } catch (NumberFormatException nfe) {
                System.err.println(nfe);
            }
        }

        ListNode listA = ListNode.fromArray(arrA);
        ListNode listB = ListNode.intersect(arrB, skipA, skipB, listA);

        listA.printListNode(listA);
        listB.printListNode(listB);

        System.out.println(getIntersectionNode(listA, listB).val);
    }
}
