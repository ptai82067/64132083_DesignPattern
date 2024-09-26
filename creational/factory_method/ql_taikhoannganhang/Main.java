package creational.factory_method.ql_taikhoannganhang;

public class Main {
  public static void main(String[] args) {
    BankAcccountFactory factory;
    factory = new SavingAccountFactory();
    BankAccount saving = factory.creatorBankAccount();
    saving.getAccountType();
    factory = new CheckingAccountFactory();
    BankAccount checking = factory.creatorBankAccount();
    checking.getAccountType();


  }

}
