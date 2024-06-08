public class removeDuplicates26 {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1])
                nums[j++] = nums[i];
        }
        return j;
    }

    public static void main(String[] args) {
        String[] items = args[0].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

        int[] nums = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            try {
                nums[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            };
        }
        System.out.println(removeDuplicates(nums));
    }
}
