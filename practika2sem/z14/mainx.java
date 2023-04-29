package z14;

import java.util.Arrays;
import java.util.Scanner;

public class mainx {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество ячеек");
        int size = s.nextInt();
        z14 array = new z14(size);
        System.out.println("Все ячейки заполнены");
        while(true){
            System.out.println(Arrays.deepToString(array.array1()));
        }
    }
}