package Collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<User> users = new ArrayList<>();
    users.add(new Buyer("Wisnu", "Jl. Candi Mendut"));
    users.add(new Seller("Yusuf", "Toko Suka Suka"));

    List<Product> products = new ArrayList<>();
    products.add(new Electronic("Laptop Asus", 7500000, 24));
    products.add(new Fashion("T-shirt", 300000, "M"));
    products.add(new Electronic("Smartphone", 4500000, 12));
    products.add(new Fashion("Sepatu", 350000, "42"));
    products.add(new Electronic("Printer", 1200000, 18));
    products.add(new Fashion("Jaket", 500000, "L"));

    System.out.println("=== Data Pengguna ===");
    for (User user : users) {
      System.out.println(user);
      System.out.println("Peran: " + user.getRoleDescription() + "\n");
    }

    System.out.println("=== Penambahan Produk oleh Seller ===");
    Seller seller = null;
    for (User user : users) {
      if (user instanceof Seller) {
        seller = (Seller) user;
        for (Product product : products) {
          seller.addProduct(product);
        }
      }
    }

    System.out.println("=== Daftar Produk yang Tersedia ===");
    if (seller != null) {
      for (Product product : seller.getProducts()) {
        System.out.println(product);
      }

      System.out.println("\nProduk via getProductByIndex:");
      try {
        Product xProduct = seller.getProductByIndex(0);
        System.out.println(xProduct);
      } catch (ProductAccessException e) {
        System.out.println("Error akses produk: " + e.getMessage());
      }
    }

    System.out.println("=== Pemrosesan Pembelian Produk ===");
    for (User user : users) {
      if (user instanceof Buyer && seller != null) {
        Buyer buyer = (Buyer) user;
        for (Product product : seller.getProducts()) {
          buyer.buyProduct(product);
        }
      }
    }
  }
}

