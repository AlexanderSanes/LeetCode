import java.util.HashMap;

public class romanToInt13 {
    public romanToInt13() {
    }

    public static int romanToInt(String var0) {
        HashMap var1 = new HashMap();
        var1.put('I', 1);
        var1.put('V', 5);
        var1.put('X', 10);
        var1.put('L', 50);
        var1.put('C', 100);
        var1.put('D', 500);
        var1.put('M', 1000);
        int var2 = 0;

        for(int var3 = 0; var3 < var0.length(); ++var3) {
            if (var3 < var0.length() - 1 && (Integer)var1.get(var0.charAt(var3)) < (Integer)var1.get(var0.charAt(var3 + 1))) {
                var2 -= (Integer)var1.get(var0.charAt(var3));
            } else {
                var2 += (Integer)var1.get(var0.charAt(var3));
            }
        }

        return var2;
    }

    public static void main(String[] var0) {
        System.out.println(romanToInt(var0[0]));
    }
}
