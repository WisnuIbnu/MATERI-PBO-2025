package Inheritance;

public class Product {
  protected String productName;
  protected int price;

  public Product(String productName, int price) {
      this.productName = productName;
      this.price = price;
  }

  @Override
  public String toString() {
      return "Nama Produk: " + productName + ", Harga: Rp " + price;
  }
}

