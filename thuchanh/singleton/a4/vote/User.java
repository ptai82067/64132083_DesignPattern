package thuchanh.singleton.a4.vote;

public class User {
  private String name;
  public void vote (Candidate candidate){
    Election e = Election.getInstance();
      e.vote(candidate,this.name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
