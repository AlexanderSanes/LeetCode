import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class letterCombinations17 {

    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>(Arrays.asList(""));
        if (digits.length() == 0)
            return res;
        List<String> set = Arrays.asList("abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");
        for (char c : digits.toCharArray()) {
            List<String> tmp = new ArrayList<>();
            for (String s : res) {
                for (char letter : set.get(c - '2').toCharArray())
                    tmp.add(s + letter);
            }
            res = tmp;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations(args[0]));
    }

}
