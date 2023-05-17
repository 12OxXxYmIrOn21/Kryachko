package z35;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Decoding_caesar obj = new Decoding_caesar();
        String text_file = "";
        System.out.println("Введите шаг:");
        int step = scanner.nextInt();
        File file = new File("C:\\Users\\iva00\\OneDrive\\Рабочий стол\\text.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            text_file += scan.nextLine();
        }
        String codeMessage = obj.caesar(text_file, step);
        System.out.print("Зашифрованный текст: " + obj.caesar(text_file, step) + "\n");
        System.out.print("Расшифрованный текст: " + obj.caesar(codeMessage, -step));
    }

}
