package thuchanh.singleton.a4.vote;

import java.util.ArrayList;
import java.util.List;

public class Election {
  private static Election instance;
  int trump = 0, biden = 0;
  List<String> user = new ArrayList<>() {
  };
  private Election(){}
  public static Election getInstance(){
    if(instance == null){
      instance = new Election();
    }
    return instance;
  }
  public void vote(Candidate candidate, String name){
    if (candidate != Candidate.TRUMP && candidate != Candidate.BIDEN){
      System.out.println("Tên cử tri không hợp lệ");
    }else if(!user.contains(name)){
      user.add(name);
      if(candidate == Candidate.TRUMP){
        trump++;
      } else if (candidate == Candidate.BIDEN) {
        biden++;
      }
    }else{
      System.out.println("User đã bầu chọn trước đó, không thể tiếp tục bầu chọn");
    }

  }
  public void result(){
    System.out.println("Số lượng phiếu bẩu của cử tri DonalTrump: "+trump);
    System.out.println("Số lượng phiếu bầu của cử tri Biden: "+biden);
  }
}
