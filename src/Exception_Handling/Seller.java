package Exception_Handling;

class Seller extends User implements CanSell {
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
        try {
            storage.addProduct(product);
            System.out.println(name + " menambahkan produk: " + product.getName());
        } catch (StorageFullException e) {
            System.out.println("Gagal menambahkan produk: " + e.getMessage());
        } finally {
            System.out.println("Proses penambahan produk selesai.\n");
        }
    }

    public Product[] getProducts() {
        return storage.getAllProducts();
    }

    public int getProductCount() {
        return storage.getProductCount();
    }

    public Product getProductByIndex(int index) {
        if (index < 0 || index >= getProductCount()) {
            throw new ProductAccessException("Indeks produk invalid: " + index);
        }
        return storage.getAllProducts()[index];
    }
}
