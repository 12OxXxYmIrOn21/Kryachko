public class Main {
    public static void main(String[] args) {
        // Создаем массив различных видов транспорта
        Transport[] transports = {
                new Car(),
                new Bicycle(),
                new Train()
        };

        // Вызываем метод move для каждого из видов транспорта
        for (Transport transport : transports) {
            transport.move();
        }
    }
}