import java.util.Scanner;

public class z44 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number1 = sc.nextLine();
        String number2 = sc.nextLine();
        int number1_int = Integer.parseInt(number1);
        int number2_int = Integer.parseInt(number2);
        int summ = number1_int + number2_int;
        String summ_str = "" + summ;
        System.out.println(summ_str);

    }
}
