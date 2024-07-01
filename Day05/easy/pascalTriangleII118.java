import java.util.ArrayList;
import java.util.List;

public class pascalTriangleII118 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        int n = rowIndex;
        row.add(1);
        for (int i = 1; i < n + 1; i++) {
            long tmp = (long) row.get(i - 1) * (n - i + 1) / i;
            row.add((int) tmp);
        }
        return row;
    }

    public static void main(String[] args) {
        int rowIndex = Integer.valueOf(args[0]);
        List<Integer> row = getRow(rowIndex);

        System.out.print("[");
        for (int i = 0; i < row.size(); i++) {
            System.out.print(row.get(i));
            if (i < row.size() - 1)
                System.out.print(",");
        }
        System.out.print("]");
    }
}
