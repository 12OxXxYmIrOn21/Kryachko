public class Main {
    public static void main(String[] args) {
        // Получаем единственный экземпляр GlobalAppConfig
        GlobalAppConfig config = GlobalAppConfig.getInstance();

        // Выводим текущие настройки
        System.out.println("Application Name: " + config.getAppName());
        System.out.println("Version: " + config.getVersion());
        System.out.println("Max Users: " + config.getMaxUsers());

        // Изменяем настройки
        config.setAppName("New Application Name");
        config.setVersion("2.0.0");
        config.setMaxUsers(200);

        // Выводим обновленные настройки
        System.out.println("nUpdated Settings:");
        System.out.println("Application Name: " + config.getAppName());
        System.out.println("Version: " + config.getVersion());
        System.out.println("Max Users: " + config.getMaxUsers());
    }
}
