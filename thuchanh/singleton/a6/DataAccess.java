package thuchanh.singleton.a6;

import thuchanh.singleton.a4.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataAccess {

  private DataAccess(){}
  ArrayList<Product> listProduct = new ArrayList<>();
  private static Map<String, DataAccess> instances = new HashMap<>();
  public static DataAccess getInstance(String name){
    if(!instances.containsKey(name)){
      instances.put(name,new DataAccess());

    }
    return instances.get(name);
  }
  public void addProduct(Product p){
    listProduct.add(p);
    System.out.println("add thanh cong");
  }
  public void removeProduct(String maSanPham){
    for(var i:listProduct){
      if(i.getMaSanPham().equalsIgnoreCase(maSanPham)){
        System.out.println("remove thanh cong");
        listProduct.remove(i);
      }
    }
  }
  public  void updateProduct(String maSanPham, String tenSanpham, int soLuong, float donGia){
    for (var i:listProduct){
      if (i.getMaSanPham().equalsIgnoreCase(maSanPham)){
        i.setTenSanPham(tenSanpham);
        i.setSoLuong(soLuong);
        i.setDonGia(donGia);
        System.out.println("update thanh cong");
      }
    }
  }
  public void inds(){
    for (var i:listProduct){
      System.out.println(i.getMaSanPham()+"--"+i.getTenSanPham()+"--"+i.getSoLuong()+"--"+i.getDonGia());
    }
  }
}
