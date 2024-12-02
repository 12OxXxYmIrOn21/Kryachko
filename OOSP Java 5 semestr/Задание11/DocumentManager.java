import java.util.HashMap;
import java.util.Map;

public class DocumentManager {
    private Map<String, DocumentPrototype> templates = new HashMap<>();

    public void addTemplate(String name, DocumentPrototype template) {
        templates.put(name, template);
    }

    public DocumentPrototype getTemplate(String name) {
        DocumentPrototype template = templates.get(name);
        return (template != null) ? template.clone() : null; // Клонируем шаблон
    }
}
