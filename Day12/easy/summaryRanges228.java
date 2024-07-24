import java.util.ArrayList;
import java.util.List;

public class summaryRanges228 {

    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0)
            return res;
        long curr = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if ((long) nums[i] - (long) nums[i - 1] > 1) {
                if (curr == nums[i - 1])
                    res.add(curr + "");
                else res.add(curr + "->" + nums[i - 1]);
                curr = nums[i];
            }
        }
        if (curr == nums[nums.length - 1])
            res.add(curr + "");
        else res.add(curr + "->" + nums[nums.length - 1]);
        return res;
    }

    public static void main(String[] args) {
        String[] items = args[0].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

        int[] digits = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            try {
                digits[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            };
        }
        System.out.println(summaryRanges(digits));
    }
}
