import java.util.Scanner;

public class z16 {
    public static void main(String[] args){
        System.out.println("Введите текст");
        Scanner str = new Scanner(System.in);
        String stroka1 = str.nextLine();
        String[] stroka2 = stroka1.split("");
        int x = 0;
        for(int i = 0; i <  stroka2.length;i++){
            if(stroka2[i].equals(stroka2[i].toUpperCase())) {
                x++;
            }
            if(x > stroka2.length - x) {
                stroka1 = stroka1.toUpperCase();
            } else {
                stroka1 = stroka1.toLowerCase();
            }
        }
        System.out.println(stroka1);
    }
}