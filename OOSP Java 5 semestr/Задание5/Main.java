public class Main {
    public static void main(String[] args) {
        ProjectManagementSystem pms = new ProjectManagementSystem();

        // Создаем пользователей
        User user1 = new User("Иван");
        User user2 = new User("Мария");

        // Подписываем пользователей на уведомления
        pms.subscribe(user1);
        pms.subscribe(user2);

        // Создаем новую задачу и назначаем её
        Task task = new Task("Разработать новый функционал", "Нужно добавить новый функционал в систему.");
        pms.assignTask(task);

        // Отписываем пользователя Мария
        pms.unsubscribe(user2);

        // Создаем новую задачу и назначаем её
        Task task2 = new Task("Исправить ошибку", "Необходимо исправить ошибку, влияющую на производительность.");
        pms.assignTask(task2);
    }
}
