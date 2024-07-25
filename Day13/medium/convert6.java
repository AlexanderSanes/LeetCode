import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class convert6 {

    public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length())
            return s;
        StringBuilder res = new StringBuilder();
        List<List<Character>> matr = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            matr.add(new ArrayList<>());
        }
        int i = 0;
        int d = 0;
        for (char c : s.toCharArray()) {
            matr.get(i).add(c);
            if (i == 0)
                d = 1;
            else if (i == numRows - 1)
                d = -1;
            i += d;
        }

        for (List<Character> row : matr)
            for (char c : row)
                res.append(c);
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert(args[0], Integer.parseInt(args[1])));
    }
}
