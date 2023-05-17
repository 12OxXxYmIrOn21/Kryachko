import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class z38 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\iva00\\Рабочий стол\\text.txt");
        Scanner scan = new Scanner(file);
        String text_file = "";
        while (scan.hasNextLine()) {
            text_file += scan.nextLine();
        }
        String[] array = text_file.split(" ");
        String[] stroka1;
        for(int x = 0; x < array.length; x++){

            stroka1 = array[x].split("");
            array[x] += (stroka1[0] + "ауч");
            array[x] = array[x].substring(1);
        }
        for (String y: array){
            System.out.print(y + " ");
        }
    }
}