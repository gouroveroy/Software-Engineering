// Notification Strategy Interface
interface NotificationChannel {
    void sendNotification(String message);
}

// Concrete Strategy: Email Notification
class EmailNotification implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}

// Concrete Strategy: SMS Notification
class SMSNotification implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// Concrete Strategy: Mobile App Notification
class MobileAppNotification implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Mobile App Notification: " + message);
    }
}

// Context: Notification System
class NotificationSystem {
    private NotificationChannel notificationChannel;

    // Allows setting the preferred notification channel dynamically
    public void setNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    // Sends a notification using the selected channel
    public void notifyCustomer(String message) {
        if (notificationChannel == null) {
            throw new IllegalStateException("No notification channel set!");
        }
        notificationChannel.sendNotification(message);
    }
}

// Driver Code
public class Main {
    public static void main(String[] args) {
        // Create the notification system
        NotificationSystem notificationSystem = new NotificationSystem();

        // Send a transaction update via Email
        notificationSystem.setNotificationChannel(new EmailNotification());
        notificationSystem.notifyCustomer("Your account has been credited with $500.");

        // Switch to SMS for low balance warning
        notificationSystem.setNotificationChannel(new SMSNotification());
        notificationSystem.notifyCustomer("Alert: Your account balance is below $100.");

        // Switch to Mobile App Notification for promotional offer
        notificationSystem.setNotificationChannel(new MobileAppNotification());
        notificationSystem.notifyCustomer("Special Offer: Get 10% cashback on your next transaction!");
    }
}
