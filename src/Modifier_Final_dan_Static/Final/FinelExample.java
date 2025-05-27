package Modifier_Final_dan_Static.Final;

class Product { 
  final String productId; 

  public Product(String productId) { 
    this.productId = productId; 
  } 
  public void displayInfo() { 
    System.out.println("ID Produk: " + this.productId); 
  }
}

public class FinelExample {
  public static void main(String[] args) { 

    Product produk1 = new Product("P001"); 
    Product produk2 = new Product("P002"); 


    produk1.displayInfo(); 
    produk2.displayInfo(); 


  }   
}
