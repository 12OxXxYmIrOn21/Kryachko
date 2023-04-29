import java.util.Scanner;

public class z9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String stroka1 = x.nextLine();
        String stroka2 = x.nextLine();
        boolean str = stroka1.endsWith(stroka2); //Проверка является ли 2я строка концом 1й
        System.out.println(str);
    }
}