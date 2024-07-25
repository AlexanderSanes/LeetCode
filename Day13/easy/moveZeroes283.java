import java.util.Arrays;

public class moveZeroes283 {

    public static void shiftZero(int[] nums, int index, int end) {
        for (int i = index; i < end; i++)
            nums[i] = nums[i + 1];
    }
    public static void moveZeroes(int[] nums) {
        int numOfZeroes = 0;
        int n = nums.length - 1;
        int i = 0;
        while (i <= n) {
            System.out.println(Arrays.toString(nums));
            if (nums[i] == 0)
                shiftZero(nums, i, n--);
            else i++;
        }
        while (n < nums.length - 1)
            nums[++n] = 0;
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
        moveZeroes(digits);
        System.out.println(Arrays.toString(digits));
    }
}
