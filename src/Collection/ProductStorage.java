package Collection;

import java.util.ArrayList;
import java.util.List;

interface ProductStorage {
  void addProduct(Product product);
  List<Product> getAllProducts();
  int getProductCount();
}

class FlexibleProductStorage implements ProductStorage {
  private List<Product> products = new ArrayList<>();

  @Override
  public void addProduct(Product product) {
    products.add(product);
  }

  @Override
  public List<Product> getAllProducts() {
    return products;
  }

  @Override
  public int getProductCount() {
    return products.size();
  }
}

