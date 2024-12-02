// Абстрактный класс Transport
abstract class Transport {
    // Общий метод для движения
    public void move() {
        System.out.println("Транспорт находится в пути: " + getTransportationMode());
    }

    // Абстрактный метод, который должен быть реализован в подклассах
    protected abstract String getTransportationMode();
}
