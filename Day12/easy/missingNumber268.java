public class missingNumber268 {

    public static int missingNumber(int[] nums) {
        int sum = 0;
        for (int n : nums)
            sum += n;
        int realSum = 0;
        for (int i = 0; i <= nums.length; i++)
            realSum += i;
        return realSum - sum;
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
        System.out.println(missingNumber(digits));
    }
}
