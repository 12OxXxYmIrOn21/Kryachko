package z20;
    public class z20 {
    public static void main(String[] args) {
        int[][] creature = matrix(5, 5);
        print(creature);
    }

    public static int[][] matrix(int m, int height){
        int[][] array = new int[m][height];
        int val = 2;
        int row = 1, col = 1;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[0][j] = 1;
                array[array.length - 1][j] = 1;
                array[i][0] = 1;
                array[i][array[i].length - 1] = 1;
            }
        }
        while (row < m && col < height) {

            for (int i = col; i < height - 1; i++) {
                array[row][i] = val++;
            }
            row++;
            for (int i = row; i < m - 1; i++) {
                array[i][height - 2] = val++;
            }
            height--;
            if (row < m - 1) {
                for (int i = height - 2; i >= col; i--) {
                    array[m - 2][i] = val++;
                }
                m--;
            }
            if (col < height - 1) {
                for (int i = m - 2; i >= row; i--) {
                    array[i][col] = val++;
                }
                col++;
            }
        }
        return array;
    }
    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d\t", arr[i][j]);
            }
            System.out.println();
        }
    }
}