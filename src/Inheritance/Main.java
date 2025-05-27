package Inheritance;

public class Main {
    public static void main(String[] args) {
      
        Buyer[] buyers = new Buyer[2];
        buyers[0] = new Buyer("Ana", "ana@gmail.com", "Jl. Veteran");
        buyers[1] = new Buyer("Zahra", "zahra@gmail.com", "Jl. Surabaya");

       
        Seller seller = new Seller("Firda", "firda@gmail.com", "Toko Firda");

       
        Product[] products = new Product[3];
        products[0] = new Electronic("Laptop Asus", 7500000, 24);
        products[1] = new Shoes("Nike Zoom Air", 1200000, "42", "Running");
        products[2] = new Tool("Palu Besi", 100000, "Besi");

        
        System.out.println("=== Data Pembeli ===");
        for (Buyer buyer : buyers) {
            System.out.println(buyer + "\n");
        }

        
        System.out.println("=== Data Penjual ===");
        System.out.println(seller + "\n");

        
        System.out.println("=== Daftar Produk ===");
        for (Product product : products) {
            System.out.println(product + "\n");
        }
    }
}