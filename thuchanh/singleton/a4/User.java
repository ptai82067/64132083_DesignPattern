package thuchanh.singleton.a4;

import java.util.HashMap;
import java.util.Map;

public class User {
  private static Map<String,User> instances = new HashMap<>();
  private String name;
  private String vote;
  private User(String name){
    this.name = name;
  }
  public static User getInstance(String name){
    if(!instances.containsKey(name)){
      instances.put(name,new User(name));
    }
    return instances.get(name);
  }

  public String getName() {
    return name;
  }

  public String getVote() {
    return vote;
  }

  public void setVote(String vote) {
    this.vote = vote;
  }

}
