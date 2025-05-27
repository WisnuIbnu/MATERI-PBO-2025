package Exception_Handling;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[2];
        users[0] = new Buyer("Wisnu", "Jl. Candi Mendut");
        users[1] = new Seller("Yusuf", "Toko Suka Suka");

        Product[] products = new Product[6];
        products[0] = new Electronic("Laptop Asus", 7500000, 24);
        products[1] = new Fashion("T-shirt", 300000, "M");
        products[2] = new Electronic("Smartphone", 4500000, 12);
        products[3] = new Fashion("Sepatu", 350000, "42");
        products[4] = new Electronic("Printer", 1200000, 18);
        products[5] = new Fashion("Jaket", 500000, "L");

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

        System.out.println("=== Daftar Produk yang Tersedia ===");
        if (seller != null) {
            Product[] availableProducts = seller.getProducts();
            for (Product product : availableProducts) {
                System.out.println(product);
            }

            System.out.println("\nProduk via getProductByIndex:");
            Product xProduct = seller.getProductByIndex(0);
            System.out.println(xProduct);
        }

        System.out.println("=== Pemrosesan Pembelian Produk ===");
        for (User user : users) {
            if (user instanceof Buyer && seller != null) {
                Buyer buyer = (Buyer) user;
                for (Product product : seller.getProducts()) {
                    buyer.buyProduct(product);
                }
            }
        }
    }
}
