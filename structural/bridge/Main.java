package structural.bridge;

public class Main {
  public static void main(String[] args) {
    Device tv = new TV();
    Remote remote = new AdvanceRemote(tv);
    remote.togglePower();
    remote.setVolume(15);

    AdvanceRemote advanceRemote = new AdvanceRemote(new Radio());
    advanceRemote.togglePower();
    advanceRemote.mute();
  }
}
