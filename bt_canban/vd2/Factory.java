package bt_canban.vd2;

public abstract class Factory {
  public abstract Product creatorProduct();
  public void useProduct(){
    Product product = creatorProduct();
    product.use();
  }
}
