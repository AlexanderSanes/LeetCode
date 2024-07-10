import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class majorityElement169 {

//    public static int majorityElement(int[] nums) {
//        Map<Integer, Integer> hm = new HashMap<>();
//        for (int i = 0; i < nums.length; i++)
//            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
//
//        return Collections.max(hm.entrySet(),Map.Entry.comparingByValue()).getKey();
//    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }



    public static void main(String[] args) {
        String[] items = args[0].replaceAll("\\[", "").replaceAll("\\]", "").split(",");
        int[] arr = new int[items.length];

        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                System.err.println(nfe);
            }
        }
        System.out.println(majorityElement(arr));
    }
}
