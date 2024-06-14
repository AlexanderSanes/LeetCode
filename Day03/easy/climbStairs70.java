public class climbStairs70 {
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;
        int prev = 1, curr = 1, temp = 0;
        for (int i = 2; i <= n; i++) {
            temp = curr;
            curr += prev;
            prev = temp;
        }
        return curr;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(Integer.valueOf(args[0])));
    }
}
