import java.util.Scanner;

public class z29 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String num1 = scan.nextLine();
        int number1_int = Integer.parseInt(num1.trim());
        int number2 = scan.nextInt() - 1;
        int summa = 0;
        String[] numbers = num1.split("");
        for(int i = 0; i < numbers.length; i++){
            number2++;
            int x = Integer.parseInt(numbers[i].trim ());
            summa += Math.pow(x,number2);
        }
        if(summa % number1_int == 0){

            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}