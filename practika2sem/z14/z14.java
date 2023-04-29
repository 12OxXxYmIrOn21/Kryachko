package z14;

import java.util.Arrays;
import java.util.Scanner;

public class z14 {
    private int[][] array;

    public z14(int size) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите элементы ячеек");
        array = new int[size][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = s.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    public int[][] array1(){
        Scanner s = new Scanner(System.in);


        int number = s.nextInt();
        int min = Integer.MAX_VALUE;
        int minI = -1;
        int minJ = -1;
        for(int i = 0; i < array.length;i++){
            for(int j = 0; j < 3;j++){
                if(array[i][j] < min){
                    min = array[i][j];
                    minI = i;
                    minJ = j;

                }

            }

        }
        array[minI][minJ] = number;
        return array;

    }

}
