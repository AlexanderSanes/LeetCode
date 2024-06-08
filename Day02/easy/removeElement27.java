public class removeElement27 {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[j++] = nums[i];
        }
        return j;
    }

    public static void main(String[] args) {
        String[] items = args[0].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        int val = Integer.valueOf(args[1]);
        int[] nums = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            try {
                nums[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            };
        }
        System.out.println(removeElement(nums, val));
    }
}
