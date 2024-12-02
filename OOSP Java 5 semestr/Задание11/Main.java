public class Main {
    public static void main(String[] args) {
        DocumentManager manager = new DocumentManager();

        // Создаем шаблоны документов
        DocumentTemplate invoiceTemplate = new DocumentTemplate("Invoice", "This is the invoice content.");
        DocumentTemplate reportTemplate = new DocumentTemplate("Report", "This is the report content.");

        // Добавляем шаблоны в менеджер
        manager.addTemplate("invoice", invoiceTemplate);
        manager.addTemplate("report", reportTemplate);

        // Клонируем шаблоны для создания новых документов
        DocumentPrototype newInvoice = manager.getTemplate("invoice");
        DocumentPrototype newReport = manager.getTemplate("report");

        // Выводим информацию о новых документах
        System.out.println(newInvoice);
        System.out.println(newReport);
    }
}
