package Inheritance;

public class Shoes extends Fashion {
  private String shoeType;

  public Shoes(String productName, int price, String size, String shoeType) {
      super(productName, price, size);
      this.shoeType = shoeType;
  }

  @Override
  public String toString() {
      return super.toString() + ", Jenis Sepatu: " + shoeType;
  }
}

