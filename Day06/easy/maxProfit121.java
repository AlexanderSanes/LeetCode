import java.util.List;

public class maxProfit121 {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int curr = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (curr > prices[i])
                curr = prices[i];
            else if (prices[i] - curr > profit)
                profit = prices[i] - curr;
        }
        return profit;
    }

    public static void main(String[] args) {
        String[] items = args[0].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        int[] arr = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            try {
                arr[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            }
        }
        System.out.println(maxProfit(arr));
    }
}
