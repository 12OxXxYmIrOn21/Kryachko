import java.util.Scanner;

public class z32_33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();
        game(number);
    }
    public static void game(long i) {
        int Tan = 0;
        while (i != 1) {
            if (i % 2 == 0) {
                Tan++;
                i--;
                if (i == 1) {
                    break;
                } else {
                    i--;
                }
            } else {
                Tan++;
                i--;
                if (i % 2 == 0) {
                    i /= 2;
                    if (i == 1) {
                        break;
                    }
                }
            }
        }
        System.out.println(Tan);
    }
}