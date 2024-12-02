public class GlobalAppConfig {
    private static GlobalAppConfig instance;

    private String appName;
    private String version;
    private int maxUsers;

    // Закрытый конструктор для предотвращения создания экземпляров класса
    private GlobalAppConfig() {
        // Инициализация значений по умолчанию
        this.appName = "My Application";
        this.version = "1.0.0";
        this.maxUsers = 100;
    }

    // Метод для получения единственного экземпляра класса
    public static GlobalAppConfig getInstance() {
        if (instance == null) {
            instance = new GlobalAppConfig();
        }
        return instance;
    }

    // Геттеры и сеттеры для параметров конфигурации
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }
}
