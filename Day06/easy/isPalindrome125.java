
public class isPalindrome125 {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty())
            return true;
        s = s.toLowerCase();
//        for (int i = 0, j = s.length() - 1; i < s.length() && j >= 0; i++, j--) {
//            while (i < s.length() && !isDigit(s.charAt(i)) && !isLetter(s.charAt(i)))
//                i++;
//            while (j >= 0 && !isDigit(s.charAt(j)) && !isLetter(s.charAt(j)))
//                j--;
//            if (j >= 0 && i < s.length() && s.charAt(i) != s.charAt(j))
//                return false;
//        }
//        return true;
        int begin = 0;
        int end = s.length() - 1;
        while (begin <= end) {
            char left = s.charAt(begin);
            char right = s.charAt(end);
            if (!Character.isLetterOrDigit(left)) {
                begin++;
            } else if (!Character.isLetterOrDigit(right)) {
                end--;
            } else {
                if (left != right)
                    return false;
                begin++;
                end--;
            }
        }
        return true;
    }

    public static boolean isDigit(char c) {
        return (c >= '0' && c <= '9');
    }

    public static boolean isLetter(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
    }

    public static void main(String[] args) {
        String s = args[0];
        System.out.println(isPalindrome(s));
    }
}
