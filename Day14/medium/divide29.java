

public class divide29 {

    public static int divide(int dividend, int divisor) {
        if (dividend == divisor) return 1;
        int ans = 0;
        boolean isPositive = (dividend < 0 == divisor < 0);
        int x = Math.abs(dividend);
        int y = Math.abs(divisor);
        while (x >= y) {
            int q = 0;
            while (x > (y << q + 1))
                q++;
            ans += 1<<q;
            x -= (y << q);
        }
        if (ans == 1<<31 && isPositive)
            return Integer.MAX_VALUE;
        return isPositive ? ans : -ans;
    }

    public static void main(String[] args) {
        System.out.println(1 << 31);
        System.out.println(divide(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
}

/*
	dividend = (quotient) * divisor + rem
	dividend = (2^n + ... + 2^0) * divisor + rem

	ans = (2^n + ... + 2^0) * divisor + rem

	(10 = (q) * 3 + rem)
	3 * 2^1 = 6 < 10 // 3 * 2^2 = 12 > 10
	10 - 3 * 2^1 = 4 | ans = ans + 2^1 = 0 + 2 = 2
	3 * 2^0 = 3 < 4
	4 - 3 * 2^0 = 1 < 3 | ans = ans + 2^0 = 2 + 1 = 3 --> ans = 3
 */