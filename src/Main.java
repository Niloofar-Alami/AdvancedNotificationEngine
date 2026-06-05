public class Main {
    public static void main(String[] args) {
        NotificationManager<Notification> manager = new NotificationManager<>();

        manager.addNotification(() -> System.out.println("[Email] -> Sent"));
        manager.addNotification(() -> System.out.println("[SMS] -> Sent"));
        manager.addNotification(() -> System.out.println("[PUSH] -> Sent"));

        manager.sendAll();
    }
}

