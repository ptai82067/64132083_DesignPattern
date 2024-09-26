package creational.factory_method.phuongtiengiaothong;

public class Main {
  public static void main(String[] args) {
    VehicleFactory factory;
    factory = new BicycleFactory();
    Vehicle bicycle = factory.creatorVehicle();
    bicycle.move();
    factory = new CarFactory();
    Vehicle car = factory.creatorVehicle();
    car.move();
    factory = new TruckFactory();
    Vehicle truck = factory.creatorVehicle();
    truck.move();
  }
}
