import java.util.*;

public class z30 {
    private static final Deque<Integer> indexes = new LinkedList<>();
    private static final List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] ts = {58, 57, 56, 55, 50};
        int number = 163;
        int summa = choose_best_sum(number,3, ts);
        if(Collections.min(list) < number){
            System.out.println(summa);
        }
    }
    public static int choose_best_sum(int number, int expectedSize, int[] arrs) {
        int summa = 0;
        if (indexes.size() == expectedSize) {

            for (Integer i : indexes) {
                summa +=arrs[i];
            }
            if(number <= summa) {
                summa = number;
                list.add(summa);
            }
            list.add(summa);
        }
        for (int i = 0; i < arrs.length; i++) {
            if (!indexes.contains(i)) {
                indexes.addLast(i);
                choose_best_sum(number, expectedSize,arrs);
                indexes.removeLast();
            }
        }
        return Collections.max(list);
    }
}