package Exception_Handling;

public class Buyer extends User implements CanBuy {
    private String address;

    public Buyer(String name, String address) {
        super(name);
        this.address = address;
    }

    @Override
    public String getRoleDescription() {
        return "Pengguna dengan peran pembeli.";
    }

    @Override
    public String toString() {
        return "Buyer: " + name + ", Alamat: " + address;
    }

    @Override
    public void buyProduct(Product product) {
        System.out.println(name + " membeli: " + product.getName());
    }
}

