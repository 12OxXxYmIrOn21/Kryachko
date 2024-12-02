// Класс системы управления проектами
import java.util.ArrayList;
import java.util.List;
class ProjectManagementSystem {
    private List<TaskObserver> observers = new ArrayList<>();

    public void subscribe(TaskObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(TaskObserver observer) {
        observers.remove(observer);
    }

    public void assignTask(Task task) {
        notifyObservers(task);
    }

    private void notifyObservers(Task task) {
        for (TaskObserver observer : observers) {
            observer.update(task);
        }
    }
}