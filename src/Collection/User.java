package Collection;

import java.util.List;

abstract class User {
  protected String name;

  public User(String name) {
    this.name = name;
  }

  public abstract String getRoleDescription();
  public abstract String toString();
}

interface CanBuy {
  void buyProduct(Product product);
}

interface CanSell {
  void addProduct(Product product);
}

class Buyer extends User implements CanBuy {
  private String address;

  public Buyer(String name, String address) {
    super(name);
    this.address = address;
  }

  @Override
  public String getRoleDescription() {
    return "Pengguna dengan peran pembeli.";
  }

  @Override
  public String toString() {
    return "Buyer: " + name + ", Alamat: " + address;
  }

  @Override
  public void buyProduct(Product product) {
    System.out.println(name + " membeli: " + product.getName());
  }
}

class Seller extends User implements CanSell {
  private String storeName;
  private ProductStorage storage;

  public Seller(String name, String storeName) {
    super(name);
    this.storeName = storeName;
    this.storage = new FlexibleProductStorage();
  }

  @Override
  public String getRoleDescription() {
    return "Pengguna yang mengelola toko.";
  }

  @Override
  public String toString() {
    return "Seller: " + name + ", Nama Toko: " + storeName;
  }

  @Override
  public void addProduct(Product product) {
    storage.addProduct(product);
    System.out.println(name + " menambahkan produk: " + product.getName());
    System.out.println("Proses penambahan produk selesai.\n");
  }

  public List<Product> getProducts() {
    return storage.getAllProducts();
  }

  public int getProductCount() {
    return storage.getProductCount();
  }

  public Product getProductByIndex(int index) {
    if (index < 0 || index >= getProductCount()) {
      throw new ProductAccessException ("Indeks produk invalid: " + index);
    }
    return getProducts().get(index);
  }
}

