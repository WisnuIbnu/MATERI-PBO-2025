package Abstrack_dan_Interface;

public abstract class Product {

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

