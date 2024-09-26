package creational.factory_method.ql_taikhoannganhang;

public class SavingAccountFactory extends BankAcccountFactory {
  @Override
  public BankAccount creatorBankAccount() {
    return new SavingAccount();
  }
}
