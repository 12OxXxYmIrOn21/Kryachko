import java.util.Scanner;

public class z46 {
    private static int[] inter ={0, 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    private static String[] roman_numbers ={"", "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine();
        int arabic = toArabic(roman);
        System.out.println(arabic);
    }
    public static int toArabic(String roman) {
        int arabic_num = 0;
        for (int i = inter.length-1; i >= 0; i-- ) {
            while (roman.indexOf(roman_numbers[i]) == 0 && roman_numbers[i].length() > 0) {
                arabic_num += inter[i];
                roman = roman.substring(roman_numbers[i].length());
            }
        }
        return arabic_num;
    }
}
