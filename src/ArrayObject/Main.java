package ArrayObject;
 
public class Main { 
  public static void main(String[] args) { 
    Product produk1 = new Product("P001", "Redmi Note", (byte) 4); 
    Product produk2 = new Product("P002", "Asus ROG", (byte) 5); 
    Product produk3 = new Product("P003", "Mac Book", (byte) 5); 
    Product produk4 = new Product("P004", "Samsung Galaxy", (byte) 3); 
 
    Transaction transaksi1 = new Transaction(); 
    // transaksi1.display1(); 
    // transaksi1.display2(); 
 
    transaksi1.addToCart(produk1); 
    transaksi1.addToCart(produk2);
    transaksi1.addToCart(produk3);
    transaksi1.addToCart(produk4);

    transaksi1.display1(); 
    transaksi1.display2(); 
  } 
} 


