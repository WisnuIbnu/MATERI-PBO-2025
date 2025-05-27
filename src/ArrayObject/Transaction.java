package ArrayObject;

public class Transaction {
  Product[] products = new Product[3]; 
  int countProduct = 0; 

  public void addToCart(Product productItem) { 
    products[countProduct] = productItem; 
    countProduct++; 
  } 

  public void display1() { 
    System.out.println("========= LIST BARANG YANG DIBELI ========="); 
    for (int i = 0; i < countProduct; i++) { 
      System.out.println("ID: " + products[i].productId); 
      System.out.println("Nama: " + products[i].productName); 
      System.out.println("Rating: " + products[i].rating); 
      System.out.println("-------------------------------"); 
    } 
  } 

  public void display2() { 
    System.out.println("========= LIST BARANG YANG DIBELI ========="); 
    for (Product product : products) { 
      if (product != null) { 
        System.out.println("ID: " + product.productId); 
        System.out.println("Nama: " + product.productName); 
        System.out.println("Rating: " + product.rating); 
        System.out.println("-------------------------------"); 
      } 
    } 
  } 
  }
