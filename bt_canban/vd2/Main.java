package bt_canban.vd2;

public class Main {
  public static void main(String[] args) {
    Factory bookFactory = new BookFactory();
    bookFactory.useProduct();
    Factory electronicFactory = new ElectronicFactory();
    electronicFactory.useProduct();
  }

}
