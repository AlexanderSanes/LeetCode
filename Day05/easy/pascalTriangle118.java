import java.util.ArrayList;
import java.util.List;

public class pascalTriangle118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> tmp = new ArrayList<>();
            List<Integer> listTmp = list.get(i - 1);
            tmp.add(1);
            for (int j = 0; j < listTmp.size() - 1; j++) {
                tmp.add(listTmp.get(j) + listTmp.get(j + 1));
            }
            tmp.add(1);
            list.add(tmp);
        }
        return list;
    }

//    public static List<List<Integer>> generate(int n) {
//        List<List<Integer>> ans = new ArrayList<>();
//
//        //store the entire pascal's triangle:
//        for (int row = 1; row <= n; row++) {
//            ans.add(ptriangle(row));
//        }
//        return ans;
//    }
//
//    public static List<Integer> ptriangle(int n) {
//        List<Integer> tempList = new ArrayList<>();
//        long ans = 1;
//        tempList.add(1);
//        System.out.print(ans);
//        for (int i = 1; i < n; i++) {
//            ans = ans * (n - i);
//            ans = ans / i;
//            System.out.print(ans);
//            tempList.add((int)ans);
//        }
//        System.out.println();
//        return tempList;
//    }

    public static void main(String[] args) {
        int numRows = Integer.valueOf(args[0]);
        List<List<Integer>> triangle = generate(numRows);

        System.out.print("[");
        for (int i = 0; i < triangle.size(); i++) {
            System.out.print("[");
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j));
                if (j < triangle.get(i).size() - 1)
                    System.out.print(",");
            }
            System.out.print("}");
        }
    }
}
