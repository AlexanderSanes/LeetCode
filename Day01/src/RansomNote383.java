class RansomNote383 {
    RansomNote383() {
    }

    public static boolean canConstruct(String var0, String var1) {
        if (var0.length() > var1.length()) {
            return false;
        } else {
            int[] var2 = new int[256];

            int var3;
            char var4;
            for(var3 = 0; var3 < var1.length(); ++var3) {
                var4 = var1.charAt(var3);
                ++var2[var4 - 97];
            }

            for(var3 = 0; var3 < var0.length(); ++var3) {
                var4 = var0.charAt(var3);
                if (var2[var4 - 97] == 0) {
                    return false;
                }

                --var2[var4 - 97];
            }

            return true;
        }
    }

    public static void main(String[] var0) {
        System.out.println(canConstruct(var0[0], var0[1]));
    }
}