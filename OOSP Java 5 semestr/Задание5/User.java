// Класс для пользователя
class User implements TaskObserver {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Task task) {
        System.out.println("Пользователь " + name + " получил уведомление о новой задаче: " + task.getTitle());
    }
}