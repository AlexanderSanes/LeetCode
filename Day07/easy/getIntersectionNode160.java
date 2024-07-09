public class getIntersectionNode160 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

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

        ListNode head = ListNode.fromArray(arr);
        head.printListNode(head);
        head.makeCycle(pos);
        System.out.println(getIntersectionNode(list1, list2).val);
    }
}
