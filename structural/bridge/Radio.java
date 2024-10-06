package structural.bridge;

public class Radio implements Device{

  @Override
  public void turnOn() {
    System.out.println("Turned on Radio");
  }

  @Override
  public void turnOf() {
    System.out.println("Turned of Radio");
  }

  @Override
  public void setVolume(int volume) {
    System.out.println("volume Radio is: " + volume);
  }
}
