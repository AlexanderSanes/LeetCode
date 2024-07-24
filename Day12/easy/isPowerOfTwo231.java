public class isPowerOfTwo231 {

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0 || (n & ~(n - 1)) != n)
            return false;
        return true;
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("15 = " + Integer.toBinaryString(15));
        System.out.println("14 = " + Integer.toBinaryString(14));
        System.out.println("~14 = " + Integer.toBinaryString(~14));

        System.out.println("32 = " + Integer.toBinaryString(32));
        System.out.println("31 = " + Integer.toBinaryString(31));
        System.out.println("~31 = " + Integer.toBinaryString(~31));

        System.out.println("16 = " + Integer.toBinaryString(16));
        System.out.println("15 = " + Integer.toBinaryString(15));
        System.out.println("~15 = " + Integer.toBinaryString(~15));

        System.out.println(isPowerOfTwo(x));
    }
}
