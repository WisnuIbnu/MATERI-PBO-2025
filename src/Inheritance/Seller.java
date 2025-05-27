package Inheritance;

public class Seller extends User {
  private String storeName;

  public Seller(String name, String email, String storeName) {
      super(name, email);
      this.storeName = storeName;
  }

  @Override
  public String toString() {
      return super.toString() + ", Nama Toko: " + storeName;
  }
}

