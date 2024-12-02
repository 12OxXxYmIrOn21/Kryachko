public class DocumentTemplate implements DocumentPrototype {
    private String title;
    private String content;

    public DocumentTemplate(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Геттеры
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    // Реализация метода clone
    @Override
    public DocumentPrototype clone() {
        return new DocumentTemplate(this.title, this.content);
    }

    @Override
    public String toString() {
        return "DocumentTemplate{" +
                "title='" + title + "" + ", content='" + content + "" + "}";
    }
}

