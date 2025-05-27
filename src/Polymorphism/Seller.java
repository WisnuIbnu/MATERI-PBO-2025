package Polymorphism;

public class Seller extends User {
  private String storeName;

  public Seller(String name, String storeName) {
      super(name);
      this.storeName = storeName;
  }

  @Override
  public String toString() {
      return "Seller: " + name + ", Nama Toko: " + storeName;
  }
  
  public void addProduct(Product product) {
      System.out.println(name + " menambahkan produk: " + product.getName());
  }
}

