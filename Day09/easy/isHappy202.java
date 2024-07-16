import java.util.HashSet;
import java.util.Set;

public class isHappy202 {
    public static int squareSum(int n) {
        int res = 0;
        while (n != 0) {
            res += (n % 10) * (n % 10);
            n /= 10;
        }
        return res;
    }
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        while (sum != 1) {
            sum = squareSum(n);
            if (set.contains(sum))
                return false;
            set.add(sum);
            n = sum;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(Integer.valueOf(args[0])));
    }
}
