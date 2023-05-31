import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class z47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if(Math.round(Math.sqrt(N)) * Math.round(Math.sqrt(N)) == N){
            double size = Math.sqrt(N);
            int size_int = (int) size;
            int[][] array = new int[size_int][size_int];
            for (int i = 0;i < size_int;i++){
                for (int j = 0;j < size_int;j++){
                    array[i][j]= (int) (Math.random() * 10);
                }
            }
            System.out.println(Arrays.deepToString(array));
            System.out.println(snail(size_int, array));
        }
    }
    public static List<Integer> snail(int size, int[][] array){
        List<Integer> snail_arr = new ArrayList<>();
        int[] snail_arr1 = new int[size*size+3];
        int quantity = 0;
        int l = 0;
        int m = 0;
        int row = size;
        int col = size;
        while (quantity != size*size)
        {
            for (int j = l;j < row;j++)
            {
                snail_arr1[quantity] = array[m][j];

                quantity++;
            }
            for (int i = m+1;i < col;i++)
            {
                snail_arr1[quantity] = array[i][row-1];
                quantity++;
            }
            row--;
            for (int j = row-1;j >= l;j--)
            {
                snail_arr1[quantity] = array[col-1][j];
                quantity++;
            }
            col--;
            m++;
            for (int i = col-1;i >=m;i--)
            {
                snail_arr1[quantity] = array[i][l];
                quantity++;
            }
            l++;
        }
        for (int i = 0;i < quantity;i++){
            snail_arr.add(snail_arr1[i]);
        }
        return snail_arr;
    }
}
