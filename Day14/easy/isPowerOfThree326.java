public class isPowerOfThree326 {

    public static boolean isPowerOfThree(int n) {
        while (n % 3 == 0)
            n /= 3;
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(Integer.parseInt(args[0])));
    }
}
