import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float triangle[][] = new float[3][2];
        int x = 1;
        for(int i = 0; i < 3; i++){
            System.out.println("Введите координаты " + x + "й вершины треугольника");
            x++;
            for(int j = 0; j < 2; j++){
                triangle[i][j] = in.nextInt();
            }
        }
        System.out.println("Барицентр треугольника равен=>" + "{"
                + (triangle[0][0] + triangle[1][0] + triangle[2][0])/3 + ","
                + (triangle[0][1] + triangle[1][1] + triangle[2][1])/3 + "}");
    }
}