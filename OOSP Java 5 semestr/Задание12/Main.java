public class Main {
    public static void main(String[] args) {
        // Создание текстовых и графических элементов
        DocumentElement text1 = new TextElement("Hello, World!");
        DocumentElement text2 = new TextElement("Welcome to Composite Pattern.");
        DocumentElement image1 = new ImageElement("/images/pic1.png");

        // Создание составного элемента
        CompositeElement composite = new CompositeElement();
        composite.add(text1);
        composite.add(image1);
        composite.add(text2);

        // Печать составного элемента
        composite.print();
    }
}
