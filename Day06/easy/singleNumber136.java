import java.awt.font.NumericShaper;
import java.util.HashSet;

public class singleNumber136 {

    public static int singleNumber(int[] nums) {
//        HashSet<Integer> hashSet = new HashSet<Integer>();
//        hashSet.add(nums[0]);
//        for (int i = 1; i < nums.length; i++) {
//            if (hashSet.contains(nums[i]))
//                hashSet.remove(nums[i]);
//            else hashSet.add(nums[i]);
//        }
//        return hashSet.toArray(new Integer[hashSet.size()])[0];

            int x =0;
            for(int i=0;i<nums.length;i++)
            {
                System.out.println(x);
                x ^= nums[i];
            }
            return x;

    }

    public static void main(String[] args) {
        String[] items = args[0].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        int[] arr = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            try {
                arr[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            }
        }
        System.out.println(singleNumber(arr));
    }
}
