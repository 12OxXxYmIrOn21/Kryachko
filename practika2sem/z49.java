public class z49 {
    public static void main(String[] args) {
        System.out.println(fusc(0) + "\n" + fusc(1) + "\n"
                + fusc(11)+ "\n" + fusc(3) + "\n" + fusc(9999));
    }
    public static int fusc(int i) {
        int x = 0;
        int y = 1;
        int temp;
        if(i == 0) {
            return 0;
        }
        while(i >= 2) {
            if(i % 2 == 0) {
                i /= 2;
            } else {
                temp = x;
                x += y;
                y = temp;
                i--;
            }
        }
        return x + y;
    }
}
