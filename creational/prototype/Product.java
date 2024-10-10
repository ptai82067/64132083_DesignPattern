package creational.prototype;

public class Product extends Prototype{
  String id, name;
  int quantity;

  public Product(String id, int quantity, String name) {
    this.id = id;
    this.quantity = quantity;
    this.name = name;
  }
  @Override
  public Product copy(){
    return (Product) super.copy();
  }
  @Override
  public Product clone(){
    return (Product) super.clone();
  }

}
