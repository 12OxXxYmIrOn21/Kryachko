import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();

        while (true) {
            System.out.println("1. Добавить контакт");
            System.out.println("2. Показать все контакты");
            System.out.println("3. Выход");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Чистим буфер

            switch (choice) {
                case 1:
                    System.out.print("Введите имя контакта: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите номер телефона: ");
                    String phoneNumber = scanner.nextLine();
                    contactManager.addContact(new Contact(name, phoneNumber));
                    break;
                case 2:
                    System.out.println("Список контактов:");
                    contactManager.listContacts();
                    break;
                case 3:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
                    break;
            }
        }
    }
}