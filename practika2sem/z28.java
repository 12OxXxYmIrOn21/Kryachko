import java.util.ArrayList;
import java.util.Scanner;

public class z28 {
    private static final ArrayList<Integer> list = new ArrayList();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextInt();
        if (0 < num && num < 100000) {
            for (int i = 1; i < num; i++) {
                list.add((int) Math.pow(i, 2));
            }
        }
        System.out.println(differenceVal(num));
    }
    public static String differenceVal(double num){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) - list.get(j) == num) {
                    return (int) num + "=" + list.get(i) + "-" + list.get(j);
                }
            }
        }
        return null;
    }
}