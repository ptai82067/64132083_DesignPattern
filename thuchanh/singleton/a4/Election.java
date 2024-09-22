package thuchanh.singleton.a4;

import java.util.ArrayList;
import java.util.Scanner;

public class Election {
  ArrayList<User> listVote = new ArrayList<User>();
  void menu(){


    // Hiển thị menu
    System.out.println("******************************");
    System.out.println("*        MENU CHÍNH          *");
    System.out.println("******************************");
    System.out.println("* 1. Insert User             *");
    System.out.println("* 2. Display vote            *");
    System.out.println("* 3. Exit                    *");
    System.out.println("******************************");
    System.out.println("Chọn số:");

    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    scanner.nextLine();
    while (true) {
      switch (i) {
        case 1:
          System.out.println("1.Insert User");
          System.out.printf("Nhập tên người bầu cử: \n");
          String nameBC = scanner.nextLine();
          User u = User.getInstance(nameBC);
          System.out.printf("nhấn phím 1 nếu là Donaltrum\n");
          System.out.printf("nhấn phím 2 nếu là Biden\n");
          System.out.printf("Bạn chọn: ");
          String kq = scanner.nextLine();
          if (kq.equals("1") || kq.equals("2")){
            if(!listVote.contains(u)){
              u.setVote(kq);
              listVote.add(u);
            }
          }else{
            System.out.printf("!!!Nhập sai!!!");
          }
          break;
        case 2:
          System.out.println("Display vote");
          int voteNumberOfDoNalTrum = 0;
          int voteNumberOfBiden = 0;
          for(User x : listVote){
            if (x.getVote().equals("1")){
              voteNumberOfDoNalTrum = voteNumberOfDoNalTrum + 1;
            }else {
              voteNumberOfBiden  =  voteNumberOfBiden + 1;
            }
          }
          System.out.println("Số phiếu bầu mà DonalTrum đã đạt được: "+  voteNumberOfDoNalTrum);
          System.out.println("Số phiếu bầu mà Biden đã đạt được: "+ voteNumberOfBiden);
          break;
        case 3:
          System.out.println("Exit");
          return; // Thoát khỏi vòng lặp và kết thúc chương trình
        default:
          System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
      }
      System.out.println("******************************");
      System.out.println("*        MENU CHÍNH          *");
      System.out.println("******************************");
      System.out.println("* 1. Insert User             *");
      System.out.println("* 2. Display vote            *");
      System.out.println("* 3. Exit                    *");
      System.out.println("******************************");
      System.out.println("Chọn số:");
      i = scanner.nextInt();
      scanner.nextLine();
    }
  }
}
