package thuchanh.singleton.a4.vote;

public class Main {
  public static void main(String[] args) {

    User u1 = new User();
    u1.setName("Tài");
    u1.vote(Candidate.TRUMP);
    User u2 = new User();
    u1.setName("Lộc");
    u1.vote(Candidate.TRUMP);
    User u3 = new User();
    u1.setName("Lành");
    u1.vote(Candidate.BIDEN);
    Election e = Election.getInstance();
    e.result();
  }
}
