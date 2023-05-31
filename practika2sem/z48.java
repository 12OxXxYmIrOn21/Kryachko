import java.util.*;

public class z48 {
    public static void main(String[] args) {
        int i = 20;
        int y;
        int z;
        HashSet<Integer> set = new HashSet<>();
        for(int x = 1; set.size() < i; x++) {
            y = 2 * x + 1;
            z = 3 * x + 1;
            set.add(x);
            set.add(y);
            set.add(z);
        }
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
