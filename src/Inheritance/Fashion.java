package Inheritance;

public class Fashion extends Product {
  protected String size;

  public Fashion(String productName, int price, String size) {
      super(productName, price);
      this.size = size;
  }

  @Override
  public String toString() {
      return super.toString() + ", Ukuran: " + size;
  }
}
