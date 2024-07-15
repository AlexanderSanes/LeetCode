import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomizedSet380 {

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(1);
        boolean param_2 = obj.remove(1);
        int param_3 = obj.getRandom();
    }
}

class RandomizedSet {

    HashMap<Integer, Integer> map;
    List<Integer> list;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        boolean res = map.containsKey(val);
        if (!res) {
            list.add(val);
            map.put(val, list.size() - 1);
        }
        return res;
    }

    public boolean remove(int val) {
        boolean res = map.containsKey(val);
        if (res) {
            int i = map.get(val);
            list.set(i, list.get(list.size() - 1));
            map.put(list.get(list.size() - 1), i);
            list.remove(list.size() - 1);
            map.remove(val);
        }
        return res;
    }

    public int getRandom() {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}
