import java.util.ArrayList;
import java.util.List;

// Компонент
abstract class DocumentElement {
    public abstract void print();
}

// Листовой элемент
class TextElement extends DocumentElement {
    private String text;

    public TextElement(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("Text: " + text);
    }
}