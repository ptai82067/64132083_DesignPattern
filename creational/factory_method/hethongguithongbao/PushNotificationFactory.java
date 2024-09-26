package creational.factory_method.hethongguithongbao;

public class PushNotificationFactory extends NotificationFactory {
  @Override
  public Notification creatorNotification() {
    return new PushNotification();
  }
}
