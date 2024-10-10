package creational.prototype;

import java.util.ArrayList;

public class Order extends Prototype{
  String id, nameUser;
  ArrayList<Product> products;

  public Order(String id, String nameUser) {
    this.id = id;
    this.nameUser = nameUser;
    products = new ArrayList<>();
  }
  public void add(Product product){
    products.add(product);

  }
  public void display(){
    for (var i:products){
      System.out.println("id: "+i.id +"\tname: "+i.name+"\tquantity: "+i.quantity );
    }
  }
  @Override
  public Order copy(){
    return (Order) super.copy();
  }
  @Override
  public Order clone(){
    return (Order) super.clone();
  }


}
