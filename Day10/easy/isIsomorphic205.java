import java.util.*;
public class isIsomorphic205 {

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character,Character> hmap = new HashMap<Character,Character>();
        for (int i =0;i < s.length(); i++) {
            if (!hmap.containsKey(s.charAt(i))) {
                if (!hmap.containsValue(t.charAt(i))) {
                    hmap.put(s.charAt(i), t.charAt(i));
                } else return false;
            } else {
                if (hmap.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic(args[0], args[1]));
    }
}