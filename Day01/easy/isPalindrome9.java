public class isPalindrome9 {
    public isPalindrome9() {
    }

    public static boolean isPalindrome(int var0) {
        if (var0 < 0) {
            return false;
        } else {
            String var1 = String.valueOf(var0);

            for(int var2 = 0; var2 < var1.length(); ++var2) {
                if (var1.charAt(var2) != var1.charAt(var1.length() - var2 - 1) && var2 != var1.length() / 2) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] var0) {
        int var1 = Integer.valueOf(var0[0]);
        System.out.println(isPalindrome(var1));
    }
}