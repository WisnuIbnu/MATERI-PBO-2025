package Abstrack_dan_Interface;

public class FixedSizeProductStorage implements ProductStorage {
    private Product[] products = new Product[5];
    private int count = 0;

    @Override
    public void addProduct(Product product) {
        if (count < products.length) {
            products[count++] = product;
        } else {
            System.out.println("Storage penuh!");
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

