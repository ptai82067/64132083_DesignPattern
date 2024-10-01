package thuchanh.singleton.a6;

public class Main {
  public static void main(String[] args) {
    DataAccess ui1 = DataAccess.getInstance("Shop1");
    ui1.addProduct(new Product("001","LapTop",2,2000.3f));
    DataAccess ui2 = DataAccess.getInstance("Shop1");
    ui2.addProduct(new Product("002","Phone",10,500.1f));
    DataAccess ui3 = DataAccess.getInstance("Shop1");
//    ui3.removeProduct("001");
//    ui3.updateProduct("002","IPhone",11,1500.1f);
    ui3.inds();
    DataAccess ui4 = DataAccess.getInstance("Shop2");
    ui4.addProduct(new Product("001","LapTopGamin",2,2000.3f));
    DataAccess ui5 = DataAccess.getInstance("Shop2");
    ui5.addProduct(new Product("002","IPhone",10,500.1f));
    DataAccess ui6 = DataAccess.getInstance("Shop2");
    ui6.inds();
  }
}
