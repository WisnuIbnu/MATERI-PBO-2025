package Overload_Method;

public class Product {
  int stock;
  double price;
  String name;

  Product(int price, int stock) {
    name = "Xiaomi Poco X5 5G 8GB/256GB";
    this.stock = stock;
    this.price = price;
  }

  Product( String name,float  price, int stock) {
    this.name = name;
    this.stock = stock;
    this.price = price;
  }

  Product(String name) {
    this.name = name;
    this.stock = 34;
    this.price = 240000;
  }

  void addStock(int addStock){
    this.stock += addStock;
  }

  // overload method
  void addStock(int addStock, boolean status){   
    this.stock += addStock;  
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

