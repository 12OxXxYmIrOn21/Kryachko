package Matrix;

public class main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(3);
        System.out.println(matrix.toString());
        System.out.println("Произведение диагонали: " + matrix.diagonalProduct());
        System.out.println("Сумма чисел выше диагонали: " + matrix.Summa());
        System.out.println("Разность чисел ниже диагонали: " + matrix.Razn());
    }
}
