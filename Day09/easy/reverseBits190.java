public class reverseBits190 {
    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res = res | (n & 1);
            n >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(Integer.valueOf(args[0])));
    }
}
