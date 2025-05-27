package Exception_Handling;

class FixedSizeProductStorage implements ProductStorage {
    private Product[] products = new Product[5];
    private int count = 0;

    @Override
    public void addProduct(Product product) throws StorageFullException {
        if (count < products.length) {
            products[count++] = product;
        } else {
            throw new StorageFullException("Storage penuh: " + product.getName());
        }
    }

    @Override
    public Product[] getAllProducts() {
        return products;
    }

    @Override
    public int getProductCount() {
        return count;
    }
}
