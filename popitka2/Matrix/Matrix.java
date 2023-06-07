package Matrix;

import java.util.Random;

public class Matrix {
    private int[][] matrix;

    public Matrix(int size) { //Создаём матрицу
        matrix = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) { //пока заданное число столбцов матрицы не превышает длинну самой матрицы добавляем столбцы
            for (int j = 0; j < matrix[i].length; j++) { //пока заданное число строк матрицы не превышает длинну самой матрицы добавляем строки
                matrix[i][j] = random.nextInt(10); //заполняем матрицу числами от 0 до 9
            }
        }
    }

    public int Razn() { //считаем разность чисел ниде диагонали
        int v = 0;
        for (int i = 0; i < matrix.length; i++) { //Для существующей матрицы
            for (int j = 0; j < i; j++) { //Выделяем числа ниже диагонали
                v -= matrix[i][j]; //Считаем разность
            }
        }
        return v;
    }

    public int Summa() { //считаем сумму чисел выше диагонали
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) { //Для существующей матрицы
            for (int j = i + 1; j < matrix[i].length; j++) { //Выделяем числа выше диагонали
                sum += matrix[i][j]; //Считаем сумму
            }
        }
        return sum;
    }

    public int diagonalProduct() {
        int d = 1;
        for (int i = 0; i < matrix.length; i++) { //Для существующей матрицы
            d *= matrix[i][i]; //Выделяем диагональ и перемножаем числа
        }
        return d;
    }

    public String toString() { //приводим матрицу к стандартному виду
        StringBuilder sb = new StringBuilder();
        for (int[] row : matrix) { //пробегаемся по всем элементам матрицы
            for (int el : row) {
                sb.append(String.format("%2d", el));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}