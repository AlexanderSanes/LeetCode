import java.util.HashMap;
import java.util.Map;

public class wordPattern290 {

    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> hmap1 = new HashMap<>();
        Map<String, Character> hmap2 = new HashMap<>();
        String[] splitS = s.split(" ");
        if (splitS.length != pattern.length())
            return false;
        int i = 0;
        for (char c : pattern.toCharArray()) {
            if (hmap1.containsKey(c) ) {
                if (!hmap1.get(c).equals(splitS[i]))
                    return false;
            } else {
                if (hmap2.containsKey(splitS[i]))
                    return false;
                hmap1.put(c, splitS[i]);
                hmap2.put(splitS[i], c);
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern(args[0], args[1]));
    }
}
