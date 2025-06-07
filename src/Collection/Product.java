package Collection;

abstract class Product {
  protected String name;
  protected int price;

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Nama Produk: " + name + ", Harga: Rp " + price;
  }
}

class Electronic extends Product {
  private int warrantyPeriod; 

  public Electronic(String name, int price, int warrantyPeriod) {
    super(name, price);
    this.warrantyPeriod = warrantyPeriod;
  }

  @Override
  public String toString() {
    return super.toString() + ", Garansi: " + warrantyPeriod + " bulan";
  }
}

class Fashion extends Product {
  private String size;

  public Fashion(String name, int price, String size) {
    super(name, price);
    this.size = size;
  }

  @Override
  public String toString() {
    return super.toString() + ", Ukuran: " + size;
  }
}

