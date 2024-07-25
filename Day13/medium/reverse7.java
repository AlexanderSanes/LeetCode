import javax.print.DocFlavor;

public class reverse7 {

    public static int reverse(int x) {
        int res = 0;
        int digit = 0;
        while (x != 0) {
            digit = x % 10;
            if (res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE && digit > 7)
                return 0;
            if (res < Integer.MIN_VALUE / 10 || res == Integer.MIN_VALUE && digit < -8)
                return 0;
            x /= 10;
            res = res * 10 + digit;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(Integer.parseInt(args[0])));
    }
}
