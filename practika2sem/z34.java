import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class z34 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number;
        String[] w = new String[9];
        for(int i = 0; i < w.length; i++) {
            number = rand.nextInt(55,180);
            w[i] = "" + number;
            System.out.print(w[i] + " ");
        }
        System.out.println("\n");
        Arrays.sort(w, Comparator.comparingInt(z34::sum_of_digits));
        for(String i: w){
            System.out.print(i + " ");
        }
    }
    public static int sum_of_digits(String nums) {
        int sumaa = 0;

        for(int i = 0; i < nums.length(); ++i) {
            sumaa += Character.getNumericValue(nums.charAt(i));
        }
        return sumaa;
    }
}