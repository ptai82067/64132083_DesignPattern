package creational.factory_method.hethongguithongbao;

public class EmailFactory extends NotificationFactory{
  @Override
  public Notification creatorNotification() {
    return new Email();
  }
}
