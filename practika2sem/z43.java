import static java.lang.Math.max;
import static java.util.Arrays.fill;

public class z43 {
    public static void main(String[] args) {
        int[] piram =
                {5,
                        9, 6,
                        4, 6, 8,
                        0, 7, 1, 5,
                        123,1444,1,11,1
                };

        System.out.println("Max. summ.: " + findingMaxSumm(piram, 5));
    }

    public static int findingMaxSumm(int[] tree, int height) {
        int[] sums = new int[height + 1];
        fill(sums , 0);
        int elem = height;
        int num = elem - 1;
        int[] next_elem = new int[elem];
        for(int i = tree.length - 1; i > -1 ; i--) {
            int left_max_path = sums[num];
            int right_max_path = sums[num + 1];
            next_elem[num] = max(right_max_path, left_max_path) + tree[i];
            num -= 1;
            if (num == -1) {
                elem--;
                num = elem - 1;
                sums = next_elem;
                next_elem = new int[sums.length - 1];
            }
        }
        return sums[0];
    }
}
