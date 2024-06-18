public class merge88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int end1 = m - 1;
        int end2 = n - 1;
        int k = m + n - 1;
        while (end2 >= 0) {
            if (end1 >= 0 && nums1[end1] > nums2[end2])
                nums1[k--] = nums1[end1--];
            else
                nums1[k--] = nums2[end2--];
        }
    }

    public static void main(String[] args) {
        String[] items1 = args[0].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        int m = Integer.valueOf(args[1]);

        String[] items2 = args[2].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        int n = Integer.valueOf(args[3]);

        int[] nums1 = new int[n + m];
        int[] nums2 = new int[n];

        for (int i = 0; i < n + m; i++) {
            try {
                nums1[i] = Integer.parseInt(items1[i]);
            } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            };
        }

        for (int i = 0; i < n; i++) {
            try {
                nums2[i] = Integer.parseInt(items2[i]);
            } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            };
        }
        merge(nums1, n, nums2, m);
        for (int i = 0; i < n + m; i++)
            System.out.printf("%3d ", nums1[i]);
    }
}
