package Abstrack_dan_Interface;

public class Seller extends User implements CanSell {
    private String storeName;
    private ProductStorage storage;

    public Seller(String name, String storeName) {
        super(name);
        this.storeName = storeName;
        this.storage = new FixedSizeProductStorage();
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
    }

    public Product[] getProducts() {
        return storage.getAllProducts();
    }

    public int getProductCount() {
        return storage.getProductCount();
    }
}

