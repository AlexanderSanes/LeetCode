import java.util.HashMap;
import java.util.Map;

public class containsNearbyDuplicate219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        int i = 0;
//        int j = 0;
//        while (i < nums.length - 1) {
//            j = i + 1;
//            while (j - i <= k && j < nums.length) {
//                if (nums[i] == nums[j++])
//                    return true;
//            }
//            i++;
//        }
//        return false;

        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hmap.containsKey(nums[i])) {
                if (i - hmap.get(nums[i]) <= k)
                    return true;
            }
            hmap.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        String[] items = args[0].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

        int[] digits = new int[items.length];
        int k = Integer.valueOf(args[1]);
        for (int i = 0; i < items.length; i++) {
            try {
                digits[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            };
        }
        System.out.println(containsNearbyDuplicate(digits, k));
    }
}
