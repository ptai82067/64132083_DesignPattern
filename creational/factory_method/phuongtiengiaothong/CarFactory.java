package creational.factory_method.phuongtiengiaothong;

public class CarFactory extends VehicleFactory{
  @Override
  public Vehicle creatorVehicle() {
    return new Car();
  }
}
