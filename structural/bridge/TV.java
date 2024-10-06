package structural.bridge;

public class TV implements Device{
  @Override
  public void turnOn() {
    System.out.println("Turned on TV");
  }

  @Override
  public void turnOf() {
    System.out.println("Turned of TV");
  }

  @Override
  public void setVolume(int volume) {
    System.out.println("volume TV is: "+volume);
  }
}
