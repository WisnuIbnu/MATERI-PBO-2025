package Polymorphism;

public class Buyer extends User {
  private String address;

  public Buyer(String name, String address) {
      super(name);
      this.address = address;
  }

  @Override
  public String toString() {
      return "Buyer: " + name + ", Alamat: " + address;
  }

  public void buy(Product product) {
      System.out.println(name + " membeli: " + product.getName());
  }
}

