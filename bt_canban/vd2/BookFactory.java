package bt_canban.vd2;

public class BookFactory extends Factory{
  @Override
  public Product creatorProduct(){
    return new Book();
  }
}
