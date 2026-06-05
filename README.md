# Advanced Notification Engine

A clean and extensible Java notification engine with:
- Bulk notification processing
- Retry mechanism
- Execution time measurement
- Functional (Lambda-based) notifications

## How it works
Add notifications and send them in bulk:

manager.addNotification(() -> System.out.println("[Email] -> Sent"));
manager.addNotification(() -> System.out.println("[SMS] -> Sent"));
manager.addNotification(() -> System.out.println("[PUSH] -> Sent"));

##
