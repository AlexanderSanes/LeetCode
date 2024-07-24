public class isAnagram242 {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] alphabet = new int[256];
        for (int i = 0; i < s.length(); i++)
            alphabet[s.charAt(i)]++;
        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i)]--;
            if (alphabet[t.charAt(i)] < 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram(args[0], args[1]));
    }
}
