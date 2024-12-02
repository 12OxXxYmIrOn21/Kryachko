// Класс Room, представляющий собой конечный продукт
class Room {
    private final double area; // площадь
    private final String wallColor; // цвет стен
    private final String furniture; // мебель

    // Конструктор класса Room, доступный только через строителя
    private Room(RoomBuilder builder) {
        this.area = builder.area;
        this.wallColor = builder.wallColor;
        this.furniture = builder.furniture;
    }

    @Override
    public String toString() {
        return "Комната{" +
                "Площадь=" + area +
                ", Цвет стен = " + wallColor + " " + ", Мебель = " + furniture + ""  + "}" ;
    }
    // Строитель класса Room
    public static class RoomBuilder {
        private double area;
        private String wallColor;
        private String furniture;

        public RoomBuilder setArea(double area) {
            this.area = area;
            return this;
        }

        public RoomBuilder setWallColor(String wallColor) {
            this.wallColor = wallColor;
            return this;
        }

        public RoomBuilder setFurniture(String furniture) {
            this.furniture = furniture;
            return this;
        }

        // Метод для создания объекта Room
        public Room build() {
            return new Room(this);
        }
    }
}