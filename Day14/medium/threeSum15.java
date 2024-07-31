import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;

public class threeSum15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3)
            return res;
        int i = 0;
        }

    }

    public static void main(String[] args) {
        String[] items = args[0].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        int[] nums = new int[items.length];

        for (int i = 0; i < nums.length; i++)
            nums[i] = Integer.parseInt(items[i]);

        System.out.println(threeSum(nums));
    }
}
