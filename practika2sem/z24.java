import java.lang.reflect.Array;
import java.util.*;

public class z24 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        String m = number.nextLine();
        String[] num = m.split(" ");
        int summ = 0;
        int y = 0;
        int y1 = 0;
        for(int i = 0; i < num.length; i++){
            y = Integer.parseInt(num[0]);
            y1 = Integer.parseInt(num[1]);
        }
        for(int x1 = y; x1 <= y1; x1++){
            List<Integer> nums2 = new ArrayList();
            for(int i = 2; i < num.length; i++){
                int x = Integer.parseInt(num[i].trim());
                if(x1 % x == 0){
                    String str = "" + x;
                    if(num[i].equals(str)){
                        nums2.add(x1);
                    }
                }
            }
            Set<Integer> set = new HashSet(nums2);
            nums2.clear();
            nums2.addAll(set);
            for(int g : set){
                summ += g;
            }
        }
        System.out.println(summ);
    }
}