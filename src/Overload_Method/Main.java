package Overload_Method;

public class Main {
  public static void main(String[] args) {
    Product barang1 = new Product(90, 300000000);
    barang1.diplayInfo();

    // System.out.println("\n========= PRODUCT 2 =========");
    // Product barang2 = new Product("Anker Soundcore R50i");
    // barang2.diplayInfo();
    
    // System.out.println("\nMemakai Method addStock dengan 1 Parameter");
    // barang2.addStock(5);
    // barang2.diplayInfo();

    // System.out.println("\nMemakai Method addStock dengan 2 Parameter");
    // barang2.addStock(8, false);
    // barang2.diplayInfo();

    System.out.println("ubah stok barang1");
    barang1.addStock(10, true);
    
  }
}
