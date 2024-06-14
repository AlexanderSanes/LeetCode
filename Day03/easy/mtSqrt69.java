public class mtSqrt69 {

    public static int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int start = 1;
        int end = x;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if ((long) mid * mid == (long) x)
                return mid;
            else
                start = mid + 1;
        }
        return end;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(Integer.valueOf(args[0])));
    }
}
