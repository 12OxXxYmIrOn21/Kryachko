import java.util.ArrayList;
import java.util.List;
class CompositeElement extends DocumentElement {
    private List<DocumentElement> elements = new ArrayList<>();

    public void add(DocumentElement element) {
        elements.add(element);
    }

    public void remove(DocumentElement element) {
        elements.remove(element);
    }

    @Override
    public void print() {
        System.out.println("Composite Element:");
        for (DocumentElement element : elements) {
            element.print();
        }
    }
}