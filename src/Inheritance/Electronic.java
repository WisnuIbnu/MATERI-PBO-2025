package Inheritance;

public class Electronic extends Product {
  private int warrantyPeriod;

  public Electronic(String productName, int price, int warrantyPeriod) {
      super(productName, price);
      this.warrantyPeriod = warrantyPeriod;
  }

  @Override
  public String toString() {
      return super.toString() + ", Garansi: " + warrantyPeriod + " bulan";
  }
}

