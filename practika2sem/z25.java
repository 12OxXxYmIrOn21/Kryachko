import java.util.*;

public class z25 {
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
            ArrayList<String> a = new ArrayList();
            ArrayList<String> a2 = new ArrayList();
            for(int i = 2; i < num.length; i++){
                a2.add(num[i]);
                int x = Integer.parseInt(num[i].trim());
                if(x1 % x == 0){
                    String str = "" + x;
                    a.add(str);
                }
            }
            if(a.equals(a2)){
                summ += x1;
            }
        }
        System.out.println(summ);
    }
}
