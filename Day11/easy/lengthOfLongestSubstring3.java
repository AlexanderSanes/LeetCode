import java.net.HttpRetryException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class lengthOfLongestSubstring3 {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int i = 0;
        int left = 0;
        int maxLength = 0;
        while (i < s.length()) {
            while (charSet.contains(s.charAt(i)))
                charSet.remove(s.charAt(left++));
            charSet.add(s.charAt(i));
            maxLength = Math.max(maxLength, charSet.size());
            i++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(args[0]));
    }
}
