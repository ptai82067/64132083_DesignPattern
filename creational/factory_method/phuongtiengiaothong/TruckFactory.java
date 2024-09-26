package creational.factory_method.phuongtiengiaothong;

public class TruckFactory extends VehicleFactory{
  @Override
  public Vehicle creatorVehicle() {
    return new Truck();
  }
}
