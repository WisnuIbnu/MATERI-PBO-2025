package Polymorphism;

public class Main {
  public static void main(String[] args) {
    
      User[] users = new User[2];
      users[0] = new Buyer("Rizwanda", "Jl. Veteran");
      users[1] = new Seller("Keysha", "Jl. Surabaya");

      Product[] products = new Product[2];
      products[0] = new Electronic("Laptop Asus", 7500000, 24);
      products[1] = new Fashion("T-shirt", 300000, "M");

      System.out.println("=== Data Pengguna ===");
      for (User user : users) {
          System.out.println(user + "\n");
      }

      System.out.println("=== Daftar Produk ===");
      for (Product product : products) {
          System.out.println(product + "\n");
      }

      System.out.println("=== Pemrosesan Produk ===");
      for (User user : users) {
          if (user instanceof Buyer) {
              Buyer buyer = (Buyer) user;
              buyer.buy(products[0]);
              buyer.buy(products[1]);
          }

          if (user instanceof Seller) {
              Seller seller = (Seller) user;
              seller.addProduct(products[0]);
          }
      }
  }
}
