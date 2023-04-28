import java.util.Random;

public class z1 {
    public static void main(String[] args) {
        Random ran = new Random();
        int size1 = 2;
        int size2 = 4;
        int[][] matrix = new int[size1][size2];
        for (int i = 0; i < size2; i++) {
            for (int j = 0; j < size1; j++) {
                matrix[j][i] = ran.nextInt(10);
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}