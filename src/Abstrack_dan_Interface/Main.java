package Abstrack_dan_Interface;

public class Main {
    public static void main(String[] args) {

        User[] users = new User[2];
        users[0] = new Buyer("Wisnu", "Jl. Candi Mendut");
        users[1] = new Seller("Yusuf", "Toko Suka Suka");

        Product[] products = new Product[2];
        products[0] = new Electronic("Laptop Asus", 7500000, 24);
        products[1] = new Fashion("T-shirt", 300000, "M");

        System.out.println("=== Data Pengguna ===");
        for (User user : users) {
            System.out.println(user);
            System.out.println("Peran: " + user.getRoleDescription() + "\n");
        }

        System.out.println("=== Penambahan Produk oleh Seller ===");
        Seller seller = null;
        for (User user : users) {
            if (user instanceof Seller) {
                seller = (Seller) user;
                for (Product product : products) {
                    seller.addProduct(product);
                }
            }
        }

        System.out.println("\n=== Pemrosesan Pembelian Produk ===");
        for (User user : users) {
            if (user instanceof Buyer && seller != null) {
                Buyer buyer = (Buyer) user;
                Product[] availableProducts = seller.getProducts();
                int count = seller.getProductCount();
                for (int i = 0; i < count; i++) {
                    buyer.buyProduct(availableProducts[i]);
                }
            }
        }

    }
}
