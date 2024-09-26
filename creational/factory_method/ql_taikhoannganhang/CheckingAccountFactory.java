package creational.factory_method.ql_taikhoannganhang;

public class CheckingAccountFactory extends BankAcccountFactory {
  @Override
  public BankAccount creatorBankAccount() {
    return new CheckingAccount();
  }
}
