@FunctionalInterface
    public interface Notification {
    void send();

    default long measureExecutionTime() {
        long start = System.nanoTime();
        send();
        return System.nanoTime() - start;
    }

    default void sendWithRetry(int retries) {
        for (int i = 1; i <= retries; i++) {
            try {
                send();
                return;
            } catch (Exception e) {
                System.out.println("[WARN] Attempt " + i + " failed.");
            }
        }
        System.out.println("[ERROR] Notification failed after retries.");
    }
}
