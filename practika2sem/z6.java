import java.util.Scanner;
public class z6 {
    public static void main(String[] args){
        boolean count = number(5869);
        System.out.println(count);
    }
    public static boolean number(int x){
        int i = 2;
        while (x % i != 0){
            i++;
        }
        if (i == x){
            return true;
        }
        return false;
    }

}