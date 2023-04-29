import java.util.Scanner;

public class z5 {
    public static void main(String[] args) {
        System.out.println("Введите числа через пробел, чтоюы перемножить их на самих себя и сложить");
        int[] list;
        String str;
        String[] strnew;
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        strnew = str.split(" ");
        list = new int[strnew.length];
        int x = 0;
        for (int i = 0; i < strnew.length; i++){
            list[i] =  Integer.parseInt(strnew[i]);
            int y = list[i] * list[i];
            x += y;
        }
        System.out.println(x);
    }
}