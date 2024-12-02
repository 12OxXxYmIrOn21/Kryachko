// Класс с методом main для тестирования
public class Main {
    public static void main(String[] args) {
        Room room = new Room.RoomBuilder()
                .setArea(25.5)
                .setWallColor("Синий")
                .setFurniture("Диван и Стол")
                .build();

        System.out.println(room);
    }
}