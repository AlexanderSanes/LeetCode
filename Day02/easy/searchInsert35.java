public class searchInsert35 {
    public static int searchInsert(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        if (target > nums[right]) return right + 1;
        if (target < nums[left]) return left;
        while (right >= left) {
            int middle = left + (right - left) / 2;
            if (nums[middle] > target) right = middle - 1;
            else if (nums[middle] < target) left = middle + 1;
            else return middle;
        }
        return left;
    }

    public static void main(String[] args) {
        String[] items = args[0].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        int target = Integer.valueOf(args[1]);
        int[] nums = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            try {
                nums[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            };
        }
        System.out.println(searchInsert(nums, target));
    }
}
