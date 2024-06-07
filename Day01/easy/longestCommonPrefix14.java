import java.util.Arrays;

public class longestCommonPrefix14 {
    public static String longestCommonPrefix(String[] strs) {
        String ans = "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int minlen = first.length() < last.length() ? first.length() : last.length();
        for (int i = 0; i < minlen; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans;
            }
            ans += first.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(args));
    }
}
