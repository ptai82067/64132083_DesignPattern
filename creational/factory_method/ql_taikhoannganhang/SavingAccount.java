package creational.factory_method.ql_taikhoannganhang;

public class SavingAccount implements BankAccount {
  @Override
  public void getAccountType() {
    System.out.printf("Tạo tài khoản tiết kiệm thành công\n");
  }
}
