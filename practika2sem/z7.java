import java.util.Scanner;

public class z7 {
    public static void main(String[] args){
        System.out.println("Введите число n");
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        System.out.println(Math.round(Math.sqrt(number)));

    }
}