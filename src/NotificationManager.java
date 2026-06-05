import java.util.ArrayList;
import java.util.List;

public class NotificationManager<T extends Notification> {

    private final List<T> notifications = new ArrayList<>();

    public void addNotification(T notification) {
        notifications.add(notification);
    }

    public void sendAll() {
        System.out.println("=== Bulk Notification Engine Started ===");

        for (T notification : notifications) {
            long time = notification.measureExecutionTime();
            System.out.println("[LOG] Execution Time: " + time + " ns");

            notification.sendWithRetry(2);
        }
    }
}
