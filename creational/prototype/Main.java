package creational.prototype;

public class Main {
  public static void main(String[] args) {
    Product p1 = new Product("01",15,"Mít");
    Product p2 = new Product("02",10,"Mận");
    Product p3 = new Product("03",20,"Ổi");
    Order o1 = new Order("01","Tài");
    o1.add(p1);
    o1.add(p2);
    o1.add(p3);
    Order o2 = o1.clone();
    Order o3 = o1.copy();
    System.out.println("o1:");
    o1.display();

    System.out.println("Copy");
    o3.products.get(0).name = "Chuối";
    o3.display();

    System.out.println("o1 sau khi đã copy --> Copy o1 nhưng o1 không thay đổi");
    o1.display();


    System.out.println("Clone");
    o2.products.get(0).name  = "Chuối";
    o2.display();
    System.out.println("o1 sau khi đã clone --> Clone o1 nhưng o1 bị thay đổi theo");
    o1.display();


  }
}
