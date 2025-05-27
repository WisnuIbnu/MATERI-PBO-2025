package Modifier_Final_dan_Static.Campuran;

class Product { 
  final String productId; 
  static final String CURRENCY = "IDR"; 
  static int productTotal = 0; 

  public Product(String productId) { 
    this.productId = productId; 
    productTotal++; 
  } 

  public void displayInfo() { 
    System.out.println("Kode Barang: " + this.productId); 
    System.out.println("Mata Uang: " + CURRENCY); 
  }

  public static void displayProductTotal() { 
    System.out.println("Total produk yang dibuat: " + productTotal);
  } 
}

  public class Main {
    public static void main(String[] args) { 
      Product produk1 = new Product("P001"); 
      Product produk2 = new Product("P002"); 
  
      produk1.displayInfo(); 
      produk2.displayInfo(); 
      
      Product.displayProductTotal(); 
    }     
  }
