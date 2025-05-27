package Inheritance;

public class Tool extends Product {
  private String material;

  public Tool(String productName, int price, String material) {
      super(productName, price);
      this.material = material;
  }

  @Override
  public String toString() {
      return super.toString() + ", Bahan: " + material;
  }
}

