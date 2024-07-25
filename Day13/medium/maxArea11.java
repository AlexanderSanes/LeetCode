public class maxArea11 {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        int currMax = 0;
        while (left < right) {
            int minh = Math.min(height[left], height[right]);
            currMax = minh * (right - left);
            max = Math.max(currMax, max);
            while (left < right && height[left] <= minh)
                left++;
            while (left < right && height[right] <= minh)
                right--;
        }
        return max;

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
        System.out.println(maxArea(digits));
    }
}

