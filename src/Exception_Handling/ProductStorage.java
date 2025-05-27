package Exception_Handling;

public interface ProductStorage {

  void addProduct(Product product) throws StorageFullException;
  Product[] getAllProducts();
  int getProductCount();

}

