public class hammingWeight191 {

    public static int hammingWeight(int n) {
        int sum = 0;
        while (n > 0) {
            if (1 == (n & 1))
                sum++;
            n >>= 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(Integer.valueOf(args[0])));
    }
}
