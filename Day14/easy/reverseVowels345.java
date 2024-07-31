import java.util.HashSet;
import java.util.Set;

public class reverseVowels345 {
    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        StringBuilder res = new StringBuilder(s);
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !vowels.contains(s.charAt(left)))
                left++;
            while (left < right && !vowels.contains(s.charAt(right)))
                right--;
            if (left < right) {
                res.setCharAt(left, s.charAt(right));
                res.setCharAt(right, s.charAt(left));
                left++;
                right--;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels(args[0]));
    }
}
