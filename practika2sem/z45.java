import java.util.Scanner;

public class z45 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ar_number = sc.nextInt();
        System.out.println(romanNumeral(ar_number));
    }
    public static String romanNumeral(int ar_number) {
        StringBuilder strBox = new StringBuilder();
        if(1 < ar_number && ar_number < 10000){
            int times;
            String[] romans_numbers = new String[] { "I", "IV", "V", "IX", "X", "XL", "L",
                    "XC", "C", "CD", "D", "CM", "M" };
            int[] ar_ints = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500,
                    900, 1000 };
            for (int i = ar_ints.length - 1; i >= 0; i--) {
                times = ar_number / ar_ints[i];
                ar_number %= ar_ints[i];
                while (times > 0) {
                    strBox.append(romans_numbers[i]);
                    times--;
                }
            }
            return strBox.toString();
        }
        return "";
    }
}
