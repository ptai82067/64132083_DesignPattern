package bt_canban.vd2;

public class ElectronicFactory extends Factory{

  @Override
  public Product creatorProduct() {
    return new Electronic();
  }
}
