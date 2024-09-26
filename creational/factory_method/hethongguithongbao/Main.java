package creational.factory_method.hethongguithongbao;

public class Main {
  public static void main(String[] args) {
    NotificationFactory factory;
    factory = new EmailFactory();
    Notification email = factory.creatorNotification();
    email.notificationUers();

    factory = new SMSFactory();
    Notification sms = factory.creatorNotification();
    sms.notificationUers();

    factory = new PushNotificationFactory();
    Notification pushNotification = factory.creatorNotification();
    pushNotification.notificationUers();
  }
}
