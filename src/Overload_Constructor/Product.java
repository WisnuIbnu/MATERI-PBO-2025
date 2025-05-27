package Overload_Constructor;

public class Product {
  int stock;
  int price;
  String name;

  Product() {
    name = "Asus vivobook 14X M1403QA";
    stock = 14;
    price = 8599000;
  }

  // overload Constructor
  Product(String name) {
    this.name = name;
    this.stock = 30;
    this.price = 8850000;
  }

  void addStock(int addStock){
    this.stock += addStock;
  }

  // overload method
  void addStock(int addStock, boolean status){     
    if (status) {
      System.out.println("Stok bertambah sebanyak " + addStock + ". Total stok sekarang: " + this.stock);
    } 
  }

  void diplayInfo(){
    System.out.println("======= DETAIL PRODUK =======");
    System.out.println("Nama Produk\t\t: "+ this.name);
    System.out.println("Jumlah Stok Produk\t: " + this.stock);
    System.out.println("Harga Produk\t\t: Rp."+ this.price);
  }
}