package creational.factory_method.hethongguithongbao;

public class SMS implements Notification {
  @Override
  public void notificationUers() {
    System.out.printf("Đã có một tin nhắn SMS được gửi đến!!!\n");
  }
}
