package creational.factory_method.hethongguithongbao;

public class SMSFactory extends NotificationFactory {
  @Override
  public Notification creatorNotification() {
    return new SMS();
  }
}
