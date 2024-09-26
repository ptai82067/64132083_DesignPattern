package creational.factory_method.phuongtiengiaothong;

public class BicycleFactory extends VehicleFactory{
  @Override
  public Vehicle creatorVehicle() {
    return new Bicycle();
  }
}
