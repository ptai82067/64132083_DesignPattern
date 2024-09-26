package creational.factory_method.hethongguithongbao;

public class Email implements Notification{
  @Override
  public void notificationUers() {
    System.out.printf("Đã có Email được gửi đến!!!\n");
  }
}
