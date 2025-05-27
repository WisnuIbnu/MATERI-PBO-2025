package Modifier_Final_dan_Static.Static;

class Product { 
  final String productId; 
  static int productTotal;

  public Product(String productId) { 
    this.productId = productId; 
    productTotal++; 
  } 
  public static void displayProductTotal() { 
    System.out.println("Total produk yang dibuat: " + productTotal); 
  } 

  public static void penjumlahan(int angka, int angka1){
    int hasil = angka + angka1;
    System.out.println( hasil);
  }

  public void displayProduct(){
    System.out.println("Kode Barang : "+ productId);
  }

}

public class StaticExample {
  public static void main(String[] args) { 
    Product produk1 = new Product("P001"); 
    Product produk2 = new Product("P002"); 

    Product.displayProductTotal();
    
    produk1.displayProduct();
    produk2.displayProduct();
  } 
}
