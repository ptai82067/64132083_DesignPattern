package creational.factory_method.ql_taikhoannganhang;

public class CheckingAccount implements BankAccount {
  @Override
  public void getAccountType() {
    System.out.printf("Tạo tài khoản thanh toán thành công\n");
  }
}
