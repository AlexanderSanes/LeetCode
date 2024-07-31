import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSumCloset16 {
    public static int threeSumClosest(int[] nums, int target) {
        int res = 0;
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int currDiff = Math.abs(sum - target);
                if (currDiff < minDiff) {
                    minDiff = currDiff;
                    res = sum;
                }
                if (sum > target) k--;
                else if (sum < target) j++;
                else return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] items = args[0].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        int[] nums = new int[items.length];
        int target = Integer.parseInt(args[1]);

        for (int i = 0; i < nums.length; i++)
            nums[i] = Integer.parseInt(items[i]);

        System.out.println(threeSumClosest(nums, target));
    }
}
